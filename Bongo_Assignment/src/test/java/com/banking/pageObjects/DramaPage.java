package com.banking.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DramaPage {

	WebDriver ldriver;
	
	public DramaPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	

	public boolean CheckObjectsArePresent() {
	    boolean result = false;
	    int attempts = 0;
	    while(attempts < 10) {
	        try {
	            WebElement superActiondrama =  ldriver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/div[1]"));
	            if(superActiondrama.isDisplayed())
	            {
	            	result = true;
	            	
	            }
	            break;
	            
	            
	        } catch(Exception e) {
	        	
	        }
	        attempts++;
	    }
	    return result;
	}
	
	public boolean CheckvideoIsPlaying() {
	    boolean result = false;
	    int attempts = 0;
	    while(attempts < 10) {
	        try {
	            String timer =  ldriver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/video-js[1]/div[4]/div[3]/span[3]")).getText();
	      

	            if(timer!=null)
	            {
	            	result = true;
	            	break;
	            }
	            
	            
	            
	        } catch(Exception e) {
	        	System.out.println(e);
	        }
	        attempts++;
	    }
	    return result;
	}
	

	
}
