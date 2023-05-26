Feature: Checking Multi Transfer (Main Debit) Transaction
@TRS_016
Scenario: To check whether amount can to transfered from one debit account to other credit account
Given navigate to CSM application and login with valid credentials
And Click the Transactions flag
Then Click the Maintenance flag on the Transaction
And Enter the code in TRXTypeBox in Maintenance flag