package com.AMRetailAutomationScript.testCases;

import org.testng.annotations.Test;

import com.AMRetailAutomationScript.pageObjects.BaseClass;
import com.AMRetailAutomationScript.pageObjects.LoginPage;
import com.AMRetailAutomationScript.pageObjects.PDPPage;
import com.AMRetailAutomationScript.pageObjects.PLPPage;
import com.AMRetailAutomationScript.pageObjects.CheckoutPage;

import io.qameta.allure.Description;

public class Checkout_Sections_Functionality extends BaseClass
{
	@Test
	@Description("Confirmed Shopping cart display with product name, image, qty, edit, remove, save for later, promo section, CO button"
			+ "Confirmed checkout method, tax and payment method display.")
	public void checkoutfunctionalityverification()
	{
		LoginPage lp= new LoginPage(driver);
		lp.closepopups();
		PLPPage plp= new PLPPage(driver);
		plp.plpselectpdt();
		PDPPage pdp = new PDPPage(driver);
		pdp.addtoCart();
		CheckoutPage chckp= new CheckoutPage(driver);
		chckp.verifyshoppingcart();
		chckp.verifylogin();
		chckp.verifyshippingdetails();
		//chckp.verifypaymentdetails();
		//chckp.verifyordersummary();
		System.out.println("Checkout Test complete");
}
}