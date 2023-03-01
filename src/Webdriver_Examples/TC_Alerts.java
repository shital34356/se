package Webdriver_Examples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_Alerts {
public static void main(String args[])throws Exception{
System.setProperty("webdriver.gecko.driver","D:\\Driver\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.navigate().to("http://183.82.103.245/nareshit/index.php");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
Thread.sleep(4000);
driver.findElement(By.name("Submit")).click();
Thread.sleep(4000);
Alert a = driver.switchTo().alert();
System.out.println(a.getText());
a.accept();
Thread.sleep(4000);
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
Thread.sleep(4000);
System.out.println("Login completed");
driver.findElement(By.linkText("Logout")).click();
System.out.println("Logout completed");
driver.close();


}

}
