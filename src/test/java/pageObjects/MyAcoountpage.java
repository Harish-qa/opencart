package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAcoountpage extends Basepage {

	public MyAcoountpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

@FindBy (xpath="//h2[normalize-space()='My Account']") WebElement msghead;

@FindBy (xpath="//a[@class='list-group-item'][normalize-space()='Logout']") WebElement logout;

public boolean ismyaccountpage() {
	try {
	return msghead.isDisplayed();
	}
	catch (Exception e) {
		// TODO: handle exception
		return false;
	}
}
public void logout() {
	logout.click();
}
}
