package com.hyr.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThirdTest {
	@Test
 public void testLMS() throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://lms.thapar.edu/moodle/login/index.php");
		driver.findElement(By.name("username")).sendKeys("sgupta14_be20@thapar.edu");
		driver.findElement(By.name("password")).sendKeys("TIET119575#lms", Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.quit();
	 
 }
}
