package golive.operation;



import java.util.concurrent.TimeUnit;

import golive.action.LoginPageAction;
import golive.common.Driver;
import golive.element.LoginPageElement;
import io.appium.java_client.android.AndroidDriver;

public class LoginPageOperation {
	Driver drivers=new Driver();
	AndroidDriver driver=drivers.getDriver();
	
	LoginPageElement lpelement=new LoginPageElement();
	LoginPageAction lpaction=new LoginPageAction();
	
	//facebook登录
	public void facebookLogin() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		lpaction.click(lpelement.facebookLogin(driver));//facebook登录按钮
	}
	
	//手机登录
	public void mobileLogin() {
		//为了等到页面的元素都出来，所以设置等待了10秒钟
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		lpaction.click(lpelement.mobileLogin(driver));//选择手机登录
		lpaction.click(lpelement.mobileChooseLogin(driver));//手机登录中选择登录
		lpaction.input(lpelement.mobileUserName(driver), "10000000153");//手机登录中的用户名输入框
		lpaction.input(lpelement.mobilePassword(driver), "123456");//手机登录中的密码输入框
		lpaction.click(lpelement.mobileNext(driver));//手机登录中下一步进行登录按钮
	}
	
	//退出登录
	public void logOut() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		lpaction.click(lpelement.userinfo(driver));//个人信息按钮
		System.out.println("333");
		lpaction.click(lpelement.setting(driver));//设置按钮
		System.out.println("111");
		lpaction.swipToUp(driver, 1000);
		System.out.println("222");
		lpaction.click(lpelement.logOut(driver));//账号登出按钮
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		lpaction.click(lpelement.sureLogOut(driver));//确认登出按钮
	}

}
