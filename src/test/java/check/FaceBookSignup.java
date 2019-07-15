package check;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//Automation Testing to create new facebook account
public class FaceBookSignup {
	WebDriver driver;
	 @Test
	 public void openBrowser() {
	 System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");
	 }
	 
	 
	 @Test(dependsOnMethods= {"openBrowser"})
	 public void facebookLogin() {
	 driver.findElement(By.xpath("//*[@id=\"u_0_l\"]")).sendKeys("Ramz");
	 driver.findElement(By.xpath("//*[@id=\"u_0_n\"]")).sendKeys("Saran");
	 driver.findElement(By.xpath("//*[@id=\"u_0_q\"]")).sendKeys("saran@gmail.com");
	 driver.findElement(By.xpath("//*[@id=\"u_0_t\"]")).sendKeys("saran@gmail.com");
     driver.findElement(By.xpath("//*[@id=\"u_0_x\"]")).sendKeys("hello");
     driver.findElement(By.xpath("//*[@id=\"day\"]")).sendKeys("12");
     driver.findElement(By.xpath("//*[@id=\"month\"]")).sendKeys("Feb");
     driver.findElement(By.xpath("//*[@id=\"year\"]")).sendKeys("1992");
     driver.findElement(By.xpath("//*[@id=\"u_0_5\"]")).click();
     
	 }
	
}
