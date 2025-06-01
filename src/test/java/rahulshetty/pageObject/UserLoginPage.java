package rahulshetty.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserLoginPage extends BasePageObjects {

	// Constructor
	public UserLoginPage(WebDriver driver) {
		super(driver);
	}

	// Locator
	@FindBy(xpath = "//h1[text()='Log in']")
	WebElement isLoginPage;
	
	// register
	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement clkRegister;

	// login
	@FindBy(xpath = "//input[@id='userEmail']")
	WebElement txtEmail;

	@FindBy(xpath = "//input[@id='userPassword']")
	WebElement txtPassword;

	@FindBy(xpath = "//input[@id='login']")
	WebElement clkLoginBtn;

	// Action Methods
	public void registerPage() {
		implicitWaitElement(clkRegister, 5);
		clkRegister.click();
	}

	// login actions
	public boolean verifyIsLoginPage() {
		String getLogPageText = isLoginPage.getText();
		return getLogPageText.equals("Log in");
	}
	
	public void setEmail(String email) {
		implicitWaitElement(txtEmail, 1);
		txtEmail.sendKeys(email);
	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void getLogin() {
		clkLoginBtn.click();
	}
	
	public void clearEnterData() throws Exception{
		Thread.sleep(3000);
		txtEmail.clear();
		txtPassword.clear();
	}
}
