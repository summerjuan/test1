package golive.element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class LoginPageElement {
	
	/**facebook登录**/
	//选择facebook登录按钮
	public WebElement facebookLogin(AndroidDriver driver) {
		return driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]"));
	}
	
	/**ins登录**/
	//选择instagram登录按钮
	public WebElement instagramLogin(AndroidDriver driver) {
		return driver.findElement(By.xpath(" //android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[2]"));
	}
	
	//ins账号输入框
	public WebElement insUserName(AndroidDriver driver) {
		List<WebElement> lis=driver.findElementByClassName("android.view.View").findElements(By.className("android.widget.EditText"));
		return lis.get(0);
	}
	
	//ins密码输入框
	public WebElement insPassword(AndroidDriver driver) {
		List<WebElement> lis=driver.findElementByClassName("android.view.View").findElements(By.className("android.widget.EditText"));
		return lis.get(1);
	}
	
	//ins登录按键
	public WebElement insLoginButton(AndroidDriver driver) {
		return driver.findElementByClassName("android.view.View").findElement(By.className("android.widget.Button"));
	}

	
	/**twitter登录**/
	//选择twitter登录按钮
	public WebElement twitterLogin(AndroidDriver driver) {
		return driver.findElementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[3]");
	}
	
	//连接twitter进行授权
	public WebElement connectTwitter(AndroidDriver driver) {
		List<WebElement> list=driver.findElementByClassName("android.widget.LinearLayout").findElements(By.className("android.widget.Button"));
		return list.get(1);
	}

	
	/**手机登录**/
	//选择手机登录
	public WebElement mobileLogin(AndroidDriver driver) {
		return driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[4]"));
	}
	
	//手机登录中选择登录
	public WebElement mobileChooseLogin(AndroidDriver driver) {
		return driver.findElement(By.xpath(" //android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[2]"));
		
	}
	
	//手机登录中的用户名输入框
	public WebElement mobileUserName(AndroidDriver driver) {
		return driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.EditText[1]"));
	}
	
	//手机登录中的密码输入框
	public WebElement mobilePassword(AndroidDriver driver) {
		return driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.EditText[2]"));
	}
	
	//手机登录中下一步进行登录按钮
	public WebElement mobileNext(AndroidDriver driver) {
		return driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[4]"));
	}
	
	/**google登录**/
	//更多登录方式按钮
	public WebElement moreLoginWays(AndroidDriver driver) {
		return driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget.TextView[1]"));
	}
	
	//选择google登录按钮
	public WebElement googleLogin(AndroidDriver driver) {
		return driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget.ImageView[1]"));
	}
	
	//选择google登录账号
	public WebElement chooseGoogleAccount(AndroidDriver driver) {
		List<WebElement> list=driver.findElementByClassName("android.widget.LinearLayout").findElements(By.className("android.widget.ImageView"));
		return list.get(0);
	}
	/**退出登录**/
	//个人信息按钮
	public WebElement userinfo(AndroidDriver driver) {
		return driver.findElementByClassName("android.widget.TabHost").findElement(By.className("android.widget.TabWidget")).findElements(By.className("android.widget.RelativeLayout")).get(2).findElements(By.className("android.widget.ImageView")).get(0);
	}
	
	//设置按钮
	public WebElement setting(AndroidDriver driver) {
		return driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"));
	}
	
	//账号登出按钮
	public WebElement logOut(AndroidDriver driver) {
		return driver.findElement(By.xpath(" //android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[10]/android.widget.RelativeLayout[1]/android.widget.TextView[1]"));
	}
	
	//确认登出按钮
	public WebElement sureLogOut(AndroidDriver driver) {
		return driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[2]"));
		
	}
	
	//取消登出按钮
	public WebElement cancelLogOut(AndroidDriver driver) {
		return driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[1]"));
	}
	
	/**登录另一账号**/
	//登录另一账号按钮
	public WebElement anotherAccount(AndroidDriver driver) {
	    //List<WebElement> lis=driver.findElementByClassName("android.widget.RelativeLayout").findElements(By.className("android.widget.TextView"));
		return driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[2]"));
	}
	
	//开播按钮
	public WebElement open(AndroidDriver driver) {
		return driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.TabHost[1]/android.widget.LinearLayout[1]/android.widget.TabWidget[1]/android.widget.RelativeLayout[2]/android.widget.ImageView[1]"));
	}

}

