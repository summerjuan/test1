package golive.test;


import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import golive.common.Driver;
import golive.operation.LoginPageOperation;
import golive.operation.SignInPageOperation;
import io.appium.java_client.android.AndroidDriver;

public class LoginTest {
	
	LoginPageOperation lpoperation=new LoginPageOperation();
	SignInPageOperation sipOperation=new SignInPageOperation();
	Driver drivers=new Driver();
	AndroidDriver driver=drivers.getDriver();
  
	@Test(priority=0)
	public void testFacebookLogin() {
		lpoperation.facebookLogin(driver);
		sipOperation.SignIn(driver);
		lpoperation.logOut(driver);
		lpoperation.anotherAccount(driver);
		assertEquals(lpoperation.moreLoginWaysString(driver), "更多");
	}
	
	
	@Test(priority=1)
	public void testInstagramLogin() {
		lpoperation.instagramLogin(driver);
		sipOperation.SignIn(driver);
		lpoperation.logOut(driver);
		lpoperation.anotherAccount(driver);
		assertEquals(lpoperation.moreLoginWaysString(driver), "更多");
	}
	
	
	@Test(priority=2)
	public void testTwitterLogin() {
		lpoperation.twitterLogin(driver);
		sipOperation.SignIn(driver);
		lpoperation.logOut(driver);
		lpoperation.anotherAccount(driver);
		assertEquals(lpoperation.moreLoginWaysString(driver), "更多");
	}
	
	
	@Test(priority=3)
	public void testMobileLogin() {
		lpoperation.mobileLogin(driver);
		sipOperation.SignIn(driver);
		lpoperation.logOut(driver);
		lpoperation.anotherAccount(driver);
		assertEquals(lpoperation.moreLoginWaysString(driver), "更多");
	}
	
	
    @Test(priority=4)
    public void testGooleLogin() {
	  
	  lpoperation.googleLogin(driver);
	  sipOperation.SignIn(driver);
	  lpoperation.logOut(driver);
	  lpoperation.anotherAccount(driver);
	  assertEquals(lpoperation.moreLoginWaysString(driver), "更多");
   }
}
