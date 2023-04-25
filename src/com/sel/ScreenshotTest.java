package com.sel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotTest {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Avadi\\workspace\\Selenium7AMMar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("abca@gmail.com");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("asddsgdf");
		
		WebElement login = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
		login.click();
		Thread.sleep(3000);
		TakesScreenshot ts =  (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Avadi\\workspace\\Selenium7AMMar\\screenshots\\s2.png");
	//	FileHandler.copy(src, dest);
		FileUtils.copyFile(src, dest);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
