package com.AMRetailAndrewMarcAutomationScript.pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.AMRetailAndrewMarcAutomationScript.utilities.Utilities;


public class LoginPage 
{
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		this.ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//div[@data-testid='POPUP']/div/div/div/button")
	WebElement closeoffer;
	
	@FindBy(xpath="//div[@id='onetrust-button-group']/button[3]")
	WebElement acceptallcookie;
	
	@FindBy(xpath="//div[@data-testid='POPUP']/div/div/div/form/div/div[3]/div/div/input")
	WebElement newsemail;
	
	@FindBy(xpath="//div[@data-testid='POPUP']/div/div/div/form/div/div[4]/div/button")
	WebElement joinbtn;
	
	@FindBy(xpath="//select[@id='esw-country-currency']")
	WebElement currency;
		
	@FindBy(xpath="//div[@id='eshopworld-landing-page']//button")
	WebElement savebtn;
	
	@FindBy(xpath="//li[@class='header__nav-item account']/div/a")
	WebElement myaccnticon;
	
	@FindBy(xpath="//button[@class='action primary action-register']")
	WebElement createaccntbtn;
	
	@FindBy(xpath="//input[@id='login-register-firstname']")
	WebElement fname;
	
	@FindBy(xpath="//input[@id='login-register-lastname']")
	WebElement lname;
	
	@FindBy(xpath="//input[@id='login-register-email-2']")
	WebElement emailid;
	
	@FindBy(xpath="//input[@id='login-register-password-2']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='login-register-password-confirmation']")
	WebElement confirmpassword;
	
	@FindBy(xpath="//form[@class='login-register__form']/div[2]/div[1]/button")
	WebElement createaccnt;
	
	@FindBy(xpath="//input[@id='login-register-email']")
	WebElement regemail;
	
	@FindBy(xpath="//input[@id='login-register-password']")
	WebElement regpassword;
	
	@FindBy(xpath="//form[@id='login-register__login']/div[2]/div[1]/button")
	WebElement regsubmit;
	
	
	@FindBy(xpath="//div[@class='login-register__popup']/div/div[2]/div/div/ul/li[6]/a")
	WebElement logout;
	
	public void closepopups() 
	{
		
	    
		WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait1.until(ExpectedConditions.elementToBeClickable(newsemail)).sendKeys("testqaaccnt@gmail.com");
		joinbtn.click();
		System.out.println("Subscribed");
		
		WebDriverWait wait2=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait2.until(ExpectedConditions.elementToBeClickable(closeoffer)).click();
		System.out.println("The pop up is closed");
	    
		WebDriverWait wait3=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait3.until(ExpectedConditions.elementToBeClickable(acceptallcookie)).click();
		System.out.println("Accepted all cookies");
		
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
	    WebDriverWait wait4=new WebDriverWait(ldriver, Duration.ofSeconds(20000));
		wait4.until(ExpectedConditions.elementToBeClickable(savebtn)).click();
		
	}
	
	public void createAccount()
	{
		ldriver.navigate().refresh();
		WebDriverWait wait4=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait4.until(ExpectedConditions.elementToBeClickable(myaccnticon)).click();
		WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait1.until(ExpectedConditions.elementToBeClickable(createaccntbtn)).click();
		WebDriverWait wait2=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait2.until(ExpectedConditions.elementToBeClickable(fname)).click();
		fname.sendKeys("Test");
		lname.sendKeys("QA");
		emailid.sendKeys(Utilities.generateEmailWithTimeStamp());
		password.sendKeys("Test@123");
		confirmpassword.sendKeys("Test@123");
		WebDriverWait wait3=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait3.until(ExpectedConditions.elementToBeClickable(createaccnt)).click();
		System.out.println("User account created successfully");

		
	}
	
	public void login()
	{
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", myaccnticon);
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait.until(ExpectedConditions.elementToBeClickable(regemail)).sendKeys("testqaaccnt@gmail.com");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait1.until(ExpectedConditions.elementToBeClickable(regpassword)).sendKeys("Test@123");
		
		WebDriverWait wait2=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait2.until(ExpectedConditions.elementToBeClickable(regsubmit)).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("User successfully logged in");
	}
	
	
	
	public void logout()
	{
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", myaccnticon);
		try {
			Thread.sleep(1000);
			logout.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Log out successfully");
		
	}
	public void invalidlogin()
	{
		ldriver.navigate().refresh();
		WebDriverWait wait4=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait4.until(ExpectedConditions.elementToBeClickable(myaccnticon)).click();
		WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait1.until(ExpectedConditions.elementToBeClickable(regemail)).click();
		regemail.sendKeys("testqaaccnt@gmail.com");
		WebDriverWait wait2=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait2.until(ExpectedConditions.elementToBeClickable(regpassword)).click();
		regpassword.sendKeys("Test@1234@");
		WebDriverWait wait3=new WebDriverWait(ldriver, Duration.ofSeconds(1000));
		wait3.until(ExpectedConditions.elementToBeClickable(regsubmit)).click();
		System.out.println("Invalid User");
	}
		
	
	
}
	
	
	
	
	
