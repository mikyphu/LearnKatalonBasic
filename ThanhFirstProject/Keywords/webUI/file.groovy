package webUI
import java.nio.file.NoSuchFileException

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil
import java.nio.file.NoSuchFileException;


class file {
	/**
	 * 
	 * @param filePathName : absolute path
	 * @return true if file is existed.Else, return false
	 */
	@Keyword
	public  boolean isFileDownloaded(String filePathName) {
		try{
			File downloadedFile = new File(filePathName);
			Boolean isDownloaded=downloadedFile.exists();
			if (isDownloaded) {
				KeywordUtil.markPassed("File exists")
				return isDownloaded
			}
		}catch(NoSuchFileException e) {
			KeywordUtil.markFailed("File not existed")
		} catch (Exception e) {
			KeywordUtil.markFailed("Exception error when checking file existing")
		}
	}

	/**
	 * Delete a file
	 * @param path: absolute path
	 */
	@Keyword
	public  void deleteFile(String path)  {
		try {
			File downloadedFile = new File(path);
			KeywordUtil.logInfo('Deleting the file:'+path)
			downloadedFile.delete();
			KeywordUtil.markPassed("The file is deleted successfully")
		}catch(NoSuchFileException e) {
			KeywordUtil.markFailed("File not existed")
		} catch (Exception e) {
			KeywordUtil.markFailed("Exception error when deleting file")
		}
	}
}