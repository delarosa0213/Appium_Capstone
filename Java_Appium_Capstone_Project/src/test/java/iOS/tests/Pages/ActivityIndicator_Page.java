package iOS.tests.Pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;

public class ActivityIndicator_Page {
	static IOSDriver driver;
	public ActivityIndicator_Page(IOSDriver driver) 
	{
        this.driver = driver;
    }
	
	public void actvityIndi() {
		driver.findElement (AppiumBy.accessibilityId("Activity Indicators")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == 'UIKitCatalog'`]")).click();
	}

}
