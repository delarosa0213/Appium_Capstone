package iPAD.tests.Pages;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;

public class ProgressView_Page {
	
	static IOSDriver driver;
	ExtentTest test;
	
	public ProgressView_Page(IOSDriver driver, ExtentTest test) 
	{
        this.driver = driver;
        this.test = test;
    }
	public void progressView() throws InterruptedException 
	{
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == 'Progress Views'`]")).click();
	    test.log(LogStatus.INFO, "Progress View appeared!");

		Thread.sleep(10000);
		
		
	}

}
