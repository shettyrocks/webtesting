package viv.simple;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SampleTest {
	
	private static final Logger logger = LogManager.getLogger(SampleTest.class);

	@Test
	public void testfunction()
	{
		logger.info("Test method : testfunction");
		System.out.print("TestNg");
		Assert.assertEquals(true, true);
	}
}