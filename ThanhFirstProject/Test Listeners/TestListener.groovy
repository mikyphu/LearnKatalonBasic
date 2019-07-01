import java.nio.file.Paths

import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

class TestListener {
	/**
	 * Executes before every test case starts.
	 * @param testCaseContext related information of the executed test case.
	 */
	@BeforeTestCase
	def beforeTestCase(TestCaseContext testCaseContext) {
		if (GlobalVariable.Download_Path.isEmpty())
		{ 
			KeywordUtil.logInfo("Set default download path folder of user")
			GlobalVariable.Download_Path= Paths.get(System.getProperty("user.home"), "Downloads").toString()+"/"
			
		}
	if(GlobalVariable.init_browser)
	{
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl(GlobalVariable.URL)
		 WebUI.waitForPageLoad(GlobalVariable.ShortTimeInSecond)
		}
	}

	/**
	 * Executes after every test case ends.
	 * @param testCaseContext related information of the executed test case.
	 */
	@AfterTestCase
	def afterTestCase(TestCaseContext testCaseContext) {		
		WebUI.closeBrowser();

	}
	
}