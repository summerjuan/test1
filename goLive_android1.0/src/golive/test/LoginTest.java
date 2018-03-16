package golive.test;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import golive.common.Driver;
import golive.operation.LoginPageOperation;
import golive.operation.SignInPageOperation;
import golive.operation.UserinfoPageOperation;
import io.appium.java_client.android.AndroidDriver;

public class LoginTest {

	LoginPageOperation lpoperation = new LoginPageOperation();
	SignInPageOperation sipOperation = new SignInPageOperation();
	Driver drivers = new Driver();
	AndroidDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = drivers.getDriver();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@Test(priority = 0)
	public void testFacebookLogin() {
		lpoperation.facebookLogin(driver);
		lpoperation.Skip(driver);
		sipOperation.SignIn(driver);
		lpoperation.QuitUpdate(driver);
		lpoperation.logOut(driver);
		lpoperation.anotherAccount(driver);
		assertEquals(true, lpoperation.LoginPageSign(driver));
		Reporter.log("Facebook登录通过");
	}

	@Test(priority = 1)
	public void testGooleLogin() {

		lpoperation.googleLogin(driver);
		lpoperation.Skip(driver);
		sipOperation.SignIn(driver);
		lpoperation.QuitUpdate(driver);
		lpoperation.logOut(driver);
		lpoperation.anotherAccount(driver);
		assertEquals(true, lpoperation.LoginPageSign(driver));
		Reporter.log("Goole登录通过");
	}

	@Test(priority = 2)
	public void testTwitterLogin() {
		lpoperation.twitterLogin(driver);
		lpoperation.Skip(driver);
		sipOperation.SignIn(driver);
		lpoperation.QuitUpdate(driver);
		lpoperation.logOut(driver);
		lpoperation.anotherAccount(driver);
		assertEquals(true, lpoperation.LoginPageSign(driver));
		Reporter.log("Twitter登录通过");
	}

	@Test(priority = 3)
	public void testMobileLogin() {
		lpoperation.mobileLogin(driver);
		lpoperation.Skip(driver);
		sipOperation.SignIn(driver);
		lpoperation.QuitUpdate(driver);
		lpoperation.logOut(driver);
		lpoperation.anotherAccount(driver);
		assertEquals(true, lpoperation.LoginPageSign(driver));
		Reporter.log("手机登录通过");
	}

	@Test(priority = 4)
	public void testInstagramLogin() {
		lpoperation.instagramLogin(driver);
		lpoperation.Skip(driver);
		sipOperation.SignIn(driver);
		lpoperation.QuitUpdate(driver);
		lpoperation.logOut(driver);
		lpoperation.anotherAccount(driver);
		assertEquals(true, lpoperation.LoginPageSign(driver));
		Reporter.log("Instagram登录通过");
	}

}
