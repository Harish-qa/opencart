package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Login  extends Basepage{

	public Login(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

@FindBy( xpath="//input[@id='input-email']") WebElement txtemail;
@FindBy( xpath="//input[@id='input-password']") WebElement txtpassword;
@FindBy (xpath="//button[normalize-space()='Login']")  WebElement btnlogin;
 
public void email( String email) {
	txtemail.sendKeys(email);
	
}
public void password( String password) {
	txtpassword.sendKeys(password);
}
public void login() {
	btnlogin.click();
}
}
