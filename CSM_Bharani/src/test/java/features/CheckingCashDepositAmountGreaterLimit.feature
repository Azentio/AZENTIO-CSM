Feature: Checking Cash Withdrawal Transaction Amount Greater than Limit

@TRS_096
Scenario: To check whether transfer is possible with particular amount greater than limit
Given navigate to CSM application and login with valid credentials
And User update test data for test case number TRS_604
And Click the Transactions flag
Then Click the Maintenance flag on the Transaction
And Enter the code in TRXTypeBox in Maintenance flag
#Then Enter the Branch code in Branch code Maintenance flag
And Enter the Currency code in Maintenance flag
Then Enter the Gl code in Maintenance flag
And Enter the Cif code in Maintenance flag
#Then Click the Ok popup
#And Click the Close popup
Then Enter the serial number in Maintenance flag
Then Click the Ok popup
#And Click the Close popup
And Enter the currency code flag
#Then User enter the currency code2 value_604
And User enter the glcode2 value_604
Then User enter the cif code2 value_604
And User enter the serail no2 value_604
Then User Enter the debit amount in Maintenance flag_604
Then Click the Ok popup
Then Click the Ok popup
And Save the transaction
Then Click the Ok popup