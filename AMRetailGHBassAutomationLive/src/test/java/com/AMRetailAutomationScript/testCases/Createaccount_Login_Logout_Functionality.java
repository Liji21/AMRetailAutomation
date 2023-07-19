package com.AMRetailAutomationScript.testCases;

import org.testng.annotations.Test;
import com.AMRetailGHBassAutomationScript.pageObjects.BaseClass;
import com.AMRetailGHBassAutomationScript.pageObjects.LoginPage;

import io.qameta.allure.Description;

public class Createaccount_Login_Logout_Functionality extends BaseClass
{
		
	@Test
	@Description("1.User login to site successfully"
			+ "Invalid error message display in login for invalid credential"
			+ "User create account successfully")
	public void createaccount_Login_Logout_Functionality()
	{
		LoginPage lp= new LoginPage(driver);
		lp.closepopups();
		//lp.createAccount();
		//lp.logout();
		lp.login();
		lp.logout();
		lp.invalidlogin();
		System.out.println("Login Test complete");

	}
}
