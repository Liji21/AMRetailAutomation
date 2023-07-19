package com.AMRetailkarllagerfeldparis.testCases;

import org.testng.annotations.Test;
import com.AMRetailkarllagerfeldparis.pageObjects.BaseClass;
import com.AMRetailkarllagerfeldparis.pageObjects.CheckoutPage;
import com.AMRetailkarllagerfeldparis.pageObjects.HomePage;
import com.AMRetailkarllagerfeldparis.pageObjects.PDPPage;

import io.qameta.allure.Description;

public class CheckoutSectionsFunctionality extends BaseClass
{
	@Test(priority=1)
	@Description("1. Confirmed Shopping cart display with product name, image, qty, edit, remove, save for later, promo section"
			   + "2. CO Confirmed checkout method, tax and payment method display.")
	public void checkout_guestuser_functionality()
	{
		HomePage hp= new HomePage(driver);
		hp.closepopups();
		PDPPage pd=new PDPPage(driver);
		pd.verifypdp();
		pd.verifyminicart();
		CheckoutPage cp=new CheckoutPage(driver);
		cp.proceedtocheckout();
		cp.loginemailsectionsection();
		cp.shippingsection();
		cp.paymentmethods();
		cp.verifyordersummary();
	
	} 
	
	
}
