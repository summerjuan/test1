package golive.common;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Driver {
	private AndroidDriver driver;
	
	public AndroidDriver getDriver(){
		File classpathRoot=new File(System.getProperty("user.dir"));//获得程序当前路径
		File appDir=new File(classpathRoot,"apps");
		File app=new File(appDir,"GLive_debug_unminify_1.11.0_dev_42_svn92588_200_staging_2018_02_07.apk");
		//判断apk是否存在
		if(!app.exists()) {
			System.out.println("本次需要安装的apk不存在");
		}
		//设置启动参数
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("appium-version", "1.7.2");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "5.1");
		capabilities.setCapability("deviceName", "YTDE45IJSGF645NJ");
		capabilities.setCapability("unicodeKeyboard",true);//安装appium自带的输入法
		capabilities.setCapability("resetKeyboard", true);//恢复原来的输入法
		capabilities.setCapability("app", app);
		capabilities.setCapability("appPackage", "com.cs.glive");
		capabilities.setCapability("appActivity", "com.cs.glive.activity.SplashActivity");
		
		try {
			driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	}

}
