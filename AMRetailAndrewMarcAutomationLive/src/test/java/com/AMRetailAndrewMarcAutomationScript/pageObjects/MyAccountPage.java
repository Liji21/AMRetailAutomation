package com.AMRetailAndrewMarcAutomationScript.pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;

public class MyAccountPage 
{

WebDriver ldriver;
	
	public MyAccountPage(WebDriver rdriver)
	{
		this.ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//div[@id='login-register']/a")
	WebElement myaccnticon;
	
	@FindBy(xpath="//div[@class='sidebar sidebar-main']/div/div[2]/ul/li[1]")
	WebElement mydashboardlink;
	
	@FindBy(xpath="//div[@class='sidebar sidebar-main']/div/div[2]/ul/li[2]/a")
	WebElement myorderslink;
	
	@FindBy(xpath="//div[@class='sidebar sidebar-main']/div/div[2]/ul/li[3]/a")
	WebElement mysaveditemslink;
	
	@FindBy(xpath="//div[@class='sidebar sidebar-main']/div/div[2]/ul/li[4]/a")
	WebElement mydetailslink;
	
	@FindBy(xpath="//div[@class='sidebar sidebar-main']/div/div[2]/ul/li[5]/a")
	WebElement myaddresseslink;
	
	@FindBy(xpath="//div[@class='sidebar sidebar-main']/div/div[2]/ul/li[6]/a")
	WebElement logoutlink;
	
	public void verifylinks()
	{
		
		Assert.assertTrue(mydashboardlink.isDisplayed());
		System.out.println("My dashboard link is displayed");
		
		Assert.assertTrue(myorderslink.isDisplayed());
		System.out.println("My orders link is displayed");
		Assert.assertTrue(mysaveditemslink.isDisplayed());
		System.out.println("My saved link is displayed");
		Assert.assertTrue(mydetailslink.isDisplayed());
		System.out.println("My details link is displayed");
		Assert.assertTrue(myaddresseslink.isDisplayed());
		System.out.println("My addresses link is displayed");
		Assert.assertTrue(logoutlink.isDisplayed());
		System.out.println("Logout link is displayed");
		
	}
}
