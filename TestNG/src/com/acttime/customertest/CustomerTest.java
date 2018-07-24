package com.acttime.customertest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import cross.BaseClass;

public class CustomerTest extends BaseClass {
	
	@Test
	public void CreateCustomerTest()
	{
	System.out.println("execute CreateCustomerTest");
	WebDriver driver=new FirefoxDriver();
	System.out.println("login");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("http://laptop-3dp5vk6o:8080/login.do");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	
	
}
@Test(groups="regressionTest")
private void modifyCustomerTest()
{
	System.out.println("execute modifyCustomerTest");
}
@Test(groups="regressionTest")
public void deleteCustomerTest()
{
	System.out.println("execute deleteCustomerTest");
}

}
