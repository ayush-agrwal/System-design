package com.chainofResponse;

public class ErrorLogProcessor extends LogProcessor{

	public ErrorLogProcessor(LogProcessor logProcessor) {
		super(logProcessor);
		// TODO Auto-generated constructor stub
	}

public void log(int logLevel, String message) {
		
		if(logLevel ==ERROR) {
			
			System.out.println("Error:"+message);
		}
		else {
			
			super.log(logLevel, message);
		}
	}
}
