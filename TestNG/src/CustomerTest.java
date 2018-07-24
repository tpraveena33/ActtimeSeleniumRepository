import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CustomerTest {
	@BeforeClass
	public void configBC() {
		System.out.println("=======launch browser=========");
	}
	@Test
	public void CreateCustomerTest()
	{
		System.out.println("execute createcustomertest");
	}
	@Test
	public void modifyCustomerTest()
	{
		System.out.println("execute create customer&modifyTest");
	}
	@Test
	public void deleteCustomerTest()
	{
		System.out.println("execute create customer&deleteTest");
		
	}
	@AfterMethod
	public void configAM()
	{
		System.out.println("logout");
		
	}
	@AfterClass
	public void configAC()
	
		{
			System.out.println("======close browser=========");
		}
	}
	
	



