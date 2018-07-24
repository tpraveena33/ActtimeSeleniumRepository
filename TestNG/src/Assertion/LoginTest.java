package Assertion;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import cross.BaseClass;

public class LoginTest extends BaseClass{
	@Test
	public void verifyhomePage()
	{
		String expTitle="actiTime-Tasks";
		String actTitle=driver.getTitle();
		Assert.assertEquals(actTitle,expTitle);
	}
	@Test
	public void verifyHomePageLogo()
	{
		boolean imgstat=driver.findElement(By.xpath("//img[contains(@src,'default-logo.png')])]")).isDisplayed();
		Assert.assertTrue(imgstat);

	
	}

}
