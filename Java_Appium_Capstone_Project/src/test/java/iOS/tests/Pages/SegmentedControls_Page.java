package iOS.tests.Pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;

public class SegmentedControls_Page {
	
	static IOSDriver driver;
	
	public SegmentedControls_Page(IOSDriver driver) 
	{
        this.driver = driver;
    }
	
	public void segmentedControl() {
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == 'UIKitCatalog'`]")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Segmented Controls")).click();
		
		//default select tools
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == 'Tools'`][1]")).click();
		
		//check in tinted 
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == 'Check'`][2]")).click();
		
		//gift
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == 'Gift'`]")).click();
	}

}
