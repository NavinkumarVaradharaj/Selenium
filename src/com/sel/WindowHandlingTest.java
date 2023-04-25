package com.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class WindowHandlingTest {

	public static void main(String[] args) throws AWTException, InterruptedException {
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

		r.keyPress(KeyEvent.VK_ENTER);

		WebElement miniTv = driver.findElement(By.xpath("//a[text() = 'Amazon miniTV']"));

		a.contextClick(miniTv).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> all_tabs = driver.getWindowHandles();
		
		Iterator<String> itr = all_tabs.iterator();
		
		while(itr.hasNext()) {
			String child = itr.next();
			System.out.println(child);
			
			if(!parent.equals(child)) {
				driver.switchTo().window(child);
				Thread.sleep(3000);
				driver.close();
			}
			
			
		}
		
		
		
		

	}

}
