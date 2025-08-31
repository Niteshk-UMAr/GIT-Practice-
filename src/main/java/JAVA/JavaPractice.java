package JAVA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arrays Syntax
		//Syntax1
		/*int[] arr= new int[5];
		arr[0]=10;
		arr[1]=0;
        arr[2]=1;
        arr[3]=12;
        arr[4]=9;*/
        
        //Syntax2
       // int[] arr2= {1,0,19,10,11};
        /*for(int i=0; i<arr.length;i++)
        {
        	if(arr[i]%3==0)
        	{
        		System.out.println(arr[i]);
        	}
        	else
        	{
        		System.out.println(arr[i] + " ->not multiple of 3");
        	}
        }*/
        	//Arraylist
		/*ArrayList<String> a=new ArrayList<String>();
		a.add("India");
		a.add("will");
		a.add("always");
		System.out.println(a.contains("will"));
		for(String s:a)
		{
			System.out.println(s);
		}
		int[] arr2= {1,0,19,10,11};
		List<int[]> arr3=Arrays.asList(arr2);*/
		
		//String Literal and New keyword
		//String s="Automation Complete Task";
		String s1=new String("Automation");
		
		String s="Automation Complete Task";
		String[] splittedString =s.split(" ");
		//Print the string character by character in forward direction
	    for(int i=0; i<s.length(); i++)
	    {
	    	System.out.println(s.charAt(i));//prints the string character by character IN FORWARD direction 
	    }
		//print the string character by character from reverse
	    for(int i=s.length()-1;i<s.length();i--)
	    {
	    	System.out.println(s.charAt(i));//prints the string character by character in reverse direction
	    }
		
		
	
	
	
	
	
	
	
	
	
	}

}
