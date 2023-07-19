package com.AMRetailkarllagerfeldparis.pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.AMRetailkarllagerfeldparis.utilities.Utilities;


public class LoginPage 
{
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		this.ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//ul[@class='header__nav']/li[5]/div/a")
	WebElement myaccnticon;
	
	@FindBy(xpath="//form[@class='login-register__form']/div[2]/div[2]/button")
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
	
	@FindBy(xpath="//form[@class='login-register__form']/div[2]/div[2]/button")
	WebElement alreadyaccntsignin;
	
	@FindBy(xpath="//form[@class='login-register__form']/div[1]/div[1]/div/input")
	WebElement regemail;
	
	@FindBy(xpath="//form[@class='login-register__form']/div[1]/div[2]/div/input")
	WebElement regpassword;
	
	@FindBy(xpath="//form[@class='login-register__form']/div[2]/div/button")
	WebElement regsubmit;
	
	
	@FindBy(xpath="//div[@class='account-nav']/div/ul/li[6]/a")
	WebElement logout;
	
		
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
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		WebDriverWait wait1=new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		wait1.until(ExpectedConditions.elementToBeClickable(regpassword)).sendKeys("Test@123*");
		
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
	
	
	
	
	
