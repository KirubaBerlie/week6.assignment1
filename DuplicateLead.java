package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DuplicateLead extends BaseClass{
	
	String view_CompanyName;
	String view_FirstName;
	String view_LastName;
	
	@Given("Note the LeadID details")
	public void noteInfoToVerify() {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		view_CompanyName=text.replaceAll("[0-9]", text);
		view_FirstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		view_FirstName = view_FirstName.substring(0, 3);
		view_LastName = driver.findElement(By.id("viewLead_lastName_sp")).getText();
		System.out.println(view_FirstName + "   " + view_CompanyName );
	}

	@Then("Verify duplicate Lead performed")
	public void VerifyLead() {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();

		String duplicate_CompanyName;
		duplicate_CompanyName= text.replaceAll("[0-9 ]", text);
		String duplicate_view_FirstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		duplicate_view_FirstName = duplicate_view_FirstName.substring(0, 3);
		// String duplicate_view_LastName =
		// driver.findElement(By.id("viewLead_lastName_sp")).getText();

		if (duplicate_view_FirstName.equals(view_FirstName) && view_CompanyName.equals(duplicate_CompanyName)) {
			System.out.println("Duplicated :" + view_FirstName + " " + duplicate_view_FirstName);
			
		}
		else
		{	System.out.println("Issue in Duplicate Lead");
		System.out.println(duplicate_view_FirstName + "   " + duplicate_CompanyName );}
		}
		
	}



