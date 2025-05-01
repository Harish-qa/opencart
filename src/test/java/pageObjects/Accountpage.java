package pageObjects;  

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class Accountpage extends Basepage {

	public Accountpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	  
	

@FindBy(xpath="//input[@id='input-firstname']") WebElement txtfname;
@FindBy( xpath="//input[@id='input-lastname']") WebElement txtlname;
@FindBy( xpath="//input[@id='input-email']") WebElement txtemail;
@FindBy(xpath="//input[@id='input-password']") WebElement txtpassword;


public void setfname( String fname) {
	txtfname.sendKeys(fname);
}
public void setlname(String lname ) {
	txtlname.sendKeys(lname);
}
public void setemail( String email) {
	txtemail.sendKeys(email);
}
public void setpassword(String password) {
	txtpassword.sendKeys(password);
}



}
