package com.banking.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bongo_Frontpage {
	
	WebDriver ldriver;
	
	public Bongo_Frontpage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[3]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/div[1]")
	@CacheLookup
	WebElement BestAndLatest;
	
	
	public void clickOnDrama() throws InterruptedException
	{
		BestAndLatest.click();
		
	}
	
	
}
