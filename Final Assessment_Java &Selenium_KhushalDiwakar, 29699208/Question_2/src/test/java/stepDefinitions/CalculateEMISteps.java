package stepDefinitions;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pages.EMICalculatorPage;
import utils.DriverFactory;

public class CalculateEMISteps {

//    WebDriver driver = DriverFactory.getDriver();
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//    EMICalculatorPage emiCalculatorPage = new EMICalculatorPage(driver);
	
	WebDriver driver;
	EMICalculatorPage emiPage;
	
	public CalculateEMISteps() {
		this.driver=DriverFactory.getDriver();
		emiPage = new EMICalculatorPage(driver);
		
	}

    @Given("I launch the EMI calculator website")
    public void launchEMICalculatorWebsite() {
        driver.get("https://emicalculator.net/");
    }

    @When("I select {string}")
    public void selectLoanType(String loanType) {
       // emiCalculatorPage.navigateToLoanType(loanType);
    	emiPage.navigateToLoanType(loanType);
    }

    @And("I enter Loan Amount {string}")
    public void enterLoanAmount(String loanAmount) {
      //  emiCalculatorPage.enterLoanAmount(loanAmount);
        emiPage.enterLoanAmount(loanAmount);
    }

    @And("I set Interest Rate {string}")
    public void setInterestRate(String interestRate) {
      //  emiCalculatorPage.setInterestRate(interestRate);
        emiPage.setInterestRate(interestRate);
    }

    @And("I enter Loan Tenure {string}")
    public void enterLoanTenure(String tenure) {
       // emiCalculatorPage.enterLoanTenure(tenure);
        emiPage.enterLoanTenure(tenure);
    }

    @Then("I validate the EMI calculations")
    public void validateEMICalculations() {
      //  emiCalculatorPage.validateEMI();
        emiPage.validateEMI();
    }
}