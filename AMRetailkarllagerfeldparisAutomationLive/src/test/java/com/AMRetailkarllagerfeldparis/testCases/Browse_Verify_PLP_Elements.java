package com.AMRetailkarllagerfeldparis.testCases;

import org.testng.annotations.Test;

import com.AMRetailkarllagerfeldparis.pageObjects.BaseClass;
import com.AMRetailkarllagerfeldparis.pageObjects.HomePage;
import com.AMRetailkarllagerfeldparis.pageObjects.PLPPage;

import io.qameta.allure.Description;


public class Browse_Verify_PLP_Elements extends BaseClass 
{
	@Test
	@Description("1. Confirmed PLP display with product grid, filter, sort, load more and grid switcher "
			      + "2. Browsed a few PLP pages randomly and no 404 page")
	public void Browse_Verify_PLP_Elements_Functionality()
	{
		HomePage lp= new HomePage(driver);
		lp.closepopups();
		PLPPage plp= new PLPPage(driver);
		plp.plpselectpdt();
		plp.verifyplp();
		plp.browseplp();
		System.out.println("PLP page Test complete");

	}
}
