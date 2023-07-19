package com.AMRetailDonnnakaranAutomationScript.pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PLPPage {

WebDriver ldriver;
	
	public PLPPage(WebDriver rdriver)
	{
		this.ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//div[@class='header__container']/nav/ul/li[2]/a")
	WebElement mainmenu;
	
	@FindBy(xpath="//nav[@class='sidebar-megamenu _active']/ul/li[2]/div/ul/li[2]/div/ul/li[2]/a")
	WebElement submenu;
	
	@FindBy(xpath="//div[@class='page-title-wrapper']/h1[@id='page-title-heading']")
	WebElement title;
	
	@FindBy(xpath="//div[@class='breadcrumbs']/ul")
	WebElement breadcrumb;
	
	@FindBy(xpath="//div[@id='narrow-by-list']")
	WebElement filterbylist;
	
	@FindBy(xpath="//div[@id='aw-filter-sort']")
	WebElement sortbybtn;
	
	@FindBy(xpath="//div[@class='ias-btn-container']/button")
	WebElement loadmorebtn;
	
	@FindBy(xpath="//div[@class='modes']/a")
	WebElement gridswitch;
	
	@FindBy(xpath="//div[@class='header__container']/nav/ul/li[4]/a")
	WebElement homemainmenu;
	
	@FindBy(xpath="//nav[@class='sidebar-megamenu _active']/ul/li[4]/div/ul/li[2]/div/ul/li/a")
	WebElement beddingsubmenu;
	
	public void plpselectpdt()
	{
		ldriver.get("https://www.dkny.com/donnakaran/woman/clothing/jackets-outwear");
		/*ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		Actions a = new Actions(ldriver);
		a.moveToElement(mainmenu).click().perform();
		
		System.out.println("main menu  is selected");
		
		JavascriptExecutor jse = (JavascriptExecutor) ldriver;
		jse.executeScript("arguments[0].click();", submenu);
		System.out.println("Submenu is selected");*/
		
		
	}
	
	public void verifyplp()
	{	
		JavascriptExecutor jse = (JavascriptExecutor) ldriver;
		jse.executeScript("arguments[0].click();", breadcrumb);
		breadcrumb.isDisplayed();
		System.out.println("Breadcrumb is displayed");

		WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait1.until(ExpectedConditions.elementToBeClickable(title)).isDisplayed();
		System.out.println("Title is displayed");
		
		WebDriverWait wait3=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait3.until(ExpectedConditions.elementToBeClickable(filterbylist)).isDisplayed();
		System.out.println("Filter by List is displayed");
		
		WebDriverWait wait4=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait4.until(ExpectedConditions.elementToBeClickable(sortbybtn)).isDisplayed();
		System.out.println("Sort by button is displayed");
		
		WebDriverWait wait5=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait5.until(ExpectedConditions.elementToBeClickable(gridswitch)).isDisplayed();
		System.out.println("Grid switch/ list option is displayed");
		
		WebDriverWait wait6=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait6.until(ExpectedConditions.elementToBeClickable(loadmorebtn)).isDisplayed();
		System.out.println("Load more button is displayed");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void browseplp()
	{
		ldriver.get("https://www.dkny.com/donnakaran/home1/home");
		/*ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		Actions a = new Actions(ldriver);
		a.moveToElement(homemainmenu).click().perform();
		System.out.println("main menu  is selected");
		
		JavascriptExecutor jse = (JavascriptExecutor) ldriver;
		jse.executeScript("arguments[0].click();", beddingsubmenu);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Submenu is selected");*/
	}
	
	
}
