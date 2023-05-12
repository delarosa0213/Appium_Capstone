package iOS.tests.Pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;

public class ProgressView_Page {
	
	static IOSDriver driver;
	
	public ProgressView_Page(IOSDriver driver) 
	{
        this.driver = driver;
    }
	public void progressView() throws InterruptedException 
	{

	    driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == 'UIKitCatalog'`]")).click();
	    
	    
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == 'Progress Views'`]")).click();
		
		Thread.sleep(10000);
		
		
	}

}
