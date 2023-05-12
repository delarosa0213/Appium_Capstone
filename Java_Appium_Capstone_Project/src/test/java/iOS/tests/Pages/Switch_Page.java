package iOS.tests.Pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;

public class Switch_Page {
static IOSDriver driver;
	
	public Switch_Page(IOSDriver driver) 
	{
        this.driver = driver;
    }
	public void switchPage() throws InterruptedException {

		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == 'UIKitCatalog'`]")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Switches")).click();
		
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`value == '1'`][1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`value == '1'`][2]")).click();
	}

}
