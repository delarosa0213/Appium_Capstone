package iOS.tests.Pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;

public class PickerView_Page {
	static IOSDriver driver;
	
	public PickerView_Page(IOSDriver driver) 
	{
        this.driver = driver;
    }
	public void pickerView() {
		
    
    driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == 'UIKitCatalog'`]")).click();
    
    
	driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == 'Picker View'`]")).click();
	
	WebElement RedColor = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypePickerWheel[`label == 'Red color component value'`]"));
	RedColor.sendKeys("155");
	
	WebElement GreenColor = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypePickerWheel[`label == 'Green color component value'`]"));
	GreenColor.sendKeys("50");
	
	WebElement BlueColor = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypePickerWheel[`label == 'Blue color component value'`]"));
	BlueColor.sendKeys("125");
	
	
	System.out.println("The color changed!");

}
}