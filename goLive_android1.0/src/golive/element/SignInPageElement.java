package golive.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class SignInPageElement {
	
	//签到按钮
	//com.cs.glive:id/button
	public WebElement SignInButton(AndroidDriver driver) {
		return driver.findElement(By.xpath(" //android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[2]"));
	}
	
	//开启按钮
	public WebElement SignInOpenButton(AndroidDriver driver) {
		return driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[2]"));
	}
	
	//确认按钮
	public WebElement SignInSureButton(AndroidDriver driver) {
		return driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[2]"));
	} 
   
   
	

	


}
