package golive.action;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class UserinfoPageAction {
	//点击操作
	public void click(WebElement element) {
		element.click();
	}
	
	//向上滑动操作
		public void swipToUp(AndroidDriver driver,int during) {
			int width=driver.manage().window().getSize().width;
			int height=driver.manage().window().getSize().height;
			driver.swipe(width/2, height*3/4, width/2, height/4, during);
		}

}
