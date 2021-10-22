package steps;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommonImplementation extends BaseClass {

	@And("Enter user name as {string}")
	public void enterUserName(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@And("Enter the password as {string}")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);

	}

	@When("Click on Login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}

	@Then("Homepage should get displayed")
	public void verifyHomePage() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if (displayed)
			System.err.println("Homepage displayed");
		else
			System.err.println("Homepage is NOT displayed");
	}

	@When("Click on {string} link")
	public void ClickLink(String str) {
		driver.findElement(By.linkText(str)).click();

	}

	@Then("{string} page should be displayed")
	public void page_should_be_displayed(String string) {
		boolean displayed = driver.findElement(By.xpath("//div[text()='" + string + "']")).isDisplayed();
		if (displayed)
			System.err.println(string + " displayed");
		else
			System.err.println(string + " is NOT displayed");
	}

	@When("Click on {string} button")
	public void clickButton(String buttonName) {
		driver.findElement(By.xpath("//input[@value='" + buttonName + "']")).click();

	}

	@When("Click button {string}")
	public void clickButtonTag(String buttonName) {

		driver.findElement(By.xpath("//button[text()='" + buttonName + "']")).click();
	}

	@Then("Lead List should  get displayed")
	public void fetchdDisplay() {
		boolean displayed = driver.findElement(By.xpath("//span[text()='Lead List']")).isDisplayed();
		if (displayed)
			System.out.println("Lead List Displayed");
		else
			System.out.println("Lead List NOt displayed");
	}

	@And("Click on first Lead ID")
	public void firstLeadID() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")));
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}

	@Given("Enter the Company name as {string} in {string} Lead")
	public void enterCompanyName(String companyName, String action) {
		WebElement companyName1 = driver.findElement(By.id(action + "LeadForm_companyName"));
		companyName1.clear();
		companyName1.sendKeys(companyName);

	}
	
	/*
	 * @Then("Note the LeadID") public void noteLeadIdToVerify() { String text =
	 * driver.findElement(By.id("viewLead_companyName_sp")).getText(); leadID =
	 * text.replaceAll("[^0-9 ]", "").trim(); System.out.println(leadID); }
	 */
}
