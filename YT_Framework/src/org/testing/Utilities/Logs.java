package org.testing.Utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Logs 
{
	public static void takeLogs(String classname, String message) 
	{
		DOMConfigurator.configure("../YT_Framework/Layout.xml");
		Logger l = Logger.getLogger(classname);
		l.info(message);
	}
}