package golive.action;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class AnchorPageAction {
	//点击操作
	public void click(WebElement element) {
		element.click();
	}
	
	//输入操作
	public void input(WebElement element,String inputKey) {
		element.sendKeys(inputKey);
	}
	
	//点击屏幕中间一个点
	public void ClickAPoint(AndroidDriver driver,int during) {
		int width=driver.manage().window().getSize().width;
		int height=driver.manage().window().getSize().height;
		int x=width/2;
		int y=height/2;
		driver.swipe(x, y, x, y, during);
	}

}
