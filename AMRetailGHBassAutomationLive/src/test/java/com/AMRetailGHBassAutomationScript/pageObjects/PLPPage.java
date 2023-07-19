package com.AMRetailGHBassAutomationScript.pageObjects;

import java.time.Duration;
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
	
	@FindBy(xpath="//ul[@class='megamenu__list']/li[2]/a")
	WebElement mainmenu;
	
	@FindBy(xpath="//ul[@class='megamenu__list']/li[2]/div/ul/li[2]/div/ul/li[2]/a")
	WebElement submenu;
	
	@FindBy(xpath="//div[@class='columns-top__content']/div/h1")
	WebElement title;
	
	@FindBy(xpath="//div[@class='breadcrumbs']/ul")
	WebElement breadcrumb;
	
	@FindBy(xpath="//div[@id='narrow-by-list']")
	WebElement filterbylist;
	
	@FindBy(xpath="//div[@id='filter-block-control-wrap']/div/div[1]/button")
	WebElement sortbybtn;
	
	@FindBy(xpath="//div[@class='ias-btn-container ias-trigger-next']/button")
	WebElement loadmorebtn;
	
	@FindBy(xpath="//div[@id='filter-block-control-wrap']/div/div[4]")
	WebElement gridswitch;
		
	@FindBy(xpath="//ul[@class='megamenu__list']/li[4]/a")
	WebElement mainmenu2;
	
	public void plpselectpdt()
	{
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		Actions a = new Actions(ldriver);
		a.moveToElement(mainmenu).click().perform();
		mainmenu.click();
		System.out.println("main menu  is selected");
		/*WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait1.until(ExpectedConditions.elementToBeClickable(submenu)).click();
		System.out.println("Submenu is selected");*/
		
	}
	
	public void verifyplp()
	{
		WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait1.until(ExpectedConditions.elementToBeClickable(title)).isDisplayed();
		System.out.println("Title is displayed");
		
		WebDriverWait wait2=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait2.until(ExpectedConditions.elementToBeClickable(breadcrumb)).isDisplayed();
		System.out.println("Breadcrumb is displayed");
		
		/*WebDriverWait wait3=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait3.until(ExpectedConditions.elementToBeClickable(filterbylist)).isDisplayed();
		System.out.println("Filter by List is displayed");*/
		
		WebDriverWait wait4=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait4.until(ExpectedConditions.elementToBeClickable(sortbybtn)).isDisplayed();
		System.out.println("Filter by and Sort by buttons are displayed");
		
		WebDriverWait wait5=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait5.until(ExpectedConditions.elementToBeClickable(gridswitch)).isDisplayed();
		System.out.println("Grid switch/ list option is displayed");
		
		WebDriverWait wait6=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait6.until(ExpectedConditions.elementToBeClickable(loadmorebtn)).isDisplayed();
		System.out.println("Load more button is displayed");
	}
	
	public void browseplp()
	{
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		Actions a = new Actions(ldriver);
		a.moveToElement(mainmenu2).perform();
		System.out.println("main menu  is selected");
		
		
	}
	
	
}
