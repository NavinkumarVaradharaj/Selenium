package com.sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Avadi\\workspace\\Selenium7AMMar\\chromedriver.exe");

		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("Incognito");
		WebDriver driver = new ChromeDriver(ch);

		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(5000);
		Alert simple_alert = driver.switchTo().alert();
		simple_alert.accept();
		
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200);");
		
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(5000);
		Alert confirm_alert = driver.switchTo().alert();
		
		confirm_alert.dismiss();
		Thread.sleep(3000);
		
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(3000);
		
		Alert prompt_alert = driver.switchTo().alert();
		String text = prompt_alert.getText();
		System.out.println(text);
		
		prompt_alert.sendKeys("Selenium");
		
		Thread.sleep(3000);
		
		prompt_alert.accept();
		
		
		
		
		
		
		
		
		
	}

}
