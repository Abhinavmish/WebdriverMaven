package com.git.gitwebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoginTest {

public static WebDriver driver;
	
	@BeforeTest
	public void setup(){
	driver = new ChromeDriver();
		
	}
	
@Test
	public void dologin(){
				
		driver.get("https://10.191.95.43/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='uid']")).sendKeys("schooladmin");
		driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id='userType']")).sendKeys("Local");
		driver.findElement(By.xpath("//*[@id='loginForm']/button")).click();
		
				
	}

}
