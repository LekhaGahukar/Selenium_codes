package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutExample {
  @Test(timeOut = 1000)
  public void A() throws InterruptedException 
  {
	  Thread.sleep(2000);
	  Reporter.log("This is Method A", false);
  }
}
