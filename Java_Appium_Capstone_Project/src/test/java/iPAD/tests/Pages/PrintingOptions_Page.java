package iPAD.tests.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;

public class PrintingOptions_Page {
	static IOSDriver driver;
	ExtentTest test;
	
	public PrintingOptions_Page(IOSDriver driver,ExtentTest test) 
	{
        this.driver = driver;
        this.test = test;
    }
	public void print() {
	    List<WebElement> options = driver.findElements(MobileBy.iOSClassChain("**/XCUIElementTypeStaticText"));
	    int count = 0;
	    for (WebElement option : options) {
	        String label = option.getAttribute("label");
	        if (label != null) {
	            label = label.trim();
	            if (label.equals("Activity Indicators")
	                || label.equals("Alert Views")
	                || label.equals("Buttons")
	                || label.equals("Date Picker")
	                || label.equals("Image View")
	                || label.equals("Page Control")
	                || label.equals("Picker View")
	                || label.equals("Progress Views")
	                || label.equals("Search")
	                || label.equals("Segmented Controls")
	                || label.equals("Sliders")
	                || label.equals("Stack Views")
	                || label.equals("Steppers")
	                || label.equals("Switches")
	                || label.equals("Text Fields")
	                || label.equals("Text View")
	                || label.equals("Toolbars")
	                || label.equals("Web View")) {
	                count++;
	            }
	        }
	    }
	    System.out.println("Number of options: " + count);
	    test.log(LogStatus.INFO, "Number of options: " + count);
	}


}
