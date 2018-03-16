package golive.operation;


import golive.action.SignInPageAction;
import golive.element.SignInPageElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class SignInPageOperation {
	SignInPageElement sipElement=new SignInPageElement();
	SignInPageAction sipAction=new SignInPageAction();
	
	//签到
	public void SignIn(AndroidDriver driver) {
		try {
			sipAction.click(sipElement.SignInButton(driver));
			try {
				sipAction.click(sipElement.SignInOpenButton(driver));
				
			} catch (Exception e) {
				System.out.println("签到没有神秘宝箱");
			}
			sipAction.click(sipElement.SignInSureButton(driver));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	//遇到签到弹窗就点击手机返回按键
	public void QuitSignIn(AndroidDriver driver) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
		try {
			sipElement.SignInButton(driver);
			driver.pressKeyCode(AndroidKeyCode.BACK);//点击手机返回键
			System.out.println("退出签到弹窗");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
