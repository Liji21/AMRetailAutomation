package com.AMRetailkarllagerfeldparis.pageObjects;

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
	
	@FindBy(xpath="//div[@class='promo-bar']")
	WebElement promobanner;
	
	@FindBy(xpath="//div[@class='header__logo logo']")
	WebElement logo;
	
	@FindBy(xpath="//div[@class='header__navigation']")
	WebElement megamenu;
	
	@FindBy(xpath="//ul[@class='header__nav']/li[1]/a")
	WebElement livechat;
	
	@FindBy(xpath="//ul[@class='header__nav']/li[2]")
	WebElement locationswitcher;
	
	@FindBy(xpath="//ul[@class='header__nav']/li[4]")
	WebElement searchicon;
	
	@FindBy(xpath="//div[@class='header__wrapper']/div/div/ul/li[4]")
	WebElement wishlisticon;
	
	@FindBy(xpath="//ul[@class='header__nav']/li[5]")
	WebElement myaccnticon;
	
	@FindBy(xpath="//ul[@class='header__nav']/li[6]")
	WebElement mycarticon;
	
	@FindBy(xpath="//div[@class='newsletter__content']")
	WebElement newsletterlabel;
	
	@FindBy(xpath="//nav[@class='footer__nav']/ul/li[1]/a")
	WebElement findastorelink;
	
	@FindBy(xpath="//nav[@class='footer__nav']/ul/li[3]")
	WebElement socialshareiconlink;
		
	@FindBy(xpath="//nav[@class='footer__nav']/ul/li[5]/div/ul/li[1]/a")
	WebElement ourstorylink;
	
	@FindBy(xpath="//ul[@class='bottom-links']/li[2]/a")
	WebElement termsofuselink;
	
	@FindBy(xpath="//div[@data-testid='POPUP']/div/div/div/button")
	WebElement closeoffer;
	
	@FindBy(xpath="//div[@id='onetrust-button-group']/button[3]")
	WebElement acceptallcookie;
	
	@FindBy(xpath="//div[@data-testid='POPUP']/div/div/div/form/div/div[3]/div/div/input")
	WebElement newsemail;
	
	@FindBy(xpath="//div[@data-testid='POPUP']/div/div/div/form/div/div[4]/div/button")
	WebElement joinbtn;
	
	@FindBy(id="esw-country-currency")
	WebElement currency;
		
	@FindBy(xpath="//div[@id='eshopworld-landing-page']/div/div[2]/form/fieldset/div[2]/div/button")
	WebElement savebtn;
	
	public void closepopups() 
	{
		WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait1.until(ExpectedConditions.elementToBeClickable(acceptallcookie)).click();
		System.out.println("Accepted all cookies");
		
		WebDriverWait wait2=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait2.until(ExpectedConditions.elementToBeClickable(newsemail)).sendKeys("testqaaccnt@gmail.com");
		joinbtn.click();
		System.out.println("Subscribed");
		
		WebDriverWait wait3=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait3.until(ExpectedConditions.elementToBeClickable(closeoffer)).click();
		System.out.println("The pop up is closed");
	    
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
	    WebDriverWait wait4=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait4.until(ExpectedConditions.elementToBeClickable(savebtn)).click();
		
	}
	
	public void verifyhomepageElementsDisplay()
	{
		WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait1.until(ExpectedConditions.elementToBeClickable(promobanner)).isDisplayed();
		System.out.println("Promo banner is displayed");
		Assert.assertTrue(logo.isDisplayed());
		System.out.println("Logo is displayed");
		Assert.assertTrue(megamenu.isDisplayed());
		System.out.println("Megamenu is displayed");
		Assert.assertTrue(livechat.isDisplayed());
		System.out.println("Live chat is displayed");
		Assert.assertTrue(locationswitcher.isDisplayed());
		System.out.println("Location Switcher is displayed");
		Assert.assertTrue(searchicon.isDisplayed());
		System.out.println("Search icon is displayed");
		Assert.assertTrue(myaccnticon.isDisplayed());
		System.out.println("My Account icon is displayed");
		Assert.assertTrue(mycarticon.isDisplayed());
		System.out.println("My Cart icon is displayed");
		Assert.assertTrue(findastorelink.isDisplayed());
		System.out.println("Find a store link is displayed");
		Assert.assertTrue(socialshareiconlink.isDisplayed());
		System.out.println("Social Share icon link is displayed");
	}
	
	public void verifystorelocator()
	{
		ldriver.navigate().refresh();
		WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait1.until(ExpectedConditions.elementToBeClickable(findastorelink)).click();
		System.out.println("store Locator search successful");
	}
	
	public void browsecmspage()
	{
		WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait1.until(ExpectedConditions.elementToBeClickable(ourstorylink)).click();
		System.out.println("Our story page is displayed ");

		ldriver.navigate().refresh();
		WebDriverWait wait2=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait2.until(ExpectedConditions.elementToBeClickable(termsofuselink)).click();
		System.out.println("Terms of use page is displayed ");

	}
}
