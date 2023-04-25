package com.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "D:\\Avadi\\workspace\\Selenium7AMMar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/table");
		
		
		String row = driver.findElement(By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[2]/table/tbody/tr[2]")).getText();
		System.out.println(row);
		
		String value = driver.findElement(By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[2]/table/tbody/tr[2]/td[2]")).getText();
		System.out.println(value);
		
		String table = driver.findElement(By.xpath("//table[@class='mat-sort table is-bordered is-striped is-narrow is-hoverable is-fullwidth']")).getText();
		
		System.out.println(table);
		
//		WebElement a = driver.findElement(By.xpath("//td[text() = '37']"));
//		System.out.println(a.getText());
//		
		
		
		
		
//		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
//		Thread.sleep(3000);
//		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='_octopus-search-result-card_style_apbSearchResultItem__2-mx4']"));
//		System.out.println(findElements.size());
//		for (WebElement webElement : findElements) {
//			System.out.println(webElement.getText());
//		}
		
		
		
//		driver.navigate().to("https://www.facebook.com/");
//		Thread.sleep(2000);
//		driver.navigate().back();
//		String title = driver.getTitle();
//		System.out.println(title);
//		Thread.sleep(3000);
//		driver.navigate().forward();
//		System.out.println(driver.getCurrentUrl());
//		Thread.sleep(3000);
//		driver.navigate().refresh();
//		
//		Thread.sleep(5000);
//		
//		driver.quit();
	}

}
