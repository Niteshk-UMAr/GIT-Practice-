package AutomationStart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Section7Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
		//select dropdwon
		//WebElement staticDropdown=driver.findElement();
		//Select dropdown=new Select(staticDropdown);
		//use select methods to access the dropdown
		
		//Problem- Adding items into cart for Ecommerce App(Single product to cart)
		/*WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		String[] itemsNeeded= {"cucumber","Brocolli"};	
		List<WebElement> options=driver.findElements(By.xpath("//h4[class=\"product-name\"]"));
		//convert the array into arrayList 
		List<String> items=Arrays.asList(itemsNeeded);//convert the array into arraylist in run time so memory is saved
		for(int i=0;i<options.size();i++)
		{
			String name=options.get(i).getText();
			if(items.contains(name))//if the arrayList which has the name.
			{
				driver.findElements(By.cssSelector("button[type=\"button\"]")).get(i).click();//gets the index of cart button and clicks the cart button
				
			}
		}*/
		
		//Problem- Adding items into cart for Ecommerce App(two products to cart)
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//implicitlyWait for 5 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
		addItems(driver, itemsNeeded);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//div[@class='action-block']/button")).click();
		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		WebElement msg=driver.findElement(By.cssSelector(".promoInfo"));
		//explicit wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(msg));
		
		
		
		
		
		
		
	}
       public static void addItems(WebDriver driver,String[] itemsNeeded)
       {
    	   int j=0;
    	   List<WebElement> options=driver.findElements(By.xpath("//h4[class='product-name']"));
   		//convert the array into arrayList
   		//Brocolli - 1 Kg. Split on - and trim white space
   		for(int i=0;i<options.size();i++)
   		{
   			String[] name=options.get(i).getText().split("-");
   			String name1=name[0].trim();
   			List<String> items=Arrays.asList(itemsNeeded);//convert the array into arraylist in run time so memory is saved
   			if(items.contains(name1))//if the arrayList which has the name.
   			{
   				j++;
   				driver.findElements(By.xpath("//button[class='product-action']")).get(i).click();//gets the index of cart button and clicks the cart button
   				if(j==itemsNeeded.length)
   				{
   					break;
   				}
   			}  
       }
       }
}
