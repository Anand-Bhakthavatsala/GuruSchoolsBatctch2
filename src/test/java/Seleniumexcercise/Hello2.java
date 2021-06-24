package Seleniumexcercise;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
public class Hello2 {
	private static final Logger logger = LogManager.getLogger(Hello2.class);

	@Test
	public void hello()
	{
		// TODO Auto-generated method stub
		
		System.out.println("Hello");
		System.out.println("Welcome to java");
		logger.trace("We've just greeted the user!");
        logger.debug("We've just greeted the user!");
        logger.info("We've just greeted the user!");
        logger.warn("We've just greeted the user!");
        logger.error("We've just greeted the user!");
        logger.fatal("We've just greeted the user!");
        System.out.println("Added a new line");
	}

}
