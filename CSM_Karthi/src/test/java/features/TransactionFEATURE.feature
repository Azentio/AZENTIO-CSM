Feature: Checking the functionality of transactions

@TRS_188
Scenario: Transactions -> Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account - GL Charges - General (CIF2) - Account

#Pre-requisties
Given  navigate to CSM param application and login with valid credentials
And user get the data from the excel sheet for the test case id TRS_188

And user click on the parameters menu under the menu options in the CSM params application
And user click on the system paramters under the parameters menu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the GL charges button
And user click on the any existing added data in the GL charges and click on the delete button to delete it
And user click on the plus button to add the GL code under the GL charges
And user enters the GL code under the GL code column
And user enters the charge scheme code under the Charge Schema Details column
And user selects all from the dropdown list before the cash account column
And user selects account option from the cash account column
And user selects the Authorize from the action column
And user click on the OK button to close the GL charges popup menu
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the approve button to approve the changes
And user click on Log Out icon to log out from the CSM Params application

#Test case execution
Given navigate to CSM application and login with valid credentials

And user click on Transactions under CSM application in the CSM core application
And user click on Maintenance under Transactions in the CSM core application
And user enters the transaction type 
And user Enter the Branch Code for AC1 in Maintenance Screen 
And user Enter Currency Code for AC1 in Maintenance Screen 
And user Enter GL Code for AC1 in Maintenance Screen 
And user Enter CIF Code for AC1 in Maintenance Screen 
And user Enter Serial for AC1 in Maintenance Screen 
And user click Ok Button in Warning PopUp Menu
And user Enter the Currency in Maintenance Screen 
And user Enter the Amount in Maintenance Screen 
#And user Enter the Branch Code for AC2 in Maintenance Screen 
And user Enter Currency Code for AC2 in Maintenance Screen 
And user Enter GL Code for AC2 in Maintenance Screen 
And user Enter CIF Code for AC2 in Maintenance Screen 
And user Enter Serial for AC2 in Maintenance Screen 
And user click Ok Button in Warning PopUp Menu
And user click Save Button in Maintenance Screen
And user Get the Transaction No in Success PopUo Menu
And user click Ok Button in Success PopUp Menu
And user click on Approve Screen under Transactions menu
And user Enter the Transaction No in Approve Screens
And user Double click on the Transaction No
And user click on Approve Button for approve the Transaction
And user click on Ok Button in Success PopUp Menu for Approve Transcation
And user click on Maintenance under Transactions
And user click Ok Button in Warning PopUp to go back to Maintenance
And user click on Search Button in Maintenance Screen
And user Enter the Transaction No in Search Boxs
And user Double click on the Searched Transaction No in Search Box
And user click on Booked Entries in Maintenance Screen



#Post requisties
Given  navigate to CSM param application and login with valid credentials
And user get the data from the excel sheet for the test case id TRS_188

And user click on the parameters menu under the menu options in the CSM params application
And user click on the system paramters under the parameters menu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the GL charges button
And user click on the any existing added data in the GL charges and click on the delete button to delete it
And user click on the OK button to close the GL charges popup menu
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the approve button to approve the changes

@TRS_189
Scenario: Transactions -> Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account - GL Charges - Specific Vs. General - Account


#Pre-requisties
Given  navigate to CSM param application and login with valid credentials
And user get the data from the excel sheet for the test case id TRS_189
And user click on the parameters menu under the menu options in the CSM params application
And user click on the system paramters under the parameters menu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the GL charges button
And user click on the any existing added data in the GL charges and click on the delete button to delete it
And user click on the plus button to add the GL code under the GL charges
And user enters the GL code under the GL code column
And user enters the charge scheme code under the Charge Schema Details column
And user selects all from the dropdown list before the cash account column
And user selects account option from the cash account column
And user selects the Authorize from the action column
And user click on the plus button to add the GL code under the GL charges
And user enters the GL code under the GL code column to link charge code 2
And user enters the charge scheme code under the Charge Schema Details column to link charge code 2
And user selects all from the dropdown list before the cash account column to link charge code 2
And user selects account option from the cash account column to link charge code 2
And user selects the Authorize from the action column to link charge code 2
And user click or check the Transfer Type is Intra Bank
And user click or check the radio button is Main Acc is Debit 
And user click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu
And user click on the OK button to close the GL charges popup menu
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the approve button to approve the changes
#And user click on Log Out icon to log out from the CSM Params application

