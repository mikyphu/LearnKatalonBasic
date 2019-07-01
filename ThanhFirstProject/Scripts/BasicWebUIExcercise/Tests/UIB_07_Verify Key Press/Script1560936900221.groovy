import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Click KeyPress link from home page and open the Key Press page'
WebUI.callTestCase(findTestCase('BasicWebUIExcercise/Pages/Home Page/Click any link on Home Page and verify page title'), 
    [('linkNameText') : 'Key Presses', ('pageTitle') : 'Key Presses'], FailureHandling.STOP_ON_FAILURE)

'Press ENTER key'
CustomKeywords.'webUI.action.pressKey'(Keys.ENTER)

'Verify message'
WebUI.verifyElementText(findTestObject('Master Page/lbl_Result'), 'You entered: ENTER')
'Press G key'
CustomKeywords.'webUI.action.pressKey'("G")

'Verify message'
WebUI.verifyElementText(findTestObject('Master Page/lbl_Result'), 'You entered: G')

'Press TAB key'
CustomKeywords.'webUI.action.pressKey'(Keys.TAB)

'Verify message'
WebUI.verifyElementText(findTestObject('Master Page/lbl_Result'), 'You entered: TAB')