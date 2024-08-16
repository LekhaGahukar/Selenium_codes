package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyTestNg {
	@BeforeMethod
	public void beforemethod()
	{
		Reporter.log("This is BeforeMethod", true);
	}
	@AfterMethod
	public void after()
	{
	  Reporter.log("This is AfterMthod", true);
	}
	
  @Test
  public void f() 
  {
	
	  Reporter.log("This is Testing Program", true);
  }
  @Test
  public void f1() 
  {
	
	  Reporter.log("This is Testing Program2", true);
  }
}
