package testNGXML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Addmission {
	@Test(groups = {"faculty"})
	  public void AddmissionWebSite()
	  
	  {
		  Reporter.log("www.addmissionwebsite.com",true);
	  }
	  
	  @Test(groups = {"marks"})
	  public void AddmissionDate()
	  
	  {
		  Reporter.log("Addmission Process Start form 23-07-2024",true);
	  }
	  
	  @Test(groups = {"marks"})
	  public void AddmissionLastDate()
	  
	  {
		  Reporter.log("The Last Date of Addmission is 23-08-2024",true);
	  }
	  
	 

}
