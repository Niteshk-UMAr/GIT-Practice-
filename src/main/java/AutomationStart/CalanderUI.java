package AutomationStart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalanderUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =  new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		String year="2028";
		String month="11";
		String date="28";
		String[] expectedList= {month,date,year};
		driver.findElement(By.xpath("//div[@class='react-date-picker__inputGroup']")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
		List<WebElement> actualList=driver.findElements(By.cssSelector("input[class*='react-date-picker__inputGroup__input']"));
		for(int i=0;i<actualList.size();i++)
		{
			
			
			Assert.assertEquals(actualList.get(i).getAttribute("value"),expectedList[i] );
		}
		driver.quit();
	}

}
