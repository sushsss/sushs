package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends BaseClass{

	@FindBy(id="email")
	WebElement userName;
	@FindBy(id="pass")
	WebElement passWord;
	@FindBy(id="loginbutton")
	WebElement btnlogin;
	
	
	public LogInPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void logIn() {
	userName.sendKeys("7798748292");
	passWord.sendKeys("Siddhu1997");
	btnlogin.click();
	}
}
