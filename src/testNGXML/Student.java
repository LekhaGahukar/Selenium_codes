package testNGXML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Student {
	@Test(groups = {"marks"})
	  public void Stud_name()
	  
	  {
		  Reporter.log("Student Name",true);
	  }
	  
	  @Test(groups = {"faculty"})
	  public void Stud_ID()
	  
	  {
		  Reporter.log("Student ID",true);
	  }
	  
	  @Test(groups = {"marks"})
	  public void Stud_education()
	  
	  {
		  Reporter.log("Student Education",true);
	  }
	  
	  
}
