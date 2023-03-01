package Webdriver_Examples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;


public class TC001_Login_Logout{
public static void main(String args[])throws Exception{
System.setProperty("Webdriver.gecko.driver","D:\\Driver\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
System.out.println("Open Application");
Thread.sleep(3000);
driver.close();

}
}





