package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Kyro_Page {
	
	public WebDriver driver;
	public Login_Kyro_Page(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	

	@FindBy(xpath = "(//button[@class='LoginButton_login_button__ehTMa'])[1]")
	@CacheLookup
	 WebElement Loginbutton;
	
	@FindBy(xpath = "//input[@id='username']")
	@CacheLookup
	 WebElement username;
	
	@FindBy(xpath = "//input[@id='password']")
	@CacheLookup
	 WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	 WebElement submit;

	public void loginbutn() {
		Loginbutton.click();
	}

	public void userid(String name) {
		username.clear();
		username.sendKeys(name);
	}
	public void pass(String code) {
		password.clear();
		password.sendKeys(code);
		
	}
		
		
	public void submt() {
		submit.click();
	}

		
		
		
		
		
		
		
		
		
		
		
	
}

