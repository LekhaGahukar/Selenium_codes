package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority_Example {
  @Test(priority = -3)
  public void a() 
  {
	  Reporter.log("This is A Method",true);
  }
  @Test(priority = 1)
  public void b()
  {
	Reporter.log("This is B method", true);  
  }
  @Test(priority = -5)
  public void e()
  {
	  Reporter.log("This is E method ",true);
  }
  
}
