package iOS.tests.Pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;

public class TextField_Page {
	static IOSDriver driver;
	public TextField_Page(IOSDriver driver) 
	{
        this.driver = driver;
    }
	public void txtField() throws InterruptedException {
		
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == 'UIKitCatalog'`]")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Text Fields")).click();
		
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == 'Placeholder text'`][1]")).sendKeys("Rostel");
		Thread.sleep(2000);
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == 'Placeholder text'`][2]")).sendKeys("Red");
		Thread.sleep(2000);
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == 'Placeholder text'`][3]")).sendKeys("RBD");
		Thread.sleep(2000);
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSecureTextField[`value == 'Placeholder text'`]")).sendKeys("Blue");
		Thread.sleep(2000);
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == 'Placeholder text'`][4]")).sendKeys("Gray");
	}

}
