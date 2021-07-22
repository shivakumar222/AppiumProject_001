package com.appiumproject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DailPad_AppTesting
{
    public static void main(String[] args) throws MalformedURLException, InterruptedException
    {
    	DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10 QKQ1.190910.002");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Redmi Note 7S");  
		// with  the help 0f app info we have to get the app package and app activity information..... 
		dc.setCapability("appPackage","com.android.incallui");
		dc.setCapability("appActivity","com.android.incallui.InCallActivity");

		//url of appium  server
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		//object creation for AndroidDriver 
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,dc);
		Thread.sleep(3000);
		WebElement phonebutton=driver.findElement(By.xpath("//*[@content-desc='Phone']")); //click on phone button in the calculator
		phonebutton.click();
		
		/*WebElement addbutton=driver.findElement(By.id("com.miui.calculator:id/btn_plus_s")); //click on add button in the calculator
		addbutton.click();
		
		WebElement five=driver.findElement(By.id("com.miui.calculator:id/btn_5_s")); //click on 5 button in the calculator
		five.click();

		WebElement equals=driver.findElement(By.id("com.miui.calculator:id/btn_equal_s")); //click on equals button in the calculator
		equals.click();
		String result=driver.findElement(By.id("com.miui.calculator:id/result")).getText();
		if(result.equals("12"))
		{
			System.out.println("Test Passed...");
		}
		else
		{
			System.out.println("Test Failed......");
		}*/
		//close the appium server 
		driver.quit();
	}
	
}
