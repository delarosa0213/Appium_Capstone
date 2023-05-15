package iOS.tests.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;

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
		List<WebElement> elements = driver.findElements(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == 'UIKitCatalog'`]"));
	    if (!elements.isEmpty()) {
	        elements.get(0).click();
	    } else {
	        // Element not found, proceed with the rest of the code
	    }
		driver.findElement(AppiumBy.accessibilityId("Switches")).click();
		
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`value == '1'`][1]")).click();
		Thread.sleep(2000);
		test.log(LogStatus.INFO, "First switch toggled!");
		
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSwitch[`value == '1'`]")).click();
		test.log(LogStatus.INFO, "Second switch toggled!");
	}

}
