package com.AMRetailkarllagerfeldparis.testCases;

import org.testng.annotations.Test;
import com.AMRetailkarllagerfeldparis.pageObjects.BaseClass;
import com.AMRetailkarllagerfeldparis.pageObjects.HomePage;
import com.AMRetailkarllagerfeldparis.pageObjects.LoginPage;
import io.qameta.allure.Description;

public class Createaccount_Login_Logout_Functionality extends BaseClass
{
	@Test
	@Description("1. User login to site successfully "
			      + "2. Invalid error message display in login for invalid credential "
			      + "3. User create account successfully ")
	public void createaccount_Login_Logout_Functionality()
	{
		HomePage hp= new HomePage(driver);
		hp.closepopups();
		LoginPage lp= new LoginPage(driver);
		lp.createAccount();
		lp.logout();
		lp.login();
		lp.logout();
		lp.invalidlogin();
		System.out.println("Login Test complete");
	}
	
}
