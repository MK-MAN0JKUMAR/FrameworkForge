package rahulshetty.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import rahulshetty.pageObject.MyHomePage;
import rahulshetty.pageObject.UserLoginPage;

public class ParticularExecution {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/client/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	@Test
	public void verifyMethod() throws Exception{
		UserLoginPage ulp = new UserLoginPage(driver);
		ulp.setEmail("boata4@fmail.com");
		ulp.setPassword("Test1234");
		ulp.getLogin();
		Thread.sleep(1000);
		
		MyHomePage mhp = new MyHomePage(driver);
		mhp.logoutAccount();
		
		ulp.clearEnterData();
		Thread.sleep(1000);
		ulp.setEmail("boat123@gmail.com");
		ulp.setPassword("Test@1234");
		ulp.getLogin();
		ulp.clearEnterData();
		
		System.out.println(ulp.verifyIsLoginPage());
	}

	@AfterMethod
	public void tearDown() {
//		driver.quit();
	}
}
