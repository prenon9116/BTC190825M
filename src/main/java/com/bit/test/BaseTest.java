package com.bit.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseTest {
	
	WebDriver driver;
	public BaseTest(WebDriver driver) {
		this.driver=driver;
	}
	
	



	
	public void openBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	public void tearDown() {
		driver.quit();


	}

}
	

