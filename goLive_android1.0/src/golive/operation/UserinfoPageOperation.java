package golive.operation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.server.handler.UploadFile;

import golive.action.UserinfoPageAction;
import golive.element.DiamondPageElement;
import golive.element.EditUserinfoPageElement;
import golive.element.MyBadgePageElement;
import golive.element.SignInPageElement;
import golive.element.UserinfoPageElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class UserinfoPageOperation {
	MyBadgePageElement mbpElement = new MyBadgePageElement();
	UserinfoPageElement upElement = new UserinfoPageElement();
	UserinfoPageAction upAction = new UserinfoPageAction();
	SignInPageElement sipElement = new SignInPageElement();
	DiamondPageElement dpElement = new DiamondPageElement();
	EditUserinfoPageElement eupElement=new EditUserinfoPageElement();

	/**个人信息按钮**/
	public void Userinfo(AndroidDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		upAction.click(upElement.userinfo(driver));// 点击个人信息按钮
	}
	
	/**用户信息编辑页**/
	public void EditUserinfoPage(AndroidDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		upAction.click(eupElement.EditUserinfoBtn(driver));//编辑用户信息按钮
		upAction.click(eupElement.EditPhotoBtn(driver));//编辑用户头像按钮
		upAction.click(eupElement.SelectOnePicture(driver));//选中一张照片
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.pressKeyCode(AndroidKeyCode.BACK);//点击手机返回按键
		//upAction.click(eupElement.EditPhotoBtn(driver));//编辑用户头像按钮
		//upAction.click(eupElement.TakeAPicturesBtn(driver));//照相
		//driver.pressKeyCode(AndroidKeyCode.BACK);//点击手机返回按键
		upAction.click(eupElement.SaveUserinfoBtn(driver));//保存用户信息编辑按键
	}
	
	/**关注列表**/
	public void FollowerList(AndroidDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		upAction.click(upElement.FollowerListBtn(driver));//关注列表按钮
	}
	
	/**粉丝列表**/
	public void FansList(AndroidDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		upAction.click(upElement.FansListBtn(driver));//粉丝列表按钮
	}

	/** 我的徽章 **/
	public void MyBadge(AndroidDriver driver) {
		upAction.click(mbpElement.MybadgeButton(driver));// 点击我的徽章
		upAction.click(mbpElement.NobilityBadgeButton(driver));// 点击贵族徽章
		upAction.click(mbpElement.ActivityBadgeButton(driver));// 点击活动徽章
		upAction.click(mbpElement.FansBadgeButton(driver));// 点击粉丝徽章
		upAction.click(mbpElement.BadgeReturnButton(driver));// 点击返回按钮
	}

	/** 我的签到 **/
	public void MySignIn(AndroidDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		upAction.click(upElement.MySignInBtn(driver));// 点击我的签到按钮
		upAction.click(upElement.SignInBtn(driver));// 如果没签到就点击签到按键
		try {
			upAction.click(sipElement.SignInOpenButton(driver));
			upAction.click(sipElement.SignInSureButton(driver));
		} catch (Exception e) {

		}
		upAction.click(upElement.MySignInReturnBtn(driver));// 点击我的签到页面的返回按键
		System.out.println("我的签到");
	}

	/** 金币 **/
	public void GoldCoin(AndroidDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		upAction.click(upElement.GoldCoinButton(driver));// 金币按钮
		upAction.click(upElement.CoinRechargeRecord(driver));// 金币充值记录
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		upAction.click(upElement.CoinRechargeReturn(driver));// 金币充值记录页面返回按键
		upAction.click(upElement.CoinReturnBtn(driver));// 金币返回按钮
	}

	/** 钻石 **/
	public void Diamond(AndroidDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		upAction.click(dpElement.DiamondBtn(driver));// 钻石
		upAction.click(dpElement.DiamondWithdrawDeposit(driver));// 提现按钮
		upAction.click(dpElement.WithdrawRecordBtn(driver));// 提现记录按钮
		upAction.click(dpElement.WithdrawRecordReturnBtn(driver));// 提现记录页面返回键
		upAction.click(dpElement.WithdrawDepositReturnBtn(driver));// 提现页面返回按钮
		upAction.click(dpElement.DiamondExchangeBtn(driver));// 兑换按钮
		int DiamondNumber = Integer.parseInt(dpElement.DiamondNumber(driver).getText());
		System.out.println(DiamondNumber);
		if (DiamondNumber > 100) {
			upAction.click(dpElement.Spend100Diamon(driver));// 兑换花费100钻石按钮
			upAction.click(dpElement.SureExchange(driver));// 确认兑换弹窗确定按钮
		}
		upAction.click(dpElement.ExchangePageReturnBtn(driver));// 兑换页面返回按钮
		upAction.click(dpElement.DiamonPageReturnBtn(driver));// 钻石页面返回按钮

	}

	/**直播记录**/
	public void LiveRecord(AndroidDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		upAction.click(upElement.LiveRecordButton(driver));// 直播记录按钮
		upAction.click(upElement.LiveRecordReturnBtn(driver));// 直播记录页面返回键
	}
	
	
	/** 用户等级 **/
	public void UserGrade(AndroidDriver driver) {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		upAction.swipToUp(driver, 1000);//向上滑动
		upAction.click(upElement.UserGradeBtn(driver));// 用户等级
		upAction.click(upElement.UserGradeReturnBtn(driver));// 用户等级页面返回键
	}
	
	/**主播等级**/
	public void AnchorGrade(AndroidDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		upAction.click(upElement.AnchorGradeBtn(driver));// 主播等级按钮
		upAction.click(upElement.AnchorGradeReturnBtn(driver));// 主播等级页面返回键
	}
	
	/**贡献排名**/
	public void ContributorRank(AndroidDriver driver) {
		upAction.click(upElement.ContributorRankBtn(driver));// 贡献排名按钮
		upAction.click(upElement.ContributorRankReturn(driver));// 贡献排名页面返回键
	}
	
	//个人信息页面以id作为断言
	public boolean UserId(AndroidDriver driver) {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if(driver.getPageSource().contains(upElement.UserIdElement())) {
			return true;
		}else {
			return false;
		}
	}
}
