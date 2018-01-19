package golive.operation;


import golive.element.SignInPageElement;
import io.appium.java_client.android.AndroidDriver;

public class SignInPageOperation {
	SignInPageElement sipElement=new SignInPageElement();
	
	//签到
	public void SignIn(AndroidDriver driver) {
		//等待2秒
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
		
		try {
			sipElement.SignInButton(driver).click();
			try {
				sipElement.SignInOpenButton(driver).click();
				
			} catch (Exception e) {
				System.out.println("签到没有神秘宝箱");
			}
		    sipElement.SignInSureButton(driver).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
