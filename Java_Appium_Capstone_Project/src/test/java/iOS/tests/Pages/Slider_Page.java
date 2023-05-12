package iOS.tests.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.MobileElement;

public class Slider_Page {
	
	static IOSDriver driver;
	
	public Slider_Page(IOSDriver driver) 
	{
        this.driver = driver;
    }
	
	public void slide() {

		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == 'UIKitCatalog'`]")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Sliders")).click();
		
		WebElement slider1 = driver.findElement(By.xpath("//XCUIElementTypeSlider"));
		slider1.sendKeys("0%");
		
		WebElement slider2 = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSlider[`value == '50%'`][1]"));
		slider2.sendKeys("1.0");
				
		WebElement slider3 = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSlider[`value == '84%'`]"));
		slider3.sendKeys("0.5");

		
//		IOSElement slider2 = (IOSElement)driver.findElement(By.xpath("//XCUIElementTypeSlider[2]"));
//		slider2.setValue("100%");
	}
}
