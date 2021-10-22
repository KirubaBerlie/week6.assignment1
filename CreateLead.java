package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass {

	@And("Enter the FirstName as {string}")
	public void enterFirstName(String lastName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(lastName);
	}

	@And("Enter the LastName as {string}")
	public void enterLastName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	}

	@When("Click on Create Lead button")
	public void clickOnCreateLead() {
		driver.findElement(By.name("submitButton")).click();
	}

		
	@Then("New Lead should be created")
	public void verifyNewLead() {
		boolean displayed = driver.findElement(By.xpath("//div[text()='View Lead']")).isDisplayed();
		if (displayed)
			System.err.println("New Lead created");
		else
			System.err.println("New Lead is NOT created");
	}

}
