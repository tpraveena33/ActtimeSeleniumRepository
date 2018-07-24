import org.testng.annotations.Test;

public class CustomNameTest {

	@Test
	public void CreateCustomerTest()
	{
	System.out.println("execute CreateCustomerTest");
	
}
@Test(invocationCount=4)
private void modifyCustomerTest()
{
	System.out.println("execute modifyCustomerTest");
}
@Test
public void deleteCustomerTest()
{
	System.out.println("execute deleteCustomerTest");
}
}
