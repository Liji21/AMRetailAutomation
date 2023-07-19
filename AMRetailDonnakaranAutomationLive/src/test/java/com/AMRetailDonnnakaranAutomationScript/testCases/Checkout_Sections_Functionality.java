package com.AMRetailDonnnakaranAutomationScript.testCases;

import org.testng.annotations.Test;
import com.AMRetailDonnnakaranAutomationScript.pageObjects.BaseClass;
import com.AMRetailDonnnakaranAutomationScript.pageObjects.CheckoutPage;
import com.AMRetailDonnnakaranAutomationScript.pageObjects.LoginPage;
import com.AMRetailDonnnakaranAutomationScript.pageObjects.PDPPage;
import com.AMRetailDonnnakaranAutomationScript.pageObjects.PLPPage;

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
		chckp.verifypaymentdetails();
		System.out.println("Checkout Test complete");
}
}