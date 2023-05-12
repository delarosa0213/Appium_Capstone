package iOS.tests.Pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;

public class Toolbars_Page {
	
	static IOSDriver driver;
	
	public Toolbars_Page(IOSDriver driver) 
	{
        this.driver = driver;
    }
	public void toolBars() {
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == 'UIKitCatalog'`]")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Toolbars")).click();
		
		
		driver.findElement(AppiumBy.accessibilityId("Custom")).click();
		
		driver.findElement(AppiumBy.accessibilityId("warning")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Toolbars")).click();
	}

}
