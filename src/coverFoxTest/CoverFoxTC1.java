package coverFoxTest;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import coverFoxBase.Base;
import coverFoxPOM.CoverFoxAddressDetails;
import coverFoxPOM.CoverFoxHealthplan;
import coverFoxPOM.CoverFoxHomePage;
import coverFoxPOM.coverFoxMemberDetails;
import coverFoxPOM.CoverFoxResultCombinePage;
import coverFoxUtility.Utility;
@Listeners(coverFoxUtility.Listener.class)
public class CoverFoxTC1 extends Base {

	CoverFoxHomePage homePage;
	CoverFoxHealthplan healthPlanPage;
	CoverFoxAddressDetails addressDetailsPage;
	coverFoxMemberDetails memberDetailsPage;
	CoverFoxResultCombinePage resultPage;
	String filePath;

	@BeforeTest
	public void launchBrowser() {
		openBrowser();
		homePage = new CoverFoxHomePage(driver);
		healthPlanPage = new CoverFoxHealthplan(driver);
		addressDetailsPage = new CoverFoxAddressDetails(driver);
		memberDetailsPage = new coverFoxMemberDetails(driver);
		resultPage = new CoverFoxResultCombinePage(driver);

		filePath = "D:\\selenium\\exceldata\\velocityData.xlsx";
	}

	@BeforeClass
	public void preConditions() throws InterruptedException, EncryptedDocumentException, IOException {
		homePage.clickOnGenderButton();
		
		Thread.sleep(1000);
		healthPlanPage.clickOnNextButton();
	
		memberDetailsPage.selectAgeFromDropDown(Utility.readExcelsheet(filePath, "Sheet5", 0, 0));

		memberDetailsPage.clickOnNextButton();
		Thread.sleep(1000);
		addressDetailsPage.pinCodeTextBox(Utility.readExcelsheet(filePath, "Sheet5", 0, 1));
		addressDetailsPage.mobileNoTextBox(Utility.readExcelsheet(filePath, "Sheet5", 0, 2));
		addressDetailsPage.clickOnContinueButton();

	}

	@Test
	public void validateBanners() throws InterruptedException {
		Thread.sleep(4000);
		Assert.fail();
		int bannerPlanNumbers = resultPage.getPlanNumersFromBanners();
		int StringplanNumbers = resultPage.getPlanNumersFromString();
		Assert.assertEquals(StringplanNumbers, bannerPlanNumbers,"Plans on banners not matching with results, TC failed");

	}

	@Test

	public void validateIsdisplyedSortPlan() throws IOException, InterruptedException {
		Thread.sleep(4000);
		Assert.fail();
		boolean result = resultPage.getSortPlansIsDisplyed();
		Assert.assertTrue(result, "Sort plan DropDown is not displyed ,TC is failed");
		//Utility.screenshot(driver, "validateIsdisplyedSortPlan");
	}

	@AfterClass
	public void closeBrowser() throws InterruptedException {
		browserClose();
	}
}
