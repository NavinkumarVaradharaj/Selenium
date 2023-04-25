package com.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\Avadi\\workspace\\Selenium7AMMar\\chromedriver.exe");

		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("Incognito");
		WebDriver driver = new ChromeDriver(ch);

		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement electronics = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
	
		Actions a = new Actions(driver);
//		a.click(electronics).build().perform();
	
		a.contextClick(electronics).build().perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
		WebElement signIn = driver.findElement(By.xpath("//span[text() ='Hello, sign in']"));
		a.moveToElement(signIn).build().perform();
		
		driver.navigate().to("https://demoqa.com/droppable/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement src = driver.findElement(By.id("draggable"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200);");
		
		WebElement dest = driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(src, dest).build().perform();
		
		driver.navigate().refresh();
	
	
	}
}
