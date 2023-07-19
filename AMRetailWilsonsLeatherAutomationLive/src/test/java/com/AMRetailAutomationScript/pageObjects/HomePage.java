package com.AMRetailAutomationScript.pageObjects;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage 
{
	WebDriver ldriver;
	
	public HomePage(WebDriver rdriver)
	{
		this.ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//header[@class='header is-sticky transparent header__promo-enable']/div[1]/div[1]")
	WebElement promobanner;
	
	@FindBy(xpath="//div[@class='header__inner-wrapper']/div[1]/a")
	WebElement logo;
	
	@FindBy(xpath="//div[@class='header__inner-wrapper']/div[2]")
	WebElement megamenu;
		
	@FindBy(xpath="//div[@class='header__inner-wrapper']/ul/li[3]/button")
	WebElement searchicon;
	
	@FindBy(xpath="//div[@class='header__inner-wrapper']/ul/li[5]/div/a")
	WebElement myaccnticon;
	
	@FindBy(xpath="//div[@class='header__inner-wrapper']/ul/li[6]/div/a")
	WebElement mycarticon;
	
	@FindBy(xpath="//form[@class='block-newsletter__form']/label")
	WebElement newsletterlabel;
	
	@FindBy(xpath="//nav[@class='footer__nav']/ul/li[1]/div")
	WebElement socialshareiconlink;
	
	@FindBy(xpath="//nav[@class='footer__nav']/ul/li[3]/div/ul/li[2]")
	WebElement ourstorylink;
	
	@FindBy(xpath="//nav[@class='footer__nav']/ul/li[4]/div/ul/li[1]")
	WebElement privacypolicy;
	
	public void verifyhomepageElements()
	{
		WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait1.until(ExpectedConditions.elementToBeClickable(promobanner)).click();
		Assert.assertTrue(promobanner.isDisplayed());
		System.out.println("Promo banner is displayed");
		Assert.assertTrue(logo.isDisplayed());
		System.out.println("Logo is displayed");
		Assert.assertTrue(megamenu.isDisplayed());
		System.out.println("Megamenu is displayed");
		
		Assert.assertTrue(searchicon.isDisplayed());
		System.out.println("Search icon is displayed");
		
		Assert.assertTrue(myaccnticon.isDisplayed());
		System.out.println("My Account icon is displayed");
		Assert.assertTrue(mycarticon.isDisplayed());
		System.out.println("My Cart icon is displayed");
		
		Assert.assertTrue(socialshareiconlink.isDisplayed());
		System.out.println("Social Share icon link is displayed");
	}
	
	
	public void browsecmspage()
	{
		ldriver.navigate().refresh();
		WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait1.until(ExpectedConditions.elementToBeClickable(ourstorylink)).click();
		System.out.println("Our story page is displayed ");

		ldriver.navigate().refresh();
		WebDriverWait wait2=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait2.until(ExpectedConditions.elementToBeClickable(privacypolicy)).click();
		System.out.println("Privacy Policy page is displayed ");

	}
}
