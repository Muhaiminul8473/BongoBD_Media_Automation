package com.banking.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.banking.pageObjects.Bongo_Frontpage;
import com.banking.pageObjects.DramaPage;

public class TestCase2 extends Baseclass1{

	@Test
	public void Test() throws IOException, InterruptedException
	{
		
		Bongo_Frontpage Bf = new Bongo_Frontpage(driver);
		//Clicking and loading the drama present in the Front page
		Bf.clickOnDrama();
		
		DramaPage dr = new DramaPage(driver);

		Thread.sleep(2000);
		
		/*If the drama is clicked properly the page should redirect to the next page and
		 * visualize the other objects of the second page. So I took an element of the dramaPage and 
		 * checked its visibility to ensure The drama is clicked and the page & Drama is loaded properly
		 */
		boolean result = dr.CheckObjectsArePresent();
		
		if(result)
		{
			
			captureScreen(driver,"Test2");
			Assert.assertTrue(true);
			System.out.println("The drama is clicked and loaded");
			logger.info("The drama is clicked and loaded");
		}
		else
		{
			captureScreen(driver,"Test12Failed");
			Assert.assertTrue(false);
			System.out.println("The drama is not clicked and not loaded");
			logger.info("Test case failed./ The drama is not clicked and not loaded");
		}
		
		
		
		
	}
	
}
