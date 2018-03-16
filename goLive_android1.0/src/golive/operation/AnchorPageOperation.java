package golive.operation;

import com.gargoylesoftware.htmlunit.javascript.host.canvas.CanvasCaptureMediaStream;

import golive.action.AnchorPageAction;
import golive.element.AnchorPageElement;
import golive.element.AudienceInfoPageElement;
import golive.element.AudienceListPageElement;
import golive.element.ContributionListPageElement;
import golive.element.CreateStudioPageElement;
import golive.element.GuardPageElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class AnchorPageOperation {
	CreateStudioPageElement cspElement=new CreateStudioPageElement();
	AnchorPageElement apElement=new AnchorPageElement();
	AnchorPageAction apAction=new AnchorPageAction();
    GuardPageElement gpElement=new GuardPageElement();
    AudienceListPageElement alpElement=new AudienceListPageElement();
    AudienceInfoPageElement aipElement=new AudienceInfoPageElement();
    ContributionListPageElement clpElement=new ContributionListPageElement();
    
    //用直播间下栏的菜单判断是否回到直播间页面
    public boolean AnchorMenu(AndroidDriver driver) {
    	  if(driver.getPageSource().contains(apElement.AnchorMenuText())) {
    		  return true;
    	  }else {
    		  return false;
    	  }
    }
    
    //用主播头像判断是否回到直播间页面
    public boolean AnchorHeadPortraitSign(AndroidDriver driver) {
    	   if(driver.getPageSource().contains(apElement.AnchorHeadPortraitSign())) {
    		   return true;
    	   }else {
    		   return false;
    	   }
    }
	
	//driver.getPageSource().contains("android.view.View")
	//driver.getPageSource().contains("com.android.deskclock:id/analog_appwidget")
	//创建直播间
	public void CreateStudio(AndroidDriver driver) {
		apAction.click(cspElement.EnterCreateStudioBtn(driver));//进入创建直播间界面按钮
		//系统获取位置信息权限
		try {
			apAction.click(cspElement.LocationPermitBtn(driver));
		} catch (Exception e) {
			System.out.println("没有弹出位置权限框");
		}
		//系统获取摄像头权限允许按钮，想要读取位置信息
		try {
			apAction.click(cspElement.CameraPermitBtn(driver));
		} catch (Exception e) {
			System.out.println("没有弹出摄像机权限框");
		}
		apAction.input(cspElement.InputStudioName(driver), "hello");//输入直播间名字
		apAction.click(cspElement.OpenCategoryOptions(driver));//点开类别选项
		apAction.click(cspElement.ChoiceSingingCategory(driver));//选择唱歌类别
		apAction.click(cspElement.PackupCategoryOptions(driver));//收回类别选项
		apAction.click(cspElement.BeautyBtn(driver));//美颜按钮
		apAction.ClickAPoint(driver, 2);//点击屏幕中间一点收起美颜界面
		apAction.click(cspElement.LocationBtn(driver));//定位按钮
		apAction.click(cspElement.CreateStudioBtn(driver));//创建直播间按钮
		//系统录音权限允许按钮
		try {
			apAction.click(cspElement.RecordPermitBtn(driver));
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("没有弹出录屏权限框");
		}
		apAction.ClickAPoint(driver, 2);//点击屏幕中的一点跳开开播引导画面
	}
	
	//主播头像
	public void AnchorHeadPortrait(AndroidDriver driver) {
		apAction.click(apElement.AnchorHeadPortrait(driver));//主播头像
		driver.pressKeyCode(AndroidKeyCode.BACK);//点击手机返回键退出主播信息页面
	}
	
	//守护主播
	public void GuardAnchor(AndroidDriver driver) {
		apAction.click(gpElement.GuardIconBtn(driver));//守护图标按钮
		apAction.click(gpElement.FightGuardBtn(driver));//守护争夺按钮
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		if(driver.getPageSource().contains(gpElement.NotEnoughCoinPopupText())) {
			apAction.click(gpElement.NotEnoughCoinCancelBtn(driver));//金币不足弹窗取消按钮
		}
		if(driver.getPageSource().contains(gpElement.GuardPageText())) {
			driver.pressKeyCode(AndroidKeyCode.BACK);//点击手机返回键退出守护页面
		}
		
		
	}
	
	//观众列表
	public void AudienceList(AndroidDriver driver) {
		apAction.click(alpElement.EnterAudienceList(driver));  //观众列表入口
		apAction.click(alpElement.AudienceListFirstInfo(driver));//观众列表中排在第一个观众头像信息
		driver.pressKeyCode(AndroidKeyCode.BACK);//点击手机返回按键退出观众信息页面
		apAction.click(alpElement.EnterAdminList(driver));//管理员列表入口
		if(driver.getPageSource().contains(alpElement.CancelFirstAdminText())) {
			apAction.click(alpElement.CancelFirstAdminBtn(driver));//管理员列表中第一位管理员信息后面的取消管理员按钮
			if(driver.getPageSource().contains(alpElement.CancelAdminPopupText())) {
				apAction.click(alpElement.CancelAdminPopupSureBtn(driver));//取消管理员提醒弹窗中的确认按钮
			}
			apAction.click(alpElement.ReturnAudienceListBtn(driver));//返回观众列表按钮
		}
		driver.pressKeyCode(AndroidKeyCode.BACK);//点击手机返回键退出观众列表
		
	}
	
	//关注用户
	public void FollowAudience(AndroidDriver driver) {
		apAction.click(aipElement.AudienceHeadPortrait(driver));//观众头像
		apAction.click(aipElement.AudiencePageFollowBtn(driver));//观众信息页面中关注按钮
		if(driver.getPageSource().matches(aipElement.CancelFollowPopupText())) {
			apAction.click(aipElement.CancelFollowPopupCancelBtn(driver));//取消关注提醒弹窗中的取消按钮
		}
		driver.pressKeyCode(AndroidKeyCode.BACK);//点击手机返回按键退出观众信息页面
	}
	
	//设用户为管理员
	public void SetAudienceAsAdmin(AndroidDriver driver) {
		apAction.click(aipElement.AudienceHeadPortrait(driver));//观众头像
		apAction.click(aipElement.AudiencePageMoreBtn(driver));//观众信息页面中更多按钮
		apAction.click(aipElement.SetAdminBtn(driver));//设为管理员按钮
		if(driver.getPageSource().contains(aipElement.SetAdminPopupText())) {
			apAction.click(aipElement.SetAdminPopupSureBtn(driver));//设为管理员弹窗确认按钮
		}
	}
	
	//将用户禁言
	public void GagAudience(AndroidDriver driver) {
		apAction.click(aipElement.AudienceHeadPortrait(driver));//观众头像
		apAction.click(aipElement.AudiencePageMoreBtn(driver));//观众信息页面中更多按钮
		apAction.click(aipElement.GagBtn(driver));//禁言按钮
		if(driver.getPageSource().contains(aipElement.GagPopupText())) {
			apAction.click(aipElement.GagPopupSureBtn(driver));//禁言提醒弹窗确认按钮
		}
		driver.pressKeyCode(AndroidKeyCode.BACK);//点击手机返回键退出用户信息页面
	}
	
	//将用户踢出房间
	public void KickOutRoom(AndroidDriver driver) {
		apAction.click(aipElement.AudienceHeadPortrait(driver));//观众头像
		apAction.click(aipElement.AudiencePageMoreBtn(driver));//观众信息页面中更多按钮
		apAction.click(aipElement.KickOutRoomBtn(driver));//踢出房间按钮
		if(driver.getPageSource().contains(aipElement.KickOutRoomPopupText())) {
			apAction.click(aipElement.KickOutRoomPopupSureBtn(driver));//踢出房间弹窗提醒确认按钮
		}
	}
	
	//将用户加入黑名单
	public void JoinBlacklist(AndroidDriver driver) {
		apAction.click(aipElement.AudienceHeadPortrait(driver));//观众头像
		apAction.click(aipElement.AudiencePageMoreBtn(driver));//观众信息页面中更多按钮
		apAction.click(aipElement.JoinBlacklistBtn(driver));
		if(driver.getPageSource().contains(aipElement.JoinBlackListPopupText())) {
			apAction.click(aipElement.JoinBlackListPopupSureBtn(driver));//加入黑名单提醒弹窗确认按钮
		}
	}
	
	//直播间内贡献榜
	public void ContributionList(AndroidDriver driver) {
		apAction.click(clpElement.EnterContributionList(driver));//贡献榜入口
		apAction.click(clpElement.CurrentContributionBtn(driver));//单场贡献榜按钮
		apAction.click(clpElement.TotalContributionBtn(driver));//贡献总榜按钮
		apAction.click(clpElement.TimeContributionBtn(driver));//时长榜按钮
		driver.pressKeyCode(AndroidKeyCode.BACK);//点击手机返回键退出贡献榜单页面
	}
	
	//使用图案贴纸
	public void PatternStickers(AndroidDriver driver) {
		apAction.click(apElement.EnterStickerPageBtn(driver));//进入贴纸界面按钮
		apAction.click(apElement.PatternStickerBtn(driver));//图案贴纸按钮
		apAction.click(apElement.FirstPatternSticker(driver));//选中第一个图案贴纸
	}
	
	//使用文字贴纸
	public void TextStickers(AndroidDriver driver) {
		apAction.click(apElement.EnterStickerPageBtn(driver));//进入贴纸界面按钮
		apAction.click(apElement.TextStickerBtn(driver));//文字贴纸按钮
		apAction.click(apElement.FirstTextSticker(driver));//选择第一个文字贴纸
	}
	
	//使用特效
	public void Effect(AndroidDriver driver) {
		apAction.click(apElement.EnterEffectPageBtn(driver));//进入特效界面按钮
		apAction.click(apElement.FirstEffect(driver));//选择第一个特效
		driver.pressKeyCode(AndroidKeyCode.BACK);//点击手机返回键退出特效界面
	}
	
	//使用截屏
	public void Screenshot(AndroidDriver driver) {
		apAction.click(apElement.AnchorScreenshotBtn(driver));//主播截屏按钮
		if(driver.getPageSource().contains(apElement.RecordVideoPermissionPopup())) {
			apAction.click(apElement.AllowRecordVideoPermission(driver)); //录制视频权限弹窗允许按钮
			System.out.println("截屏允许按钮");
		}
	}
	
	//关闭连麦
	public void CloseConnect(AndroidDriver driver) {
		apAction.click(apElement.AnchorConnectSwitch(driver));// 主播连麦开关
		if(driver.getPageSource().contains(apElement.CloseConnectPopup(driver))) {
			apAction.click(apElement.CloseConnectPopupSureBtn(driver));// 关闭连麦提醒弹窗确认按钮
		}
	}
	
	//分享直播间
	public void Share(AndroidDriver driver) {
		apAction.click(apElement.AnchorMoreBtn(driver));// 主播更多菜单按钮
		apAction.click(apElement.AnchorShareBtn(driver));// 分享按钮
		driver.pressKeyCode(AndroidKeyCode.BACK);//点击手机返回键退出分享页面
	}
	
	//补光
	public void Lighting(AndroidDriver driver) {
		apAction.click(apElement.AnchorMoreBtn(driver));// 主播更多菜单按钮
		apAction.click(apElement.AnchorLightingBtn(driver));// 补光按钮
		driver.pressKeyCode(AndroidKeyCode.BACK);//点击手机返回键退出补光页面
	}
	
	//美颜
	public void Beauty(AndroidDriver driver) {
		apAction.click(apElement.AnchorMoreBtn(driver));// 主播更多菜单按钮
		apAction.click(apElement.AnchorBeautyBtn(driver));// 美颜按钮
		driver.pressKeyCode(AndroidKeyCode.BACK);//点击手机返回键退出美颜页面
	}
	
	//反转摄像头
	public void ReversalCamera(AndroidDriver driver) {
		apAction.click(apElement.AnchorMoreBtn(driver));// 主播更多菜单按钮
		apAction.click(apElement.AnchorReversalCameraBtn(driver));// 反转按钮
	}
	
	//聊天
	public void Chat(AndroidDriver driver) {
		apAction.click(apElement.AnchorMoreBtn(driver));// 主播更多菜单按钮
		apAction.click(apElement.AnchorChatBtn(driver));// 聊天按钮
	    apAction.click(apElement.AnchorChatIputbox(driver));//点击聊天输入框调出键盘
		apAction.input(apElement.AnchorChatIputbox(driver), "hello");//向聊天输入框输入文字
		apAction.click(apElement.AnchorChatSendBtn(driver));//点击发送按钮
		driver.pressKeyCode(AndroidKeyCode.BACK);//点击手机返回键退出键盘
	}
	
	//联播
	public void GroupLive(AndroidDriver driver) {
		apAction.click(apElement.AnchorMoreBtn(driver));// 主播更多菜单按钮
		apAction.click(apElement.GroupLiveBtn(driver));// 联合直播按钮
		apAction.click(apElement.GroupLiveCountdownBtn(driver));// 打开联合直播倒计时按钮
		apAction.click(apElement.DecreaseGroupLiveCountdown(driver));// 减少联合直播倒计时按钮
		apAction.click(apElement.IncreaseGroupLiveCountdown(driver));// 增加联合直播倒计时按钮
		apAction.click(apElement.InviteGroupLiveBtn(driver));// 联合直播发起邀请按钮
		apAction.click(apElement.RecommendGroupLiveBtn(driver));// 联合直播推荐按钮
		if(driver.getPageSource().contains(apElement.InviteFirstUserInRecommendListText(driver))) {
			apAction.click(apElement.InviteFirstUserInRecommendList(driver));//向推荐列表中的第一个人发起邀请按钮
			apAction.click(apElement.CancleInviteGroupLive(driver));	// 取消邀请
		}
		
		driver.pressKeyCode(AndroidKeyCode.BACK);//点击手机返回键退出联合直播邀请页面
	}
	
	//发送宝箱
	public void SendTreasureBox(AndroidDriver driver) {
		apAction.click(apElement.AnchorTreasureBox(driver));
		int CoinBalance=Integer.parseInt(apElement.AnchorTreasureBoxPageCoinBalance(driver).getText());
		if(CoinBalance>100) {
			apAction.input(apElement.AnchorTreasureBoxInputBox(driver), "100");
			apAction.click(apElement.AnchorSendTreasureBox(driver));
		}
	}

}
