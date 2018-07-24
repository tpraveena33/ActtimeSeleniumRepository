import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class AnnotationUsage {

	public WebDriver driver;
	@BeforeClass
	public void configBC()
	{
		System.out.println("==========launch browser========");
		driver=new FirefoxDriver();
		
	}
	@BeforeMethod
	public void configBM()
	{
		System.out.println("login");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://laptop-3dp5vk6o:8080/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	}
	@AfterMethod
	public void configAM()
	{
		System.out.println("logout");
		driver.findElement(By.linkText("logout")).click();
	}
	@AfterClass
	public void configAC()
	{
		System.out.println("=======close the browser=====");
		driver.close();
	}
}
