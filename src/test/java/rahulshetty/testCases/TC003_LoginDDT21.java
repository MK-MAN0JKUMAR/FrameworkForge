package rahulshetty.testCases;
import org.testng.Assert;
import org.testng.annotations.Test;
import rahulshetty.pageObject.MyHomePage;
import rahulshetty.pageObject.UserLoginPage;
import rahulshetty.testBase.BaseTestClass;
import rahulshetty.utilities.DataProviders;
public class TC003_LoginDDT21 extends BaseTestClass {
	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class, groups = "dataDriven") // getting data
																										// provider form
																										// different
	public void verifyLoginExcel(String email, String pwd, String expctectedResult) {
		logger.info("-->Starting TC003_LoginDDT");
		try {
			UserLoginPage ulp = new UserLoginPage(driver);
			ulp.setEmail(email);
			ulp.setPassword(pwd);
			ulp.getLogin();
			MyHomePage mhp = new MyHomePage(driver);
			//boolean txtVerifyOnHomePage = mhp.isMyHomePageExists();
			//boolean txtVerifyOnLoginPage = ulp.verifyIsLoginPage();
			
			mhp.isMyHomePageExists();
			
		
			if (expctectedResult.equalsIgnoreCase("Valid")) {
				if (mhp.isMyHomePageExists()) {
					mhp.logoutAccount();
					Assert.assertTrue(true);
					//ulp.clearEnterData();
				} else {
					ulp.clearEnterData();
					Assert.assertTrue(false);
				}
			}
			else if (expctectedResult.equalsIgnoreCase("Invalid")) {
				if (mhp.isMyHomePageExists()) {
					ulp.clearEnterData();
					Assert.assertTrue(false);
				} else {
					Assert.assertTrue(true);
					ulp.clearEnterData();
				}
			}
		} catch (
		Exception e) {
			Assert.fail();
		}
		logger.info("-->Finished TC003_LoginDDT");
	}
}