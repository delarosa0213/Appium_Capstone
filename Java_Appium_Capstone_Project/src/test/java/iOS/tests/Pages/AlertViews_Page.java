package iOS.tests.Pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;

public class AlertViews_Page {
	static IOSDriver driver;
	
	public AlertViews_Page(IOSDriver driver) {
        this.driver = driver;
    }
	
	public void alertViews() {
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == 'UIKitCatalog'`]")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Alert Views")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Simple")).click();
		
		System.out.println("The message box has been shown.");
		
		WebElement title = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"A Short Title Is Best\"`]"));
		boolean titleDisplayed = title.isDisplayed();
		if(titleDisplayed) {
			System.out.println("The title of the message box is correct.");
		}
		
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"OK\"`]")).click();
	}
}
