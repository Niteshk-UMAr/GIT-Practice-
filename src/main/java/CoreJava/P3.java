package CoreJava;

public class P3 extends P4{
	
	
	int a;//class variable
	public P3(int a) {//variable inside constructor is called instantiate variable
		super(a);
		this.a=a;
	}
	public int increment()
	{
		a=a+1;
		return a;
	}
	public int decrement()
	{
		a=a-1;
		return a;
	}
	

}
