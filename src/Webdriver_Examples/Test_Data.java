package Webdriver_Examples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Test_Data {
static String url = "http://183.82.103.245/nareshit/login.php";
static String username ="nareshit";
static String password ="nareshit";
static String title1 = "OrangeHRM-New Level of HR Management";
static String title2 = "OrangeHRM";
public static void main(String args[])throws Exception{
System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
driver.navigate().to(url);
Thread.sleep(3000);
System.out.println("Application opened");
if(driver.getTitle().equals(title1)) {
System.out.println("Title not matched");
}
else {
System.out.println("Application opened");
System.out.println(driver.getTitle());
}
//driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
//driver.findElement(By.name("txtPassword")).sendKeys("nareshit");

//OR

driver.findElement(By.name("txtUserName")).sendKeys(username);
driver.findElement(By.name("txtPassword")).sendKeys(password);
Thread.sleep(3000);
driver.findElement(By.name("Submit")).click();
Thread.sleep(3000);
System.out.println("Login completed");
if(driver.getTitle().equals(title2)) {
System.out.println("Title matched");
}
else {
System.out.println("Ttile not matched");
System.out.println(driver.getTitle());
}
driver.findElement(By.linkText("Logout")).click();
Thread.sleep(3000);
System.out.println("logout completed");
driver.close();
}
}
