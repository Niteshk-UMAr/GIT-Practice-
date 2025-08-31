package TestNGPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test3 {
	
	@Test
	public void fourthTestCarLoan()
	{
		System.out.println("4th-TestCarLoan");
	}
	
	@Test(groups= {"Smoke"})
	public void fifthTest()
	{
		System.out.println("5th-TestCarLoan");
	}
	
	@Test(dataProvider="getData")
	public void sixthTest(String username, String password)
	{
		System.out.println("6th	-TestCarLoan");
		System.out.println(username);
		System.out.println(password);
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][2];
		
		data[0][0]="1stUsername";
		data[0][1]="12341234";
		
		data[1][0]="2ndUserName";
		data[1][1]="12341234";
		
		data[2][0]="3rdUsername";
		data[2][1]="12341234";
		return data;
				
	
	}

}
