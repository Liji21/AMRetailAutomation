package com.AMRetailAndrewMarcAutomationScript.testCases;

import org.testng.annotations.Test;

import com.AMRetailAndrewMarcAutomationScript.pageObjects.BaseClass;
import com.AMRetailAndrewMarcAutomationScript.pageObjects.HomePage;
import com.AMRetailAndrewMarcAutomationScript.pageObjects.LoginPage;

import io.qameta.allure.Description;

public class Homepage_Elements_Display  extends BaseClass
{
	@Test
	@Description("Homepage displayed with below sections"
			+ "Promo"
			+ "Utility navigation section"
			+ "Mega menu"
			+ "Live chat"
			+ "Country with currency switcher"
			+ "Footer newsletter subscription"
			+ "Social share icons"
			+"Store locator page store search and location display"
			+"Browsed few CMS pages randomly and no 404 page")
			
	public void homepage_Elements_Display()
	{
		LoginPage lp= new LoginPage(driver);
		lp.closepopups();
		HomePage hp= new HomePage(driver);
		hp.verifyhomepageElements();
		hp.browsecmspage();
		System.out.println("Home page Test complete");

	}
}
