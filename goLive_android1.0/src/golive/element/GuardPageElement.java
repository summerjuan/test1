package golive.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class GuardPageElement {
	/**守护主播**/
	//守护图标按钮
	public WebElement GuardIconBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/guardian_img"));
	}
	
	//守护页面
	public String GuardPageText() {
		return "com.cs.glive:id/guardian_button_layout";
	}
	
	//守护争夺按钮
	public WebElement FightGuardBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/guardian_sure"));
	}
	
	//金币不足弹窗
	public String NotEnoughCoinPopupText() {
		return "com.cs.glive:id/desk_setting_dialog_buttons";
	}
	
	//金币不足弹窗取消按钮
	public WebElement NotEnoughCoinCancelBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/dialog_cancel_btn"));
	}
	
	//金币不足弹窗确认按钮
	//com.cs.glive:id/dialog_ok_btn
	public WebElement NotEnoughCoinSureBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/dialog_ok_btn"));
	}
	

}
