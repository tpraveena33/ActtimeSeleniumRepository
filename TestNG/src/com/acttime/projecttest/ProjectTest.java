package com.acttime.projecttest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ProjectTest {
	
		@Test
		public void CreateProjectTest()
		{
		System.out.println("execute create ProjectTest");
		WebDriver driver=new FirefoxDriver();
		System.out.println("login");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://laptop-3dp5vk6o:8080/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		
	}
	@Test
	private void modifyProjectTest()
	{
		System.out.println("execute modifyProjectTest");
	}
	@Test
	public void deleteCustomerTest()
	{
		System.out.println("execute deleteProjectTest");
	}
}
