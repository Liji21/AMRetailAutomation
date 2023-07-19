package com.AMRetailDonnnakaranAutomationScript.pageObjects;

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
	
	@FindBy(xpath="//header[@class='header']/div[1]/div")
	WebElement promobanner;
	
	@FindBy(xpath="//div[@class='header__wrapper']/div/a")
	WebElement logo;
	
	@FindBy(xpath="//div[@class='header__wrapper']/div/nav/ul")
	WebElement megamenu;
	
	@FindBy(xpath="//div[@class='header__wrapper']/div/div/ul/li[1]")
	WebElement livechat;
	
	@FindBy(xpath="//div[@class='header__wrapper']/div/div/ul/li[2]")
	WebElement locationswitcher;
	
	@FindBy(xpath="//div[@class='header__wrapper']/div/div/ul/li[3]")
	WebElement searchicon;
	
	@FindBy(xpath="//div[@class='header__wrapper']/div/div/ul/li[4]")
	WebElement wishlisticon;
	
	@FindBy(xpath="//div[@class='header__wrapper']/div/div/ul/li[5]")
	WebElement myaccnticon;
	
	@FindBy(xpath="//div[@class='header__wrapper']/div/div/ul/li[6]")
	WebElement mycarticon;
	
	@FindBy(xpath="//form[@class='block-newsletter__form']/label")
	WebElement newsletterlabel;
	
	@FindBy(xpath="//div[@class='footer-nav__wrapper']/div/nav/ul/li[1]/a")
	WebElement findastorelink;
	
	@FindBy(xpath="//div[@class='footer-nav__wrapper']/div/nav/ul/li[1]/a")
	WebElement socialshareiconlink;
	
	@FindBy(xpath="//div[@class='store-search-block']/div/input[@id='odlocator-search']")
	WebElement zipcodelink;
	
	@FindBy(xpath="//div[@class='store-search-block']/div/button[@id='searchBtn']")
	WebElement searchbtn;
	
	@FindBy(xpath="//div[@class='store-locator__search-block']/button")
	WebElement nearbybtn;
	
	@FindBy(xpath="//ul[@class='footer-nav__list']/li[5]/div/ul/li[1]/a")
	WebElement ourstorylink;
	
	@FindBy(xpath="//ul[@class='footer-nav__list']/li[6]/div/ul/li[1]/a")
	WebElement termsofuselink;
	
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
		Assert.assertTrue(livechat.isDisplayed());
		System.out.println("Live chat is displayed");
		Assert.assertTrue(locationswitcher.isDisplayed());
		System.out.println("Location Switcher is displayed");
		Assert.assertTrue(searchicon.isDisplayed());
		System.out.println("Search icon is displayed");
		Assert.assertTrue(wishlisticon.isDisplayed());
		System.out.println("Wish list icon is displayed");
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
