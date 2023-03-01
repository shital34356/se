package Webdriver_Examples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class TC_mouseover {
public static void main(String args[])throws Exception{
System.setProperty("webdriver.gecko.driver","D:\\Driver\\geckodriver.exe");// open app
WebDriver driver = new FirefoxDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");//enter url
Thread.sleep(3000);
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");//username
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");//password
Thread.sleep(3000);
driver.findElement(By.name("Submit")).click();//loginbtn
System.out.println("Login completed");
Thread.sleep(3000);
Actions ac = new Actions(driver);//mouseover
ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();//pim menu
System.out.println("mouseover completed");
Thread.sleep(3000);
driver.findElement(By.linkText("Add Employee")).click();
System.out.println("Clicked on Subemenu");
Thread.sleep(3000);
driver.findElement(By.linkText("Logout")).click();
System.out.println("Logout completed");
Thread.sleep(3000);
driver.close();
}

}
