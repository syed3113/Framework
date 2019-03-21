package org.testing.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Logs {

	public static void take_logs(String classname, String message)
	{
		DOMConfigurator.configure("C:\\Users\\Sadia Shah\\eclipse-workspace\\YT_Framework\\layout.xml");
		Logger l = Logger.getLogger(classname);
		l.info(message);
	}
}