#Test case execution
Given navigate to CSM application and login with valid credentials
And user click on Date to Change the Current Date in the CSM core application
And user Enters the Date in user Running Date in the CSM core application
And user click on Use Button in Change Running Date Popup in the CSM core application
And user click Ok Button in Information PopUp menu in the CSM core application
And user click on Close Button in Change Running Date Popup in the CSM core application
And user click on Technical Details Icon in the CSM core application
And user click Clear Cache in Technical Details Icon in the CSM core application
And user click Ok Button Under Information PopUp Menu in the CSM core application
And user click on Transactions under CSM application in the CSM core application
And user click on Maintenance under Transactions in the CSM core application
And user enters the transaction type 
And user Enter the Branch Code for AC1 in Maintenance Screen 
And user Enter Currency Code for AC1 in Maintenance Screen 
And user Enter GL Code for AC1 in Maintenance Screen 
And user Enter CIF Code for AC1 in Maintenance Screen 
And user Enter Serial for AC1 in Maintenance Screen 
And user click Ok Button in Warning PopUp Menu
And user Enter the Currency in Maintenance Screen 
And user Enter the Amount in Maintenance Screen 
And user Enter the Branch Code for AC2 in Maintenance Screen 
And user Enter Currency Code for AC2 in Maintenance Screen 
And user Enter GL Code for AC2 in Maintenance Screen 
And user Enter CIF Code for AC2 in Maintenance Screen 
And user Enter Serial for AC2 in Maintenance Screen 
And user click Ok Button in Warning PopUp Menu
And user click Save Button in Maintenance Screen
And user Get the Transaction No in Success PopUo Menu
And user click Ok Button in Success PopUp Menu
And user click on Approve Screen under Transactions menu
And user Enter the Transaction No in Approve Screens
And user Double click on the Transaction No
And user click on Approve Button for approve the Transaction
And user click on Ok Button in Success PopUp Menu for Approve Transcation
And user click on Maintenance under Transactions
And user click Ok Button in Warning PopUp to go back to Maintenance
And user click on Search Button in Maintenance Screen
And user Enter the Transaction No in Search Boxs
And user Double click on the Searched Transaction No in Search Box
And user click on Booked Entries in Maintenance Screen
And user click on Maintenance under Transactions
And user click Ok Button in Warning PopUp to go back to Maintenance
And user enters the transaction type 
And user Enter the Branch Code for AC1 in Maintenance Screen 
And user Enter Currency Code for AC1 in Maintenance Screen 
And user Enter GL Code for AC1 in Maintenance Screen 
And user Enter CIF Code for AC1 in Maintenance Screen 
And user Enter Serial for AC1 in Maintenance Screen 
And user click Ok Button in Warning PopUp Menu
And user Enter the Currency in Maintenance Screen 
And user Enter the Amount in Maintenance Screen 
And user Enter the Branch Code for AC2 in Maintenance Screen 
And user Enter Currency Code for AC2 in Maintenance Screen 
And user Enter GL Code for AC2 in Maintenance Screen 
And user Enter CIF Code for AC2 in Maintenance Screen 
And user Enter Serial for AC2 in Maintenance Screen 
And user click Ok Button in Warning PopUp Menu
And user click Save Button in Maintenance Screen
And user Get the Transaction No in Success PopUo Menu
And user click Ok Button in Success PopUp Menu
And user click on Approve Screen under Transactions menu
And user Enter the Transaction No in Approve Screens
And user Double click on the Transaction No
And user click on Approve Button for approve the Transaction
And user click on Ok Button in Success PopUp Menu for Approve Transcation
And user click on Maintenance under Transactions
And user click Ok Button in Warning PopUp to go back to Maintenance
And user click on Search Button in Maintenance Screen
And user Enter the Transaction No in Search Boxs
And user Double click on the Searched Transaction No in Search Box
And user click on Booked Entries in Maintenance Screen



#Post requisties
Given  navigate to CSM param application and login with valid credentials
And user click on the parameters menu under the menu options in the CSM params application
And user click on the system paramters under the parameters menu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the GL charges button
And user click on the any existing added data in the GL charges and click on the delete button to delete it
And user click on the any existing added data in the GL charges and click on the delete button to delete it
And user click on the OK button to close the GL charges popup menu
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the approve button to approve the changes
