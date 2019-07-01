import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.TearDown as TearDown
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

'Click JQuery UI Menus link from home page to open the page'
WebUI.callTestCase(findTestCase('BasicWebUIExcercise/Pages/Home Page/Click any link on Home Page and verify page title'), 
    [('linkNameText') : 'JQuery UI Menus', ('pageTitle') : 'JQueryUI - Menu'], FailureHandling.STOP_ON_FAILURE)

'Click Enable Menu >>Back to JQuery'
WebUI.callTestCase(findTestCase('BasicWebUIExcercise/Pages/Menu page/Click Menu Item'), [('_MenuItemLevel1') : findTestObject(
            'JQueryUI Menu Page/lnk_Enabled'), ('_MenuItemLevel2') : findTestObject('JQueryUI Menu Page/lnk_Back to JQuery UI')
        , ('_MenuItemLevel3') : findTestObject(null)], FailureHandling.STOP_ON_FAILURE)

'Wait for next page loading'
WebUI.waitForElementVisible(findTestObject('JQueryUI Menu Page/lnk_Menu'), 10, FailureHandling.STOP_ON_FAILURE)

'Verify title of the new page'
WebUI.verifyElementText(findTestObject('Master Page/lbl_PageTitle'), 'JQuery UI')

'Click Menu link to return JQueryUI - Menu '
WebUI.click(findTestObject('JQueryUI Menu Page/lnk_Menu'))

'Wait for next page \'JQueryUI - Menu\' loading'
WebUI.waitForElementVisible(findTestObject('JQueryUI Menu Page/lnk_Enabled'), 10, FailureHandling.STOP_ON_FAILURE)

'Verify page title is JQueryUI - Menu'
WebUI.verifyElementText(findTestObject('Master Page/lbl_PageTitle'), 'JQueryUI - Menu')

'Click Enable Menu >>Download >> CSV'
WebUI.callTestCase(findTestCase('BasicWebUIExcercise/Pages/Menu page/Click Menu Item'), [('_MenuItemLevel1') : findTestObject(
            'JQueryUI Menu Page/lnk_Enabled'), ('_MenuItemLevel2') : findTestObject('Object Repository/JQueryUI Menu Page/lnk_Downloads')
        , ('_MenuItemLevel3') : findTestObject('Object Repository/JQueryUI Menu Page/lnk_CSV')], FailureHandling.STOP_ON_FAILURE)

'Wait for downloading file'
WebUI.delay(5)

'Verifying the file is download in the User defined Path'
Boolean isExisted=CustomKeywords.'webUI.file.isFileDownloaded'(GlobalVariable.Download_Path + _FileName)
WebUI.verifyEqual(isExisted, true)

@TearDown
def tearDownTestCase() {
	CustomKeywords.'webUI.file.deleteFile'(GlobalVariable.Download_Path+_FileName)
}

