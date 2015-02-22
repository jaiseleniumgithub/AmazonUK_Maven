package com.cts.qa.pageobject;

import org.openqa.selenium.By;


import com.cts.qa.TestBase;

public class HomePage extends TestBase{
	
	public void launchAmazon(String browser,String url){
		initWebDriver(browser);
		getUrl(url);
	}
	
	public void navigateToPhoneAndAccessories() throws Exception{
	
		//add an apple iphone 6 using navigation links
		implicitWait(20);
		clickButton(By.id("nav-shop-all-button"));		
		implicitWait(20);
		clickButton(By.linkText("Phones & Accessories"));		
	}
	
	public void selectAppleIPhone() throws Exception{
		implicitWait(20);
		clickButton(By.linkText("Apple iPhone"));	
		implicitWait(20);;
		clickButton(By.xpath(".//*[contains(text(),'Apple iPhone 6 4.7')]"));	
		
	}
	public void closeBrowser (){
		quitDriver();
	}
	
	}
