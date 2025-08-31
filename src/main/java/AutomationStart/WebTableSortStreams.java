package AutomationStart;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSortStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =  new ChromeDriver();//pass the object of the chromeOptions class into ChromeDriver class 
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//span[text()='Veg/fruit name']")).click();
		List<WebElement>  veggies=driver.findElements(By.xpath("//tr/td[1]"));//capture all the veggies into a list
		List<String> originalList=veggies.stream().map(s->s.getText()).collect(Collectors.toList());//grab the text of the arrays capture it into list
		List<String> sortedList=originalList.stream().sorted().collect(Collectors.toList());//sort the list and capture into the sorted List
		Assert.assertTrue(originalList.equals(sortedList));//compare the original List and the sorted list with assertion
		List<String> priceBeans;
		do{
			List<WebElement>  row=driver.findElements(By.xpath("//tr/td[1]"));
		priceBeans=row.stream().filter(s->s.getText().contains("Rice")).map(s->getPrice(s)).collect(Collectors.toList());
		priceBeans.forEach(a->System.out.println(a));
		if(priceBeans.size()<1)
		{
			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		}
		
		}while(priceBeans.size()<1);
	}

	private static String getPrice(WebElement s) {
		// TODO Auto-generated method stub
		String price=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}

}
