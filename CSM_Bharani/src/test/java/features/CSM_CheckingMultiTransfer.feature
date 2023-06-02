Feature: Checking Multi Transfer (Main Debit) Transaction
@TRS_016
Scenario: To check whether amount can to transfered from one debit account to other credit account
Given navigate to CSM application and login with valid credentials
And User Click on Date to Change the Current Date
And User Enter the Date in User Running Date
And User Click on Use Button in Change Running Date Popup
And User Click Ok Button in Information PopUp menu
And User Click on Close Button in Change Running Date Popup
And User Click on Technical Details Icon
And User Click Clear Cache in Technical Details Icon
And User Click Ok Button Under Information PopUp Menu
And Click the Transactions flag
Then Click the Maintenance flag on the Transaction
And Enter the code in TRXTypeBox in Maintenance flag
Then Enter the Branch code in Branch code Maintenance flag
And Enter the Currency code in Maintenance flag
Then Enter the Gl code in Maintenance flag
And Enter the Cif code in Maintenance flag
Then Click the Ok popup
And Click the Close popup
Then Enter the serial number in Maintenance flag
Then Click the Ok popup
And Click the Close popup
And Enter the currency code flag
Then Enter the debit amount in Maintenance flag
Then Click the Ok popup
And Click the Account details flag
Then Click the Add account details icon
And Click the first row
Then Enter the branch code in account details
And Enter the GL code in account details
Then Enter the Cif code in account details
And Enter the serial number in account details
Then Click the Ok popup
And Enter the debit amount for first account
Then Click the Ok popup
Then Enter the first instruction box
And Enter the second instruction box
Then Click the Add account details icon
And Click the Second Row
Then Enter the second branch code
And Enter the second GL code
Then Enter the second cif number
And Enter the second serial number
Then Click the Ok popup
And Enter debit amount for second account
Then Click the Ok popup
Then Enter the first instruction box for second account
And Enter the second instruction box for second account
Then Click the Ok popup
And Save the transaction