package golive.operation;



import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Sleeper;

import golive.action.LoginPageAction;
import golive.common.Driver;
import golive.element.LoginPageElement;
import io.appium.java_client.android.AndroidDriver;

public class LoginPageOperation {
	
	LoginPageElement lpelement=new LoginPageElement();
	LoginPageAction lpaction=new LoginPageAction();
	//facebook登录
	public void facebookLogin(AndroidDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		lpaction.click(lpelement.facebookLogin(driver));//facebook登录按钮
	}
	
	//ins登录
	public void instagramLogin(AndroidDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		lpaction.click(lpelement.instagramLogin(driver));//选择instagram登录按钮
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		lpaction.input(lpelement.insUserName(driver), "huangxiaojuan3344");//ins账号输入框
		lpaction.input(lpelement.insPassword(driver), "123456juan");//ins密码输入框
		lpaction.click(lpelement.insLoginButton(driver));//ins登录按键
	}
	
	//twitter登录
	public void twitterLogin(AndroidDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		lpaction.click(lpelement.twitterLogin(driver));//选择twitter登录按钮
		lpaction.click(lpelement.connectTwitter(driver));//连接twitter进行授权
		
	}
	
	
	//手机登录
	public void mobileLogin(AndroidDriver driver) {
		//为了等到页面的元素都出来，所以设置等待了10秒钟
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		lpaction.click(lpelement.mobileLogin(driver));//选择手机登录
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		lpaction.click(lpelement.mobileChooseLogin(driver));//手机登录中选择登录
		lpaction.input(lpelement.mobileUserName(driver), "10000000153");//手机登录中的用户名输入框
		lpaction.input(lpelement.mobilePassword(driver), "123456");//手机登录中的密码输入框
		lpaction.click(lpelement.mobileNext(driver));//手机登录中下一步进行登录按钮
	}
	
	//退出登录
	public void logOut(AndroidDriver driver) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		lpaction.click(lpelement.userinfo(driver));//个人信息按钮
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		lpaction.click(lpelement.setting(driver));//设置按钮
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lpaction.swipToUp(driver, 2000);
		lpaction.click(lpelement.logOut(driver));//账号登出按钮
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		lpaction.click(lpelement.sureLogOut(driver));//确认登出按钮
		
	}
	
	//google登录
	public void googleLogin(AndroidDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		lpaction.click(lpelement.moreLoginWays(driver));//更多登录方式按钮
		lpaction.click(lpelement.googleLogin(driver));//选择google登录按钮
		lpaction.click(lpelement.chooseGoogleAccount(driver));//选择google登录账号
		
	}
	
	//登录另一账号
	public void anotherAccount(AndroidDriver driver) {
		lpaction.click(lpelement.anotherAccount(driver));
		
	}
	
	//更多登录方式按钮文字
	public String moreLoginWaysString(AndroidDriver driver) {
		return lpelement.moreLoginWays(driver).getText();
	}
	
	public void open(AndroidDriver driver) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		lpaction.click(lpelement.open(driver));
	}

}
