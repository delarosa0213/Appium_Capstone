package iOS.tests.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

public class LaunchingIpad {
	static IOSDriver driver;
	ExtentTest test;
	
	static void configureApp() throws MalformedURLException, FileNotFoundException {
	    File file = new File("src/test/java/config/iPADdevice.json");
	    InputStream is = new FileInputStream(file);
	    JsonReader reader = Json.createReader(is);
	    JsonObject jsonObject = reader.readObject();
	    reader.close();

	    File fs = new File(jsonObject.getString("appLink"));
	    XCUITestOptions cap = new XCUITestOptions();

	    cap.setDeviceName(jsonObject.getString("deviceName"));
	    cap.setApp(fs.getAbsolutePath());
	    cap.setPlatformVersion(jsonObject.getString("platformVersion"));
	    cap.setAutomationName(jsonObject.getString("automationName"));
	    cap.setUdid(jsonObject.getString("udid"));

	    driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	   // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20).toMillis(), TimeUnit.MILLISECONDS);
	}

	
}