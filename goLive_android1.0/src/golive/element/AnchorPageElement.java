package golive.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class AnchorPageElement {
	/** 主播头像 **/
	// 主播头像
	// com.cs.glive:id/layout_head_userinfo
	// com.cs.glive:id/iv_head_icon
	public WebElement AnchorHeadPortrait(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/layout_head_userinfo"));
	}
	
	//主播头像标记
	public String AnchorHeadPortraitSign() {
		return "com.cs.glive:id/layout_head_userinfo";
	}

	// 主播菜单栏
	// com.cs.glive:id/layout_bottom_host
	public String AnchorMenuText() {
		return "com.cs.glive:id/layout_bottom_host";
	}

	/** 贴纸 **/
	// 进入贴纸界面按钮
	// com.cs.glive:id/btn_sticker
	//// android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager[1]/android.support.v4.view.ViewPager[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]
	public WebElement EnterStickerPageBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/btn_sticker"));
	}

	// 图案贴纸按钮
	//// android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.HorizontalScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]
	public WebElement PatternStickerBtn(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.HorizontalScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]"));
	}

	// 选中第一个图案贴纸
	//// android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.GridView[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]
	public WebElement FirstPatternSticker(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.GridView[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]"));
	}

	// 文字贴纸按钮
	//// android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.HorizontalScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.TextView[1]
	public WebElement TextStickerBtn(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.HorizontalScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.TextView[1]"));
	}

	// 选择第一个文字贴纸
	// //android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.GridView[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]
	public WebElement FirstTextSticker(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.GridView[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]"));
	}

	// 进入特效界面按钮
	// com.cs.glive:id/btn_effect
	//// android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager[1]/android.support.v4.view.ViewPager[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]
	public WebElement EnterEffectPageBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/btn_effect"));
	}

	// 选择第一个特效
	// com.cs.glive:id/filter_image
	public WebElement FirstEffect(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/filter_image"));
	}

	// 主播截屏按钮
	// com.cs.glive:id/live_screen_snapshot
	//// android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager[1]/android.support.v4.view.ViewPager[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[3]
	public WebElement AnchorScreenshotBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/live_screen_snapshot"));
	}

	// 系统录制视频权限弹窗
	// android:id/parentPanel
	//android:id/buttonPanel
	public String RecordVideoPermissionPopup() {
		return "android:id/buttonPanel";
	}

	// 录制视频权限弹窗允许按钮
	// android:id/button1
	public WebElement AllowRecordVideoPermission(AndroidDriver driver) {
		return driver.findElement(By.id("android:id/button1"));
	}

	// 录制视频权限弹窗取消按钮
	// android:id/button2
	public WebElement CancelRecordVideoPermission(AndroidDriver driver) {
		return driver.findElement(By.id("android:id/button2"));
	}

	// 主播连麦开关
	// com.cs.glive:id/btn_link_mic_switch
	//// android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager[1]/android.support.v4.view.ViewPager[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[4]
	public WebElement AnchorConnectSwitch(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/btn_link_mic_switch"));
	}

	// 关闭连麦提醒弹窗
	// android:id/content
	public String CloseConnectPopup(AndroidDriver driver) {
		return "android:id/content";
	}

	// 关闭连麦提醒弹窗确认按钮
	/// hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.Button[2]
	public WebElement CloseConnectPopupSureBtn(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.Button[2]"));
	}

	// 关闭连麦提醒弹窗取消按钮
	/// hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.Button[1]
	public WebElement CloseConnectPopupCancelBtn(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.Button[1]"));
	}

	// 主播更多菜单按钮
	// com.cs.glive:id/btn_more
	//// android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager[1]/android.support.v4.view.ViewPager[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[5]
	public WebElement AnchorMoreBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/btn_more"));
	}

	// 分享按钮
	// hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.ImageView
	public WebElement AnchorShareBtn(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.ImageView"));
	}

	// 补光按钮
	/// hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.ImageView
	public WebElement AnchorLightingBtn(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.ImageView"));
	}

	// 美颜按钮
	/// hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.ImageView
	public WebElement AnchorBeautyBtn(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.ImageView"));
	}

	// 反转按钮
	/// hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.ImageView
	public WebElement AnchorReversalCameraBtn(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.ImageView"));
	}

	// 聊天按钮
	/// hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[5]/android.widget.ImageView
	public WebElement AnchorChatBtn(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[5]/android.widget.ImageView"));
	}

	// 聊天输入框
	// com.cs.glive:id/et_input_message
	public WebElement AnchorChatIputbox(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/et_input_message"));
	}

	// 聊天发送按钮
	// com.cs.glive:id/confirm_btn
	public WebElement AnchorChatSendBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/confirm_btn"));
	}

	// 联合直播按钮
	/// hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[6]/android.widget.ImageView
	public WebElement GroupLiveBtn(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[6]/android.widget.ImageView"));
	}

	// 打开联合直播倒计时按钮
	// com.cs.glive:id/union_live_time_setting_switch
	public WebElement GroupLiveCountdownBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/union_live_time_setting_switch"));
	}

	// 减少联合直播倒计时按钮
	// com.cs.glive:id/union_live_time_decrease
	public WebElement DecreaseGroupLiveCountdown(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/union_live_time_decrease"));
	}

	// 增加联合直播倒计时按钮
	// com.cs.glive:id/union_live_time_increase
	public WebElement IncreaseGroupLiveCountdown(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/union_live_time_increase"));
	}

	// 联合直播发起邀请按钮
	// com.cs.glive:id/united_live_invite
	public WebElement InviteGroupLiveBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/united_live_invite"));
	}

	// 联合直播推荐按钮
	/// hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]
	public WebElement RecommendGroupLiveBtn(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]"));
	}
	
	//向推荐列表中的第一个人发起邀请按钮
	public String InviteFirstUserInRecommendListText(AndroidDriver driver) {
		return "com.cs.glive:id/united_live_list_invite";
	}

	// 向推荐列表中的第一个人发起邀请按钮
	// com.cs.glive:id/united_live_list_invite
	public WebElement InviteFirstUserInRecommendList(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/united_live_list_invite"));
	}

	// 取消邀请
	// com.cs.glive:id/invite_cancle
	public WebElement CancleInviteGroupLive(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/invite_cancle"));
	}

	// 主播宝箱按钮
	// com.cs.glive:id/btn_treasure_box
	//// android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager[1]/android.support.v4.view.ViewPager[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[6]
	public WebElement AnchorTreasureBox(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/btn_treasure_box"));
	}

	// 宝箱金币输入框
	// com.cs.glive:id/et_amount
	//// android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.EditText[1]
	public WebElement AnchorTreasureBoxInputBox(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/et_amount"));
	}

	// 发宝箱按钮
	// com.cs.glive:id/ok
	//// android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.TextView[1]
	public WebElement AnchorSendTreasureBox(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/ok"));
	}

	// 金币余额
	// com.cs.glive:id/tv_property
	//// android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]
	public WebElement AnchorTreasureBoxPageCoinBalance(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/tv_property"));
	}

	// 第一次开播结束弹窗棒极了按钮
	//// android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[2]
	public WebElement LiveFinishScoringGuidePopup(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[2]"));
	}

	// 好评提示框中的不了，谢谢按钮
	//// android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[1]
	public WebElement ScoringGuidePoupupCancelBtn(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[1]"));
	}

}
