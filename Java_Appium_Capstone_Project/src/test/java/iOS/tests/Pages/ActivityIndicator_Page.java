package iOS.tests.Pages;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;

public class ActivityIndicator_Page {
	static IOSDriver driver;
	ExtentTest test;
	private static File directory;
	
	public ActivityIndicator_Page(IOSDriver driver, ExtentTest test, File directory) {
        this.driver = driver;
        this.test = test;
        this.directory = directory;
    }
	
	public void actvityIndi() throws IOException, InterruptedException {
		List<WebElement> elements = driver.findElements(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == 'UIKitCatalog'`]"));
	    if (!elements.isEmpty()) {
	        elements.get(0).click();
	    } else {
	        // Element not found, proceed with the rest of the code
	    }
		
	    driver.findElement (AppiumBy.accessibilityId("Activity Indicators")).click();
		

		test.log(LogStatus.INFO, "The activity indicator appeared!");

		
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String screenshotPath = directory.getAbsolutePath() + "/screenshots/Activity indicator.png";
        FileUtils.copyFile(screenshotFile, new File(screenshotPath));

        // Log the screenshot in the report
        test.log(LogStatus.INFO, "Activity indicator: " + test.addScreenCapture(screenshotPath));
        
        Thread.sleep(2000);
        
        List<WebElement> elements1 = driver.findElements(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == 'UIKitCatalog'`]"));
	    if (!elements1.isEmpty()) {
	        elements1.get(0).click();
	    } else {
	        // Element not found, proceed with the rest of the code
	    }
	}

}
