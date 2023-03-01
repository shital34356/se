package Webdriver_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_WT {
public static void main(String args[])throws Exception{
System.setProperty("webdriver.gecko driver","D:\\Driver\\geckodriver.exe");
WebDriver driver= new FirefoxDriver();
driver.get("C:\\Users\\SHITAL\\Downloads\\WebTable.html");
int row=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[1]/td[2]")).size();
int col=driver.findElements(By.xpath("//*[@id=\'idCourse']/tbody/tr[1]/td")).size();
int row_col=driver.findElements(By.xpath("//*[@id=\'idCourse']/tbody/tr/td")).size();
System.out.println("rowcount"+row);
System.out.println("colount"+col);
System.out.println("row_colcount"+row_col);
String celldata=driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[1]/td[2]")).getText();
System.out.println(celldata);
for(int i=1;i<=row;i++) {
String data = driver.
findElement(By.xpath("//*[@id='idCourse']/tbody/tr["+i+"]")).getText();
System.out.println(data);
Thread.sleep(4000);
}
driver.close();


}

}


