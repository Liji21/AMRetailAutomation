package com.AMRetailkarllagerfeldparis.pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {

WebDriver ldriver;
	
	public CheckoutPage(WebDriver rdriver)
	{
		this.ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//li[@id='shipping']/div/form[1]/fieldset/div/div/input")
	WebElement emailid;
	
	@FindBy(xpath="//form[@id='co-shipping-form']/div/div[1]/div/input")
	WebElement fname;
	
	@FindBy(xpath="//form[@id='co-shipping-form']/div/div[2]/div/input")
	WebElement lname;
	
	@FindBy(xpath="//div[@id='shipping-new-address-form']/fieldset/div/div[1]/div[1]/input[1]")
	WebElement streetaddress;
	
	@FindBy(xpath="//div[@id='shipping-new-address-form']//input[@name='street[1]']")
	WebElement suite;
	
	@FindBy(xpath="//div[@id='shipping-new-address-form']//input[@name='company']")
	WebElement company;
	
	@FindBy(xpath="//div[@id='shipping-new-address-form']//input[@name='city']")
	WebElement city;
	
	@FindBy(xpath="//div[@id='shipping-new-address-form']//select[@name='region_id']")
	WebElement state;
	
	@FindBy(xpath="//div[@id='shipping-new-address-form']//input[@name='postcode']")
	WebElement zipcode;
	
	@FindBy(xpath="//div[@id='shipping-new-address-form']//input[@name='telephone']")
	WebElement telephone;
	
	@FindBy(xpath="//div[@id='checkout-shipping-method-load']/table/tbody/tr[1]/td[1]")
	WebElement shippingmethod;
	
	@FindBy(xpath="//div[@id='shipping-method-buttons-container']/div[2]/button")
	WebElement continuetoreviewandpaymentbtn;
	
	@FindBy(xpath="//div[@id='minicart-content-wrapper']/div[3]/div[3]/div/button")
	WebElement proceedtocheckout;
	
	@FindBy(xpath="//div[@class='payment-group']/div[1]/div[1]")
	WebElement creditcardpayment;
	
	@FindBy(xpath="//div[@class='payment-group']/div[2]/div[1]")
	WebElement paypalpayment;
	
	@FindBy(xpath="//div[@class='primary complete-order-box']/button/span")
	WebElement placeorderbtn;
	
	@FindBy(xpath="//div[@class='totals-box']/table/tbody/tr[1]")
	WebElement subtotal;
	
	@FindBy(xpath="//div[@class='shipping-information']/div[1]")
	WebElement shipto;
	
	@FindBy(xpath="//div[@class='shipping-information']/div[2]")
	WebElement shippmethod;
	
	public void loginemailsectionsection()
	{
		WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait1.until(ExpectedConditions.elementToBeClickable(emailid)).click();
		emailid.sendKeys("guestmail@gmail.com");
		System.out.println("Entered as guest");
	}
	
	public void shippingsection()
	{
		System.out.println("Enter the shipping address");
		WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait1.until(ExpectedConditions.elementToBeClickable(fname)).click();
		fname.sendKeys("Test");
		
		WebDriverWait wait2=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait2.until(ExpectedConditions.elementToBeClickable(lname)).click();
		lname.sendKeys("Do not ship");
		
		WebDriverWait wait3=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait3.until(ExpectedConditions.elementToBeClickable(streetaddress)).click();
		streetaddress.sendKeys("363 BLOOMFIELD AVE");
		
		WebDriverWait wait4=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait4.until(ExpectedConditions.elementToBeClickable(suite)).click();
		suite.sendKeys("STE 3C");
		
		WebDriverWait wait5=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait5.until(ExpectedConditions.elementToBeClickable(company)).click();
		company.sendKeys("corra");
		
		WebDriverWait wait6=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait6.until(ExpectedConditions.elementToBeClickable(city)).click();
		city.sendKeys("MONTCLAIR");
		
		Select drp = new Select(state);
		drp.selectByValue("121");
		
		WebDriverWait wait7=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait7.until(ExpectedConditions.elementToBeClickable(zipcode)).click();
		zipcode.sendKeys("07042-3655");
		
		WebDriverWait wait8=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait8.until(ExpectedConditions.elementToBeClickable(telephone)).click();
		telephone.sendKeys("1234567898");
		
		System.out.println("Enter the shipping method");
		WebDriverWait wait9=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait9.until(ExpectedConditions.elementToBeClickable(shippingmethod)).click();
		
		WebDriverWait wait10=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait10.until(ExpectedConditions.elementToBeClickable(continuetoreviewandpaymentbtn)).click();
		
	}
	
	public void proceedtocheckout()
	{
		System.out.println("proceed to checkout from cart");
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait.until(ExpectedConditions.elementToBeClickable(proceedtocheckout)).click();
	}
	
	public void paymentmethods()
	{
		System.out.println("Payment methods");
		WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait1.until(ExpectedConditions.elementToBeClickable(creditcardpayment)).isDisplayed();
		System.out.println("The credit card payment option is available");
		
		WebDriverWait wait2=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait2.until(ExpectedConditions.elementToBeClickable(paypalpayment)).isDisplayed();
		System.out.println("The paypal payment option is available");
		
		WebDriverWait wait3=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait3.until(ExpectedConditions.elementToBeClickable(placeorderbtn)).isDisplayed();
		System.out.println("The place order button is displayed");
		
	}
	
	public void verifyordersummary()
	{
		WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait1.until(ExpectedConditions.elementToBeClickable(subtotal)).isDisplayed();
		System.out.println("Subtotal is displayed");
		
		WebDriverWait wait2=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait2.until(ExpectedConditions.elementToBeClickable(shipto)).isDisplayed();
		System.out.println("Shipto is displayed");
		
		WebDriverWait wait3=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait3.until(ExpectedConditions.elementToBeClickable(shippmethod)).isDisplayed();
		System.out.println("Shipping method is displayed");
		
	}
}
