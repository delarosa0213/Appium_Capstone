package iOS.tests.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;

public class PageControl_Page {

	static IOSDriver driver;
	
	public PageControl_Page(IOSDriver driver) 
	{
        this.driver = driver;
    }
	
	public void pageControl() {

		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == 'UIKitCatalog'`]")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Page Control")).click();
		
		WebElement color1 = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypePageIndicator[`value == 'page 3 of 10'`]"));
		color1.click();
		System.out.println("The color change, current color is green");
		
		WebElement color2 = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypePageIndicator[`value == 'page 4 of 10'`]"));
		color2.click();
		System.out.println("The color change, current color is blue");
		
	


	}

}
