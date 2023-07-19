package com.AMRetailDonnnakaranAutomationScript.testCases;

import org.testng.annotations.Test;

import com.AMRetailDonnnakaranAutomationScript.pageObjects.BaseClass;
import com.AMRetailDonnnakaranAutomationScript.pageObjects.LoginPage;
import com.AMRetailDonnnakaranAutomationScript.pageObjects.MyAccountPage;

import io.qameta.allure.Description;

public class MyAccountPageLinksDisplay extends BaseClass
{
	@Test
	@Description("My account pages and links display in dashboard:"
			+ "My DNKY account"
			+ "My order"
			+ "My saved items"
			+ "My details"
			+ "My address"
			+ "logout")
			
	public void myAccountPageLinksDisplay()
	{
		LoginPage lp= new LoginPage(driver);
		lp.closepopups();
		lp.login();
		MyAccountPage ap= new MyAccountPage(driver);
		ap.verifylinks();
		System.out.println("My account page Test complete");

	}
}
