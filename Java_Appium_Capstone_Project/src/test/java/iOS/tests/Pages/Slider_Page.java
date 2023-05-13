package iOS.tests.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.MobileElement;

public class Slider_Page {
	
	static IOSDriver driver;
	ExtentTest test;
	
	public Slider_Page(IOSDriver driver, ExtentTest test) 
	{
        this.driver = driver;
        this.test = test;
    }
	
	public void slide() {

		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == 'UIKitCatalog'`]")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Sliders")).click();
		
		WebElement slider1 = driver.findElement(By.xpath("//XCUIElementTypeSlider"));
		slider1.sendKeys("0%");
		test.log(LogStatus.INFO, "Changed the value to 0%");
		
		WebElement slider2 = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSlider[`value == '50%'`][1]"));
		slider2.sendKeys("1.0");
		test.log(LogStatus.INFO, "Changed the value to 100%");
				
		WebElement slider3 = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSlider[`value == '84%'`]"));
		slider3.sendKeys("0.5");
		test.log(LogStatus.INFO, "Changed the value to 50%");

		
//		IOSElement slider2 = (IOSElement)driver.findElement(By.xpath("//XCUIElementTypeSlider[2]"));
//		slider2.setValue("100%");
	}
}
