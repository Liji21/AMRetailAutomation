package com.AMRetailGHBassAutomationScript.pageObjects;

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
	
	@FindBy(xpath="//div[@class='promo-bar promo-bar--white']")
	WebElement promobanner;
	
	@FindBy(xpath="//div[@class='header__inner']/div[1]/a")
	WebElement logo;
	
	@FindBy(xpath="//div[@class='header__inner']/div[2]/div[1]/nav/ul")
	WebElement megamenu;
	
	@FindBy(xpath="//div[@class='header__inner']/div[2]/ul/li[1]")
	WebElement livechat;
	
	@FindBy(xpath="//div[@class='header__inner']/div[2]/ul/li[2]")
	WebElement locationswitcher;
	
	@FindBy(xpath="//div[@class='header__inner']/div[2]/ul/li[5]")
	WebElement searchicon;
	
	@FindBy(xpath="//div[@class='header__wrapper']/div/div/ul/li[4]")
	WebElement wishlisticon;
	
	@FindBy(xpath="//div[@id='login-register']/a")
	WebElement myaccnticon;
	
	@FindBy(xpath="//div[@data-block='minicart']/a")
	WebElement mycarticon;
	
	@FindBy(xpath="//div[@class='subscribe__field']/div/button/span")
	WebElement newsletterlabel;
	
	@FindBy(xpath="//ul[@class='footer__menu menu']/li[5]/div/a")
	WebElement findastorelink;
	
	@FindBy(xpath="//nav[@class='footer__nav']/ul/li[1]/div/ul")
	WebElement socialshareiconlink;
	
	@FindBy(xpath="//div[@class='store-search-block']/div/input[@id='odlocator-search']")
	WebElement zipcodelink;
	
	@FindBy(xpath="//div[@class='store-search-block']/div/button[@id='searchBtn']")
	WebElement searchbtn;
	
	@FindBy(xpath="//div[@class='store-locator__search-block']/button")
	WebElement nearbybtn;
	
	@FindBy(xpath="//nav[@class='footer__nav']/ul/li[3]/div/ul/li[1]")
	WebElement ourstorylink;
	
	@FindBy(xpath="//nav[@class='footer__nav']/ul/li[4]/div/ul/li[1]")
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
	
	public void verifystorelocator()
	{
		WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait1.until(ExpectedConditions.elementToBeClickable(findastorelink)).click();
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait.until(ExpectedConditions.elementToBeClickable(nearbybtn)).isDisplayed();
		System.out.println("Near by button is displayed ");
		/*WebDriverWait wait2=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait2.until(ExpectedConditions.elementToBeClickable(zipcodelink)).sendKeys("10120");;
		WebDriverWait wait3=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait3.until(ExpectedConditions.elementToBeClickable(searchbtn)).click();*/
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
