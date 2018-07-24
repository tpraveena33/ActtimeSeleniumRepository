package com.acttime.genericlib;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import cross.BaseClass;

public class Listener {

	@Listeners(com.acttime.genericlib.SampleListener.class)
	public class customerTest extends BaseClass
	{
		@Test
		public void createCustomerTest()
		{
			driver.findElement(By.xpath("//span[text()='Task']")).click();
			System.out.println("step1");
			System.out.println("step2");
			System.out.println("step3");
			
		}

	}

}
