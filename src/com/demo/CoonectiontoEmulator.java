package com.demo;
//BASE CLASS CODE
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class CoonectiontoEmulator {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
		File f=new File("src");
		File fs=new File(f,"ApiDemos-debug.apk");
		
		DesiredCapabilities dcap=new DesiredCapabilities();
		dcap.setCapability(MobileCapabilityType.DEVICE_NAME,"ankuremulator");
		dcap.setCapability(MobileCapabilityType.APP, "D:\\Games\\Course\\hello.apk");
		dcap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");	
		AndroidDriver<AndroidElement> driver=
				new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),dcap);
		return driver;
		
		//Android Ui Automator---for inspecting elements
		
		 
	}

}
