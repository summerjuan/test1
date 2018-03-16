package golive.test;

import org.testng.annotations.Test;

import golive.common.Driver;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;

public class Test3 {
	Driver drivers=new Driver();
	Test2 test2=new Test2();
    //AndroidDriver driver;
	
	/**
	@BeforeClass
	public void beforeClass() {
		driver=drivers.getDriver();
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}
	**/
	
	
  @Test
  public void f() {
	  System.out.println("Test3");
  }
}
