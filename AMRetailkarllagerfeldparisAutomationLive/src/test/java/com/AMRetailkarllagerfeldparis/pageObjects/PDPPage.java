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
import org.testng.Assert;

public class PDPPage 
{
	WebDriver ldriver;
	
	public   PDPPage(WebDriver rdriver)
	{
		this.ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//ul[@class='megamenu__list']/li[3]/a")
	WebElement megamenu;
	
	@FindBy(xpath="//ul[@class='megamenu__list']/li[3]/div/ul/li[3]/div/ul/li[2]/a")
	WebElement submenu;
	
	@FindBy(xpath="//div[@class='products wrapper grid products-grid']/ol/li[2]/div/div[4]/h3/a")
	WebElement product;
	
	@FindBy(xpath="//div[@id='product-options-wrapper']/div/div/div[1]/div/input")
	WebElement colorswatch;
	
	@FindBy(xpath="//div[@id='product-options-wrapper']/div/div/div[2]/div[1]/div[3]")
	WebElement sizeswatch;
	
	@FindBy(xpath="//button[@id='product-addtocart-button']")
	WebElement addtobag;
	
	@FindBy(xpath="//div[@class='live-chat']/div/a")
	WebElement livechatlink;
	
	@FindBy(xpath="//div[@class='product attribute overview']")
	WebElement productdetail;
	
	@FindBy(xpath="//div[@class='yotpo-box']")
	WebElement yotoporeview;
	
	@FindBy(xpath="//div[@class='yotpo-bottomline-box-1 yotpo-stars-and-sum-reviews']")
	WebElement rating;
	
	@FindBy(xpath="//ul[@class='header__nav']/li[6]/div/a")
	WebElement minicart;
	
	@FindBy(xpath="//div[@class='details-qty qty']")
	WebElement quantityselector;
	
	@FindBy(xpath="//div[@class='product actions']/div/a[1]")
	WebElement removelink;
	
	@FindBy(xpath="//div[@class='product actions']/div/a[2]")
	WebElement savelaterlink;
	
	@FindBy(xpath="//ol[@class='products list items product-items js-infinite-scroll']/li[2]/div/div[2]/strong/a")
	WebElement browsepdt;
	
	@FindBy(xpath="//table[@id='shopping-cart-table']/tbody/tr/td[2]/div/div")
	WebElement shoppingcartquantity;
	
	@FindBy(xpath="//div[@class='product-option-details']/div[2]/a[2]")
	WebElement shoppingcartremove;
	
	@FindBy(xpath="//div[@class='product-option-details']/div[2]/a[3]")
	WebElement shoppingcartsaveforlater;
	
	@FindBy(xpath="//div[@class='cart-summary-wrapper']/div[3]/button/strong")
	WebElement promocodeshoppingcart;
	
	@FindBy(xpath="//div[@class='cart-summary-wrapper']/ul/li/button")
	WebElement proceedtocheckoutbutton;
	
	public void verifypdp()
	{
		Actions a = new Actions(ldriver);
		a.moveToElement(megamenu).perform();
		System.out.println("main menu  is selected");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JavascriptExecutor jse = (JavascriptExecutor) ldriver;
		jse.executeScript("arguments[0].click();", submenu);
		
			
		WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait1.until(ExpectedConditions.elementToBeClickable(product)).click();
		
		/*WebDriverWait wait2=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait2.until(ExpectedConditions.elementToBeClickable(colorswatch)).click();
		System.out.println("Color is selected");*/
		
		WebDriverWait wait3=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait3.until(ExpectedConditions.elementToBeClickable(sizeswatch)).click();
		System.out.println("Size is selected");
		
		WebDriverWait wait4=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait4.until(ExpectedConditions.elementToBeClickable(addtobag)).click();
		System.out.println("Item added to cart");

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebDriverWait wait5=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait5.until(ExpectedConditions.elementToBeClickable(livechatlink)).isDisplayed();
		System.out.println("Live chat link is displayed");
		
		/*WebDriverWait wait6=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait6.until(ExpectedConditions.elementToBeClickable(productdetail)).isDisplayed();
		System.out.println("Product detail is displayed");*/
		
		WebDriverWait wait7=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait7.until(ExpectedConditions.elementToBeClickable(yotoporeview)).isDisplayed();
		System.out.println("Review is displayed");
		
		WebDriverWait wait8=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait8.until(ExpectedConditions.elementToBeClickable(rating)).isDisplayed();
		System.out.println("Rating is displayed");
		
		WebDriverWait wait9=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait9.until(ExpectedConditions.elementToBeClickable(minicart)).isDisplayed();
		System.out.println("Mini cart is displayed");
		
		
	}
	
	public void verifyminicart()
	{
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions a = new Actions(ldriver);
		a.moveToElement(minicart).perform();
		System.out.println("Mini cart is opened");
		minicart.click();
		WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait1.until(ExpectedConditions.elementToBeClickable(quantityselector)).isDisplayed();
		System.out.println("Quantity Selector is displayed");
		
		Assert.assertTrue(removelink.isDisplayed());
		System.out.println("Remove Link is displayed");

		Assert.assertTrue(savelaterlink.isDisplayed());
		System.out.println("Save Later is displayed");

	}
	
	public void verifyshoppingcart()
	{
		ldriver.get("https://www.karllagerfeldparis.com/checkout/cart/");
		WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait1.until(ExpectedConditions.elementToBeClickable(shoppingcartquantity)).isDisplayed();
		System.out.println("Quantity Selector is displayed");
		WebDriverWait wait2=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait2.until(ExpectedConditions.elementToBeClickable(shoppingcartremove)).isDisplayed();
		System.out.println("Remove is displayed");
		WebDriverWait wait3=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait3.until(ExpectedConditions.elementToBeClickable(shoppingcartsaveforlater)).isDisplayed();
		System.out.println("Save for later is displayed");
		WebDriverWait wait4=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait4.until(ExpectedConditions.elementToBeClickable(promocodeshoppingcart)).isDisplayed();
		System.out.println("Promocode section is displayed");
		WebDriverWait wait5=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait5.until(ExpectedConditions.elementToBeClickable(proceedtocheckoutbutton)).click();
		
	}
}
