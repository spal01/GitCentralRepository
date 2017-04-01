package com.testNGRelated;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestNG {
  @Test
  public void test() {
	  System.out.println("Hallo World in Test NG BY Maven");
  
	  /*System.setProperty("webdriver.gecko.driver","C:\\Users\\spal\\workspace1\\TestNg\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		System.out.println("Title is " + driver.getTitle());*/
  }
}
