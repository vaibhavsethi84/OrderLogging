package com.utils;

public class LoggerUtils {
	public static String truncate(String ipString,int maxLen){
		String opString=ipString;
		if(ipString.length() - maxLen >=2 && maxLen>22){
			int charToPick = maxLen - 21;
			int from = charToPick/2;
			from = charToPick%2 > 0 ? from+1 : from;
			int to = ipString.length() - (charToPick/2);
			opString = ipString.substring(0, from) + " ... (truncated) ... " + ipString.substring(to);
		}
		return opString;
	}
	public static void log(String logString){
		System.out.println(logString);
	}
}
