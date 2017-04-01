package packTwo;

import org.testng.annotations.Test;

public class Demo2 {
	@Test
	public void firstTestCase()
	{
		System.out.println("im in first test case from demoTwo Class");
		int a=6/0;
	}
	@Test
	public void secondTestCase()
	{
		System.out.println("im in second test case from demoTwo Class");
	}
  

}
