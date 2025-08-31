package CoreJava;

import org.testng.annotations.Test;

public class P1 extends P2 {
	
	@Test
	public void testRun()
	{
		int a=3;
		P3 p3=new P3(3);
		
		doThis();
		p3.increment();
		p3.decrement();
		p3.multiplyFour();
	}
	

}
