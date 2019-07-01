import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Click on Dropdown link and open the DropDown page'
WebUI.callTestCase(findTestCase('BasicWebUIExcercise/Pages/Home Page/Click any link on Home Page and verify page title'), 
    [('linkNameText') : 'Dropdown', ('pageTitle') : 'Dropdown List'], FailureHandling.STOP_ON_FAILURE)

'Verify Default Option Selected'
WebUI.verifyOptionSelectedByLabel(findTestObject('Drop Down Page/cbo_SelectOption'), 'Please select an option', 
    false, 0)

'Select Option 2'
WebUI.selectOptionByIndex(findTestObject('Drop Down Page/cbo_SelectOption'), 2)

'Verfiy Option 2 is selected'
WebUI.verifyOptionSelectedByIndex(findTestObject('Drop Down Page/cbo_SelectOption'), 2, 0)

'Select Option 1'
WebUI.selectOptionByValue(findTestObject('Drop Down Page/cbo_SelectOption'), '1', false)

'Verify Option 1 is selected'
WebUI.verifyOptionSelectedByValue(findTestObject('Drop Down Page/cbo_SelectOption', [('variable') : '']), '1', 
    false, 0)

