package novmavenproject;

import org.openqa.selenium.By;
import java.io.Fsile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Assertions
{
WebDriver driver;
String username="tomsmith";
String password="SuperSecretPassword!";

@BeforeTest
public void browserlaunch()

{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuldeep\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver(); 
	driver.navigate().to("https://the-internet.herokuapp.com/");
	String actualtitle=driver.getTitle();
	String expectedtitle="The Internet";
	Assert.assertEquals(actualtitle,expectedtitle);
	
	@Test
	public void Login (String username,String password)
	{
	driver.findElement(By.linkText("Form Authentication")).click();
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.className("radius")).click();
	Assert.assertTrue(driver.findElement( By.xpath("//*[@id='flash']")).isDisplayed());
	}
	
	
	
	}


}
