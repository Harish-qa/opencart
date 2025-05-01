package testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Login;
import pageObjects.MyAcoountpage;
import testBase.Baseclass;

public class TC_002login extends Baseclass {
@Test(groups = {"sanity","master"} )
	public void accountlogin() {
	logger.info("***********start---------------------------");
		try {
		Homepage hp=new Homepage(driver);
		hp.myaccount();
		hp.login();
		logger.info("*************login=====================");
		Login  lp=new Login(driver);
		lp.email(p.getProperty("email"));
		lp.password(p.getProperty("password"));
		lp.login();
		MyAcoountpage macc=new MyAcoountpage(driver);
		boolean targetpage= macc.ismyaccountpage();
		Assert.assertTrue(targetpage);
	}
		catch (Exception e) {
			// TODO: handle exception
			Assert.fail();
		}
		
		
	}
}
 