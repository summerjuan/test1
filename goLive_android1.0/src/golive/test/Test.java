package golive.test;

import golive.common.Driver;
import golive.operation.LoginPageOperation;
import golive.operation.SignInPageOperation;
import io.appium.java_client.android.AndroidDriver;

public class Test {
	public static void main(String[] args) {
		LoginPageOperation lpoperation=new LoginPageOperation();
		SignInPageOperation sipOperation=new SignInPageOperation();
		Driver drivers=new Driver();
		AndroidDriver driver=drivers.getDriver();
		lpoperation.mobileLogin(driver);
		sipOperation.SignIn(driver);
		//lpoperation.facebookLogin();
		//lpoperation.instagramLogin();
		//lpoperation.twitterLogin();
		//lpoperation.googleLogin();
		lpoperation.logOut(driver);
		//lpoperation.open();
		lpoperation.anotherAccount(driver);
		
	}

}
