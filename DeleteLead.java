package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;

public class DeleteLead extends BaseClass {

	@Then("Note the LeadID")
	public void noteLeadIdToVerify() {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		leadID = text.replaceAll("[^0-9 ]", "").trim();
		System.out.println(leadID);
	}

	@Then("Verify Lead deleted")
	public void verifyLEadDeleted() throws InterruptedException {
		driver.findElement(By.name("id")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.className("x-paging-info")).getText();
		if (message.equals("No records to display"))
			System.out.println("Successfully deleted the lead");
		else

			System.out.println("pls look into console");

	}

}
