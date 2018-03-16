package golive.test;

import static org.testng.Assert.assertEquals;

import java.io.File;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ReporterType;

import golive.common.Driver;
import io.appium.java_client.android.AndroidDriver;


public class Test2 {

	//Driver drivers = new Driver();

	// AndroidDriver driver;
	/**
	 * @BeforeClass public void beforeClass() { driver=drivers.getDriver(); }
	 * @AfterClass public void afterClass() { driver.quit(); }
	 **/

	@Test
	public void f() {
		System.out.println("Test2");
		assertEquals(1, 1);
	}

	@Test
	public void a() {
		assertEquals(1, 2);
	}
}
