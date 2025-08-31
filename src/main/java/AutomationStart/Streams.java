package AutomationStart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Streams {

	
		
		
		
		/*@Test
		public void Conevtional()
		{
			
		WebDriver driver = new ChromeDriver();
		ArrayList<String> names = new ArrayList<String>();
		names.add("Anu");
		names.add("Abhi");
		names.add("Advaith");
		names.add("Tom");
		names.add("Bean");
		int count = 0;
		for(int i=0;i<names.size();i++)
		{
			String actual=names.get(i);
			if(actual.startsWith("A"))
			{
				count++;
			}
		}
		System.out.println(count);

	}*/
		/*@Test
		public void Streams1()
		{
			//WebDriver driver = new ChromeDriver();
			ArrayList<String> names = new ArrayList<String>();
			names.add("Anu");
			names.add("Abhi");
			names.add("Advaith");
			names.add("Tom");
			names.add("Bean");
			//1.count of the arrays which starts with A
			long c=names.stream().filter(s->s.startsWith("A")).count();
			//2.Stream without declaring an array
			long d=Stream.of("Anu","Abhi","Advaith","Tom","Bean").filter(s->s.length()>1).count();
			System.out.println(d);
			//3.Print all the arrays of the list
			Stream.of("Anu","Abhi","Advaith","Tom","Bean").filter(s->s.length()>1).forEach(s->System.out.println(s));
			//4.Print only 1st array which matches the condition 
			Stream.of("Anu","Abhi","Advaith","Tom","Bean").filter(s->s.startsWith("A")).limit(1).forEach(s->System.out.println(s));
		}*/
	@Test
	public void streams2()
	{
		//find the array ends with a and convert that to UPPERCase
		//Stream.of("Anu","Abhi","Advaith","Tom","Bean","Rama","Bheema","Soma").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//Convert the array into arrayList and apply stream
		//List<String> names=Arrays.asList("Rama","Bheema","Soma","Laxman");
		//names.stream().filter(s->s.endsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//Merge 2 lists and print the value in sorted format
		//1st Array
		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("Anu");
		names1.add("Abhi");
		names1.add("Advaith");
		names1.add("Tom");
		names1.add("Bean");
		//2nd Array
		List<String> names=Arrays.asList("Rama","Bheema","Soma","Laxman");
		
		Stream<String> conStream=Stream.concat(names1.stream(), names.stream());
		//Merged stream is sorted and written in the UPPERCase format
		//conStream.sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//anyMatch() returns boolean value. Is used to check whether the boolean value is written for the condition
		Boolean var=conStream.anyMatch(s->s.equalsIgnoreCase("Rama"));
	    System.out.println(var);
		Assert.assertTrue(var);//assertion is applied to check whether the obtained value is true or false
		
	}
		

}
