package coverFoxTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethod.Utility;
import coverFoxPOM.CoverFoxAddressDetails;
import coverFoxPOM.CoverFoxHealthplan;
import coverFoxPOM.CoverFoxHomePage;
import coverFoxPOM.coverFoxMemberDetails;

public class CoverFoxAddressDetailTC {
	WebDriver driver;
	CoverFoxHomePage homePage;
	CoverFoxHealthplan healthPlanPage;
	CoverFoxAddressDetails addressDetailsPage;
	coverFoxMemberDetails memberDetailsPage;

	String filePath;

	@BeforeTest
	public void launchBrowser() {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		homePage = new CoverFoxHomePage(driver);
		healthPlanPage = new CoverFoxHealthplan(driver);
		addressDetailsPage = new CoverFoxAddressDetails(driver);
		memberDetailsPage = new coverFoxMemberDetails(driver);

		filePath = "D:\\selenium\\exceldata\\velocityData.xlsx";
	}

	@BeforeClass
	public void preConditions() throws InterruptedException, EncryptedDocumentException, IOException {
		homePage.clickOnGenderButton();
		Thread.sleep(1000);
		healthPlanPage.clickOnNextButton();
		Thread.sleep(1000);
		memberDetailsPage.selectAgeFromDropDown(Utility.readExcelsheet(filePath, "Sheet6", 0, 0));

		memberDetailsPage.clickOnNextButton();
		Thread.sleep(1000);
		addressDetailsPage.pinCodeTextBox(Utility.readExcelsheet(filePath, "Sheet6", 0, 1));

		addressDetailsPage.mobileNoTextBox(Utility.readExcelsheet(filePath, "Sheet6", 0, 2));

		addressDetailsPage.clickOnContinueButton();
		Thread.sleep(2000);

	}

	@Test
	public void validatePinErrorMsg() {
		String actual = addressDetailsPage.getPinErrorMsg();
		String expected = "Please enter a valid pincode";
		Assert.assertEquals(actual, expected, "Validation Msg Is Not Matched with Pin Field ,TC is failed");
	}

	@Test
	public void validateMobileErrorMsg() {
		String actual = addressDetailsPage.getMobErrorMsg();
		String expected = "Please enter a valid mobile no.";
		Assert.assertEquals(actual, expected, "Validation Msg Is Not Matched With Mob Field,TC is failed");

	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

}
