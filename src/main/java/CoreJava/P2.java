package CoreJava;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class P2 {
	
	
	public void doThis()
	{
		System.out.println("Parent-P2");
	}
	@BeforeMethod
	public void bfMethod()
	{
		System.out.println("Before method");
	}
	@AfterMethod
	public void afMethod()
	{
		System.out.println("After method");
	}

}
