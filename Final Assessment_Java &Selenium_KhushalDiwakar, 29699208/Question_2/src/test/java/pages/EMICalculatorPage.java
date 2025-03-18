package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EMICalculatorPage {
    WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    public EMICalculatorPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,Duration.ofSeconds(10000));
        this.actions = new Actions(driver);
    }

    public void navigateToLoanType(String loanType) {
        WebElement loanTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='" + loanType + "']")));
        loanTab.click();
    }

    public void enterLoanAmount(String amount) {
        WebElement amountField = driver.findElement(By.id("loanamount"));
        amountField.clear();
        amountField.sendKeys(amount);
    }

    public void setInterestRate(String rate) {
        WebElement slider = driver.findElement(By.xpath("//div[@id='loaninterestslider']//span"));
        actions.dragAndDropBy(slider, Integer.parseInt(rate), 0).perform();
    }

    public void enterLoanTenure(String tenure) {
        WebElement tenureField = driver.findElement(By.id("loanterm"));
        tenureField.clear();
        tenureField.sendKeys(tenure);
    }

    public void validateEMI() {
        String emi = driver.findElement(By.id("emiamount")).getText();
        String interest = driver.findElement(By.id("interestpayable")).getText();
        String totalPayment = driver.findElement(By.id("totalpayment")).getText();

        System.out.println("Loan EMI: " + emi);
        System.out.println("Total Interest Payable: " + interest);
        System.out.println("Total Payment: " + totalPayment);
    }
}