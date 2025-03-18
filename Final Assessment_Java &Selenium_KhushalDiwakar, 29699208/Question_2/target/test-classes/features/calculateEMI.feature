Feature: EMI Calculation

  Scenario Outline: Calculate EMI for different loan types
    Given I launch the EMI calculator website
    When I select "<Loan Type>"
    And I enter Loan Amount "<Loan Amount>"
    And I set Interest Rate "<Interest Rate>"
    And I enter Loan Tenure "<Loan Tenure>"
    Then I validate the EMI calculations

    Examples:
      | Loan Type    | Loan Amount | Interest Rate | Loan Tenure |
      | Home Loan    | 5000000     | 10            | 20 years    |
      | Personal Loan| 750000      | 15            | 5 years     |
      | Car Loan     | 2000000     | 9             | 6 years     |