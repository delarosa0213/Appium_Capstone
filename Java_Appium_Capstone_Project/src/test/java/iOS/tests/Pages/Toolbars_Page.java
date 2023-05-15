package iOS.tests.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;

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
		List<WebElement> elements = driver.findElements(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == 'UIKitCatalog'`]"));
	    if (!elements.isEmpty()) {
	        elements.get(0).click();
	    } else {
	        // Element not found, proceed with the rest of the code
	    }
		driver.findElement(AppiumBy.accessibilityId("Toolbars")).click();
		
		
		driver.findElement(AppiumBy.accessibilityId("Custom")).click();
		
		driver.findElement(AppiumBy.accessibilityId("warning")).click();
		test.log(LogStatus.INFO, "Delete button clicked!");
		
		driver.findElement(AppiumBy.accessibilityId("Toolbars")).click();
	}

}
