import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'CLick Drag and Drop link and open the page'
WebUI.callTestCase(findTestCase('BasicWebUIExcercise/Pages/Home Page/Click any link on Home Page and verify page title'), 
    [('linkNameText') : 'Drag and Drop', ('pageTitle') : 'Drag and Drop'], FailureHandling.STOP_ON_FAILURE)

'Verify default name of Column A'
WebUI.verifyElementText(findTestObject('Drag Drop page/div_Column A'), 'A')

'Verify default name of Column B'
WebUI.verifyElementText(findTestObject('Drag Drop page/div_Column B'), 'B')

'Drage column A and drop it to column B'
CustomKeywords.'webUI.action.dragAndDrop'(findTestObject('Drag Drop page/div_Column A'), findTestObject('Drag Drop page/div_Column B'))

//CustomKeywords.'com.kms.katalon.keyword.draganddrop.DragAndDropKeywords.dragAndDrop'(findTestObject('Drag Drop page/div_Column A'),findTestObject('Drag Drop page/div_Column B'))
'Verify Column A\'s name is changed to \'B\''
WebUI.verifyElementText(findTestObject('Drag Drop page/div_Column A'), 'B')

'Verify Column B\'s name is changed to \'A\''
WebUI.verifyElementText(findTestObject('Drag Drop page/div_Column B'), 'A')

