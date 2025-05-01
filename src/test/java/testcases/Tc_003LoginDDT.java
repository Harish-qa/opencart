package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Login;
import pageObjects.MyAcoountpage;
import testBase.Baseclass;
import utilities.Dataproviders;
public class Tc_003LoginDDT extends Baseclass {
@Test(dataProvider = "LoginData",dataProviderClass=Dataproviders.class,groups="Datadriven")	
public void loginDDT( String email,String pwd,String exp) throws InterruptedException {
	logger.info("-------------------------------------------------------------------Homepage");
	Homepage hp=new Homepage(driver);
	hp.myaccount();
	hp.login();
	Thread.sleep(3000);
	logger.info("-------------------------------------------------------------------Login");
	Login  lp=new Login(driver);
	lp.email("email");
	lp.password("password");
	lp.login();
	Thread.sleep(3000);
	logger.info("-------------------------------------------------------------------My Account");
	MyAcoountpage macc=new MyAcoountpage(driver);
	boolean targetpage= macc.ismyaccountpage();
	
	if(exp.equalsIgnoreCase("valid"))
	{
		if(targetpage==true) {
			macc.logout();
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
	
	}
	if(exp.equalsIgnoreCase("Invalid"))
	{
		if(targetpage==true) {
			macc.logout();
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(true);
		}
	}
	}
	logger.info("-------------------------------------------------------------------logout");
}

}



