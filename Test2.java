package appium_demo2;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.xerces.util.URI.MalformedURIException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;



import io.appium.java_client.android.AndroidDriver;

public class Test2 {
	private static   AndroidDriver driver;
	public static void main(String[] args) throws MalformedURIException, MalformedURLException, InterruptedException{
		File classpathRoot=new File(System.getProperty("user.dir"));//获得程序当前路径
		File appDir=new File(classpathRoot,"apps");
		File app=new File(appDir,"GLive_debug_1.7.0_dev_35_svn83820_200_staging_2017_12_28.apk");
		//判断apk是否存在
		if(!app.exists()) {
			System.out.println("本次需要安装的apk不存在");
		}
		//设置启动参数
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("appium-version", "1.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "5.1");
		capabilities.setCapability("deviceName", "YTDE45IJSGF645NJ");
		capabilities.setCapability("app", app);
		capabilities.setCapability("appPackage", "com.cs.glive");
		capabilities.setCapability("appActivity", "com.cs.glive.activity.SplashActivity");
		
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//login();
		FBlogin();
		//driver.quit();
		System.out.println("111111");	
		//driver.switchTo().alert().accept();
	}
	
	public static void login() throws InterruptedException {
		//手机登录
		//TimeUnit.SECONDS.sleep(10);
		//为了等到页面的元素都出来，所以设置等待了10秒钟
		
		//选中手机登录
		driver.findElementByXPath(" //android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[4]").click();
		//选中登录
		driver.findElementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[3]\n").click();
		//输入框
		driver.findElementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.EditText[1]\n").sendKeys("10000000111");
		//密码框
		driver.findElementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.EditText[2]\n").sendKeys("123456");
		//点击下一步进行登录
		driver.findElementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[4]\n").click();
		
	}
	
	public static void FBlogin() {
		//facebook登录
		//facebook按键
		driver.findElementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]\n").click();
		
		
	}

}
