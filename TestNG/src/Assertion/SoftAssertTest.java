package Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {

	@Test
	public void CreateCustomerTest()
	{
		System.out.println("step-1");
		System.out.println("step-2");
		SoftAssert s=new SoftAssert();
		s.assertEquals("A","B");
		System.out.println("step-3");
		System.out.println("step-5");
		System.out.println("step-4");
		s.assertAll();

	}
@Test
public void modifycustomerTest()
{
	System.out.println("=============");
	System.out.println("step-1");
	System.out.println("step-2");
	System.out.println("step-3");
	System.out.println("step-4");
}
}
