package golive.element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class LoginPageElement {
	
	/**facebook登录**/
	//facebook登录按钮
	public WebElement facebookLogin(AndroidDriver driver) {
		return driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]"));
	}
	
	/**手机登录**/
	//选择手机登录
	public WebElement mobileLogin(AndroidDriver driver) {
		return driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[4]"));
	}
	
	//手机登录中选择登录
	public WebElement mobileChooseLogin(AndroidDriver driver) {
		return driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[3]"));
		
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
	
	/**退出登录**/
	//个人信息按钮
	public WebElement userinfo(AndroidDriver driver) {
		//List<WebElement> lis=driver.findElementsByClassName("android.widget.ImageView");
		//System.out.println("userinfo"+lis.size());
		////android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.TabHost[1]/android.widget.LinearLayout[1]/android.widget.TabWidget[1]/android.widget.RelativeLayout[3]/android.widget.ImageView[1]
		////android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.TabHost[1]/android.widget.LinearLayout[1]/android.widget.TabWidget[1]/android.widget.RelativeLayout[3]/android.widget.ImageView[2]
		return driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.TabHost[1]/android.widget.LinearLayout[1]/android.widget.TabWidget[1]/android.widget.RelativeLayout[3]/android.widget.ImageView[2]"));
		//return lis.get(0);
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

}

