package Testleaf.leaftaps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class MergeLead extends GenericWrappers {

	@Test
	public void Mergelead() {
		// Initialize Web Driver and URL
		invokeApp("chrome", "http://leaftaps.com/opentaps/control/main");

		// Entering UserName and Password for login and login
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");

		// Click on "CRM/SFA" link
		clickByLink("CRM/SFA");
		clickByLink("Leads");
		clickByLink("Merge Leads");
		clickByXpath("//img[@alt='Lookup']");
		
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		
		enterByXpath("//input[@name='firstName']","Samson");
		clickByXpath("//button[text()='Find Leads']");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElementById("ext-gen320").click();
		 
		 
	
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
 