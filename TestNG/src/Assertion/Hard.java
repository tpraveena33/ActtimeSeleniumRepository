package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard {

	@Test
	public void CreateCustomerTest()
	{
		System.out.println("step-2");
		String exp="Actitime";
		String act="Acti";
		Assert.assertEquals(exp,act);
		System.out.println("step-1");

	}
@Test
public void modifyCustomerTest()
{
	System.out.println("step-3");
	System.out.println("step-4");
	System.out.println("step-6");
}
}
