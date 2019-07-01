import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebDriver as WebDriver

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Click Alert link from home page and open the Alert page'
WebUI.callTestCase(findTestCase('BasicWebUIExcercise/Pages/Home Page/Click any link on Home Page and verify page title'), 
    [('linkNameText') : 'JavaScript Alerts', ('pageTitle') : 'JavaScript Alerts'], FailureHandling.STOP_ON_FAILURE)

'Click Alert button'
WebUI.click(findTestObject('Alert Page/btn_Alert'))

'Get web driver'
WebDriver driver = DriverFactory.getWebDriver()

'Verifying the Actual and Expected text from Alert'
WebUI.verifyEqual(WebUI.getAlertText(), 'I am a JS Alert')

'Click OK button from the Alert'
WebUI.acceptAlert()

'Verify result messagge'
WebUI.verifyElementText(findTestObject('Master Page/lbl_Result'), 'You successfuly clicked an alert')

'Click Confirm button'
WebUI.click(findTestObject('Alert Page/btn_Confirm'))

'Click OK button from the Confirm Dialog'
WebUI.acceptAlert()

'Verify result messagge'
WebUI.verifyElementText(findTestObject('Master Page/lbl_Result'), 'You clicked: Ok')

'Click Confirm button again'
WebUI.click(findTestObject('Alert Page/btn_Confirm'))

'Click Cancel button from the Confirm Dialog'
WebUI.dismissAlert()

'Verify result messagge'
WebUI.verifyElementText(findTestObject('Master Page/lbl_Result'), 'You clicked: Cancel')

'Click Prompt button'
WebUI.click(findTestObject('Alert Page/btn_Prompt'))

'Enter text on the Prompt dialog'
WebUI.setAlertText(_Content)

'Click OK button from the Prompt Dialog'
WebUI.acceptAlert()

'Verify result messagge'
WebUI.verifyElementText(findTestObject('Master Page/lbl_Result'), 'You entered: ' + _Content)

