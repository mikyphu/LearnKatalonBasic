import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

TestObject slider = findTestObject('Horizontal Slider Page/Slider')
TestObject rangeValueObject = findTestObject('Horizontal Slider Page/span_RangeValue')

'Set Slider range and verify range value'
setSliderRange(slider,_expectedRangeValue)
'Verify range value is correct'
WebUI.verifyEqual(getCurrentSliderValue(rangeValueObject), _expectedRangeValue)


double getCurrentSliderValue(TestObject rangeValueObject) {
	String value=WebUI.getText(rangeValueObject)
	return Double.parseDouble(value)
}

void setSliderRange(TestObject slider,double rangeValue) {
	Double maxRange=Double.parseDouble(WebUI.getAttribute(slider, 'max'))
	int oneRangeValue = WebUI.getElementWidth(slider)/maxRange
	int expectedXCoord = (int) ((rangeValue - maxRange/2) * oneRangeValue)
	WebUI.dragAndDropByOffset(slider, expectedXCoord, 0)	
}
