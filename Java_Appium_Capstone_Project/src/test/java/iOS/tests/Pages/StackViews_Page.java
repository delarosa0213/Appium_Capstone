package iOS.tests.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;

public class StackViews_Page {
	
static IOSDriver driver;
	
	public StackViews_Page(IOSDriver driver) 
	{
        this.driver = driver;
    }
	
	public void stackView() throws InterruptedException {
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == 'UIKitCatalog'`]")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Stack Views")).click();
		
		driver.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"stepper increment\"])[1]")).click();
		//**/XCUIElementTypeButton[`label == "stepper increment"`][1]
		Thread.sleep(2000);
		
		boolean further = driver.findElement(AppiumBy.accessibilityId("Further Detail")).isDisplayed();
		System.out.println("Further Detail is displayed: " + further);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"stepper increment\"])[2]")).click();
		System.out.println("The color is not red");
		
		
	}

}
