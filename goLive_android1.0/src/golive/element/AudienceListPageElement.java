package golive.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class AudienceListPageElement {
	    /**观众列表**/
	    //观众列表入口
		//com.cs.glive:id/tv_top_member_counts
		public WebElement EnterAudienceList(AndroidDriver driver) {
			return driver.findElement(By.id("com.cs.glive:id/tv_top_member_counts"));
		}
		
		//观众列表中排在第一个观众头像信息
		//com.cs.glive:id/civ_viewer_avatar
		public WebElement AudienceListFirstInfo(AndroidDriver driver) {
			return driver.findElement(By.id("com.cs.glive:id/civ_viewer_avatar"));
		}
		
		//管理员列表入口
		//com.cs.glive:id/iv_admin_btn
		public WebElement EnterAdminList(AndroidDriver driver) {
			return driver.findElement(By.id("com.cs.glive:id/iv_admin_btn"));
		}
		
		//管理员列表中第一位管理员信息后面的取消管理员按钮
		//com.cs.glive:id/riv_delete
		public WebElement CancelFirstAdminBtn(AndroidDriver driver) {
			return driver.findElement(By.id("com.cs.glive:id/riv_delete"));
		}
		
		//管理员列表中第一位管理员信息
		public String CancelFirstAdminText() {
			return "com.cs.glive:id/riv_delete";
		}
		
		//取消管理员提醒弹窗
		//android.widget.FrameLayout
		public String CancelAdminPopupText() {
			return "android.widget.FrameLayout";
		}
		
		//取消管理员提醒弹窗中的取消按钮
		//com.cs.glive:id/dialog_cancel_btn
		public WebElement CancelAdminPopupCancelBtn(AndroidDriver driver) {
			return driver.findElement(By.id("com.cs.glive:id/dialog_cancel_btn"));
		}
		
		//取消管理员提醒弹窗中的确认按钮
		//com.cs.glive:id/dialog_ok_btn
		public WebElement CancelAdminPopupSureBtn(AndroidDriver driver) {
			return driver.findElement(By.id("com.cs.glive:id/dialog_ok_btn"));
		}
		
		//返回观众列表按钮
		//com.cs.glive:id/riv_back
		public WebElement ReturnAudienceListBtn(AndroidDriver driver) {
			return driver.findElement(By.id("com.cs.glive:id/riv_back"));
		}

}
