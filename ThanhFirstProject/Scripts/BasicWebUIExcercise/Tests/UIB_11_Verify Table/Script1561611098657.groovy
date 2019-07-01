import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Click Checkbox link from home page and open the Checkbox page'
WebUI.callTestCase(findTestCase('BasicWebUIExcercise/Pages/Home Page/Click any link on Home Page and verify page title'), 
    [('linkNameText') : 'Sortable Data Tables', ('pageTitle') : 'Data Tables'], FailureHandling.STOP_ON_FAILURE)

'Get header of column 3- table1'
String headerName = WebUI.getText(findTestObject('Data Table Page/td_Table1_Header', [('columnIndex') : '3']))

'Verify Header name of column 3-table 1 is Email'
WebUI.verifyEqual(headerName, findTestData('TestData_UIB_11').getValue(1, 1))

'Verify cell value (row 3, column 2) on Table 1 is Jason'
WebUI.verifyElementText(findTestObject('Data Table Page/td_Table1_Cell', [('rowIndex') : '3', ('columnIndex') : '2']), findTestData(
        'TestData_UIB_11').getValue(2, 1))

'Verify cell value (row 2, column 4) on Table 1 is $51.00'
WebUI.verifyElementText(findTestObject('Data Table Page/td_Table1_Cell', [('rowIndex') : '2', ('columnIndex') : '4']), findTestData(
        'TestData_UIB_11').getValue(3, 1))

'Get current values of Email cells  on table 2 Before sorting'
String[] ExpectedEmailList = CustomKeywords.'webUI.table.getDataOfColumnCells'(findTestObject('Data Table Page/td_Table2_Email_Cells'))

'Click on Email header of Table 2 to apply Sort function'
WebUI.click(findTestObject('Data Table Page/td_Table2_Header', [('columnIndex') : '3']))

'Get Email List on Table 2 after Sorting'
String[] actualEmailList = CustomKeywords.'webUI.table.getDataOfColumnCells'(findTestObject('Data Table Page/td_Table2_Email_Cells'))

'Create expected email list after applying sort at Email column on table 2'
Arrays.sort(ExpectedEmailList)

'Verify Email list is sorted properly'
WebUI.verifyEqual(ExpectedEmailList, actualEmailList)

