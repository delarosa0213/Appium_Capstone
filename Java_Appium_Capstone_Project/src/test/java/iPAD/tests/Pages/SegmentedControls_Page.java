package iPAD.tests.Pages;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;

public class SegmentedControls_Page {
	
	static IOSDriver driver;
	ExtentTest test;
	
	public SegmentedControls_Page(IOSDriver driver, ExtentTest test) 
	{
        this.driver = driver;
        this.test = test;
    }
	
	public void segmentedControl() {
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == 'UIKitCatalog'`]")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Segmented Controls")).click();
		
		//default select tools
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == 'Tools'`][1]")).click();
		test.log(LogStatus.INFO, "Selected 'Tools'!");
		
		//check in tinted 
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == 'Check'`][2]")).click();
		test.log(LogStatus.INFO, "Selected 'Check'");
		
		//gift
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == 'Gift'`]")).click();
		test.log(LogStatus.INFO, "Selected 'Gift' icon!");
	}

}
