package com.appiumproject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Message_APP_Testing
{
   public static void main(String[] args) throws MalformedURLException, InterruptedException
   {
	  
   	DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10 QKQ1.190910.002");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Redmi Note 7S");  
		// with  the help 0f app info we have to get the app package and app activity information..... 
		dc.setCapability("appPackage","com.android.mms");
		dc.setCapability("appActivity","com.android.mms.ui.ComposeMessageRouterActivity");

		//url of appium  server
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		//object creation for AndroidDriver 
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,dc);
	    Thread.sleep(3000);
		WebElement recepints=driver.findElement(By.id("com.android.mms:id/recipient_rows")); //click on phone button in the calculator
		recepints.sendKeys("9492964922");
		
		WebElement recepintsconfirm=driver.findElement(By.id("com.android.mms:id/confirm_recipient")); //click on phone button in the calculator
		recepintsconfirm.click();
		
		WebElement texteditor=driver.findElement(By.id("com.android.mms:id/embedded_text_editor")); //click on phone button in the calculator
		texteditor.sendKeys("hi i am shiva automatic ga msg vachindha");
		
		WebElement sendbutton=driver.findElement(By.id("com.android.mms:id/send_button")); //click on phone button in the calculator
		sendbutton.click();
		
		WebElement selectsim=driver.findElement(By.id("com.android.mms:id/tv_sub_info")); //click on phone button in the calculator
		selectsim.click();
		
		WebElement sendbuttonfinal=driver.findElement(By.id("com.android.mms:id/send_button")); //click on phone button in the calculator
		sendbuttonfinal.click();
		
}
   }
