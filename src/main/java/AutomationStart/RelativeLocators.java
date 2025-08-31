package AutomationStart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =  new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//WebElement nameBox=driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-touched']"));
		//System.out.println(driver.findElement(with(By.tagName("label")).above(nameBox)).getText());
		WebElement DOB=driver.findElement(By.xpath("//label[@for='dateofBirth']"));
	    driver.findElement(with(By.tagName("input")).below(DOB)).click();
	    WebElement radiobtn=driver.findElement(By.id("inlineRadio1"));
	    System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radiobtn)).getText());
	    
		
		
		
		
	}

}
