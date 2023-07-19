package com.AMRetailDonnnakaranAutomationScript.pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PDPPage 
{
	WebDriver ldriver;
	
	public   PDPPage(WebDriver rdriver)
	{
		this.ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//div[@class='products wrapper list products-list']/ol/li[2]/div/div[2]/strong/a")
	WebElement product;
	
	@FindBy(xpath="//div[@class='swatch-opt']/div[1]/div/div[2]")
	WebElement colorswatch;
	
	@FindBy(xpath="//div[@id='option-label-dkny_sku_size-667-item-6109']")
	WebElement sizeswatch;
	
	@FindBy(xpath="//button[@id='product-addtocart-button']")
	WebElement addtobag;
	
	@FindBy(xpath="//div[@class='live-chat']/div/a")
	WebElement livechatlink;
	
	@FindBy(xpath="//div[@class='product attribute pdp-description collapsible js-readmore']")
	WebElement productdetail;
	
	@FindBy(xpath="//div[@class='yotpo-box']/div/a")
	WebElement yotoporeview;
	
	@FindBy(xpath="//div[@class='yotpo-bottomline-box-1 yotpo-stars-and-sum-reviews']")
	WebElement rating;
	
	@FindBy(xpath="//div[@class='minicart-wrapper']/a")
	WebElement minicart;
	
	@FindBy(xpath="//div[@class='col qty desktop']/div/div")
	WebElement quantityselector;
	
	@FindBy(xpath="//div[@class='actions-toolbar']/a[3]")
	WebElement removelink;
	
	@FindBy(xpath="//div[@class='actions-toolbar']/a[1]")
	WebElement savelaterlink;
	
	@FindBy(xpath="//ol[@class='products list items product-items js-infinite-scroll']/li[2]/div/div[2]/strong/a")
	WebElement browsepdt;
	
	@FindBy(xpath="//ul[@class='header-panel__links']/li[2]/div/div/button")
	WebElement selectcountry;
	
	@FindBy(id="esw-country-currency-mobile")
	WebElement currency;
		
	@FindBy(xpath="//button[@title='Continue shopping']")
	WebElement savebtn;
	
	public void verifypdp()
	{
		ldriver.get("https://www.dkny.com/donnakaran/ribbon-tweed-tucked-sleeve-notch-jacket-d3ecmh46#dkny_sku_color=4387");
		/*WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait1.until(ExpectedConditions.elementToBeClickable(product)).click();*/
				
		WebDriverWait wait2=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait2.until(ExpectedConditions.elementToBeClickable(sizeswatch)).click();
		System.out.println("Size is selected");
		
		WebDriverWait wait3=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait3.until(ExpectedConditions.elementToBeClickable(addtobag)).click();
		System.out.println("Item added to cart");

		WebDriverWait wait4=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait4.until(ExpectedConditions.elementToBeClickable(livechatlink)).isDisplayed();
		System.out.println("Live chat link is displayed");
		
		WebDriverWait wait5=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait5.until(ExpectedConditions.elementToBeClickable(productdetail)).isDisplayed();
		System.out.println("Product detail is displayed");
		
		WebDriverWait wait6=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait6.until(ExpectedConditions.elementToBeClickable(yotoporeview)).isDisplayed();
		System.out.println("Review is displayed");
		
		WebDriverWait wait7=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait7.until(ExpectedConditions.elementToBeClickable(rating)).isDisplayed();
		System.out.println("Rating is displayed");
		
		WebDriverWait wait8=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait8.until(ExpectedConditions.elementToBeClickable(minicart)).isDisplayed();
		System.out.println("Mini cart is displayed");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions a = new Actions(ldriver);
		a.moveToElement(minicart).perform();
		minicart.click();
		System.out.println("Mini cart is opened");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	}
	
	public void verifyminicart()
	{
		
		/*WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(selectcountry)).click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Select drp = new Select(currency);
	    drp.selectByValue("US-USD");
	    try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    WebDriverWait wait4=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait4.until(ExpectedConditions.elementToBeClickable(savebtn)).click();
		*/
		
		WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait1.until(ExpectedConditions.elementToBeClickable(quantityselector)).isDisplayed();
		System.out.println("Quantity Selector is displayed");
		
		Assert.assertTrue(removelink.isDisplayed());
		System.out.println("Remove Link is displayed");

		Assert.assertTrue(savelaterlink.isDisplayed());
		System.out.println("Save Later is displayed");

	}
	
	public void browsePDP()
	{
		ldriver.get("https://www.dkny.com/donnakaran/luxe-tech-long-blazer-d3dc0jcg#dkny_sku_color=4387");
		/*WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait1.until(ExpectedConditions.elementToBeClickable(browsepdt)).click();*/
		System.out.println("Browsed a PDP page");
	}
	
	public void addtoCart()
	{
		WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait1.until(ExpectedConditions.elementToBeClickable(product)).click();
		WebDriverWait wait3=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait3.until(ExpectedConditions.elementToBeClickable(sizeswatch)).click();
		System.out.println("Size is selected");
		
		WebDriverWait wait4=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait4.until(ExpectedConditions.elementToBeClickable(addtobag)).click();
		System.out.println("Item added to cart");
	}
}
