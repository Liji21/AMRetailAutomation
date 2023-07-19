package com.AMRetailAndrewMarcAutomationScript.pageObjects;

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
	@FindBy(xpath="//ol[@class='products list items product-items']/li[2]/div/div[2]/strong/a")
	WebElement product;
	
	@FindBy(xpath="//div[@class='swatch-opt']/div[1]/div/div[1]")
	WebElement colorswatch;
	
	@FindBy(xpath="//div[@class='swatch-opt']/div[2]/div[1]/div[2]")
	WebElement sizeswatch;
	
	@FindBy(xpath="//button[@id='product-addtocart-button']")
	WebElement addtobag;
	
	@FindBy(xpath="//div[@class='live-chat']/div/a")
	WebElement livechatlink;
	
	@FindBy(xpath="//div[@class='product attribute overview']")
	WebElement productdetail;
	
	@FindBy(xpath="//div[@class='yotpo-box']/div/a")
	WebElement yotoporeview;
	
	@FindBy(xpath="//div[@class='yotpo-bottomline-box-1 yotpo-stars-and-sum-reviews']")
	WebElement rating;
	
	@FindBy(xpath="//li[@class='header__nav-item minicart']/div/a")
	WebElement minicart;
	
	@FindBy(xpath="//div[@class='details-qty qty']/label")
	WebElement quantityselector;
	
	@FindBy(xpath="//div[@class='product actions']/div/a[1]")
	WebElement removelink;
	
	@FindBy(xpath="//div[@class='product actions']/div/a[2]")
	WebElement savelaterlink;
	
	@FindBy(xpath="//ol[@class='products list items product-items']/li[3]/div/div[2]/strong/a")
	WebElement browsepdt;
	
	@FindBy(xpath="//div[@class='block discount']/button")
	WebElement promocodefield;
	
	@FindBy(xpath="//div[@class='actions to-checkout']/div/button")
	WebElement proceedtocheckoutbtn;
	
	public void verifypdp()
	{ 
		ldriver.get("https://www.andrewmarc.com/jolla-puffer-quilt-blazer-mw3aq090");
		/*WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait1.until(ExpectedConditions.elementToBeClickable(product)).click();
		WebDriverWait wait2=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait2.until(ExpectedConditions.elementToBeClickable(colorswatch)).click();
		System.out.println("Color is selected");*/
		
		WebDriverWait wait3=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait3.until(ExpectedConditions.elementToBeClickable(sizeswatch)).click();
		System.out.println("Size is selected");
		
		WebDriverWait wait4=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait4.until(ExpectedConditions.elementToBeClickable(addtobag)).click();
		System.out.println("Item added to cart");

		WebDriverWait wait5=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait5.until(ExpectedConditions.elementToBeClickable(livechatlink)).isDisplayed();
		System.out.println("Live chat link is displayed");
		
		WebDriverWait wait6=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait6.until(ExpectedConditions.elementToBeClickable(productdetail)).isDisplayed();
		System.out.println("Product detail is displayed");
		
		WebDriverWait wait7=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait7.until(ExpectedConditions.elementToBeClickable(yotoporeview)).isDisplayed();
		System.out.println("Review is displayed");
		
		WebDriverWait wait8=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait8.until(ExpectedConditions.elementToBeClickable(rating)).isDisplayed();
		System.out.println("Rating is displayed");
		
		WebDriverWait wait9=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait9.until(ExpectedConditions.elementToBeClickable(minicart)).isDisplayed();
		System.out.println("Mini cart is displayed");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void verifyminicart()
	{
		
		Actions a = new Actions(ldriver);
		a.moveToElement(minicart).click().perform();
		System.out.println("Mini cart is opened");
		
				
		Assert.assertTrue(quantityselector.isDisplayed());
		System.out.println("Quantity Selector is displayed");
		
		Assert.assertTrue(removelink.isDisplayed());
		System.out.println("Remove Link is displayed");

		Assert.assertTrue(savelaterlink.isDisplayed());
		System.out.println("Save Later is displayed");
		
		Assert.assertTrue(proceedtocheckoutbtn.isDisplayed());
		System.out.println("Proceed to checkout button is displayed");
		
		Assert.assertTrue(promocodefield.isDisplayed());
		System.out.println("Promo code field is displayed");
		
		

	}
	
	public void browsePDP()
	{
		ldriver.get("https://www.andrewmarc.com/catalina-lightweight-jacket-mw3ac086");
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
