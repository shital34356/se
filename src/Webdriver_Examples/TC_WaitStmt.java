package Webdriver_Examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TC_WaitStmt {

//private static final ExpectedConditions ExceptedConditions = null;

private static final ExpectedConditions ExceptedConditions = null;

public static void main(String args[])throws Exception {
System.setProperty("Webdriver.gecko.driver","D:\\Driver\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(4));

//wait.until(ExceptedConditions.elementToBeClikable(driver.findElement(By.name("Submit"))));

wait.until(ExceptedConditions.elementToBeClickable(driver.findElement(By.name("Submit"))));

driver.findElement(By.name("Submit")).click();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
System.out.println("Login completed");
driver.findElement(By.linkText("Logout")).click();
System.out.println("Login completed");
Thread.sleep(4000);
driver.close();

}

}
