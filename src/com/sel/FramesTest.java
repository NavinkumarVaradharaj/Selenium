package com.sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FramesTest {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Avadi\\workspace\\Selenium7AMMar\\chromedriver.exe");

		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("Incognito");
		WebDriver driver = new ChromeDriver(ch);

		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='ape_Gateway_right-2_desktop_iframe']"));
		
		driver.switchTo().frame(frame1);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/G/31/img19/AMS/Houseads/Laptops-Sept2019._CB436595915_.jpg']")).click();
		driver.navigate().to("https://demoqa.com/nestedframes");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame("frame1");
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		
		WebElement frameText = driver.findElement(By.tagName("p"));
	
		System.out.println(frameText.getText());
		
		driver.switchTo().defaultContent();
	
	}

}
