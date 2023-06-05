Feature: User login to transaction deposit the cash
@TRS_085
Scenario: Checking Cash Deposit Transaction - Currency Deposit Limit Defined - Warn User if Limit Exceeds UnChecked - Amount (FC) > Limit
Given navigate to CSM application and login with valid credentials
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
And User Enter TRX Type in Maintenance Screen
And User Enter the Branch Code in debit Ac in Maintenance Screen
And User Enter Currency Code in debit Ac in Maintenance Screen
And User Enter GL Code in debit Ac in Maintenance Screen
And User Enter CIF Code in debit Ac in Maintenance Screen
And User Enter Serial in debit Ac in Maintenance Screen
And User Click Ok Button in Warning PopUp Menu
And User Click Ok Button in Warning PopUp Menu
And User Enter the Currency in Maintenance Screen
And User Enter the Amount in Maintenance Screen
And User Click Save Button in Maintenance Screen
And User Get the Transaction No in Success PopUo Menu
And User Click Ok Button in Success PopUp Menu
And User Click on Approve Screen under Transactions
And User Enter the Transaction No in Approve Screen
And User Double Click on the Transaction No
And User Click on Approve Button for approve the Transaction
And User Click on Ok Button in Success PopUp Menu for Approve Transcation
And User Click on Maintenance under Transactions
And User Click Ok Button in Warning PopUp to go back to Maintenance
And User Click on Search Button in Maintenance Screen
And User Enter the Transaction No in Search Box
And User Double Click on the Searched Transaction No in Search Box
And User Click on Booked Entries in Maintenance Screen


@TRS_086
Scenario: Checking Cash Depsoit Transaction - Currency Deposit Limit Defined - Warn User if Limit Exceeds Checked - Amount > Limit - Specifc vs. General
Given navigate to CSM application and login with valid credentials
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
And User Enter TRX Type in Maintenance Screen
And User Enter the Branch Code in debit Ac in Maintenance Screen
And User Enter Currency Code in debit Ac in Maintenance Screen
And User Enter GL Code in debit Ac in Maintenance Screen
And User Enter CIF Code in debit Ac in Maintenance Screen
And User Enter Serial in debit Ac in Maintenance Screen
And User Click Ok Button in Warning PopUp Menu
And User Click Ok Button in Warning PopUp Menu
And User Enter the Currency in Maintenance Screen
And User Enter the Amount in Maintenance Screen
And User Click Save Button in Maintenance Screen
And User Get the Transaction No in Success PopUo Menu
And User Click Ok Button in Success PopUp Menu
And User Click on Approve Screen under Transactions
And User Enter the Transaction No in Approve Screen
And User Double Click on the Transaction No
And User Click on Approve Button for approve the Transaction
And User Click on Ok Button in Success PopUp Menu for Approve Transcation
And User Click on Maintenance under Transactions
And User Click Ok Button in Warning PopUp to go back to Maintenance
And User Click on Search Button in Maintenance Screen
And User Enter the Transaction No in Search Box
And User Double Click on the Searched Transaction No in Search Box
And User Click on Booked Entries in Maintenance Screen