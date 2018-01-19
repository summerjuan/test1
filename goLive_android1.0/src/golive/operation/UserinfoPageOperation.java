package golive.operation;

import java.util.concurrent.TimeUnit;

import golive.action.UserinfoPageAction;
import golive.element.MyBadgePageElement;
import golive.element.UserinfoPageElement;
import io.appium.java_client.android.AndroidDriver;

public class UserinfoPageOperation {
	MyBadgePageElement mbpElement=new MyBadgePageElement();
	UserinfoPageElement upElement=new UserinfoPageElement();
	UserinfoPageAction upAction=new UserinfoPageAction();
	
	public void Userinfo(AndroidDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		upAction.click(upElement.userinfo(driver));//点击个人信息按钮
	}
	
	public void MyBadge(AndroidDriver driver) {
		upAction.click(mbpElement.MybadgeButton(driver));//点击我的徽章
		upAction.click(mbpElement.NobilityBadgeButton(driver));//点击贵族徽章
		upAction.click(mbpElement.ActivityBadgeButton(driver));//点击活动徽章
		upAction.click(mbpElement.FansBadgeButton(driver));//点击粉丝徽章
		upAction.click(mbpElement.BadgeReturnButton(driver));//点击返回按钮
	}

}
