package com.AMRetailAutomationScript.pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage 
{

	WebDriver ldriver;
	
	public  CheckoutPage(WebDriver rdriver)
	{
		this.ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[text()='Apply Promotion code']")
	WebElement promocodefield;
	
	@FindBy(xpath="//div[@class='actions to-checkout']/div/button")
	WebElement proceedtocheckoutbtn;
	
	@FindBy(id="customer-email")
	WebElement emailid;
	
	@FindBy(id="customer-password")
	WebElement password;
	
	@FindBy(xpath="//form[@class='form form-login']//button[@class='action login secondary']")
	WebElement loginbtn;
	
	@FindBy(xpath="//form[@id='co-shipping-form']/div/fieldset/div/div[1]/div/input")
	WebElement streetaddress;
	
	@FindBy(xpath="//div[@class='opc-steps']/ol/li[1]/div/form/div/div[4]/div/input")
	WebElement city;
	
	@FindBy(xpath="//div[@name='shippingAddress.region_id']/div/select")
	WebElement region;
	
	@FindBy(xpath="//div[@class='opc-steps']/ol/li[1]/div/form/div/div[7]/div/input")
	WebElement zipcode;
	
	@FindBy(xpath="//div[@class='opc-steps']/ol/li[1]/div/form/div/div[9]/div/input")
	WebElement phone;
	
	@FindBy(xpath="//label[contains(text(),'freeshipping_freeshipping')]")
	WebElement shippingmethod;
	
	@FindBy(xpath="//div[@id='shipping-method-buttons-container']/div[2]/button")
	WebElement continuetopayment;
	
	@FindBy(xpath="//div[@class='payment-group']/div[1]/div[1]")
	WebElement creditcard;
	
	@FindBy(xpath="//div[@class='payment-group']/div[2]/div[1]")
	WebElement paypal;
	
	@FindBy(xpath="//div[@class='opc-block-summary']/div[1]")
	WebElement ordersummary;
	
	@FindBy(xpath="//div[@class='totals-box']/table/tbody/tr[1]/td")
	WebElement subtotal;
	
	@FindBy(xpath="//div[@class='totals-box']/table/tbody/tr[2]/td")
	WebElement tax;
	
	@FindBy(xpath="//div[@class='shipping-information']")
	WebElement shippinginfrmn;
	
	@FindBy(xpath="//div[@class='minicart-wrapper']/a")
	WebElement minicart;
	
	
	public void verifyshoppingcart()
	{
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		Actions a = new Actions(ldriver);
		a.moveToElement(minicart).click().perform();
		System.out.println("Mini cart is opened");
		
		promocodefield.isDisplayed();
		System.out.println("Promo code field is present");
				
		WebDriverWait wait7=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait7.until(ExpectedConditions.elementToBeClickable(proceedtocheckoutbtn)).click();
		System.out.println("Proceed to checkout button is clicked");
	}
	
	public void verifylogin()
	{
		WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait1.until(ExpectedConditions.elementToBeClickable(emailid)).sendKeys("testqaaccnt@gmail.com");
		System.out.println("Email id is entered");
		
		WebDriverWait wait2=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait2.until(ExpectedConditions.elementToBeClickable(password)).sendKeys("Test@123");
		System.out.println("Password is entered");
		
		WebDriverWait wait3=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait3.until(ExpectedConditions.elementToBeClickable(loginbtn)).click();
		System.out.println("Login is successful");
		
	}
	
	public void verifyshippingdetails()
	{
		ldriver.navigate().refresh();
		
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait.until(ExpectedConditions.elementToBeClickable(streetaddress)).sendKeys("363 BLOOMFIELD AVE STE 3C");
		System.out.println("Street address is entered");
		
		WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait1.until(ExpectedConditions.elementToBeClickable(city)).sendKeys("Montclair");
		System.out.println("City is entered");
				
		Select drp = new Select(region);
		drp.selectByValue("121");
		
	    WebDriverWait wait2=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait2.until(ExpectedConditions.elementToBeClickable(zipcode)).sendKeys("07042");
		System.out.println("Zip code is entered");
		
		WebDriverWait wait3=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait3.until(ExpectedConditions.elementToBeClickable(phone)).sendKeys("2122684500");
		System.out.println("Phone number is entered");
		
		JavascriptExecutor jse = (JavascriptExecutor) ldriver;
	    jse.executeScript("arguments[0].click();", shippingmethod);
		System.out.println("Shipping method is selected");
	}
	
	public void verifypaymentdetails()
	{
		WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait1.until(ExpectedConditions.elementToBeClickable(continuetopayment)).click();
		System.out.println("Continue to payment");
		
		WebDriverWait wait2=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait2.until(ExpectedConditions.elementToBeClickable(creditcard)).isDisplayed();
		System.out.println("Credit card payment is available");
	}
	
	public void verifyordersummary()
	{
		WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait1.until(ExpectedConditions.elementToBeClickable(ordersummary)).isDisplayed();
		System.out.println("Order summary is displayed");
		
		WebDriverWait wait2=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait2.until(ExpectedConditions.elementToBeClickable(subtotal)).isDisplayed();
		System.out.println("Subtotal is displayed");
				
		WebDriverWait wait4=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait4.until(ExpectedConditions.elementToBeClickable(shippinginfrmn)).isDisplayed();
		System.out.println("Shipping information is displayed");
		
	}
}
