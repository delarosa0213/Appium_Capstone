package iOS.tests.Pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;

public class Search_Page {
static IOSDriver driver;
	
	public Search_Page(IOSDriver driver) 
	{
        this.driver = driver;
    }
	public void search() {

	    driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == 'UIKitCatalog'`]")).click();
	    
	    
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == 'Search'`]")).click();
		
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == 'Default'`]")).click();
		
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == 'Scope Two'`]")).click();
		
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == 'Search'`]")).click();
		
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == 'Custom'`]")).click();

		driver.findElement(By.xpath("//XCUIElementTypeSearchField")).click();
		
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeKey[`label == 'R'`]")).click();
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeKey[`label == 'o'`]")).click();
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeKey[`label == 's'`]")).click();
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeKey[`label == 't'`]")).click();
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeKey[`label == 'e'`]")).click();
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeKey[`label == 'l'`]")).click();
		
		
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == 'Search'`]")).click();
	}
}
