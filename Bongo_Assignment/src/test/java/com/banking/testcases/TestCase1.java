package com.banking.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.banking.pageObjects.Bongo_Frontpage;

public class TestCase1 extends Baseclass1{

	
	
	/* If User enters the Bongo BD URL Then he should redirect to the Bongo BD
	 * Front page and the Page title should be "BONGO | Watch Live Tv, Bangla Movies, Natoks Anytime Anywhere".
	 * So this Testcase is Created to evaluate this scenario
	 */
	
	@Test
	public void Test() throws IOException, InterruptedException
	{
		
		if(driver.getTitle().equals("BONGO | Watch Live Tv, Bangla Movies, Natoks Anytime Anywhere"))
		{
			
			String title = driver.getTitle();
			captureScreen(driver,"Test1");
			Assert.assertTrue(true);
			System.out.println("Bongo bd website opened and title is = "+title);
			logger.info("Bongo bd website opened");
		}
		else
		{
			captureScreen(driver,"Test1Failed");
			Assert.assertTrue(false);
			System.out.println("Bongo bd website not opened");
			logger.info("Test case failed./ Website not opened");
		}
		
		
		
	}
	
	
	
	
}
