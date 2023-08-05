package com.actitime.testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZohoCRM {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("http://192.168.126.128:8080/");
driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
driver.findElement(By.id("passWord")).sendKeys("123456");
driver.findElement(By.xpath("//input[@title='Sign In']")).click();
	}
}
