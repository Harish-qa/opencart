package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Homepage extends Basepage {

	public Homepage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy (xpath="//span[normalize-space()='My Account']") WebElement lnkmyaccount;

	@FindBy ( xpath="//a[@class='dropdown-item'][normalize-space()='Register']") WebElement linkregitir;
	@FindBy(xpath="//a[@class='dropdown-item'][normalize-space()='Login']") WebElement loginacc;

	
	public void myaccount() {
		lnkmyaccount.click();
		
	}
	public void register () {
		linkregitir.click();
	}
	public void login () {
		loginacc.click();
		
	}
	 

}
