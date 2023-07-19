package com.AMRetailkarllagerfeldparis.testCases;

import org.testng.annotations.Test;

import com.AMRetailkarllagerfeldparis.pageObjects.BaseClass;
import com.AMRetailkarllagerfeldparis.pageObjects.HomePage;

import io.qameta.allure.Description;

public class HomePageElementsDisplay extends BaseClass
{
	
	@Test(priority=1)
	@Description("1. Homepage displayed with below sections Promo, Utility navigation section, Mega menu, Live chat, Country with currency switcher,Footer newsletter subscription."
			+ "2. Find a store social share icons, Store locator page store search and location display"
			+ "3. Browsed few CMS pages randomly and no 404 page")
	public void homepageElementsDisplay_storelocator_browsecmspages()
	{
		HomePage hp= new HomePage(driver);
		hp.closepopups();
		hp.verifyhomepageElementsDisplay();
		hp.verifystorelocator();
		hp.browsecmspage();
	}
	
	
}
