package Webdriver_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class File_Upload {
public static void main(String args[])throws Exception{
System.setProperty("WebDriver.gecko.Driver","D:\\Driver\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nareshit");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
Thread.sleep(5000);
driver.switchTo().frame("rightMenu");
driver.findElement(By.xpath("//input[@value='Add']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='txtEmpLastName']")).sendKeys("last name");
driver.findElement(By.xpath("//input[@name='txtEmpFirstName']")).sendKeys("first name");
WebElement fileInput=driver.findElement(By.xpath("//input[@type='file'][@name='photofile']"));
fileInput.sendKeys("C:\\Users\\SHITAL\\Pictures\\Acer\\Acer_Wallpaper_01_3840x2400.jpg");
Thread.sleep(6000);
System.out.println("New Employee Added");
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Logout")).click();
driver.close();
}
}