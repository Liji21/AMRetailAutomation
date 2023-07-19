package com.AMRetailkarllagerfeldparis.testCases;

import org.testng.annotations.Test;
import com.AMRetailkarllagerfeldparis.pageObjects.BaseClass;
import com.AMRetailkarllagerfeldparis.pageObjects.HomePage;
import com.AMRetailkarllagerfeldparis.pageObjects.LoginPage;
import com.AMRetailkarllagerfeldparis.pageObjects.MyAccountPage;

import io.qameta.allure.Description;

public class MyAccountPageLinksDisplay extends BaseClass
{
	@Test
	@Description("1. My account pages and links display in dashboard: My DNKY account, My order, My saved items, My details, My address and logout")
			
	public void myAccountPageLinkDisplay()
	{
		HomePage hp=new HomePage(driver);
		hp.closepopups();
		LoginPage lp=new LoginPage(driver);
		lp.login();
		MyAccountPage ap= new MyAccountPage(driver);
		ap.verifylinks();
		System.out.println("My account page Test complete");

	}
}
