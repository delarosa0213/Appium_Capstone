package iOS.tests.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;

public class StackViews_Page {
	
	static IOSDriver driver;
	ExtentTest test;
	
	public StackViews_Page(IOSDriver driver, ExtentTest test) 
	{
        this.driver = driver;
        this.test = test;
    }
	
	public void stackView() throws InterruptedException {
		List<WebElement> elements = driver.findElements(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == 'UIKitCatalog'`]"));
	    if (!elements.isEmpty()) {
	        elements.get(0).click();
	    } else {
	        // Element not found, proceed with the rest of the code
	    }
		driver.findElement(AppiumBy.accessibilityId("Stack Views")).click();
		
		driver.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"stepper increment\"])[1]")).click();
		//**/XCUIElementTypeButton[`label == "stepper increment"`][1]
		Thread.sleep(2000);
		
		boolean further = driver.findElement(AppiumBy.accessibilityId("Further Detail")).isDisplayed();
		System.out.println("Further Detail is displayed: " + further);
		test.log(LogStatus.PASS, "Further details box displayed!");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"stepper increment\"])")).click();
		System.out.println("The color is not red");
		test.log(LogStatus.FAIL, "The color is randomly spawn!");
		
		
	}

}
