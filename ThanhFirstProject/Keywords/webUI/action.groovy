package webUI
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class action {

	@Keyword
	public void pressKey(Keys key) {
		Actions action = new Actions(DriverFactory.getWebDriver());
		action.sendKeys(key).perform();
		KeywordUtil.markPassed("Press key successfully")
	}
	@Keyword
	public void pressKey(String key) {
		try{
			Actions action = new Actions(DriverFactory.getWebDriver());
			action.sendKeys(key).perform();
			KeywordUtil.markPassed("Press key successfully")
		}catch (Exception e) {
			KeywordUtil.markFailed("Fail to press KEY")
		}
	}

	/**
	 * Click a element object by execueting JavaScript
	 * @param to
	 * @return
	 */
	@Keyword
	public void clickElement(TestObject to) {
		try {
			WebElement element = WebUI.findWebElement(to);
			KeywordUtil.logInfo("Clicking element")
			WebUI.executeJavaScript("arguments[0].click();", Arrays.asList(element))
			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}

	/**
	 * Drag and drop source element to target element by execueting JavaScript
	 * @param sourceObject
	 * @param targetObject
	 */
	@Keyword
	public void dragAndDrop(TestObject sourceObject,TestObject targetObject) {
		try {

			WebElement source = WebUI.findWebElement(sourceObject)
			WebElement target = WebUI.findWebElement(targetObject)
			String scriptContent ="var src=arguments[0],tgt=arguments[1];var dataTransfer={dropEffe" +
					"ct:'',effectAllowed:'all',files:[],items:{},types:[],setData:fun" +
					"ction(format,data){this.items[format]=data;this.types.append(for" +
					"mat);},getData:function(format){return this.items[format];},clea" +
					"rData:function(format){}};var emit=function(event,target){var ev" +
					"t=document.createEvent('Event');evt.initEvent(event,true,false);" +
					"evt.dataTransfer=dataTransfer;target.dispatchEvent(evt);};emit('" +
					"dragstart',src);emit('dragenter',tgt);emit('dragover',tgt);emit(" +
					"'drop',tgt);emit('dragend',src);";
			KeywordUtil.logInfo("Draging and Droping source element to target element")
			WebUI.executeJavaScript(scriptContent, Arrays.asList(source,target))
			KeywordUtil.markPassed("Source element has been draged and dropped to target element successfully")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to drag and drop the element")
		}
	}
}