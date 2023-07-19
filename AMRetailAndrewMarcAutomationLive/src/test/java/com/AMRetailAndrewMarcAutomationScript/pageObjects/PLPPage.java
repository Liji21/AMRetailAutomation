package com.AMRetailAndrewMarcAutomationScript.pageObjects;

import java.time.Duration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	
	@FindBy(xpath="//div[@class='header__navigation']/nav/ul[1]/li[2]/a")
	WebElement mainmenu;
	
	@FindBy(xpath="//div[@class='header__navigation']/nav/ul[1]/li[2]/div/ul/li[2]/a")
	WebElement submenu;
	
	@FindBy(xpath="//div[@class='page-title-wrapper']/h1")
	WebElement title;
	
	@FindBy(xpath="//div[@class='breadcrumbs']/ul")
	WebElement breadcrumb;
	
	@FindBy(xpath="//div[@class='block-title filter-title']/button")
	WebElement filterandsort;
	
	@FindBy(xpath="//div[@class='ias-btn-container ias-trigger-next']/button")
	WebElement loadmorebtn;
	
	@FindBy(xpath="//div[@class='modes']/strong[2]")
	WebElement gridswitch;
	
	@FindBy(xpath="//div[@class='header__navigation']/nav/ul[1]/li[3]/a")
	WebElement browsemainmenu;
	
	@FindBy(xpath="//nav[@class='sidebar-megamenu _active']/ul/li[5]/div/ul/li[2]/div/ul/li[3]/a")
	WebElement browsesubmenu;
	
	@FindBy(xpath="//div[@class='header__inner header__bottom']/ul/li[2]/button")
	WebElement searchicon;
	
	@FindBy(xpath="//div[@class='field search']/div/input")
	WebElement searchfield;
	
	public void plpselectpdt()
	{
		ldriver.get("https://www.andrewmarc.com/women/fabrication/view-all");
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
		ldriver.get("https://www.andrewmarc.com/women/fabrication/view-all");
		WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait1.until(ExpectedConditions.elementToBeClickable(title)).isDisplayed();
		System.out.println("Title is displayed");
		
		WebDriverWait wait2=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait2.until(ExpectedConditions.elementToBeClickable(breadcrumb)).isDisplayed();
		System.out.println("Breadcrumb is displayed");
		
		WebDriverWait wait3=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait3.until(ExpectedConditions.elementToBeClickable(filterandsort)).isDisplayed();
		System.out.println("Filter and sort by List is displayed");
		
				
		WebDriverWait wait5=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait5.until(ExpectedConditions.elementToBeClickable(gridswitch)).isDisplayed();
		System.out.println("Grid switch/ list option is displayed");
		
		/*WebDriverWait wait6=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait6.until(ExpectedConditions.elementToBeClickable(loadmorebtn)).isDisplayed();
		System.out.println("Load more button is displayed");*/
	}
	
	public void browseplp()
	{
		ldriver.get("https://www.andrewmarc.com/men/jackets-outerwear/view-all");
		/*ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		Actions a = new Actions(ldriver);
		a.moveToElement(browsemainmenu).perform();
		System.out.println("main menu  is selected");*/
		
		
	}
	
	public void search()
	{
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait.until(ExpectedConditions.elementToBeClickable(searchicon)).click();
		System.out.println("Search icon  is selected");
		
		WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait1.until(ExpectedConditions.elementToBeClickable(searchfield)).sendKeys("Jacket");
		searchfield.sendKeys(Keys.ENTER);
		System.out.println("Search item is displayed");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		verifyplp();
	}
	
}
