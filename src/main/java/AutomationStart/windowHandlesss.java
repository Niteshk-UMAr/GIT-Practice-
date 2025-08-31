package AutomationStart;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class windowHandlesss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =  new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String>windows=driver.getWindowHandles();
        Iterator<String> it=windows.iterator();
        String parentID=it.next();
        String childID=it.next();
        driver.switchTo().window(childID);
       String emailAddress= driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0].trim();
       driver.switchTo().window(parentID);
       driver.findElement(By.id("username")).sendKeys(emailAddress);
	}

}
