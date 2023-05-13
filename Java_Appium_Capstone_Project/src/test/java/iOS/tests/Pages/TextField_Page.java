package iOS.tests.Pages;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;

public class TextField_Page {
	static IOSDriver driver;
	ExtentTest test;
	public TextField_Page(IOSDriver driver, ExtentTest test) 
	{
        this.driver = driver;
        this.test = test;
        
    }
	public void txtField() throws InterruptedException {
		
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == 'UIKitCatalog'`]")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Text Fields")).click();
		

		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == 'Placeholder text'`][3]")).sendKeys("green");
		test.log(LogStatus.INFO, "'green' inputted");
		Thread.sleep(2000);
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == 'Placeholder text'`][1]")).sendKeys("red");
		Thread.sleep(2000);
		test.log(LogStatus.INFO, "'red' inputted");
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == 'Placeholder text'`][2]")).sendKeys("blue");
		Thread.sleep(2000);
		test.log(LogStatus.INFO, "'blue' inputted");
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == 'Placeholder text'`]")).sendKeys("tinted");
		Thread.sleep(2000);
		test.log(LogStatus.INFO, "'tinted' inputted");
		driver.findElement(By.xpath("//XCUIElementTypeSecureTextField")).sendKeys("pink");
		test.log(LogStatus.INFO, "'pink' inputted");
		
		
		

		
	}

}
