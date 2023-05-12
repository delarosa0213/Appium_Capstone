package iOS.tests.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;

public class ImageView_Page {
	static IOSDriver driver;
	
	public ImageView_Page(IOSDriver driver) 
	{
        this.driver = driver;
    }
	
	public void imageView() throws InterruptedException {
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == 'UIKitCatalog'`]")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Image View")).click();
		
		
		List<WebElement> animatedImages = driver.findElements(AppiumBy.iOSClassChain("**/XCUIElementTypeImage[`label == 'Animated'`]"));

		// Wait for 2 seconds to give time for the animation to start
		Thread.sleep(2000);

		String previousImageName = null;
		for (int i = 0; i < 10; i++) { // Repeat the validation for 10 times
		    for (WebElement animatedImage : animatedImages) {
		        String imageName = animatedImage.getAttribute("name");
		        if (imageName != null && !imageName.equals(previousImageName)) {
		            System.out.println("Images are present they are alternating");
		            previousImageName = imageName;
		            break; // Exit the loop if an alternating image is found
		        }
		    }
		    // Wait for 500 milliseconds before checking for the next alternating image
		    Thread.sleep(500);
		}



	}

}
