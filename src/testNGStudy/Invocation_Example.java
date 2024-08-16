package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Invocation_Example {
  @Test(invocationCount = 6)
  public void f() 
  {
	  Reporter.log("Test method is Running",true);
  }
  @AfterMethod
  public void after()
  {
	  Reporter.log("After Method is Running",true);
  }
}
