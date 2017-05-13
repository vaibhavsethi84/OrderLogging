package com.utils;

public class LoggerUtils {
	public static String truncate(String ipString,int maxLen){
		StringBuffer opString= new StringBuffer();
		if(ipString.length() - maxLen >=2 && maxLen>22){
			int charToPick = maxLen - 21;
			int from = charToPick/2;
			from = charToPick%2 > 0 ? from+1 : from;
			int to = ipString.length() - (charToPick/2);
			opString = opString.append(ipString.substring(0, from)).append(" ... (truncated) ... ").append(ipString.substring(to));
		}else{
			return ipString;
		}
		return opString.toString();
	}
	public static void log(String logString){
		System.out.println(logString);
	}
}
