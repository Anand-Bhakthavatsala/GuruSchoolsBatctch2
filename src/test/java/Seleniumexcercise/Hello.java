package Seleniumexcercise;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Hello {
	private static final Logger logger = LogManager.getLogger(Hello.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello");
		logger.trace("We've just greeted the user!");
        logger.debug("We've just greeted the user!");
        logger.info("We've just greeted the user!");
        logger.warn("We've just greeted the user!");
        logger.error("We've just greeted the user!");
        logger.fatal("We've just greeted the user!");

	}

}
