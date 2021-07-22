package com.appiumproject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InstallApplication
{
  public static void main(String[] args) throws MalformedURLException, InterruptedException {
	

	  DesiredCapabilities dc=new DesiredCapabilities();
	  dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
	  dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	  dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10 QKQ1.190910.002");
	  dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Redmi Note 7S");
	  
	  dc.setCapability(MobileCapabilityType.APP,"C:\\Appium jars\\ShriramUAT.apk");
	  URL url=new URL("http://127.0.0.1:4723/wd/hub");
	  AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,dc);
	  driver.quit();
	// Thread.sleep(3000);
	 
	
}
}
