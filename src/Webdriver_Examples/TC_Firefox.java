package Webdriver_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_Firefox 
{
public static void main(String args[])throws Exception
{
System.setProperty("webdriver.gecko.driver", "D:\\Driver\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.navigate().to("http://183.82.103.245/nareshit/index.php");
Thread.sleep(3000);
System.out.println("Application opened");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.findElement(By.name("submit")).click();
Thread.sleep(3000);
System.out.println("Login completed");
driver.findElement(By.linkText("Logout")).click();
Thread.sleep(3000);
System.out.println("logout completed");
driver.close();


}
}
