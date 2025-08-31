package AutomationStart;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver =  new ChromeDriver();//pass the object of the chromeOptions class into ChromeDriver class 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a = new SoftAssert();
		for(WebElement link:links)
		{
			String url=link.getDomAttribute("href");
		       HttpURLConnection con=(HttpURLConnection) new URL(url).openConnection();
		       con.setRequestMethod("HEAD");
		       con.connect();
		       int rescode=con.getResponseCode();
		       a.assertTrue(rescode<400, "The link is broken"+link.getText()+rescode);
		      
		}
		
		a.assertAll();
		
		
       driver.quit();
       
	}

}
