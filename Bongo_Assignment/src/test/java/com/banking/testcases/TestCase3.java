package com.banking.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.banking.pageObjects.Bongo_Frontpage;
import com.banking.pageObjects.DramaPage;

public class TestCase3 extends Baseclass1{

	@Test
	public void Test() throws IOException, InterruptedException
	{
		
		Bongo_Frontpage Bf = new Bongo_Frontpage(driver);
		//Clicking and loading the drama present in the Front page
		Bf.clickOnDrama();
		
		DramaPage dr = new DramaPage(driver);

		Thread.sleep(2000);
		
		/*If the drama is clicked properly the page should redirect to the next page and
		 * the drama should start to play. When the drama is playing there is a timer displayed at the
		 * right bottom corner of the media. The below function returns true if the timer contains time and
		 * returns false if it is not present which means the video is not playing.
		 */
		boolean result = dr.CheckvideoIsPlaying();
		
		if(result)
		{
			
			captureScreen(driver,"Test3");
			Assert.assertTrue(true);
			System.out.println("The drama is playing");
			logger.info("The drama is playing");
		}
		else
		{
			captureScreen(driver,"Test12Failed");
			Assert.assertTrue(false);
			System.out.println("The drama is not playing");
			logger.info("The drama is not playing");
		}
		
		
		
		
	}
	
}

