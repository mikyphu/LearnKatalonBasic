import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Click Frame and Open the Frame page'
WebUI.callTestCase(findTestCase('BasicWebUIExcercise/Pages/Home Page/Click any link on Home Page and verify page title'), 
    [('linkNameText') : _linkName, ('pageTitle') : _expectedPageTitle], FailureHandling.STOP_ON_FAILURE)

'Verify default content in Frame Body'
WebUI.verifyElementText(findTestObject('EditorFrame/txt_frameBody'), 'Your content goes here.')
'Enter new content inside Frame box'
WebUI.setText(findTestObject('EditorFrame/txt_frameBody'), _newContent)
'Verify new content is entered properly'
WebUI.verifyElementText(findTestObject('EditorFrame/txt_frameBody'), _newContent)

