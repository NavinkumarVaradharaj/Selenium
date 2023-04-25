package com.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Avadi\\workspace\\Selenium7AMMar\\chromedriver.exe");
		
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("Incognito");
		WebDriver driver = new ChromeDriver(ch);
		
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement category_search = driver.findElement(By.id("searchDropdownBox"));
		
		Select s = new Select(category_search);
		
		System.out.println(s.isMultiple());
		
		s.selectByVisibleText("Books");
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://demoqa.com/select-menu");
		
		WebElement all_cars = driver.findElement(By.id("cars"));
		
		Select s1 = new Select(all_cars);
		System.out.println(s1.isMultiple());
		
		s1.selectByIndex(2);
		s1.selectByValue("audi");
		s1.selectByVisibleText("Volvo");

		List<WebElement> options = s1.getOptions();
		for (WebElement car : options) {
			System.out.println(car.getText());
		}
		System.out.println("============");
		WebElement firstSelectedOption = s1.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		System.out.println("=============");
		s1.deselectByValue("opel");
		
		List<WebElement> allSelectedOptions = s1.getAllSelectedOptions();
		for (WebElement all_selected : allSelectedOptions) {
			System.out.println(all_selected.getText());
		}
		
		s1.deselectAll();
		
		Thread.sleep(5000);
		
		
		driver.close();
		
		
		
		
		
	}

}
