package golive.test;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import golive.common.Driver;
import golive.operation.AnchorPageOperation;
import golive.operation.LoginPageOperation;
import golive.operation.SignInPageOperation;
import io.appium.java_client.android.AndroidDriver;

public class AnchorTest {
	Driver drivers=new Driver();
	AndroidDriver driver;
	AnchorPageOperation apOperation=new AnchorPageOperation();
	LoginPageOperation lpOperation=new LoginPageOperation();
	SignInPageOperation sipOperation=new SignInPageOperation();
	
	@BeforeClass
	public void beforeClass() {
		driver = drivers.getDriver();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
  
	@Test(priority=0)
	public void CreateStudio() {
		lpOperation.mobileLogin(driver);
		lpOperation.Skip(driver);
		sipOperation.SignIn(driver);
		lpOperation.QuitUpdate(driver);
		apOperation.CreateStudio(driver);
		assertEquals(true, apOperation.AnchorHeadPortraitSign(driver));
		Reporter.log("创建直播间通过");
	}
	
	@Test(priority=1)
	public void AnchorHeadPortrait() {
		apOperation.AnchorHeadPortrait(driver);
		assertEquals(true, apOperation.AnchorHeadPortraitSign(driver));
		Reporter.log("点击主播头像通过");
	}
	
	@Test(priority=2)
	public void GuardAnchor() {
		apOperation.GuardAnchor(driver);
		assertEquals(true, apOperation.AnchorHeadPortraitSign(driver));
		Reporter.log("守护主播通过");
	}
	
	@Test(priority=3)
	public void AudienceList() {
		apOperation.AudienceList(driver);
		assertEquals(true, apOperation.AnchorHeadPortraitSign(driver));
		Reporter.log("观众列表通过");
	}
	
	@Test(priority=4)
	public void FollowAudience() {
		apOperation.FollowAudience(driver);
		assertEquals(true, apOperation.AnchorHeadPortraitSign(driver));
		Reporter.log("关注用户通过");
	}
	
	@Test(priority=5)
	public void SetAudienceAsAdmin() {
		apOperation.SetAudienceAsAdmin(driver);
		assertEquals(true, apOperation.AnchorHeadPortraitSign(driver));
		Reporter.log("将用户设为管理员通过");
	}
	
	@Test(priority=6)
	public void GagAudience() {
		apOperation.GagAudience(driver);
		assertEquals(true, apOperation.AnchorHeadPortraitSign(driver));
		Reporter.log("将用户禁言通过");
	}
	
	@Test(priority=7)
	public void KickOutRoom() {
		apOperation.KickOutRoom(driver);
		assertEquals(true, apOperation.AnchorHeadPortraitSign(driver));
		Reporter.log("将用户踢出房间通过");
	}
	
	@Test(priority=8)
	public void JoinBlacklist() {
		apOperation.JoinBlacklist(driver);
		assertEquals(true, apOperation.AnchorHeadPortraitSign(driver));
		Reporter.log("将用户加入黑名单通过");
	}
	
	@Test(priority=9)
	public void ContributionList() {
		apOperation.ContributionList(driver);
		assertEquals(true, apOperation.AnchorHeadPortraitSign(driver));
		Reporter.log("直播间内贡献榜通过");
	}
	
	@Test(priority=10)
	public void PatternStickers() {
		apOperation.PatternStickers(driver);
		assertEquals(true, apOperation.AnchorHeadPortraitSign(driver));
		Reporter.log("使用图案贴纸通过");
	}
	
	@Test(priority=11)
	public void TextStickers() {
		apOperation.TextStickers(driver);
		assertEquals(true, apOperation.AnchorHeadPortraitSign(driver));
		Reporter.log("使用文字贴纸通过");
	}
	
	@Test(priority=12)
	public void Effect() {
		apOperation.Effect(driver);
		assertEquals(true, apOperation.AnchorHeadPortraitSign(driver));
		Reporter.log("使用特效通过");
	}
	
	@Test(priority=13)
	public void Screenshot() {
		apOperation.Screenshot(driver);
		assertEquals(true, apOperation.AnchorHeadPortraitSign(driver));
		Reporter.log("使用截屏通过");
	}
	
	@Test(priority=14)
	public void CloseConnect() {
		apOperation.CloseConnect(driver);
		assertEquals(true, apOperation.AnchorHeadPortraitSign(driver));
		Reporter.log("关闭连麦通过");
	}
	
	@Test(priority=15)
	public void Share() {
		apOperation.Share(driver);
		assertEquals(true, apOperation.AnchorHeadPortraitSign(driver));
		Reporter.log("分享通过");
	}
	
	@Test(priority=16)
	public void Lighting() {
		apOperation.Lighting(driver);
		assertEquals(true, apOperation.AnchorHeadPortraitSign(driver));
		Reporter.log("使用补光通过");
	}
	
	@Test(priority=17)
	public void Beauty() {
		apOperation.Beauty(driver);
		assertEquals(true, apOperation.AnchorHeadPortraitSign(driver));
		Reporter.log("使用美颜通过");
	}
	
	@Test(priority=18)
	public void ReversalCamera() {
		apOperation.ReversalCamera(driver);
		assertEquals(true, apOperation.AnchorHeadPortraitSign(driver));
		Reporter.log("反转摄像头通过");
	}
	
	@Test(priority=19)
	public void Chat() {
		apOperation.Chat(driver);
		assertEquals(true, apOperation.AnchorHeadPortraitSign(driver));
		Reporter.log("普通聊天通过");
	}
	
	@Test(priority=20)
	public void GroupLive() {
		apOperation.GroupLive(driver);
		assertEquals(true, apOperation.AnchorHeadPortraitSign(driver));
		Reporter.log("联播通过");
	}
	
	@Test(priority=21)
	public void SendTreasureBox() {
		apOperation.SendTreasureBox(driver);
		assertEquals(true, apOperation.AnchorHeadPortraitSign(driver));
		Reporter.log("发送宝箱通过");
	}
	
}
