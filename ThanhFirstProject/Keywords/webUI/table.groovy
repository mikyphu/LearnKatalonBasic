package webUI
import java.nio.file.NoSuchFileException

import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


class table {
	/**
	 * Get Data of all cells of 1 column
	 * @param columnCells
	 * @return an String array to get cell values
	 */
	@Keyword
	public String[] getDataOfColumnCells(TestObject columnCells ) {
		try{
			List<WebElement> emailList = WebUI.findWebElements(columnCells,30)
			int size = emailList.size();
			String[] arrayEmail = new String[size];
			for (int i = 0; i < size; i++) {
				arrayEmail[i] = emailList.get(i).getText();
			}
			return arrayEmail;
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Exception error when deleting file")
		}
	}
}
