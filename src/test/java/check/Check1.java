package check;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;




//Automation Testing to download WAMP 
//step1- go to google.com
//step2- type WAMP
//step3- press enter
//step4- click https://sourceforge.net/projects/wampserver/
//step5- click Download Button


public class Check1 {
	WebDriver driver;
	 @Test
	 public void openBrowserclick () {
	 System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 driver.get("https://www.google.lk/?gws_rd=ssl");
	 }
	 
	 @Test(dependsOnMethods= {"openBrowser"})
	 public void facebookLogin() {
	 driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("Wamp");
	 driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys(Keys.ENTER);
	 driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div[1]/div/div/div[1]/a/h3")).click();
     driver.findElement(By.xpath("//*[@id=\"pg_project\"]/div[5]/div[2]/div[1]/div/section/div[2]/div[3]/a[1]")).click();
	 }
}
