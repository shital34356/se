package Webdriver_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_Dropdown {
public static void main(String args[])throws Exception{
System.setProperty("webdriver.gecko.driver","D:\\Driver\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
System.out.println(driver.getTitle());
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
System.out.println("Login completed");

Thread.sleep(3000);
driver.switchTo().frame("rightMenu");
System.out.println("Test");
Select st = new Select(driver.findElement(By.name("loc_code")));
st.selectByVisibleText("Emp. ID");
System.out.println("Slect ID");
Thread.sleep(3000);
driver.findElement(By.name("loc_name")).sendKeys("0423");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@value='Search']")).click();
Thread.sleep(3000);
driver.findElement(By.name("chkLocID[]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@value='Delete']")).click();
Thread.sleep(3000);
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Logout")).click();
Thread.sleep(3000);
System.out.println("Logout completed");
driver.close();
}

}
