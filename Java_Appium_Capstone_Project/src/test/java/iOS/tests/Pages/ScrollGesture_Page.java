	package iOS.tests.Pages;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.remote.RemoteWebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumBy;
	import io.appium.java_client.MobileBy;
	import io.appium.java_client.TouchAction;
	import io.appium.java_client.ios.IOSDriver;
	import java.util.HashMap;
	import java.util.List;
	
	
	public class ScrollGesture_Page {
		
		static IOSDriver driver;
		ExtentTest test;
		
		public ScrollGesture_Page(IOSDriver driver, ExtentTest test) 
		{
	        this.driver = driver;
	        this.test = test;
	    }
		
		public void scroll() {
			WebElement ele = driver.findElement(AppiumBy.accessibilityId("Web View"));
			
			HashMap<String, Object> scroll = new HashMap<String, Object>();
			scroll.put("element", ((RemoteWebElement)ele).getId());
			
			scroll.put("direction", "down");
			driver.executeScript("mobile:scroll", scroll);
			test.log(LogStatus.PASS, "Scrolled successfully");
			
			List<WebElement> options = driver.findElements(MobileBy.iOSClassChain("**/XCUIElementTypeButton"));
			System.out.println("Number of options available: " + options.size());
			test.log(LogStatus.INFO, "Number of options available: " + options.size());
			}
	
		}
	
	
