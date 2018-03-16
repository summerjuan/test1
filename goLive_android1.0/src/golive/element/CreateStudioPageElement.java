package golive.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class CreateStudioPageElement {
	// 进入创建直播间界面按钮
	public WebElement EnterCreateStudioBtn(AndroidDriver driver) {
		return driver.findElementByClassName("android.widget.TabHost")
				.findElement(By.className("android.widget.TabWidget"))
				.findElements(By.className("android.widget.RelativeLayout")).get(1)
				.findElements(By.className("android.widget.ImageView")).get(0);
	}

	// 系统获取位置信息权限
	public WebElement LocationPermitBtn(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.Button[2]"));
	}

	// 系统获取摄像头权限允许按钮
	public WebElement CameraPermitBtn(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.Button[2]"));
	}

	// 输入直播间名字
	public WebElement InputStudioName(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/publish_title"));
	}

	// 点开类别选项
	public WebElement OpenCategoryOptions(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/category"));
	}

	// 选择唱歌类别
	public WebElement ChoiceSingingCategory(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.TextView[1]"));
	}

	// 收回类别选项
	public WebElement PackupCategoryOptions(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]"));
	}

	// 旋转屏幕按钮
	public WebElement RotatingScreenBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/orientation_btn"));
	}

	// 美颜按钮
	public WebElement BeautyBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/beauty_btn"));
	}

	// 定位按钮
	public WebElement LocationBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/publish_location"));
	}

	// 创建直播间按钮
	public WebElement CreateStudioBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/btn_enter"));
	}

	// 系统录音权限允许按钮
	public WebElement RecordPermitBtn(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.Button[2]"));
	}
}
