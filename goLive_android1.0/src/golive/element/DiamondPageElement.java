package golive.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class DiamondPageElement {
	
	
	/** 钻石 **/
	// 钻石
	public WebElement DiamondBtn(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[5]/android.widget.RelativeLayout[1]/android.widget.TextView[2]"));
	}
    
	//提现记录按钮
	public WebElement WithdrawRecordBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/riv_right"));
	}
	
	//提现记录页面返回键
	public WebElement WithdrawRecordReturnBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/riv_left"));
	}
	
	// 提现按钮
	public WebElement DiamondWithdrawDeposit(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]"));
	}
	
	//提现页面返回按钮
	public WebElement WithdrawDepositReturnBtn(AndroidDriver driver) {
		return driver.findElement(By.id("com.cs.glive:id/riv_left"));
	}
	
	// 兑换按钮
	public WebElement DiamondExchangeBtn(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"));
	}

	// 兑换页的钻石数
	public WebElement DiamondNumber(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[2]"));
	}

	// 兑换花费100钻石按钮
	public WebElement Spend100Diamon(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]"));
	}

	// 确认兑换弹窗确定按钮
	public WebElement SureExchange(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[2]"));
	}

	// 确认兑换弹窗取消按钮
	public WebElement CancelExchange(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[2]"));
	}

	// 兑换页面返回按钮
	public WebElement ExchangePageReturnBtn(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"));
	}

	// 钻石页面返回按钮
	public WebElement DiamonPageReturnBtn(AndroidDriver driver) {
		return driver.findElement(By.xpath(
				"//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"));
	}

}
