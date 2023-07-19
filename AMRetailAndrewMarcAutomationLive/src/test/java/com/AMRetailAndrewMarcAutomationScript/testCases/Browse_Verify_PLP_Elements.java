package com.AMRetailAndrewMarcAutomationScript.testCases;

import org.testng.annotations.Test;

import com.AMRetailAndrewMarcAutomationScript.pageObjects.BaseClass;
import com.AMRetailAndrewMarcAutomationScript.pageObjects.LoginPage;
import com.AMRetailAndrewMarcAutomationScript.pageObjects.PLPPage;

import io.qameta.allure.Description;

public class Browse_Verify_PLP_Elements extends BaseClass 
{
	@Test
	@Description("Confirmed PLP display with product grid, filter,sort, load more and grid switcher"
			+"Browsed few PLP pages randomly and no 404 page")
	public void browse_Verify_PLP_Elements()
	{
		LoginPage lp= new LoginPage(driver);
		lp.closepopups();
		PLPPage plp= new PLPPage(driver);
		plp.verifyplp();
		plp.browseplp();
		plp.search();
		System.out.println("PLP page Test complete");

	}
}
