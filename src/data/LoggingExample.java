package data;

import org.apache.log4j.Logger;

public class LoggingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger print = Logger.getLogger("devpinoyLogger");
		print.debug("hello");
		//System.out.println("hello");
		print.debug("we are writing in to a log file");
		print.debug("we are writing in to a log file");
		print.debug("we are writing in to a log file");
	}

}
