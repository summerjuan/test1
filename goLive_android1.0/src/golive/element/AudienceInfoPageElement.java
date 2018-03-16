package golive.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class AudienceInfoPageElement {
	/**观众信息页面**/
	//观众头像
	//com.cs.glive:id/iv_avatar
	public WebElement AudienceHeadPortrait(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/iv_avatar"));
	}
	
	//观众信息页面中的发起连麦按钮
	//com.cs.glive:id/tv_connect_or_profile
	public WebElement AudiencePageConnectBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/tv_connect_or_profile"));
	}
	
	//观众信息页面中关注按钮
	//com.cs.glive:id/tv_follow
	public WebElement AudiencePageFollowBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/tv_follow"));
	}
	
	//取消关注提醒弹窗
	//android.widget.FrameLayout
	public String CancelFollowPopupText() {
		return "android.widget.FrameLayout";
	}
	
	//取消关注弹窗提醒文字"你确定不再关注吗？"
	///hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[2]
	public WebElement CancelFollowPopupText(AndroidDriver driver) {
		return driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[2]"));
	}
	
	//取消关注提醒弹窗中的取消按钮
	//com.cs.glive:id/dialog_cancel_btn
	public WebElement CancelFollowPopupCancelBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/dialog_cancel_btn"));
	}
	
	//取消关注提醒弹窗中的确认按钮
	//com.cs.glive:id/dialog_ok_btn
	public WebElement CancelFollowPopupSureBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/dialog_ok_btn"));
	}
	
	//观众信息页面中更多按钮
	//com.cs.glive:id/iv_more
	public WebElement AudiencePageMoreBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/iv_more"));
	}
	
	//设为管理员按钮
	///hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout
	public WebElement SetAdminBtn(AndroidDriver driver) {
		return driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout"));
	}
	
	//设为管理员提醒弹窗
	//android.widget.FrameLayout
	public String SetAdminPopupText() {
		return "android.widget.FrameLayout";
	}
	
	//设为管理员弹窗确认按钮
	//com.cs.glive:id/dialog_ok_btn
	public WebElement SetAdminPopupSureBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/dialog_ok_btn"));
	}
	
	//设为管理员弹窗取消按钮
	//com.cs.glive:id/dialog_cancel_btn
	public WebElement SetAdminPopupCancelBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/dialog_cancel_btn"));
	}
	
	//禁言按钮
	///hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout
	public WebElement GagBtn(AndroidDriver driver) {
		return driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout"));
	}
	
	//禁言提醒弹窗
	//android.widget.FrameLayout
	public String GagPopupText() {
		return "android.widget.FrameLayout";
	}
	
	//禁言提醒弹窗确认按钮
	//com.cs.glive:id/dialog_ok_btn
	public WebElement GagPopupSureBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/dialog_ok_btn"));
	}
	
	//禁言提醒弹窗取消按钮
	//com.cs.glive:id/dialog_cancel_btn
	public WebElement GagPopupCancelBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/dialog_cancel_btn"));
	}
	
	//踢出房间按钮
	///hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView
	public WebElement KickOutRoomBtn(AndroidDriver driver) {
		return driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView"));
	}
	
	//踢出房间弹窗提醒
	//android.widget.FrameLayout
	public String KickOutRoomPopupText() {
		return "android.widget.FrameLayout";
	}
	
	//踢出房间弹窗提醒确认按钮
	//com.cs.glive:id/dialog_ok_btn
	public WebElement KickOutRoomPopupSureBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/dialog_ok_btn"));
	}
	
	//踢出房间弹窗提醒取消按钮
	//com.cs.glive:id/dialog_cancel_btn
	public WebElement KickOutRoomPopupCancelBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/dialog_cancel_btn"));
	}
	
	//加入黑名单按钮
	///hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView
	public WebElement JoinBlacklistBtn(AndroidDriver driver) {
		return driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView"));
	}
	
	//加入黑名单提醒弹窗
	//android.widget.FrameLayout
	public String JoinBlackListPopupText() {
		return "android.widget.FrameLayout";
	}
	
	//加入黑名单提醒弹窗确认按钮
	//com.cs.glive:id/dialog_ok_btn
	public WebElement JoinBlackListPopupSureBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/dialog_ok_btn"));
	}
	
	//加入黑名单提醒弹窗取消按钮
	//com.cs.glive:id/dialog_cancel_btn
	public WebElement JoinBlackListPopupCancelBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/dialog_cancel_btn"));
	}

}
