package logTest;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.slf4j.LoggerFactory;

public class LogTest {
	static Logger slf4jLogger = (Logger) LoggerFactory.getLogger(LogTest.class);
	static Logger log4j = Logger.getLogger(LogTest.class);

	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		log4j.info("info msg"); 

	}
}
