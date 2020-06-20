import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Facebook {
	  
	 public static AndroidDriver<MobileElement> driver;
	 public static WebDriverWait wait;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		    DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Honor 9 Lite");
	        caps.setCapability(MobileCapabilityType.UDID, "9SF3Y18628012805"); 
	        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
	        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	        caps.setCapability("appPackage", "com.flipkart.android");
	        caps.setCapability("appActivity","com.flipkart.android.activity.HomeFragmentHolderActivity");
	        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
	        Thread.sleep(20000);
	        wait = new WebDriverWait(driver, 150);
			
		
	}

}
