package packOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo1 {
 
	@Test
	public void firstTestCase() throws InterruptedException
	{
		
		System.out.println("im in first test case from demoOne Class");
		
		/*System.setProperty("webdriver.gecko.driver","C:\\Users\\spal\\workspace1\\TestNg\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		System.out.println("Title is " + driver.getTitle());
		*/
		System.setProperty("webdriver.gecko.driver","C:\\Users\\spal\\workspace1\\MavenProject\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		System.out.println("Title is " + driver.getTitle());
	
	}
	@Test
	public void secondTestCase()
	{
		System.out.println("im in second test case from demoOne Class");
	}
	
}
