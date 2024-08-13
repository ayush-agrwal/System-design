package com.chainofResponse;

public class MainClass {
	
	public static void main(String args[]) {
		
		
		LogProcessor logobject= new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
		
		logobject.log(LogProcessor.ERROR, "exception happned");
		logobject.log(LogProcessor.DEBUG, "Need to deBUg");
		logobject.log(LogProcessor.INFO, "Just for your info");
		
	}

}
