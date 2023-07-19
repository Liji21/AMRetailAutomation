package com.AMRetailkarllagerfeldparis.pageObjects;

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
	
	@FindBy(xpath="//div[@class='header__navigation']/nav/ul/li[2]")
	WebElement mainmenu;
	
	@FindBy(xpath="//div[@class='header__navigation']/nav/ul/li[2]/div/ul/li[2]/div/ul/li[1]/a")
	WebElement submenu;
	
	@FindBy(xpath="//div[@class='page-title-wrapper']/h1/span")
	WebElement title;
	
	@FindBy(xpath="//div[@class='breadcrumbs']/ul")
	WebElement breadcrumb;
	
	@FindBy(xpath="//button[@title='Filter & Sort']")
	WebElement filtersortbylist;
	
	@FindBy(xpath="//*[text()='Load More']")
	WebElement loadmorebtn;
	
	@FindBy(xpath="//div[@class='modes']/strong[2]")
	WebElement gridswitch;
	
	@FindBy(xpath="//ul[@class='megamenu__list']/li[5]/a")
	WebElement bagmainmenu;
	
	@FindBy(xpath="//ul[@class='megamenu__list']/li[5]/div/ul/li[2]/div/ul/li[4]/a")
	WebElement crossbodiessubmenu;
	
	public void plpselectpdt()
	{
		WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait1.until(ExpectedConditions.elementToBeClickable(mainmenu)).click();
		/*ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		Actions a = new Actions(ldriver);
		a.moveToElement(mainmenu).click();*/
		System.out.println("main menu  is selected");
		/*WebDriverWait wait2=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait2.until(ExpectedConditions.elementToBeClickable(submenu)).click();
		JavascriptExecutor jse = (JavascriptExecutor) ldriver;
		jse.executeScript("arguments[0].click();", submenu);
		submenu.click();*/
		//System.out.println("Sub menu is selected");		
	}
	public void verifyplp()
	{
		WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait1.until(ExpectedConditions.elementToBeClickable(title)).isDisplayed();
		System.out.println("Title is displayed");
		
		WebDriverWait wait2=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait2.until(ExpectedConditions.elementToBeClickable(breadcrumb)).isDisplayed();
		System.out.println("Breadcrumb is displayed");
		
		WebDriverWait wait3=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait3.until(ExpectedConditions.elementToBeClickable(filtersortbylist)).isDisplayed();
		System.out.println("Filter by List is displayed");
		
				
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
		a.moveToElement(bagmainmenu).perform();
		System.out.println("main menu  is selected");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JavascriptExecutor jse = (JavascriptExecutor) ldriver;
		jse.executeScript("arguments[0].click();", crossbodiessubmenu);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Submenu is selected");
	}
	
	
}
