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
	}
	
	@Test
	public void secondTest()
	{
		System.out.println("2nd-Test");
	}

}
