package golive.test;

import golive.common.Driver;
import golive.operation.LoginPageOperation;
import golive.operation.SignInPageOperation;
import golive.operation.UserinfoPageOperation;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class Test {
	public static void main(String[] args) {
		LoginPageOperation lpoperation=new LoginPageOperation();
		SignInPageOperation sipOperation=new SignInPageOperation();
		Driver drivers=new Driver();
		AndroidDriver driver=drivers.getDriver();
		UserinfoPageOperation upOperation=new UserinfoPageOperation();
		//lpoperation.googleLogin(driver);
		lpoperation.mobileLogin(driver);
		//lpoperation.instagramLogin(driver);
		lpoperation.Skip(driver);
		
		sipOperation.QuitSignIn(driver);
		upOperation.Userinfo(driver);
		//upOperation.FollowerList(driver);
		upOperation.EditUserinfoPage(driver);
		//lpoperation.facebookLogin();
		
		
		//lpoperation.twitterLogin();
		
		//upOperation.MySignIn(driver);
		//sipOperation.SignIn(driver);
		//upOperation.GoldCoin(driver);
		//upOperation.Diamond(driver);
		//upOperation.UserGrade(driver);
		//upOperation.AnchorGrade(driver);
		//upOperation.ContributorRank(driver);
		//lpoperation.logOut(driver);
		//lpoperation.open();
		//lpoperation.anotherAccount(driver);
		
	}

}
