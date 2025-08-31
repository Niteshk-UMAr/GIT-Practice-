package AutomationStart;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ActionsPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebElement signIn=driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav-link-accountList']"));
		Actions a=new Actions(driver);
		//move to element
		a.moveToElement(signIn).build().perform();
		//enter text in search bar with capital words.
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

	}

}
