package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {

	/*
	 * public ChromeDriver driver; String view_CompanyName; String view_FirstName;
	 * String view_LastName; String leadID;
	 * 
	 * @Given("Open the Chrome browser") public void openBrowser() {
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); }
	 * 
	 * @And("Load the application url as {string}") public void loadApplUrl(String
	 * url) {
	 * 
	 * driver.get(url); }
	 * 
	 * @And("Enter user name as {string}") public void enterUserName(String
	 * username) { driver.findElement(By.id("username")).sendKeys(username); }
	 * 
	 * @And("Enter the password as {string}") public void enterPassword(String
	 * password) { driver.findElement(By.id("password")).sendKeys(password);
	 * 
	 * }
	 * 
	 * @When("Click on Login button") public void clickLogin() {
	 * driver.findElement(By.className("decorativeSubmit")).click();
	 * 
	 * }
	 * 
	 * @Given("Enter the Company name as {string} in {string} Lead") public void
	 * enterCompanyName(String companyName, String action) { WebElement companyName1
	 * = driver.findElement(By.id(action + "LeadForm_companyName"));
	 * companyName1.clear(); companyName1.sendKeys(companyName);
	 * 
	 * }
	 * 
	 * @And("Enter the {string} as {string}") public void enterFirstName(String
	 * name, String firstName) { driver.findElement(By.xpath("//input[@name='" +
	 * name + "']")).sendKeys(firstName); System.out.println(name + "  "
	 * +firstName); }
	 * 
	 * @And("Enter the FirstName as {string}") public void enterFirstName(String
	 * lastName) {
	 * driver.findElement(By.id("createLeadForm_firstName")).sendKeys(lastName); }
	 * 
	 * @And("Enter the LastName as {string}") public void enterLastName(String
	 * lastName) {
	 * driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName); }
	 * 
	 * @When("Click on Create Lead button") public void clickOnCreateLead() {
	 * driver.findElement(By.name("submitButton")).click(); }
	 * 
	 * @Then("New Lead should be created") public void verifyNewLead() { boolean
	 * displayed =
	 * driver.findElement(By.xpath("//div[text()='View Lead']")).isDisplayed(); if
	 * (displayed) System.err.println("New Lead created"); else
	 * System.err.println("New Lead is NOT created"); }
	 * 
	 * @Then("{string} page should be displayed") public void
	 * page_should_be_displayed(String string) { boolean displayed =
	 * driver.findElement(By.xpath("//div[text()='" + string + "']")).isDisplayed();
	 * if (displayed) System.err.println(string + " displayed"); else
	 * System.err.println(string + " is NOT displayed"); }
	 * 
	 * @When("Click on {string} link") public void ClickLink(String str) {
	 * driver.findElement(By.linkText(str)).click();
	 * 
	 * }
	 * 
	 * @Then("Homepage should get displayed") public void verifyHomePage() { boolean
	 * displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed(); if
	 * (displayed) System.err.println("Homepage displayed"); else
	 * System.err.println("Homepage is NOT displayed"); }
	 * 
	 * @And("Click on {string} Tab") public void clickTab(String tabName) {
	 * driver.findElement(By.xpath("//span[text()='" + tabName + "']")).click(); }
	 * 
	 * @And("Enter the phone number as {string}") public void
	 * enterPhoneNumber(String num) {
	 * driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(num);
	 * 
	 * }
	 * 
	 * @When("Click on {string} button") public void clickButton(String buttonName)
	 * { driver.findElement(By.xpath("//input[@Value='" + buttonName +
	 * "']")).click(); // input[@Value='Update'] }
	 * 
	 * @And("Click on first Lead ID") public void firstLeadID() { WebDriverWait wait
	 * = new WebDriverWait(driver, Duration.ofSeconds(10));
	 * wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
	 * By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")));
	 * driver.findElement(By.
	 * xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click(); }
	 * 
	 * @Then("{string} should  get displayed") public void fetchdDisplay(String
	 * string) { boolean displayed =
	 * driver.findElement(By.xpath("//span[text()='Lead List']")).isDisplayed(); if
	 * (displayed) System.out.println("Lead List Displayed"); else
	 * System.out.println("Lead List NOt displayed"); }
	 * 
	 * @Then("Company name should be updated as {string}") public void
	 * verifyCompanyNameUpdate(String companyName) { String text =
	 * driver.findElement(By.id("viewLead_companyName_sp")).getText(); boolean
	 * contains = text.contains(companyName); if (contains)
	 * System.out.println("Company Name has been Updated"); else
	 * System.out.println("Company Name NOT Updated");
	 * 
	 * }
	 * 
	 * @When("Click button {string}") public void clickButtonTag(String buttonName)
	 * {
	 * 
	 * driver.findElement(By.xpath("//button[text()='" + buttonName +
	 * "']")).click(); }
	 * 
	 * @Given("Note the LeadID details") public void noteInfoToVerify() {
	 * view_CompanyName =
	 * driver.findElement(By.id("viewLead_companyName_sp")).getText();
	 * view_FirstName =
	 * driver.findElement(By.id("viewLead_firstName_sp")).getText(); view_FirstName
	 * = view_FirstName.substring(0, 3); view_LastName =
	 * driver.findElement(By.id("viewLead_lastName_sp")).getText(); }
	 * 
	 * @Then("Verify duplicate Lead performed") public void VerifyLead() { String
	 * duplicate_CompanyName =
	 * driver.findElement(By.id("viewLead_companyName_sp")).getText();
	 * 
	 * String duplicate_view_FirstName =
	 * driver.findElement(By.id("viewLead_firstName_sp")).getText();
	 * duplicate_view_FirstName = duplicate_view_FirstName.substring(0, 3); //
	 * String duplicate_view_LastName = //
	 * driver.findElement(By.id("viewLead_lastName_sp")).getText();
	 * 
	 * if (duplicate_view_FirstName.equals(view_FirstName) &&
	 * duplicate_CompanyName.equals(duplicate_CompanyName)) {
	 * System.out.println("Duplicated :" + view_FirstName + " " +
	 * duplicate_view_FirstName); } }
	 * 
	 * @Then("Note the LeadID") public void noteLeadIdToVerify() { String text =
	 * driver.findElement(By.id("viewLead_companyName_sp")).getText(); leadID =
	 * text.replaceAll("[^0-9 ]", "").trim(); System.out.println(leadID); }
	 * 
	 * @Then("Verify Lead deleted") public void verifyLEadDeleted() throws
	 * InterruptedException { driver.findElement(By.name("id")).sendKeys(leadID);
	 * driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	 * Thread.sleep(1000); String message =
	 * driver.findElement(By.className("x-paging-info")).getText(); if
	 * (message.equals("No records to display"))
	 * System.out.println("Successfully deleted the lead"); else
	 * 
	 * System.out.println("pls look into console");
	 * 
	 * }
	 * 
	 * @When("Click on Lookup icon {int}") public void clickLookup(int num) {
	 * driver.findElement(By.xpath("(//img[@alt='Lookup'])[" + num + "]")).click();
	 * }
	 */
}
