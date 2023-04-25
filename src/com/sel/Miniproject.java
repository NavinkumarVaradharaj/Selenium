package com.sel;

import java.util.Set;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Miniproject {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Avadi\\workspace\\Selenium7AMMar\\chromedriver.exe");
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("incognito");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwiM69amw8L9AhUGXA8CHb7XAWcYABAAGgJ0Yg&ohost=www.google.com&cid=CAESauD2xJEnjSyTMPmVMdrNaYcoDkdh-Wj06hrcAnfMHTZGISaSlPMcm2lTlubtl2rkeiMVzI-cbpMPk3haksN1vYlN41hldse5CdCujJxRWaO7N_9eJr3PNR4jEI7IVTa6etFAY1djCqIYPdE&sig=AOD64_0gmBRCpEThwkusXE2ar6KThrgDzw&q&adurl&ved=2ahUKEwjStM-mw8L9AhVxilYBHQVnCa4Q0Qx6BAgJEAE");
		Thread.sleep(4000);
		WebElement Nykaa = driver
				.findElement(By.xpath("//a[@href='https://www.nykaa.com/sp/mom-and-baby-native/mom-and-baby']"));
		Actions a = new Actions(driver);
		a.moveToElement(Nykaa).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Baby Powder']")).click();
//JavascriptExecutor js=(JavascriptExecutor)driver;
//js.executeScript("window.scrollBy(0,400)");

		String parent = driver.getWindowHandle();
//System.out.println(parent);
		Set<String> child = driver.getWindowHandles();
		Iterator<String> itr = child.iterator();
		while (itr.hasNext()) {
			String all_tabs = itr.next();
			if (!parent.equals(all_tabs)) {
				driver.switchTo().window(all_tabs);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,400)");
				Thread.sleep(4000);
				driver.findElement(By.xpath("//img[@class='css-11gn9r6']")).click();
//Thread.sleep(4000);
//driver.findElement(By.xpath("//span[text()='Add to Bag'][1]")).click();

			}
		}
		Set<String> child1 = driver.getWindowHandles();
		List<String> l = new LinkedList<>();
		l.addAll(child1);
//System.out.println(l);

		if (l.get(1) != null)

		{
			String w2 = l.get(2);
			driver.switchTo().window(w2);

			Thread.sleep(4000);
//driver.findElement(By.xpath("(//span[@class=' css-d3w64v'])[3]")).click();
			WebElement grams = driver.findElement(By.xpath("//select[@class='css-2t5nwu']"));
			Select s = new Select(grams);
			s.selectByValue("2");
			driver.findElement(By.xpath("(//span[@class='btn-text'])[1]")).click();
			driver.findElement(By.xpath("//button[@class=\"css-g4vs13\"]")).click();
			WebElement frames = driver
					.findElement(By.xpath("//iframe[@src='/mobileCartIframe?ptype=customIframeCart']"));
			driver.switchTo().frame(frames);
//Select S1=new Select(quant);
//S1.selectByValue("3");
			Thread.sleep(4000);
driver.findElement(By.xpath("//p[@data-test-id='select-quantity']")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//div[contains(@value,'3') and (@class='css-m37lhi')]")).click();

			driver.findElement(By.xpath("//div[@class='css-1l5d7z5 e1whhlt1']")).click();
			driver.findElement(By.xpath("(//button[@class='css-dj1hws e8tshxd1'])[2]")).click();
		}
//System.out.println(l);

	}
}