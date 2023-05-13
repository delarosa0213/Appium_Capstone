package iPAD.tests.Pages;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;

public class ActivityIndicator_Page {
	static IOSDriver driver;
	ExtentTest test;
	public ActivityIndicator_Page(IOSDriver driver, ExtentTest test) 
	{
        this.driver = driver;
        this.test = test;
    }
	
	public void actvityIndi() {
		driver.findElement (AppiumBy.accessibilityId("Activity Indicators")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.log(LogStatus.INFO, "Activity Indicator showed");
	}

}
