Feature: Checking the functionality of transactions

@TRS_0012
Scenario: Transactions -> Checking Single transfer(Main Debt) - Intraday + Booked Enteries + Balance updates

Given User Navigate to CSM application and login with valid credentials
And User Click on Date to Change the Current Date
And User Enter the Date in User Running Date
And User Click on Use Button in Change Running Date Popup
And User Click Ok Button in Information PopUp menu
And User Click on Close Button in Change Running Date Popup
And User Click on Technical Details Icon
And User Click Clear Cache in Technical Details Icon
And User Click Ok Button Under Information PopUp Menu
And User Click on Transactions under CSM application
And User Click on Maintenance under Transactions
And User enters the transaction type
And User enters the GL code for debit account
And User Click Ok Button in Warning PopUp Menu
And User Enter the Currency in Maintenance Screen
And User Enter the Amount for Debit in Maintenance Screen
And User enters the GL code for credit account
And User Click Ok Button in Warning PopUp Menu
And User Click Save Button in Maintenance Screen
And User Get the Transaction No in Success PopUo Menus
And User Click Ok Button in Success PopUp Menu
And User Click on Approve Screen under Transactions
And User Enter the Transaction No in Approve Screens
And User Double Click on the Transaction No
And User Click on Approve Button for approve the Transaction
And User Click on Ok Button in Success PopUp Menu for Approve Transcation
And User Click on Maintenance under Transactions
And User Click Ok Button in Warning PopUp to go back to Maintenance
And User Click on Search Button in Maintenance Screen
And User Enter the Transaction No in Search Boxs
And User Double Click on the Searched Transaction No in Search Box
And User Click on Booked Entries in Maintenance Screen
#Check Booked Entries
And User Click on Queries under CSM application
And User Click on Statement Of Accounts in Queries under CSM application
And User Click on By Trade Date under Statement Of Accounts Sub Menu
And User Enter the GL Code in Account under By Trade Date Screens
And User Enter From Date in Periodicity Of Statement under By Trade Date Screen
And User Enter To Date in Periodicity Of Statement under By Trade Date Screen
And User Click Retrieve Button under By Trade Date Screen
#Get OP No value in excel data
#And User Enter the Op No in By Trade Date Screen
#Then User Validate the Debit Amount in By Trade Date Screen
And User Click on By Trade Date under Statement Of Accounts Sub Menu
And User Click Ok Button in Warning PopUp to go back to Maintenance
And User enters the GL code for the second account
And User Click Retrieve Button under By Trade Date Screen

@TRS_0013
Scenario: Transactions -> Checking Single Transfer (Main Credit) Intra Transaction - Booked Entries + Balance Updates

Given User Navigate to CSM application and login with valid credentials
And User Click on Date to Change the Current Date
And User Enter the Date in User Running Date
And User Click on Use Button in Change Running Date Popup
And User Click Ok Button in Information PopUp menu
And User Click on Close Button in Change Running Date Popup
And User Click on Technical Details Icon
And User Click Clear Cache in Technical Details Icon
And User Click Ok Button Under Information PopUp Menu
And User Click on Transactions under CSM application
And User Click on Maintenance under Transactions
And User enters the Main credit transaction type
And User enters the GL code for debit account
And User Click Ok Button in Warning PopUp Menu
And User Enter the Currency in Maintenance Screen
And User Enter the Amount for Debit in Maintenance Screen
And User enters the GL code for credit account
And User Click Ok Button in Warning PopUp Menu
And User Click Save Button in Maintenance Screen
And User Get the Transaction No in Success PopUo Menus
And User Click Ok Button in Success PopUp Menu
And User Click on Approve Screen under Transactions
And User Enter the Transaction No in Approve Screens
And User Double Click on the Transaction No
And User Click on Approve Button for approve the Transaction
And User Click on Ok Button in Success PopUp Menu for Approve Transcation
And User Click on Maintenance under Transactions
And User Click Ok Button in Warning PopUp to go back to Maintenance
And User Click on Search Button in Maintenance Screen
And User Enter the Transaction No in Search Boxs
And User Double Click on the Searched Transaction No in Search Box
And User Click on Booked Entries in Maintenance Screen
#Check Booked Entries
And User Click on Queries under CSM application
And User Click on Statement Of Accounts in Queries under CSM application
And User Click on By Trade Date under Statement Of Accounts Sub Menu
And User Enter the GL Code in Account under By Trade Date Screens
And User Enter From Date in Periodicity Of Statement under By Trade Date Screen
And User Enter To Date in Periodicity Of Statement under By Trade Date Screen
And User Click Retrieve Button under By Trade Date Screen
#Get OP No value in excel data
#And User Enter the Op No in By Trade Date Screen
#Then User Validate the Debit Amount in By Trade Date Screen
And User Click on By Trade Date under Statement Of Accounts Sub Menu
And User Click Ok Button in Warning PopUp to go back to Maintenance
And User enters the GL code for the second account
And User Click Retrieve Button under By Trade Date Screen


