package FrameworkTutorial.Appium_Framework;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {

	public static AndroidDriver<AndroidElement> capabilities(String appName) throws IOException {
		// TODO Auto-generated method stub
        
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "\\src\\main\\java\\FrameworkTutorial\\Appium_Framework\\global.properties");
		Properties prop = new Properties();
		prop.load(fis);
        
		File appDir = new File("src");
		File app = new File(appDir, (String) prop.get(appName));
		
		DesiredCapabilities cap = new DesiredCapabilities();
		String deviceName= (String) prop.get("device");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(url, cap);
		return driver;
		
		
		
	}

}
