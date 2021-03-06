package golive.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class MyBadgePageElement {
	
	//我的徽章
	public WebElement MybadgeButton(AndroidDriver driver) {
		return driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[3]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]"));
	}

	//贵族徽章
    public WebElement NobilityBadgeButton(AndroidDriver driver) {
		return driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.ImageView[1]"));
	}
	
	//活动徽章
    public WebElement ActivityBadgeButton(AndroidDriver driver) {
		return driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.ImageView[2]"));
	}
    
	//粉丝徽章
    public WebElement FansBadgeButton(AndroidDriver driver) {
		return driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.ImageView[3]"));
	}
    
	//我的徽章页面返回键
    public WebElement BadgeReturnButton(AndroidDriver driver) {
		return driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"));
	}

}
