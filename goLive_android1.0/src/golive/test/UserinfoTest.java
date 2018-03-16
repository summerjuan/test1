package golive.test;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import golive.common.Driver;
import golive.operation.LoginPageOperation;
import golive.operation.SignInPageOperation;
import golive.operation.UserinfoPageOperation;
import io.appium.java_client.android.AndroidDriver;

/** 用户信息模块 **/
public class UserinfoTest {
	UserinfoPageOperation upOperation = new UserinfoPageOperation();
	LoginPageOperation lpOpetation = new LoginPageOperation();
	SignInPageOperation sipOperation = new SignInPageOperation();
	Driver drivers = new Driver();
	AndroidDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = drivers.getDriver();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@Test(priority = 0)
	public void testEditUserinfoPage() {
		lpOpetation.mobileLogin(driver);
		lpOpetation.Skip(driver);
		sipOperation.QuitSignIn(driver);
		lpOpetation.QuitUpdate(driver);
		upOperation.Userinfo(driver);
		upOperation.EditUserinfoPage(driver);
		assertEquals(true, upOperation.UserId(driver));
		Reporter.log("编辑用户信息页面通过");
	}
	
	@Test(priority = 1)
	public void testMySignIn() {
		upOperation.MySignIn(driver);
		assertEquals(true, upOperation.UserId(driver));
		Reporter.log("我的签到页面通过");
	}

	@Test(priority = 2)
	public void testMybadge() {
		upOperation.MyBadge(driver);
		assertEquals(true, upOperation.UserId(driver));
		Reporter.log("我的徽章页面通过");
	}

	

	@Test(priority = 3)
	public void testGoldCoin() {
		upOperation.GoldCoin(driver);
		assertEquals(true, upOperation.UserId(driver));
		Reporter.log("金币页面通过");
	}

	@Test(priority = 4)
	public void testDiamond() {
		upOperation.Diamond(driver);
		assertEquals(true, upOperation.UserId(driver));
		Reporter.log("钻石页面通过");
	}
	
	@Test(priority=5)
	public void testLiveRecord() {
		upOperation.LiveRecord(driver);
		assertEquals(true, upOperation.UserId(driver));
		Reporter.log("直播记录页面通过");
	}

	@Test(priority = 6)
	public void testUserGrade() {
		upOperation.UserGrade(driver);
		assertEquals(true, upOperation.UserId(driver));
		Reporter.log("用户等级页面通过");
	}

	@Test(priority = 7)
	public void testAnchorGrade() {
		upOperation.AnchorGrade(driver);
		assertEquals(true, upOperation.UserId(driver));
		Reporter.log("主播等级页面通过");
	}

	@Test(priority = 8)
	public void testContributorRank() {
		upOperation.ContributorRank(driver);
		assertEquals(true, upOperation.UserId(driver));
		Reporter.log("贡献排名页面通过");
	}
}
