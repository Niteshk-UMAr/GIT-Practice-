package AutomationStart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AcceptSSLCerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);//accept insecure certificates
		
		WebDriver driver =  new ChromeDriver(options);//pass the object of the chromeOptions class into ChromeDriver class 
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		driver.quit();
		
		
	}

}
