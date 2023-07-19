package com.AMRetailkarllagerfeldparis.testCases;

import org.testng.annotations.Test;

import com.AMRetailkarllagerfeldparis.pageObjects.BaseClass;
import com.AMRetailkarllagerfeldparis.pageObjects.HomePage;
import com.AMRetailkarllagerfeldparis.pageObjects.PDPPage;

import io.qameta.allure.Description;


public class PDPPage_Minicart_Shoppingcart_Display extends BaseClass
{
	@Test
	@Description("1. Confirmed PDP elements like variant, image, ATC, live chat, sticky ATC, YMAl and rating display"
			     +"2. Confirmed Mini bag display with product name, image, qty, save for later, CO button"
			     +"3. Browsed few PLP,PDP pages randomly and no 404 page")

	public void pdpPage_Minicart_Shoppingcart_Display()
	{
		HomePage lp= new HomePage(driver);
		lp.closepopups();
		PDPPage pdp = new PDPPage(driver);
		pdp.verifypdp();
		pdp.verifyminicart();
		pdp.verifyshoppingcart();
		System.out.println("PDP page Test complete");

}
}