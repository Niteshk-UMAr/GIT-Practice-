package TestNGPractice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test4 {

	
	@AfterTest
	public void after()
	{
		System.out.println("At-Last");
	}
	@Test
	public void seventhTestHomeLoan()
	{
		System.out.println("7th-TestHomeLoan");
	}
	@Test(groups= {"Smoke"})
	public void eigthTestHomeLoan()
	{
		System.out.println("8th-TestHomeLoan");
	}
	@Test
	public void ninethTestHomeLoan()
	{
		System.out.println("9th-TestHomeLoan");
	}
	@BeforeTest
	public void before()
	{
		System.out.println("execute-1st");
	}
	@BeforeSuite
	public void bfSuite()
	{
		System.out.println("execute on TOP");
	}
}
