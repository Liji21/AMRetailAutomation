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
	@FindBy(xpath="//button[@id='product-addtocart-button']")
	WebElement addtobag;
	
	@FindBy(xpath="//div[@class='minicart-wrapper']/a")
	WebElement minicart;
	
	@FindBy(xpath="//div[@class='product-item-details__top']/div/div/div")
	WebElement quantityupdate;
	
	@FindBy(xpath="//tr[@class='item-info']/td[3]/div/a[1]")
	WebElement saveforlaterlink;
	
	@FindBy(xpath="//tr[@class='item-info']/td[3]/div/a[3]")
	WebElement removeitemlink;
	
	@FindBy(xpath="//form[@class='discount-coupon-form']/div/div[1]/div/input")
	WebElement promocodefield;
	
	@FindBy(xpath="//div[@class='cart-sidebar']/ul/li[1]/button")
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
	
	@FindBy(xpath="//*[text()='continue to payment']")
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
	
	@FindBy(xpath="//div[@class='header__container']/nav/ul/li[3]/a")
	WebElement mainmenu;
	
	@FindBy(xpath="//nav[@class='sidebar-megamenu _active']/ul/li[3]/div/ul/li[2]/div/ul/li[2]/a")
	WebElement submenu;
	
	@FindBy(xpath="//div[@class='products wrapper list products-list']/ol/li[2]/div/div[2]/strong/a")
	WebElement product;
	
	@FindBy(xpath="//div[@id='option-label-dkny_sku_size-667-item-4399']")
	WebElement sizeswatch;
	
	public void addtocart()
	{
		ldriver.get("https://www.dkny.com/4-pocket-dress-b2370421#dkny_sku_color=4549");
		/*ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		Actions a = new Actions(ldriver);
		a.moveToElement(mainmenu).click().perform();
		System.out.println("main menu  is selected");
		WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait1.until(ExpectedConditions.elementToBeClickable(submenu)).click();
		System.out.println("Submenu is selected");
		WebDriverWait wait2=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait2.until(ExpectedConditions.elementToBeClickable(product)).click();*/
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
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait.until(ExpectedConditions.elementToBeClickable(addtobag)).click();
			
	}
	
	public void verifyshoppingcart()
	{
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait.until(ExpectedConditions.elementToBeClickable(addtobag)).click();
			
		
		WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait1.until(ExpectedConditions.elementToBeClickable(quantityupdate)).isDisplayed();
		System.out.println("Quantity updation field is present");

		WebDriverWait wait2=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait2.until(ExpectedConditions.elementToBeClickable(saveforlaterlink)).isDisplayed();
		System.out.println("Save for later link is present");
		
		WebDriverWait wait3=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait3.until(ExpectedConditions.elementToBeClickable(removeitemlink)).isDisplayed();
		System.out.println("Remove item link is present");
		
		WebDriverWait wait4=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait4.until(ExpectedConditions.elementToBeClickable(promocodefield)).isDisplayed();
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
		wait.until(ExpectedConditions.elementToBeClickable(streetaddress)).clear();
		streetaddress.sendKeys("363 BLOOMFIELD AVE STE 3C");
		System.out.println("Street address is entered");
		
		WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait1.until(ExpectedConditions.elementToBeClickable(city)).clear();
		city.sendKeys("Montclair");
		System.out.println("City is entered");
				
		Select drp = new Select(region);
		drp.selectByValue("121");
		
	    WebDriverWait wait2=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait2.until(ExpectedConditions.elementToBeClickable(zipcode)).clear();
		zipcode.sendKeys("07042");
		System.out.println("Zip code is entered");
		
		WebDriverWait wait3=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait3.until(ExpectedConditions.elementToBeClickable(phone)).clear();
		phone.sendKeys("2122684500");
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
		
		WebDriverWait wait3=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait3.until(ExpectedConditions.elementToBeClickable(tax)).isDisplayed();
		System.out.println("Tax is displayed");
		
		WebDriverWait wait4=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait4.until(ExpectedConditions.elementToBeClickable(shippinginfrmn)).isDisplayed();
		System.out.println("Shipping information is displayed");
		
	}
}
