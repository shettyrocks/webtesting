package viv.simple;

import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SampleTest {
	
	private static final Logger logger = LogManager.getLogger(SampleTest.class);

	@Test
	public void testfunction()
	{
		System.out.print("TestNg");
		logger.info("Test method : testfunction");
	}

}
