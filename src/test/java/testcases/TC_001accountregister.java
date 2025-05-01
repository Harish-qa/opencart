package testcases;


 
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Accountpage;
import pageObjects.Homepage;
import testBase.Baseclass;

public class TC_001accountregister extends Baseclass{
	 
	
	@Test(groups = {"regression","master"} )
	public void verifyaccountpage() {
		logger.info("**********************************start");
		try {
		Homepage hp=new Homepage(driver);
		hp.myaccount();
		hp.register();
		logger.info(" ********************************* register");
		Accountpage ap=new Accountpage(driver);
		ap.setfname(randomString().toUpperCase());
		ap.setlname(randomString().toUpperCase());
		ap.setemail(randomString()+"@gmail.com");
		ap.setpassword(alphanumeric());
		} 
		catch (Exception e) {
			// TODO: handle exception
			logger.error("Test failed");
			logger.debug("debug.........");
			Assert.fail();
		}
		
	}
	
	
	

}
