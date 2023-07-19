package com.AMRetailAutomationScript.pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.AMRetailAutomationScript.utilities.Utilities;


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
	
	@FindBy(id="esw-country-currency")
	WebElement currency;
		
	@FindBy(xpath="//button[@title='Save']")
	WebElement savebtn;
	
	@FindBy(xpath="//ul[@class='header-panel__links']/li[5]/div/a")
	WebElement myaccnticon;
	
	@FindBy(xpath="//form[@class='login-register__form']/div[2]/div[2]/button")
	WebElement createaccntbtn;
	
	@FindBy(xpath="//form[@class='login-register__form']/div[1]/div[1]/div/input")
	WebElement fname;
	
	@FindBy(xpath="//form[@class='login-register__form']/div[1]/div[2]/div/input")
	WebElement lname;
	
	@FindBy(xpath="//form[@class='login-register__form']/div[1]/div[3]/div/input")
	WebElement emailid;
	
	@FindBy(xpath="//form[@class='login-register__form']/div[2]/div/input")
	WebElement password;
	
	@FindBy(xpath="//form[@class='login-register__form']/div[3]/div/input")
	WebElement confirmpassword;
	
	@FindBy(xpath="//div[@class='actions-toolbar actions-toolbar--register']/div[1]/button")
	WebElement createaccnt;
	
	@FindBy(xpath="//form[@class='login-register__form']/div[1]/div[1]/div/input")
	WebElement regemail;
	
	@FindBy(xpath="//form[@class='login-register__form']/div[1]/div[2]/div/input")
	WebElement regpassword;
	
	@FindBy(xpath="//form[@class='login-register__form']/div[2]/div/button")
	WebElement regsubmit;
	
	
	@FindBy(xpath="//div[@class='login-register__popup']/div/div[2]/div/div/ul/li[6]/a")
	WebElement logout;
	
	public void closepopups() 
	{
		WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait1.until(ExpectedConditions.elementToBeClickable(acceptallcookie)).click();
		System.out.println("Accepted all cookies");
	    
		WebDriverWait wait2=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait2.until(ExpectedConditions.elementToBeClickable(newsemail)).sendKeys("testqaaccnt@gmail.com");
		joinbtn.click();
		System.out.println("Subscribed");
		
		WebDriverWait wait3=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait3.until(ExpectedConditions.elementToBeClickable(closeoffer)).click();
		System.out.println("The pop up is closed");
	    
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Select drp = new Select(currency);
	    drp.selectByValue("US-USD");
	    
	    WebDriverWait wait4=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait4.until(ExpectedConditions.elementToBeClickable(savebtn)).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	
	
	
	
	
