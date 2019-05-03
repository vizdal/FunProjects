package Util;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class AppConstants {
	public static final Set<String> fileFormats = Collections.unmodifiableSet(
	        new HashSet<String>(Arrays.asList(
	        		"mp4",
	        		"mkv"
	        )));
	public static final String scanDirectory = "F:\\Movies";
	public static final Integer MP4_FILE = 1;
	public static final Integer MKV_FILE = 2;
	public static final Integer AVI_FILE = 3;
}
