package com.AMRetailAndrewMarcAutomationScript.testCases;

import org.testng.annotations.Test;

import com.AMRetailAndrewMarcAutomationScript.pageObjects.BaseClass;
import com.AMRetailAndrewMarcAutomationScript.pageObjects.CheckoutPage;
import com.AMRetailAndrewMarcAutomationScript.pageObjects.LoginPage;
import com.AMRetailAndrewMarcAutomationScript.pageObjects.PDPPage;
import com.AMRetailAndrewMarcAutomationScript.pageObjects.PLPPage;

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
		chckp.proceedtocheckout();
		chckp.verifylogin();
		chckp.verifyshippingdetails();
		chckp.verifypaymentdetails();
		System.out.println("Checkout Test complete");
}
}