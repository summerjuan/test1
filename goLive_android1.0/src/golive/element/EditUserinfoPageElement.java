package golive.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class EditUserinfoPageElement {
	
	/**用户信息编辑**/
	//用户信息编辑按键
	public WebElement EditUserinfoBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/edit_profile"));
	}
	
	//头像编辑按钮
	public WebElement EditPhotoBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/img_avatar"));
	}
	
	//选中一张照片
	public WebElement SelectOnePicture(AndroidDriver driver) {
		return driver.findElementByClassName("android.widget.FrameLayout").findElements(By.className("android.widget.TextView")).get(0);
	}

	//照相
	public WebElement TakeAPicturesBtn(AndroidDriver driver) {
		return driver.findElementByClassName("android.widget.FrameLayout").findElements(By.className("android.widget.TextView")).get(1);
	}
	
	//用户信息编辑页面保存按钮
	public WebElement SaveUserinfoBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/tv_done"));
	}
	
	//用户信息页面返回按钮
	public WebElement EditUserinfoReturnBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/img_back"));
	}

}
