package Util;

import java.io.File;
import java.io.FilenameFilter;

public class VideoFileFilter implements FilenameFilter{

	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		for(String ext: AppConstants.fileFormats) {
			if(name.endsWith(ext)) {
				return true;
			}
		}
		return false;
	}

}
