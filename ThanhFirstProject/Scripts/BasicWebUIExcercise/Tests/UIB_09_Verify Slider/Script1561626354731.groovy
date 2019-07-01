import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase 
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Click Horizontal Slider link from home page and open the  page'
WebUI.callTestCase(findTestCase('BasicWebUIExcercise/Pages/Home Page/Click any link on Home Page and verify page title'), 
    [('linkNameText') : 'Horizontal Slider', ('pageTitle') : 'Horizontal Slider'], FailureHandling.STOP_ON_FAILURE)

'Drag slider to Range Value1 and verify the range value '
WebUI.callTestCase(findTestCase('BasicWebUIExcercise/Pages/Slider Page/Drag and Verify Slider Range Value'), [('_expectedRangeValue') : Double.parseDouble(findTestData('TestData_UIB_09').getValue(1, 1))], FailureHandling.STOP_ON_FAILURE)

'Drag slider to Range Value2 and verify the range value '
WebUI.callTestCase(findTestCase('BasicWebUIExcercise/Pages/Slider Page/Drag and Verify Slider Range Value'), [('_expectedRangeValue') : Double.parseDouble(findTestData('TestData_UIB_09').getValue(2, 1))], 
FailureHandling.STOP_ON_FAILURE)

'Drag slider to Range Value3 and verify the range value '
WebUI.callTestCase(findTestCase('BasicWebUIExcercise/Pages/Slider Page/Drag and Verify Slider Range Value'), [('_expectedRangeValue') : Double.parseDouble(findTestData('TestData_UIB_09').getValue(3, 1))], 
FailureHandling.STOP_ON_FAILURE)

