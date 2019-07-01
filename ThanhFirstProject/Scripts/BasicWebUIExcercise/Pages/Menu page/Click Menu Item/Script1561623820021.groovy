import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Click Menu Item Level 1'
CustomKeywords.'webUI.action.clickElement'(_MenuItemLevel1)

'Wait for Menu Item Level 2 being visible from the context menu'
WebUI.waitForElementVisible(_MenuItemLevel2,GlobalVariable.ShortTimeInSecond)

'Click Menu Item Level 2 '
CustomKeywords.'webUI.action.clickElement'(_MenuItemLevel2)

'If Menu Item Level 3 is not null, click on it'
if(_MenuItemLevel3 !=null)
{
	'Wait for Menu Item Level 3 being visible from the context menu'
	WebUI.waitForElementVisible(_MenuItemLevel3,GlobalVariable.ShortTimeInSecond)
	
	'Click Menu Item Level 3 '
	CustomKeywords.'webUI.action.clickElement'(_MenuItemLevel3)
}