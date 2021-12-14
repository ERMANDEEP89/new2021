package part1;
import org.openqa.selenium.By;		

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1class 
{
	public static void main(String args[])
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuldeep\\Downloads\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver(); 
	
	driver.navigate().to("https://the-internet.herokuapp.com/");
	
	System.out.println("page title:"+ driver.getTitle());
	//System.out.println("page title:"+ driver.getCurrentUrl());
	//System.out.println(driver.getPageSource());
	driver.findElement(By.linkText("Form Authentication")).click();
	/*if(driver.findElement(By.className("radius")).isDisplayed())
	{
		System.out.println("launched");	
	}
	else
	{
		System.out.println("not launched");	
	}*/
driver.findElement(By.name("username")).sendKeys("tomsmith");
driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
driver.findElement(By.className("radius")).click();
driver.findElement(By.className("button secondary radius")).click();


	
	
	
	//driver.close();
	
	
}
}
