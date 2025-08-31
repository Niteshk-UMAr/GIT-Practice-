package TestNGPractice;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Test1 {
	
	@AfterSuite
	public void afSuite()
	{
		System.out.println("At the Last");
	}
	@Test(groups= {"Smoke"})
	public void Demo()
	{
		System.out.println("welcome");
		System.out.println("welcome1");
		System.out.println("welcome2");
	}
	
	@Test
	public void secondTest()
	{
		System.out.println("2nd-Test");
	}
	public void Demo2()
	{
		System.out.println("BYE");
		System.out.println("BYE1");
		System.out.println("BYE2");
	}
	@Test
	public void thirdTest()
	{
		System.out.println("3rd-Test");
	}
	public void Demo3()
	{
		System.out.println("HAI");
		System.out.println("HAI1");
		System.out.println("HAI2");
	}
	@Test
	public void fourthTest()
	{
		System.out.println("4th-Test");
	}

}
