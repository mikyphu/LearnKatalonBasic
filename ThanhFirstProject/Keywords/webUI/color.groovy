package webUI
import org.openqa.selenium.support.Color as Color;

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil


public class color {
	/**
	 * Compare 2 colors with different color type. Example: hex vs rgb, rgb vs rgba..
	 * @param color1
	 * @param color2
	 * @return true if 2 colors are equal
	 */
	@Keyword
	public static boolean isEqualColor(String color1, String color2) {

		try {
			String hex1 = Color.fromString(color1).asHex();
			String hex2 = Color.fromString(color2).asHex();
			return hex1.equals(hex2);
		} catch (IllegalArgumentException e) {
			KeywordUtil.markFailed("Failed to compare 2 colors")
			throw new IllegalArgumentException();
		}
	}
}