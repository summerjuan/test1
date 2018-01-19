package golive.test;

import org.testng.annotations.Test;

import golive.common.Driver;
import golive.operation.LoginPageOperation;
import golive.operation.SignInPageOperation;
import golive.operation.UserinfoPageOperation;
import io.appium.java_client.android.AndroidDriver;

/**用户信息模块**/
public class UserinfoTest {
	UserinfoPageOperation upOperation=new UserinfoPageOperation();
	LoginPageOperation lpOpetation=new LoginPageOperation();
	SignInPageOperation sipOperation=new SignInPageOperation();
	Driver drivers=new Driver();
	AndroidDriver driver=drivers.getDriver();
	
	
  @Test(priority=0)
  public void testMybadge() {
	  upOperation.Userinfo(driver);
	  lpOpetation.mobileLogin(driver);
	  sipOperation.SignIn(driver);
	  upOperation.MyBadge(driver);
  }
}
