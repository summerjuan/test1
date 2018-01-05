package golive.test;

import golive.operation.LoginPageOperation;

public class Test {
	public static void main(String[] args) {
		LoginPageOperation lpoperation=new LoginPageOperation();
		//lpoperation.mobileLogin();
		lpoperation.facebookLogin();
		lpoperation.logOut();
	}

}
