package Testleaf.TestAutomation;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import wrappers.GenericWrappers;

public class CreateAccount extends GenericWrappers {
	@Test
	public void CreateAccounts() {

		// Initialize Web Driver and URL
		invokeApp("chrome", "http://leaftaps.com/opentaps/control/main");

		// Entering UserName and Password for login
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");

		// Click on "CRM/SFA" link
		clickByLink("CRM/SFA");

		// click on create Lead
		clickByLink("Create Account");

		// Entering the details in the form
		enterById("accountName", "ICICI Credit Card Account ");

		// Entering the details in the Local Name
		enterById("groupNameLocal", "Samson");

		// Entering the details in the Site Name
		enterById("officeSiteName", "Edward");

		// Entering the details in the Annual Revenue
		enterById("annualRevenue", "120,0000,00");

		// Select the value in the Preferred Currency
		selectVisibileTextById("currencyUomId", "ALL - Albanian Lek");

		// Select the details in the Industry
		WebElement Industry = driver
				.findElementByXPath("/html/body/div[6]/div/div[2]/div[2]/div/form/table/tbody/tr[4]/td[2]/select");
		Industry.sendKeys("Distribution");

		// Entering the details in the Number Of Employees
		enterById("numberEmployees", "5000");

		// Select the value in the Ownership
		WebElement Ownership = driver
				.findElementByXPath("/html/body/div[6]/div/div[2]/div[2]/div/form/table/tbody/tr[5]/td[2]/select");
		Ownership.sendKeys("S-Corporation");

		// Entering the details in the SIC Code
		enterById("sicCode", "120");

		// Entering the details in the Ticker Symbol
		enterById("tickerSymbol", "120");

		// Select the value in the Source
		selectVisibileTextById("dataSourceId", "Existing Customer");

		// Select the value in the Initial Team
		selectVisibileTextById("initialTeamPartyId", "Demo Sales Team No. 1");

		// Select the value in the Initial Team
		selectVisibileTextById("marketingCampaignId", "Car and Driver");

		// Entering the details in the Description
		driver.findElementByName("description").sendKeys("Selenium with Java");

		// Entering the details in the Important Note
		driver.findElementByName("importantNote").sendKeys("TestNGFramework Leaftaps");

		// Entering the details in the Phone Number
		enterById("primaryPhoneNumber", "9962765260");

		// Entering the details in the Area code
		enterById("primaryPhoneAreaCode", "91");

		// Entering the details in the Person to Ask For
		enterById("primaryPhoneAskForName", "Kevin Sam");

		// Entering the details in the Important Note
		enterById("primaryPhoneExtension", "100");

		// Entering the details in the E-Mail Address
		enterById("primaryEmail", "Duck@gmail.com");

		// Entering the details in the Web URL
		enterById("primaryWebUrl", "www.duck.com");

		// Entering the details To Name
		enterById("generalToName", "Anandhi");

		// Entering the details in the Attention Name
		enterById("generalAttnName", "Jayaraman");

		// Entering the details in the Address1
		enterById("generalAddress1", "500 Kingston Rd");

		enterById("generalAddress2", "315 St Germain Ave");

		// Entering the details in the City
		enterById("generalCity", "Toronto ");

		// Select the value in the Country
		WebElement Country = driver.findElementByXPath(
				"/html/body/div[6]/div/div[2]/div[2]/div/" + "form/table/tbody/tr[19]/td[4]/select");
		Country.sendKeys("Canada");

		// Entering the details in the Address2
		enterById("generalCity", "Toronto ");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Select the value in the State
		WebElement State = driver.findElementByXPath("//*[@id=\"generalStateProvinceGeoId\"]");
		State.sendKeys("Ontario");

		// Click Create Account
		clickByXpath("//input[@value='Create Account']");

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		// Close the Browser
		closeBrowser();
	}

}
