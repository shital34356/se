package Webdriver_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	Thread.sleep(3000);
	driver.close();
}
}
