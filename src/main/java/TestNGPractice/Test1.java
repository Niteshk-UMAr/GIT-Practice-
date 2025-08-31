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

}
