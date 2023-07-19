package com.AMRetailAutomationScript.testCases;

import org.testng.annotations.Test;

import com.AMRetailGHBassAutomationScript.pageObjects.BaseClass;
import com.AMRetailGHBassAutomationScript.pageObjects.LoginPage;
import com.AMRetailGHBassAutomationScript.pageObjects.PDPPage;
import com.AMRetailGHBassAutomationScript.pageObjects.PLPPage;

import io.qameta.allure.Description;

public class PDPPage_Minicart_Shoppingcart_Display extends BaseClass
{
	@Test
	@Description("Confirmed PDP elements like variant, image, ATC, live chat, sticky ATC, YMAl and rating display"
			+"Confirmed Mini bag display with product name, image, qty, save for later, CO button."
			+"Browsed few PLP,PDP pages randomly and no 404 page")

	public void pdpPage_Minicart_Shoppingcart_Display()
	{
		LoginPage lp= new LoginPage(driver);
		lp.closepopups();
		PLPPage plp= new PLPPage(driver);
		plp.plpselectpdt();
		PDPPage pdp = new PDPPage(driver);
		
		pdp.verifypdp();
		pdp.verifyminicart();
		System.out.println("PDP page Test complete");

}
}