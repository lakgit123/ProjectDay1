package org.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Samsung phone");
		WebElement submit = driver.findElement(By.xpath("//input[@class='nav-input']"));
		submit.click();
		WebElement samsungop1 = driver.findElement(By.xpath("(//span[contains(text(),'Samsung Galaxy M10')])[1]"));
		samsungop1.click();
		String pwd =driver.getWindowHandle();
		System.out.println(pwd);
		Set<String> chwd =driver.getWindowHandles();
		System.out.println(chwd);
		for(String x:chwd) {
			if(!pwd.equals(x)) {
				driver.switchTo().window(x);
			}
		}
		Set<String> chwd1 =driver.getWindowHandles();
		List<String> li= new ArrayList<>();
		li.addAll(chwd1);
		WebElement addcart = driver.findElement(By.id("add-to-cart-button"));
		addcart.click();

}
}
