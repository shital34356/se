package Webdriver_Examples;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindHand {
public static void main(String args[])throws Exception{
System.setProperty("webdriver.gecko.driver","D:\\Driver\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.get("C:\\Users\\SHITAL\\Downloads\\multiplewindows.html");
Thread.sleep(4000);
driver.findElement(By.id("btn2")).click();
Thread.sleep(4000);
driver.findElement(By.id("btn3")).click();
Thread.sleep(4000);
ArrayList<String>windinfo = new
ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(windinfo.get(0));
Thread.sleep(4000);
driver.quit();

}

}
