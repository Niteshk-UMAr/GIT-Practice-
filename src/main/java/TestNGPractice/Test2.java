package TestNGPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {

	
	@Test(groups= {"Smoke"})
	public void thirdTest()
	{
		System.out.println("3rd-Test");
	}
	@AfterMethod
	public void afMethod()
	{
		System.out.println("AfterMethod");
	}
	@BeforeMethod
	public void bfMethod()
	{
		System.out.println("Before Method");
	}
}
