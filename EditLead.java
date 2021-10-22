package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class EditLead extends BaseClass {
	
	@And("Click on {string} Tab")
	public void clickTab(String tabName) {
		driver.findElement(By.xpath("//span[text()='" + tabName + "']")).click();
	}

	@And("Enter the phone number as {string}")
	public void enterPhoneNumber(String num) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(num);

	}
	
	@Given("Enter the LeadID")
	public void findByLeadID()
	{
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	}

	@Then("Company name should be updated as {string}")
	public void verifyCompanyNameUpdate(String companyName) {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		boolean contains = text.contains(companyName);
		if (contains)
			System.out.println("Company Name has been Updated");
		else
			System.out.println("Company Name NOT Updated");

	}
}