@TRS_051
Scenario: Transactions -> Checking Multi Transfer (Main Credit) Transaction - Interbranch

Given User Navigate to CSM application and login with valid credentials
And User Click on Date to Change the Current Date
And User Enters the Date in User Running Date
And User Click on Use Button in Change Running Date Popup
And User Click Ok Button in Information PopUp menu
And User Click on Close Button in Change Running Date Popup
And User Click on Technical Details Icon
And User Click Clear Cache in Technical Details Icon
And User Click Ok Button Under Information PopUp Menu
And User Click on Transactions under CSM application
And User Click on Maintenance under Transactions
And User enters the Multi Transfer Main Credit Transaction Interbranch transaction type
And User Enter the Branch Code in Credit Ac in Maintenance Screen for TRS_0051
And User Enter Currency Code in Credit Ac in Maintenance Screen for TRS_0051
And User Enter GL Code in Credit Ac in Maintenance Screen for TRS_0051
And User Enter CIF Code in Credit Ac in Maintenance Screen for TRS_0051
And User Enter Serial in Credit Ac in Maintenance Screen for TRS_0051
And User Click Ok Button in Warning PopUp Menu
And User Enter the Currency in Maintenance Screen for TRS_0051
And User Enter the Amount in Maintenance Screen for TRS_0051
And User click on the account details button
And User clicks on the plus icon to add the account details
And User double clicks on the branch code in Ac1 in add account details
And User Enter the Branch Code in Debit Ac1 in Maintenance Screen for TRS_0051
#And User Enter Currency Code in Debit Ac1 in Maintenance Screen for TRS_0051
And User Enter GL Code in Debit Ac1 in Maintenance Screen for TRS_0051
And User Enter CIF Code in Debit Ac1 in Maintenance Screen for TRS_0051
And User Enter Serial in Debit Ac1 in Maintenance Screen for TRS_0051
And User Click Ok Button in Warning PopUp Menu
And User Enter the debit amount for Ac1 for TRS_0051
And User clicks on the plus icon to add the account details
And User double clicks on the branch code in Ac2 in add account details
And User double clicks on the branch code in Ac2 in add account details
And User Enter the Branch Code in Debit Ac2 in Maintenance Screen for TRS_0051
#And User Enter Currency Code in Debit Ac2 in Maintenance Screen for TRS_0051
And User Enter GL Code in Debit Ac2 in Maintenance Screen for TRS_0051
And User Enter CIF Code in Debit Ac2 in Maintenance Screen for TRS_0051
And User Enter Serial in Debit Ac2 in Maintenance Screen for TRS_0051
And User Click Ok Button in Warning PopUp Menu
And User Enter the debit amount for Ac2 for TRS_0051
And User clicks on the ok button after adding the debit account details
And User Click Save Button in Maintenance Screen
And User Get the Transaction No in Success PopUo Menus
And User Click Ok Button in Success PopUp Menu
And User Click on Approve Screen under Transactions
And User Enter the Transaction No in Approve Screens
And User Double Click on the Transaction No
And User Click on Approve Button for approve the Transaction
And User Click on Ok Button in Success PopUp Menu for Approve Transcation
And User Click on Maintenance under Transactions
And User Click Ok Button in Warning PopUp to go back to Maintenance
And User Click on Search Button in Maintenance Screen
And User Enter the Transaction No in Search Boxs
And User Double Click on the Searched Transaction No in Search Box
And User Click on Booked Entries in Maintenance Screen



@TRS_0054
Scenario: Transactions -> Checking Cash Deposit Transaction - Booked Entries + Balance Updates

Given User Navigate to CSM application and login with valid credentials
And User Click on Date to Change the Current Date
And User Enter the Date in User Running Date
And User Click on Use Button in Change Running Date Popup
And User Click Ok Button in Information PopUp menu
And User Click on Close Button in Change Running Date Popup
And User Click on Technical Details Icon
And User Click Clear Cache in Technical Details Icon
And User Click Ok Button Under Information PopUp Menu
And User Click on Transactions under CSM application
And User Click on Maintenance under Transactions
And User enters the transaction type for deposit account with AC CY and Trx CY must be same
And User enters the GL code for credit account for deposit account with AC CY and Trx CY must be same
And User validate the currency code for the transaction currency and the account currency
And User Click Ok Button in Warning PopUp Menu
And User Enter the Amount for Debit in Maintenance Screen
And User Click Save Button in Maintenance Screens
And User Get the Transaction No in Success PopUo Menus
And User Click Ok Button in Success PopUp Menu
And User Click on Approve Screen under Transactions
And User Enter the Transaction No in Approve Screens
And User Double Click on the Transaction No
And User Click on Approve Button for approve the Transaction
And User Click on Ok Button in Success PopUp Menu for Approve Transcation




