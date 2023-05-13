package iOS.tests.Pages;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;

public class Switch_Page {
	static IOSDriver driver;
	ExtentTest test;
	
	public Switch_Page(IOSDriver driver, ExtentTest test) 
	{
        this.driver = driver;
        this.test = test;
    }
	public void switchPage() throws InterruptedException {

		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == 'UIKitCatalog'`]")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Switches")).click();
		
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`value == '1'`][1]")).click();
		Thread.sleep(2000);
		test.log(LogStatus.INFO, "First switch toggled!");
		
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`value == '1'`]")).click();
		test.log(LogStatus.INFO, "Second switch toggled!");
	}

}
