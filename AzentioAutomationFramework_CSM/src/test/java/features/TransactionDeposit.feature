Feature: User login to transaction deposit the cash
@TRS_085
Scenario: Checking Cash Deposit Transaction - Currency Deposit Limit Defined - Warn User if Limit Exceeds UnChecked - Amount (FC) > Limit
Given navigate to CSM application and login with valid credentials
And User_72 Click on Date to Change the Current Date
And User_72 Enter the Date in User Running Date
And User_72 Click on Use Button in Change Running Date Popup
And User_72 Click Ok Button in Information PopUp menu
And User_72 Click on Close Button in Change Running Date Popupss1
And User_72 Click on Technical Details Icon
And User_72 Click Clear Cache in Technical Details Icon
And User_72 Click Ok Button Under Information PopUp Menusss
And User_72 Click on Transactions under CSM application
And User_72 Click on Maintenance under Transactions
And User_72 Enter TRX Type in Maintenance Screen
And User_72 Enter the Branch Code in debit Ac in Maintenance Screen
And User_72 Enter Currency Code in debit Ac in Maintenance Screen
And User_72 Enter GL Code in debit Ac in Maintenance Screen
And User_72 Enter CIF Code in debit Ac in Maintenance Screen
And User_72 Enter Serial in debit Ac in Maintenance Screen
And User_72 Click Ok Button in Warning PopUp Menu
And User_72 Enter the Currency in Maintenance Screen
And User_72 Enter the Amount in Maintenance Screen
And User_72 Click Save Button in Maintenance Screen
And User_72 Get the Transaction No in Success PopUo Menu
And User_72 Click Ok Button in Success PopUp Menu
And User_72 Click on Approve Screen under Transactions
And User_72 Enter the Transaction No in Approve Screen
And User_72 Double Click on the Transaction No
And User_72 Click on Approve Button for approve the Transaction
And User_72 Click on Ok Button in Success PopUp Menu for Approve Transcation
And User_72 Click on Maintenance under Transactions
And User_72 Click Ok Button in Warning PopUp to go back to Maintenance
And User_72 Click on Search Button in Maintenance Screen
And User_72 Enter the Transaction No in Search Box
And User_72 Double Click on the Searched Transaction No in Search Box
And User_72 Click on Booked Entries in Maintenance Screen


@TRS_086
Scenario: Checking Cash Depsoit Transaction - Currency Deposit Limit Defined - Warn User if Limit Exceeds Checked - Amount > Limit - Specifc vs. General
Given navigate to CSM application and login with valid credentials
And User_72 Click on Date to Change the Current Date
And User_72 Enter the Date in User Running Date
And User_72 Click on Use Button in Change Running Date Popup
And User_72 Click Ok Button in Information PopUp menu
And User_72 Click on Close Button in Change Running Date Popupss1
And User_72 Click on Technical Details Icon
And User_72 Click Clear Cache in Technical Details Icon
And User_72 Click Ok Button Under Information PopUp Menu
And User_72 Click on Transactions under CSM application
And User_72 Click on Maintenance under Transactions
And User_72 Enter TRX Type in Maintenance Screen
And User_72 Enter the Branch Code in debit Ac in Maintenance Screen
And User_72 Enter Currency Code in debit Ac in Maintenance Screen
And User_72 Enter GL Code in debit Ac in Maintenance Screen
And User_72 Enter CIF Code in debit Ac in Maintenance Screen
And User_72 Enter Serial in debit Ac in Maintenance Screen
And User_72 Click Ok Button in Warning PopUp Menu
And User_72 Enter the Currency in Maintenance Screen
And User_72 Enter the Amount in Maintenance Screen
And User_72 Click Save Button in Maintenance Screen
And User_72 Get the Transaction No in Success PopUo Menu
And User_72 Click Ok Button in Success PopUp Menu
And User_72 Click on Approve Screen under Transactions
And User_72 Enter the Transaction No in Approve Screen
And User_72 Double Click on the Transaction No
And User_72 Click on Approve Button for approve the Transaction
And User_72 Click on Ok Button in Success PopUp Menu for Approve Transcation
And User_72 Click on Maintenance under Transactions
And User_72 Click Ok Button in Warning PopUp to go back to Maintenance
And User_72 Click on Search Button in Maintenance Screen
And User_72 Enter the Transaction No in Search Box
And User_72 Double Click on the Searched Transaction No in Search Box
And User_72 Click on Booked Entries in Maintenance Screen