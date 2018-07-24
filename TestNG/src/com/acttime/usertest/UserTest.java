package com.acttime.usertest;

import org.testng.annotations.Test;

public class UserTest {
	@Test(groups="smokeTest")
	public void CreateUserTest()
	{
	System.out.println("execute createUserTest");
	
}
@Test
private void modifyUserTest()
{
	System.out.println("execute modifyUserTest");
}
@Test
public void deleteUserTest()
{
	System.out.println("execute deleteUserTest");
}

}
