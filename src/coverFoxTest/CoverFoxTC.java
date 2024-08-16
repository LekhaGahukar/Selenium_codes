package coverFoxTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import commonMethod.Utility;
import coverFoxPOM.CoverFoxAddressDetails;
import coverFoxPOM.CoverFoxHealthplan;
import coverFoxPOM.CoverFoxHomePage;
import coverFoxPOM.CoverFoxResultCombinePage;
import coverFoxPOM.coverFoxMemberDetails;

public class CoverFoxTC {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		ChromeOptions ot = new ChromeOptions();
		ot.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(ot);
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		Thread.sleep(3000);
		String filePath = "D:\\selenium\\exceldata\\velocityData.xlsx";
		String age = Utility.readExcelsheet(filePath, "Sheet5", 0, 0);
		String pincode = Utility.readExcelsheet(filePath, "Sheet5", 0, 1);
		String mobileNo = Utility.readExcelsheet(filePath, "Sheet5", 0, 2);

		CoverFoxHomePage homepage = new CoverFoxHomePage(driver);
		homepage.clickOnGenderButton();
		Thread.sleep(3000);

		CoverFoxHealthplan healthplan = new CoverFoxHealthplan(driver);
		healthplan.clickOnNextButton();
		Thread.sleep(3000);

		coverFoxMemberDetails memberDetails = new coverFoxMemberDetails(driver);
		memberDetails.selectAgeFromDropDown(age);
		memberDetails.clickOnNextButton();
		Thread.sleep(3000);

		CoverFoxAddressDetails addressdetails = new CoverFoxAddressDetails(driver);
		addressdetails.pinCodeTextBox(pincode);
		addressdetails.mobileNoTextBox(mobileNo);
		addressdetails.clickOnContinueButton();
		Thread.sleep(3000);

		CoverFoxResultCombinePage combinePage = new CoverFoxResultCombinePage(driver);
		combinePage.getHeaderTextAndBannerCount();

	}

}
