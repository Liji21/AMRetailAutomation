package com.AMRetailAutomationScript.pageObjects;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
	
	@FindBy(xpath="//main[@id='maincontent']/div[2]/div[1]/div/div[2]/ul/li[1]")
	WebElement myaccntlink;
	
	@FindBy(xpath="//main[@id='maincontent']/div[2]/div[1]/div/div[2]/ul/li[2]")
	WebElement myorderslink;
	
	@FindBy(xpath="//main[@id='maincontent']/div[2]/div[1]/div/div[2]/ul/li[3]")
	WebElement mysaveditemslink;
	
	@FindBy(xpath="//main[@id='maincontent']/div[2]/div[1]/div/div[2]/ul/li[4]")
	WebElement mydetailslink;
	
	@FindBy(xpath="//main[@id='maincontent']/div[2]/div[1]/div/div[2]/ul/li[5]")
	WebElement myaddresseslink;
	
	@FindBy(xpath="//main[@id='maincontent']/div[2]/div[1]/div/div[2]/ul/li[6]")
	WebElement logoutlink;
	
	public void verifylinks()
	{
		WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait1.until(ExpectedConditions.elementToBeClickable(myaccntlink)).click();
		Assert.assertTrue(myaccntlink.isDisplayed());
		System.out.println("My DKNY account link is displayed");
		WebDriverWait wait2=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait2.until(ExpectedConditions.elementToBeClickable(myaccntlink)).click();
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
		logoutlink.click();
	}
}
