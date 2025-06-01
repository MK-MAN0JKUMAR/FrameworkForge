package rahulshetty.testCases;
import org.testng.Assert;
import org.testng.annotations.Test;
import rahulshetty.pageObject.MyHomePage;
import rahulshetty.pageObject.UserLoginPage;
import rahulshetty.testBase.BaseTestClass;
import rahulshetty.utilities.DataProviders;
public class TC003_LoginDDT extends BaseTestClass {
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
			boolean txtVerifyOnHomePage = mhp.isMyHomePageExists();
			//boolean txtVerifyOnLoginPage = ulp.verifyIsLoginPage();
			
//			Assert.assertTrue(txtVerifyOnHomePage);
			System.out.println(expctectedResult);
			
			if (expctectedResult.equalsIgnoreCase("Valid")) {
				if (txtVerifyOnHomePage == true) {
					mhp.logoutAccount();
					Assert.assertTrue(true);
				} else {
					ulp.clearEnterData();
					Assert.assertTrue(false);
				}
			}
			else if (expctectedResult.equalsIgnoreCase("Invalid")) {
				if (txtVerifyOnHomePage == true) {
					mhp.logoutAccount();
					ulp.clearEnterData();
					Assert.assertTrue(false);
				} else {
					ulp.clearEnterData();
					Assert.assertTrue(true);
				}
			}
		} catch (
		Exception e) {
			Assert.fail();
		}
		logger.info("-->Finished TC003_LoginDDT");
	}
}