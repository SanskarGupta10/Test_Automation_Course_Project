package com.hyr.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FourTest {
    @Test
	public void testWebkioskStudent() throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://webkiosk.thapar.edu/");
		WebElement selectBox = driver.findElement(By.name("UserType"));
		Select select = new Select(selectBox);
		select.selectByVisibleText("Students");
		driver.findElement(By.name("MemberCode")).sendKeys("102053049");
		driver.findElement(By.name("Password")).sendKeys("Sanskar1001", Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.quit();
	}
     @Test
     public void testWebkioskParent() throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://webkiosk.thapar.edu/");
		WebElement selectBox = driver.findElement(By.name("UserType"));
		Select select = new Select(selectBox);
		select.selectByVisibleText("Parents");
		driver.findElement(By.name("MemberCode")).sendKeys("102053049");
		driver.findElement(By.name("Password")).sendKeys("Sanskar1001", Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.quit();
	} 

}
