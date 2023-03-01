package Webdriver_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_Frames {
public void main(String args[])throws Exception{
System.setProperty("webdriver.gecko.driver","D:\\Driver\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
System.out.println(driver.getTitle());
driver.findElement(By.name("txtUsername")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
System.out.println("Login completed");
Thread.sleep(5000);
driver.switchTo().frame("rightMenu");
driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
Thread.sleep(3000);
driver.findElement(By.name("txtEmpFirstName")).sendKeys("selenium");
driver.findElement(By.name("txtEmpLastName")).sendKeys("shital");
driver.findElement(By.id("btnEdit")).click();
Thread.sleep(3000);
System.out.println("new emp added");
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Logout")).click();
System.out.println("Logout completed");
driver.close();

}
}