package resource.commonUtils;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class RestLogger {
	private static Logger log=Logger.getLogger( RestLogger.class.getName());

	public static void initLogger() {
		PropertyConfigurator.configure("log4j.properties");
	}
	public static Logger getlogger() {
		return log;
		
	}
	public static void StratTestCase(String sTestCaseName) {
		
		log.info("********************************************************");
		log.info("********************************************************");
		log.info("$$$$$$$$$$$$$$$      "+sTestCaseName+"     $$$$$$$$$$$$$$");
		log.info("********************************************************");
		log.info("********************************************************");


	}
	public static void endTestCase() {
			
			log.info("XXXXXXXXXXXXXXXXXX     "+"-E--N--D-"+"     XXXXXXXXXXXXXXXXXX");
			log.info("XXXXXXXXXXXXXXXXXX*************************XXXXXXXXXXXXXXXXXX");
			log.info("XXXXXXXXXXXXXXXXXX*************************XXXXXXXXXXXXXXXXXX");
			log.info("X");
			log.info("X");
			log.info("X");
			log.info("X");
			
	
		}
	
		public static void info(String message) {
			log.info(message);
		}
		public static void warn(String message) {
			log.info(message);
	
			}
		public static void error(String message) {
			log.info(message);
	
		}
		public static void fatal(String message) {
			log.info(message);
	
		}
		public static void debug(String message) {
			log.info(message);
		}
}
