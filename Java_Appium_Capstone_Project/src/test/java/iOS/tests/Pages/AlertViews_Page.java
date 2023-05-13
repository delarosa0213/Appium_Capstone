package iOS.tests.Pages;

import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;

public class AlertViews_Page {
	static IOSDriver driver;
	ExtentTest test; 
	
	public AlertViews_Page(IOSDriver driver, ExtentTest test) {
        this.driver = driver;
        this.test = test;
    }
	
	public void alertViews() {
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == 'UIKitCatalog'`]")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Alert Views")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Simple")).click();
		
		System.out.println("The message box has been shown.");
		
		WebElement title = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == 'A Short Title Is Best'`]"));
		boolean titleDisplayed = title.isDisplayed();
		if(titleDisplayed) {
			System.out.println("The title of the message box is correct.");
			test.log(LogStatus.INFO, "The title of the message box is correct.");
			test.log(LogStatus.INFO, "The title is: " + title.getText());
			
		}
		
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"OK\"`]")).click();
	}
}
