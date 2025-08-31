package AutomationStart;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =  new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
		
		//1.to find the size of links in the web page
		driver.findElements(By.tagName("a")).size();
		
		//2.Limit the scope of driver to footer
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));//footerdriver driver to act as driver for footer area
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//3.Limit the scope of driver to 1 column of the footer section
		WebElement coloumndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/uL"));
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());
		
		//4.Click on all the links in the column and write the title of the page
		for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
		{
			String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);//keyboard actions are performed
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);//keyboard actions are performed with sendkeys
		}//opens all the tabs
			Set<String> windows=driver.getWindowHandles();//window handles to switch to windows
			Iterator<String> it=windows.iterator();
			while(it.hasNext())//while loop is used to switch to the window and grab the title of the window
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
		
		
		
	}

}