@TRS_0055
Scenario: Transactions -> Checking Single Transfer (Main Debit) Intra Transaction - Booked Entries + Balance Updates

Given User Navigate to CSM application and login with valid credentials
And User Click on Date to Change the Current Date
And User Enter the Date in User Running Date
And User Click on Use Button in Change Running Date Popup
And User Click Ok Button in Information PopUp menu
And User Click on Close Button in Change Running Date Popup
And User Click on Technical Details Icon
And User Click Clear Cache in Technical Details Icon
And User Click Ok Button Under Information PopUp Menu
And User Click on Transactions under CSM application
And User Click on Maintenance under Transactions
And User enters the transaction type for main debt account with AC CY and Trx CY must be same
And User enters the GL code for debit account
And User Click Ok Button in Warning PopUp Menu
And User validate the currency code for the transaction currency and the account currency
And User Enter the Amount for Debit in Maintenance Screen
And User enters the GL code for credit account
And User Click Save Button in Maintenance Screens
And User Get the Transaction No in Success PopUo Menus
And User Click Ok Button in Success PopUp Menu
And User Click on Approve Screen under Transactions
And User Enter the Transaction No in Approve Screens
And User Double Click on the Transaction No
And User Click on Approve Button for approve the Transaction
And User Click on Ok Button in Success PopUp Menu for Approve Transcation
And User Click on Maintenance under Transactions
And User Click Ok Button in Warning PopUp to go back to Maintenance
And User Click on Search Button in Maintenance Screen
And User Enter the Transaction No in Search Boxs
And User Double Click on the Searched Transaction No in Search Box
And User Click on Booked Entries in Maintenance Screen
#Check Booked Entries
And User Click on Queries under CSM application
And User Click on Statement Of Accounts in Queries under CSM application
And User Click on By Trade Date under Statement Of Accounts Sub Menu
And User Enter the GL Code in Account under By Trade Date Screens
And User Enter From Date in Periodicity Of Statement under By Trade Date Screen
And User Enter To Date in Periodicity Of Statement under By Trade Date Screen
And User Click Retrieve Button under By Trade Date Screen
#Get OP No value in excel data
#And User Enter the Op No in By Trade Date Screen
#Then User Validate the Debit Amount in By Trade Date Screen
And User Click on By Trade Date under Statement Of Accounts Sub Menu
And User Click Ok Button in Warning PopUp to go back to Maintenance
And User enters the GL code for the second account
And User Click Retrieve Button under By Trade Date Screen



@TRS_0056
Scenario: Transactions -> Checking Cash Deposit Transaction - Booked Entries + Balance Updates

Given User Navigate to CSM application and login with valid credentials
And User Click on Date to Change the Current Date
And User Enter the Date in User Running Date
And User Click on Use Button in Change Running Date Popup
And User Click Ok Button in Information PopUp menu
And User Click on Close Button in Change Running Date Popup
And User Click on Technical Details Icon
And User Click Clear Cache in Technical Details Icon
And User Click Ok Button Under Information PopUp Menu
And User Click on Transactions under CSM application
And User Click on Maintenance under Transactions
And User enters the transaction type for deposit account with AC CY equal to Trx CY
And User enters the GL code for credit account for deposit account with AC CY equal to Trx CY
And User validate the currency code for the transaction currency and the account currency
And User Click Ok Button in Warning PopUp Menu
And User Enter the Amount for Debit in Maintenance Screen
And User Click Save Button in Maintenance Screens
And User Get the Transaction No in Success PopUo Menus
And User Click Ok Button in Success PopUp Menu
And User Click on Approve Screen under Transactions
And User Enter the Transaction No in Approve Screens
And User Double Click on the Transaction No
And User Click on Approve Button for approve the Transaction
And User Click on Ok Button in Success PopUp Menu for Approve Transcation

@TRS_098
Scenario: Transactions -> Checking Cash Withdrawal Transaction - CIF Type Withdrawal Limit Defined - Warn User if Limit Exceeds Checked - Proceed if Limit Exceeds Checked - Amount > Limit

Given User Navigate to CSM application and login with valid credentials
And User Click on Date to Change the Current Date
And User Enters the Date in User Running Date
And User Click on Use Button in Change Running Date Popup
And User Click Ok Button in Information PopUp menu
And User Click on Close Button in Change Running Date Popup
And User Click on Technical Details Icon
And User Click Clear Cache in Technical Details Icon
And User Click Ok Button Under Information PopUp Menu
And User Click on Transactions under CSM application
And User Click on Maintenance under Transactions















