package golive.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class UserinfoPageElement {

	// 个人信息按钮
	public WebElement userinfo(AndroidDriver driver) {
		return driver.findElementByClassName("android.widget.TabHost")
				.findElement(By.className("android.widget.TabWidget"))
				.findElements(By.className("android.widget.RelativeLayout")).get(2)
				.findElements(By.className("android.widget.ImageView")).get(0);
	}
	
	/**用户id**/
	public String UserIdElement() {
		return "com.cs.glive:id/profile_id";
	}

	/** 关注列表 **/
	// 关注列表按钮
	public WebElement FollowerListBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/tv_follower"));
	}

	/** 粉丝列表 **/
	// 粉丝列表按钮
	public WebElement FansListBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/tv_fans"));
	}

	/** 我的签到 **/
	// 我的签到按钮
	public WebElement MySignInBtn(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]"));
	}

	// 签到按钮
	public WebElement SignInBtn(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.TextView[2]"));
	}

	// 签到返回按钮
	public WebElement MySignInReturnBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/riv_left"));
	}

	/** 金币 **/
	// 金币按钮
	public WebElement GoldCoinButton(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[4]/android.widget.RelativeLayout[1]/android.widget.TextView[2]"));
	}

	// 金币充值记录
	public WebElement CoinRechargeRecord(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]"));
	}

	// 金币充值记录页面返回按键
	public WebElement CoinRechargeReturn(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"));
	}

	// 金币返回按钮
	public WebElement CoinReturnBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/riv_left"));
	}

	/** 直播记录 **/
	// 直播记录按钮
	public WebElement LiveRecordButton(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[6]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]"));
	}

	// 直播记录页面返回键
	public WebElement LiveRecordReturnBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/riv_left"));
	}

	/** 用户等级 **/
	// 用户等级
	public WebElement UserGradeBtn(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[7]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"));
	}

	// 用户等级页面返回键
	public WebElement UserGradeReturnBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/riv_left"));
	}

	/** 主播等级 **/
	// 主播等级按钮
	public WebElement AnchorGradeBtn(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[8]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"));
	}

	// 主播等级页面返回键
	public WebElement AnchorGradeReturnBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/riv_left"));
	}

	/** 贡献排名 **/
	// 贡献排名按钮
	public WebElement ContributorRankBtn(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[9]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]"));
	}

	// 贡献排名页面返回键
	public WebElement ContributorRankReturn(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"));
	}

}
