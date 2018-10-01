package FirstPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstClass 
{
	WebDriver driver;
  @Test
  public void Add() 
  {
	  
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
      driver = new ChromeDriver();	
      
      driver.manage().window().maximize();
      
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      
      driver.get("https://beckermediaqa.herokuapp.com/login");
      
      System.out.println(driver.getTitle());
      
      System.out.println(driver.getCurrentUrl());
      
      driver.navigate().to("http://beckermedia.slack.com/");
      
      System.out.println(driver.getTitle());
      
      System.out.println(driver.getCurrentUrl());
      
      
      driver.quit(); //id,name, classname,tagname, xpath, css, linkte, part
      
      System.out.println("Completed Yes Perfect");

	  
  }
}
