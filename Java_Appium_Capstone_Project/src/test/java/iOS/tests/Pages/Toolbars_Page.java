package iOS.tests.Pages;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;

public class Toolbars_Page {
	
	static IOSDriver driver;
	ExtentTest test;
	
	public Toolbars_Page(IOSDriver driver, ExtentTest test) 
	{
        this.driver = driver;
        this.test = test;
    }
	public void toolBars() {
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == 'UIKitCatalog'`]")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Toolbars")).click();
		
		
		driver.findElement(AppiumBy.accessibilityId("Custom")).click();
		
		driver.findElement(AppiumBy.accessibilityId("warning")).click();
		test.log(LogStatus.INFO, "Delete button clicked!");
		
		driver.findElement(AppiumBy.accessibilityId("Toolbars")).click();
	}

}
