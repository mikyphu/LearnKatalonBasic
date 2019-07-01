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

'Get Font Size of Test Object'
actualFontSize = WebUI.getCSSValue(ButtonObject, 'font-size')

'Verify Font Size of Test Object'
WebUI.verifyEqual(actualFontSize, expectedFontSize)

'Get Font Weight of Test Object'
actualFontWeight = WebUI.getCSSValue(ButtonObject, 'font-weight')

'Verify Font Weight of Test Object'
WebUI.verifyEqual(actualFontWeight, expectedFontWeight)

'Get Background Color of Test Object'
actualBGColor = WebUI.getCSSValue(ButtonObject, 'background-color')

'Verify Background Color of button'
WebUI.verifyEqual(CustomKeywords.'webUI.color.isEqualColor'(actualBGColor, expectedBGColor), true)

'Get Text Color of Test Object'
actualTextColor = WebUI.getCSSValue(ButtonObject, 'color')

'Verify Text Color of Test Object'
WebUI.verifyEqual(CustomKeywords.'webUI.color.isEqualColor'(actualTextColor, expectedTextColor), true)

'Get Top Border Color of Test Object'
actualBorderColor = WebUI.getCSSValue(ButtonObject, 'border-top-color')

'Verify Top Border Color of Test Object'
WebUI.verifyEqual(CustomKeywords.'webUI.color.isEqualColor'(actualBorderColor, expectedBorderColor), true)

