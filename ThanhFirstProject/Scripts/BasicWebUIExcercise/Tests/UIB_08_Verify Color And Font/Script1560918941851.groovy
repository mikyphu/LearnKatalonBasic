import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Click Challenging DOM link and open Challenging DOM page'
WebUI.callTestCase(findTestCase('BasicWebUIExcercise/Pages/Home Page/Click any link on Home Page and verify page title'), 
    [('linkNameText') : 'Challenging DOM', ('pageTitle') : 'Challenging DOM'], FailureHandling.STOP_ON_FAILURE)

'Get and Verify Attribute of Button 1'
WebUI.callTestCase(findTestCase('BasicWebUIExcercise/Pages/Chanllenge DOM page/Get And Verify Button Attributes'), [('expectedFontSize') : findTestData(
            'TestData_UIB_08').getValue(1, 1), ('expectedFontWeight') : findTestData('TestData_UIB_08').getValue(2, 1), ('expectedBGColor') : findTestData(
            'TestData_UIB_08').getValue(3, 1), ('expectedTextColor') : findTestData('TestData_UIB_08').getValue(4, 1), ('expectedBorderColor') : findTestData(
            'TestData_UIB_08').getValue(5, 1), ('ButtonObject') : findTestObject('Chanllenge DOM Page/btn_Button1')], 
    FailureHandling.STOP_ON_FAILURE)

'Get and Verify Attribute of Button 2'
WebUI.callTestCase(findTestCase('BasicWebUIExcercise/Pages/Chanllenge DOM page/Get And Verify Button Attributes'), [('expectedFontSize') : findTestData(
			'TestData_UIB_08').getValue(1, 1), ('expectedFontWeight') : findTestData('TestData_UIB_08').getValue(2, 1), ('expectedBGColor') : findTestData(
			'TestData_UIB_08').getValue(6, 1), ('expectedTextColor') : findTestData('TestData_UIB_08').getValue(7, 1), ('expectedBorderColor') : findTestData(
			'TestData_UIB_08').getValue(8, 1), ('ButtonObject') : findTestObject('Chanllenge DOM Page/btn_Button2')],
	FailureHandling.STOP_ON_FAILURE)

'Get and Verify Attribute of Button 3'
WebUI.callTestCase(findTestCase('BasicWebUIExcercise/Pages/Chanllenge DOM page/Get And Verify Button Attributes'), [('expectedFontSize') : findTestData(
			'TestData_UIB_08').getValue(1, 1), ('expectedFontWeight') : findTestData('TestData_UIB_08').getValue(2, 1), ('expectedBGColor') : findTestData(
			'TestData_UIB_08').getValue(9, 1), ('expectedTextColor') : findTestData('TestData_UIB_08').getValue(10, 1), ('expectedBorderColor') : findTestData(
			'TestData_UIB_08').getValue(11, 1), ('ButtonObject') : findTestObject('Chanllenge DOM Page/btn_Button3')],
	FailureHandling.STOP_ON_FAILURE)