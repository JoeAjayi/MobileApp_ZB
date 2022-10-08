package com.zenithbank.Utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Launch_AndroidMobileUtility_Samsung {

	
	
	protected AppiumDriver driver; 
//	AppiumDriver<MobileElement> driver; 

	
	
	public static AppiumDriver initializeMobileAndroidDriver()
	{
		AppiumDriver driver = null;
		
		
		try {

			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0.0");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "SM-N950F");
			caps.setCapability(MobileCapabilityType.UDID, "ce051715dc1f4426017e");
			caps.setCapability("appPackage", "com.ubanquity.zenith.test");
			caps.setCapability("appActivity", "com.example.xapp.MainActivity");

			URL url = new URL("http://127.0.0.1:4723/wd/hub");
//		    driver = new AndroidDriver<MobileElement> (url, caps); 
			driver = new AppiumDriver<MobileElement>(url, caps);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//		driver = (AppiumDriv r<MobileElement>) new AppiumDriver<MobileElement> (url, caps); //object of android driver 

			driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"skip\"]").click();
			driver.findElementByXPath("//android.widget.Button[@content-desc=\"Register\"]").click();
			driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"I own a hardware token "
					+ "or an e-token Use your token pin and token code to register instantly\"]").click();

			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout"
					+ "/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout"
					+ "/android.view.View/android.view.View/android.view.View/android.view.View"
					+ "/android.view.View[2]/android.view.View/android.widget.EditText[1]").sendKeys("2407356562"); 
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout"
					+ "/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout"
					+ "/android.view.View/android.view.View/android.view.View/android.view.View"
					+ "/android.view.View[2]/android.view.View/android.widget.EditText[2]").sendKeys("1379");
//			driver.findElementByXPath("").click();
//			driver.findElementByXPath("").click();
			

		} catch (MalformedURLException e) {
			System.out.println("Could not read Mobile setCapability");
//	 		e.printStackTrace();
		}
		return (AppiumDriver) driver;

	}

	
}
