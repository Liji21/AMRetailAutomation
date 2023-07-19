package com.AMRetailAndrewMarcAutomationScript.pageObjects;

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
	
	@FindBy(xpath="//div[@class='promo-bar__container js-promo-bar']/div/div/div/div/div/div[1]")
	WebElement promobanner;
	
	@FindBy(xpath="//div[@class='header__logo logo']/a")
	WebElement logo;
	
	@FindBy(xpath="//div[@class='header__inner header__bottom']/div[1]/nav/ul[1]")
	WebElement megamenu;
	
	@FindBy(xpath="//div[@class='header-top-nav']/ul/li[2]/a")
	WebElement livechat;
	
	@FindBy(xpath="//li[@class='header__nav-item store-switcher']/div/div/div/div")
	WebElement locationswitcher;
	
	@FindBy(xpath="//button[@class='search__btn']")
	WebElement searchicon;
	
	@FindBy(xpath="//li[@class='header__nav-item account']/div/a")
	WebElement myaccnticon;
	
	@FindBy(xpath="//div[@class='minicart-wrapper']/a")
	WebElement mycarticon;
	
	@FindBy(xpath="//div[@class='subscribe__field']/div/button")
	WebElement newsletterlabel;
		
	@FindBy(xpath="//nav[@class='footer__nav']/ul/li[1]/div")
	WebElement socialshareiconlink;
	
	@FindBy(xpath="//div[@class='store-search-block']/div/input[@id='odlocator-search']")
	WebElement zipcodelink;
	
	@FindBy(xpath="//div[@class='store-search-block']/div/button[@id='searchBtn']")
	WebElement searchbtn;
	
	@FindBy(xpath="//div[@class='store-locator__search-block']/button")
	WebElement nearbybtn;
	
	@FindBy(xpath="//nav[@class='footer__nav']/ul/li[3]/div/ul/li[1]/a")
	WebElement ourstorylink;
	
	@FindBy(xpath="//nav[@class='footer__nav']/ul/li[3]/div/ul/li[3]/a")
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
		wait2.until(ExpectedConditions.elementToBeClickable(termsofuselink)).click();
		System.out.println("Terms of use page is displayed ");

	}
}
