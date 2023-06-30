Feature: Checking the functionality of transactions

@TRS_188
Scenario: Transactions -> Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account - GL Charges - General (CIF2) - Account

#Pre-requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_188
And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the GL charges button
And user_614 click on the any existing added data in the GL charges and click on the delete button to delete it
And user_614 click on the plus button to add the GL code under the GL charges
And user_614 enters the GL code under the GL code column
And user_614 enters the charge scheme code under the Charge Schema Details column
And user_614 selects all from the dropdown list before the cash account column
And user_614 selects account option from the cash account column
And user_614 selects the Authorize from the action column
And user_614 click on the OK button to close the GL charges popup menu
And user_614 click or check the Transfer Type is Intra Bank
And user_614 click or check the radio button is Main Acc is Debit 
And user_614 click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details in approve screen
And user_614 click on the approve button to approve the changes
And user_614 click on Log Out icon to log out from the CSM Params application


#Test case execution
And user_614 get the data from the excel sheet for the test case id TRS_188
Given user_614 Navigate to CSM core application and login with valid credentials
 And user_614 click on Date to Change the Current Date in the CSM core application
And user_614 Enters the Date in user_614 Running Date in the CSM core application
And user_614 click on Use Button in Change Running Date Popup in the CSM core application
And user_614 click Ok Button in Information PopUp menu in the CSM core application
And user_614 click on Close Button in Change Running Date Popup in the CSM core application
And user_614 click on Technical Details Icon in the CSM core application
And user_614 click Clear Cache in Technical Details Icon in the CSM core application
And user_614 click Ok Button Under Information PopUp Menu in the CSM core application
And user_614 click on Transactions under CSM application in the CSM core application
And user_614 click on Maintenance under Transactions in the CSM core application
And user_614 enters the transaction type
#And user_614 Enter the Branch Code for AC1 in Maintenance Screen
And user_614 Enter Currency Code for AC1 in Maintenance Screen
And user_614 Enter GL Code for AC1 in Maintenance Screen
And user_614 Enter CIF Code for AC1 in Maintenance Screen
And user_614 Enter Serial for AC1 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 Enter the Currency in Maintenance Screen
And user_614 Enter the Amount in Maintenance Screen
#And user_614 Enter the Branch Code for AC2 in Maintenance Screen
#And user_614 Enter Currency Code for AC2 in Maintenance Screen
And user_614 Enter GL Code for AC2 in Maintenance Screen
And user_614 Enter CIF Code for AC2 in Maintenance Screen
And user_614 Enter Serial for AC2 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 click Save Button in Maintenance Screen
And user_614 Get the Transaction No in Success PopUo Menu
And user_614 click Ok Button in Success PopUp Menu
And user_614 click on Approve Screen under Transactions menu
And user_614 Enter the Transaction No in Approve Screens
And user_614 Double click on the Transaction No
And user_614 click on Approve Button for approve the Transaction
And user_614 click on Ok Button in Success PopUp Menu for Approve Transcation
And user_614 click on Maintenance under Transactions
And user_614 click Ok Button in Warning PopUp to go back to Maintenance
And user_614 click on Search Button in Maintenance Screen
And user_614 Enter the Transaction No in Search Boxs
And user_614 Double click on the Searched Transaction No in Search Box
And user_614 click on Booked Entries in Maintenance Screen


#Post requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_188
And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the GL charges button
And user_614 click on the any existing added data in the GL charges and click on the delete button to delete it
And user_614 click on the OK button to close the GL charges popup menu
And user_614 click on the dummy check both to save the changes
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes


#@TRS_189
Scenario: Transactions -> Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account - GL Charges - Specific Vs. General - Account


#Pre-requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_189

And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the GL charges button
And user_614 click on the any existing added data in the GL charges and click on the delete button to delete it
And user_614 click on the plus button to add the GL code under the GL charges
And user_614 enters the GL code under the CIF code column1
And user_614 enters the charge scheme code under the Charge Schema Details column
And user_614 selects all from the dropdown list before the cash account column under the GL Charges column
And user_614 click on the plus button to add the GL code under the GL charges
And user_614 enters the GL code under the CIF code column1_1
And user_614 enters the charge scheme code under the Charge Schema Details column_1
And user_614 selects all from the dropdown list before the cash account column under the GL Charges column
And user_614 click on the OK button to close the GL charges popup menu
And user_614 click or check the Transfer Type is Intra Bank
And user_614 click or check the radio button is Main Acc is Debit 
And user_614 click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes
And user_614 click on Log Out icon to log out from the CSM Params application

@TRS_189
Scenario: Transactions -> Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account - GL Charges - Specific Vs. General - Account

#Test case execution
And user_614 get the data from the excel sheet for the test case id TRS_189
Given user_614 Navigate to CSM core application and login with valid credentials
And user_614 click on Date to Change the Current Date in the CSM core application
And user_614 Enters the Date in user_614 Running Date in the CSM core application
And user_614 click on Use Button in Change Running Date Popup in the CSM core application
And user_614 click Ok Button in Information PopUp menu in the CSM core application
And user_614 click on Close Button in Change Running Date Popup in the CSM core application
And user_614 click on Technical Details Icon in the CSM core application
And user_614 click Clear Cache in Technical Details Icon in the CSM core application
And user_614 click Ok Button Under Information PopUp Menu in the CSM core application
And user_614 click on Transactions under CSM application in the CSM core application
And user_614 click on Maintenance under Transactions in the CSM core application
And user_614 enters the transaction type
And user_614 Enter the Branch Code for AC1 in Maintenance Screen
And user_614 Enter Currency Code for AC1 in Maintenance Screen
And user_614 Enter GL Code for AC1 in Maintenance Screen
And user_614 Enter CIF Code for AC1 in Maintenance Screen
And user_614 Enter Serial for AC1 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 Enter the Currency in Maintenance Screen
And user_614 Enter the Amount in Maintenance Screen
#And user_614 Enter the Branch Code for AC2 in Maintenance Screen
#And user_614 Enter Currency Code for AC2 in Maintenance Screen
And user_614 Enter GL Code for AC2 in Maintenance Screen
And user_614 Enter CIF Code for AC2 in Maintenance Screen
And user_614 Enter Serial for AC2 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 click Save Button in Maintenance Screen
And user_614 Get the Transaction No in Success PopUo Menu
And user_614 click Ok Button in Success PopUp Menu
And user_614 click on Approve Screen under Transactions menu
And user_614 Enter the Transaction No in Approve Screens
And user_614 Double click on the Transaction No
And user_614 click on Approve Button for approve the Transaction
And user_614 click on Ok Button in Success PopUp Menu for Approve Transcation
And user_614 click on Maintenance under Transactions
And user_614 click Ok Button in Warning PopUp to go back to Maintenance
And user_614 click on Search Button in Maintenance Screen
And user_614 Enter the Transaction No in Search Boxs
And user_614 Double click on the Searched Transaction No in Search Box
And user_614 click on Booked Entries in Maintenance Screen
And user_614 click on Maintenance under Transactions
And user_614 click Ok Button in Warning PopUp to go back to Maintenance
And user_614 enters the transaction type
#And user_614 Enter the Branch Code for AC1_01 in Maintenance Screen
And user_614 Enter Currency Code for AC1_01 in Maintenance Screen
And user_614 Enter GL Code for AC1_01 in Maintenance Screen
And user_614 Enter CIF Code for AC1_01 in Maintenance Screen
And user_614 Enter Serial for AC1_01 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 Enter the Currency in Maintenance Screen
And user_614 Enter the Amount in Maintenance Screen
#And user_614 Enter the Branch Code for AC2_01 in Maintenance Screen
#And user_614 Enter Currency Code for AC2_01 in Maintenance Screen
And user_614 Enter GL Code for AC2_01 in Maintenance Screen
And user_614 Enter CIF Code for AC2_01 in Maintenance Screen
And user_614 Enter Serial for AC2_01 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 click Save Button in Maintenance Screen
And user_614 Get the Transaction No in Success PopUo Menu
And user_614 click Ok Button in Success PopUp Menu
And user_614 click on Approve Screen under Transactions menu
And user_614 click Ok Button in Warning PopUp to go back to Maintenance
And user_614 Enter the Transaction No in Approve Screens
And user_614 Double click on the Transaction No
And user_614 click on Approve Button for approve the Transaction
And user_614 click on Ok Button in Success PopUp Menu for Approve Transcation
And user_614 click on Maintenance under Transactions
And user_614 click Ok Button in Warning PopUp to go back to Maintenance
And user_614 click on Search Button in Maintenance Screen
And user_614 Enter the Transaction No in Search Boxs
And user_614 Double click on the Searched Transaction No in Search Box
And user_614 click on Booked Entries in Maintenance Screen



#Post requisties
Given user_614 Navigate to CSM Params application and login with valid credentials

And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the GL charges button
And user_614 click on the any existing added data in the GL charges and click on the delete button to delete it
And user_614 click on the any existing added data in the GL charges and click on the delete button to delete it
And user_614 click on the OK button to close the GL charges popup menu
And user_614 click on the dummy check both to save the changes
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes


@TRS_190
Scenario: Transactions -> Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account - CIF Priority  Charges - Specific Used - Account

#Pre-requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_190

And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the CIF Priority charges button
And user_614 click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user_614 click on the plus button to add the CIF Priority Charges under the CIF Priority Charges to link the charge code for AC1 
And user_614 enters the CIF priority code under the CIF Priority Charges column
And user_614 enters the charge scheme code under the Charge Schema Details column
And user_614 selects all from the dropdown list before the cash account column under the CIF Priority Charges column
And user_614 selects account option from the cash account column under the CIF Priority Charges column
And user_614 selects the Authorize from the action column under the CIF Priority Charges column
And user_614 click on the OK button to close the CIF Priority Charges popup menu
And user_614 click or check the Transfer Type is Intra Bank
And user_614 click or check the radio button is Main Acc is Debit 
And user_614 click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes
And user_614 click on Log Out icon to log out from the CSM Params application

#Test case execution
Given user_614 Navigate to CSM core application and login with valid credentials
And user_614 click on Date to Change the Current Date in the CSM core application
And user_614 Enters the Date in user_614 Running Date in the CSM core application
And user_614 click on Use Button in Change Running Date Popup in the CSM core application
And user_614 click Ok Button in Information PopUp menu in the CSM core application
And user_614 click on Close Button in Change Running Date Popup in the CSM core application
And user_614 click on Technical Details Icon in the CSM core application
And user_614 click Clear Cache in Technical Details Icon in the CSM core application
And user_614 click Ok Button Under Information PopUp Menu in the CSM core application
And user_614 click on Transactions under CSM application in the CSM core application
And user_614 click on Maintenance under Transactions in the CSM core application
And user_614 enters the transaction type
And user_614 Enter the Branch Code for AC1 in Maintenance Screen
And user_614 Enter Currency Code for AC1 in Maintenance Screen
And user_614 Enter GL Code for AC1 in Maintenance Screen
And user_614 Enter CIF Code for AC1 in Maintenance Screen
And user_614 Enter Serial for AC1 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 Enter the Currency in Maintenance Screen
And user_614 Enter the Amount in Maintenance Screen
#And user_614 Enter the Branch Code for AC2 in Maintenance Screen
#And user_614 Enter Currency Code for AC2 in Maintenance Screen
And user_614 Enter GL Code for AC2 in Maintenance Screen
And user_614 Enter CIF Code for AC2 in Maintenance Screen
And user_614 Enter Serial for AC2 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 click Save Button in Maintenance Screen
And user_614 Get the Transaction No in Success PopUo Menu
And user_614 click Ok Button in Success PopUp Menu
And user_614 click on Approve Screen under Transactions menu
And user_614 Enter the Transaction No in Approve Screens
And user_614 Double click on the Transaction No
And user_614 click on Approve Button for approve the Transaction
And user_614 click on Ok Button in Success PopUp Menu for Approve Transcation
And user_614 click on Maintenance under Transactions
And user_614 click Ok Button in Warning PopUp to go back to Maintenance
And user_614 click on Search Button in Maintenance Screen
And user_614 Enter the Transaction No in Search Boxs
And user_614 Double click on the Searched Transaction No in Search Box
And user_614 click on Booked Entries in Maintenance Screen


#Post requisties
Given user_614 Navigate to CSM Params application and login with valid credentials

And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the CIF Priority charges button
And user_614 click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user_614 click on the OK button to close the CIF Priority Charges popup menu
And user_614 click on the dummy check both to save the changes
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes



@TRS_191
Scenario: Transactions -> Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account - CIF Priority  Charges - Specific NOT Used - Account

#Pre-requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_191

And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the CIF Priority charges button
And user_614 click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user_614 click on the plus button to add the CIF Priority Charges under the CIF Priority Charges to link the charge code for AC2 
And user_614 enters the CIF priority code under the CIF Priority Charges column
And user_614 enters the charge scheme code under the Charge Schema Details column
And user_614 selects all from the dropdown list before the cash account column under the CIF Priority Charges column
And user_614 selects account option from the cash account column under the CIF Priority Charges column
And user_614 selects the Authorize from the action column under the CIF Priority Charges column
And user_614 click on the OK button to close the CIF Priority Charges popup menu
And user_614 click or check the Transfer Type is Intra Bank
And user_614 click or check the radio button is Main Acc is Debit 
And user_614 click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes
And user_614 click on Log Out icon to log out from the CSM Params application

#Test case execution
Given user_614 Navigate to CSM core application and login with valid credentials
And user_614 click on Date to Change the Current Date in the CSM core application
And user_614 Enters the Date in user_614 Running Date in the CSM core application
And user_614 click on Use Button in Change Running Date Popup in the CSM core application
And user_614 click Ok Button in Information PopUp menu in the CSM core application
And user_614 click on Close Button in Change Running Date Popup in the CSM core application
And user_614 click on Technical Details Icon in the CSM core application
And user_614 click Clear Cache in Technical Details Icon in the CSM core application
And user_614 click Ok Button Under Information PopUp Menu in the CSM core application
And user_614 click on Transactions under CSM application in the CSM core application
And user_614 click on Maintenance under Transactions in the CSM core application
And user_614 enters the transaction type
And user_614 Enter the Branch Code for AC1 in Maintenance Screen
And user_614 Enter Currency Code for AC1 in Maintenance Screen
And user_614 Enter GL Code for AC1 in Maintenance Screen
And user_614 Enter CIF Code for AC1 in Maintenance Screen
And user_614 Enter Serial for AC1 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 Enter the Currency in Maintenance Screen
And user_614 Enter the Amount in Maintenance Screen
#And user_614 Enter the Branch Code for AC2 in Maintenance Screen
#And user_614 Enter Currency Code for AC2 in Maintenance Screen
And user_614 Enter GL Code for AC2 in Maintenance Screen
And user_614 Enter CIF Code for AC2 in Maintenance Screen
And user_614 Enter Serial for AC2 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 click Save Button in Maintenance Screen
And user_614 Get the Transaction No in Success PopUo Menu
And user_614 click Ok Button in Success PopUp Menu
And user_614 click on Approve Screen under Transactions menu
And user_614 Enter the Transaction No in Approve Screens
And user_614 Double click on the Transaction No
And user_614 click on Approve Button for approve the Transaction
And user_614 click on Ok Button in Success PopUp Menu for Approve Transcation
And user_614 click on Maintenance under Transactions
And user_614 click Ok Button in Warning PopUp to go back to Maintenance
And user_614 click on Search Button in Maintenance Screen
And user_614 Enter the Transaction No in Search Boxs
And user_614 Double click on the Searched Transaction No in Search Box
And user_614 click on Booked Entries in Maintenance Screen


#Post requisties
Given user_614 Navigate to CSM Params application and login with valid credentials

And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the CIF Priority charges button
And user_614 click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user_614 click on the OK button to close the CIF Priority Charges popup menu
And user_614 click on the dummy check both to save the changes
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes



@TRS_192
Scenario: Transactions -> Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account - CIF Priority  Charges - General (CIF1) - Account

#Pre-requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_192

And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the CIF Priority charges button
And user_614 click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user_614 click on the plus button to add the CIF Priority Charges under the CIF Priority Charges to link the charge code for All account
And user_614 enters the CIF priority code under the CIF Priority Charges column
And user_614 enters the charge scheme code under the Charge Schema Details column
And user_614 selects all from the dropdown list before the cash account column under the CIF Priority Charges column
And user_614 selects account option from the cash account column under the CIF Priority Charges column
And user_614 selects the Authorize from the action column under the CIF Priority Charges column
And user_614 click on the OK button to close the CIF Priority Charges popup menu
And user_614 click or check the Transfer Type is Intra Bank
And user_614 click or check the radio button is Main Acc is Debit 
And user_614 click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes
And user_614 click on Log Out icon to log out from the CSM Params application

#Test case execution
Given user_614 Navigate to CSM core application and login with valid credentials
And user_614 click on Date to Change the Current Date in the CSM core application
And user_614 Enters the Date in user_614 Running Date in the CSM core application
And user_614 click on Use Button in Change Running Date Popup in the CSM core application
And user_614 click Ok Button in Information PopUp menu in the CSM core application
And user_614 click on Close Button in Change Running Date Popup in the CSM core application
And user_614 click on Technical Details Icon in the CSM core application
And user_614 click Clear Cache in Technical Details Icon in the CSM core application
And user_614 click Ok Button Under Information PopUp Menu in the CSM core application
And user_614 click on Transactions under CSM application in the CSM core application
And user_614 click on Maintenance under Transactions in the CSM core application
And user_614 enters the transaction type
And user_614 Enter the Branch Code for AC1 in Maintenance Screen
And user_614 Enter Currency Code for AC1 in Maintenance Screen
And user_614 Enter GL Code for AC1 in Maintenance Screen
And user_614 Enter CIF Code for AC1 in Maintenance Screen
And user_614 Enter Serial for AC1 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 Enter the Currency in Maintenance Screen
And user_614 Enter the Amount in Maintenance Screen
#And user_614 Enter the Branch Code for AC2 in Maintenance Screen
#And user_614 Enter Currency Code for AC2 in Maintenance Screen
And user_614 Enter GL Code for AC2 in Maintenance Screen
And user_614 Enter CIF Code for AC2 in Maintenance Screen
And user_614 Enter Serial for AC2 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 click Save Button in Maintenance Screen
And user_614 Get the Transaction No in Success PopUo Menu
And user_614 click Ok Button in Success PopUp Menu
And user_614 click on Approve Screen under Transactions menu
And user_614 Enter the Transaction No in Approve Screens
And user_614 Double click on the Transaction No
And user_614 click on Approve Button for approve the Transaction
And user_614 click on Ok Button in Success PopUp Menu for Approve Transcation
And user_614 click on Maintenance under Transactions
And user_614 click Ok Button in Warning PopUp to go back to Maintenance
And user_614 click on Search Button in Maintenance Screen
And user_614 Enter the Transaction No in Search Boxs
And user_614 Double click on the Searched Transaction No in Search Box
And user_614 click on Booked Entries in Maintenance Screen


#Post requisties
Given user_614 Navigate to CSM Params application and login with valid credentials

And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the CIF Priority charges button
And user_614 click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user_614 click on the OK button to close the CIF Priority Charges popup menu
And user_614 click on the dummy check both to save the changes
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes


@TRS_193
Scenario: Transactions -> Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account - CIF Priority  Priority  Charges - General (CIF2) - Account

#Pre-requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_193

And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the CIF Priority charges button
And user_614 click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user_614 click on the plus button to add the CIF Priority Charges under the CIF Priority Charges to link the charge code for AC1
And user_614 enters the CIF priority code under the CIF Priority Charges column
And user_614 enters the charge scheme code under the Charge Schema Details column
And user_614 selects all from the dropdown list before the cash account column under the CIF Priority Charges column
And user_614 selects account option from the cash account column under the CIF Priority Charges column
And user_614 selects the Authorize from the action column under the CIF Priority Charges column
And user_614 click on the OK button to close the CIF Priority Charges popup menu
And user_614 click or check the Transfer Type is Intra Bank
And user_614 click or check the radio button is Main Acc is Debit 
And user_614 click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes
And user_614 click on Log Out icon to log out from the CSM Params application

#Test case execution
Given user_614 Navigate to CSM core application and login with valid credentials
And user_614 click on Date to Change the Current Date in the CSM core application
And user_614 Enters the Date in user_614 Running Date in the CSM core application
And user_614 click on Use Button in Change Running Date Popup in the CSM core application
And user_614 click Ok Button in Information PopUp menu in the CSM core application
And user_614 click on Close Button in Change Running Date Popup in the CSM core application
And user_614 click on Technical Details Icon in the CSM core application
And user_614 click Clear Cache in Technical Details Icon in the CSM core application
And user_614 click Ok Button Under Information PopUp Menu in the CSM core application
And user_614 click on Transactions under CSM application in the CSM core application
And user_614 click on Maintenance under Transactions in the CSM core application
And user_614 enters the transaction type
And user_614 Enter the Branch Code for AC1 in Maintenance Screen
And user_614 Enter Currency Code for AC1 in Maintenance Screen
And user_614 Enter GL Code for AC1 in Maintenance Screen
And user_614 Enter CIF Code for AC1 in Maintenance Screen
And user_614 Enter Serial for AC1 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 Enter the Currency in Maintenance Screen
And user_614 Enter the Amount in Maintenance Screen
#And user_614 Enter the Branch Code for AC2 in Maintenance Screen
#And user_614 Enter Currency Code for AC2 in Maintenance Screen
And user_614 Enter GL Code for AC2 in Maintenance Screen
And user_614 Enter CIF Code for AC2 in Maintenance Screen
And user_614 Enter Serial for AC2 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 click Save Button in Maintenance Screen
And user_614 Get the Transaction No in Success PopUo Menu
And user_614 click Ok Button in Success PopUp Menu
And user_614 click on Approve Screen under Transactions menu
And user_614 Enter the Transaction No in Approve Screens
And user_614 Double click on the Transaction No
And user_614 click on Approve Button for approve the Transaction
And user_614 click on Ok Button in Success PopUp Menu for Approve Transcation
And user_614 click on Maintenance under Transactions
And user_614 click Ok Button in Warning PopUp to go back to Maintenance
And user_614 click on Search Button in Maintenance Screen
And user_614 Enter the Transaction No in Search Boxs
And user_614 Double click on the Searched Transaction No in Search Box
And user_614 click on Booked Entries in Maintenance Screen


#Post requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_193
And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the CIF Priority charges button
And user_614 click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user_614 click on the OK button to close the CIF Priority Charges popup menu
And user_614 click on the dummy check both to save the changes
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes


@TRS_194
Scenario: Transactions -> Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account - CIF Priority  Charges - Specific Vs. General - Account

#Pre-requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_194

And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the CIF Priority charges button
And user_614 click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user_614 click on the plus button to add the CIF Priority Charges under the CIF Priority Charges to link the charge code for AC1
And user_614 enters the CIF priority code under the CIF Priority Charges column
And user_614 enters the charge scheme code under the Charge Schema Details column
And user_614 selects all from the dropdown list before the cash account column under the CIF Priority Charges column
And user_614 selects account option from the cash account column under the CIF Priority Charges column
And user_614 selects the Authorize from the action column under the CIF Priority Charges column
And user_614 click on the plus button to add the CIF Priority Charges under the CIF Priority Charges to link the charge code for AC1
And user_614 enters the CIF priority code under the CIF Priority Charges column1_01
And user_614 enters the charge scheme code under the Charge Schema Details column1_01
And user_614 selects all from the dropdown list before the cash account column under the CIF Priority Charges column
And user_614 selects account option from the cash account column under the CIF Priority Charges column
And user_614 selects the Authorize from the action column under the CIF Priority Charges column
And user_614 click on the OK button to close the CIF Priority Charges popup menu
And user_614 click or check the Transfer Type is Intra Bank
And user_614 click or check the radio button is Main Acc is Debit 
And user_614 click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes
And user_614 click on Log Out icon to log out from the CSM Params application


#Test case execution
And user_614 get the data from the excel sheet for the test case id TRS_194
Given user_614 Navigate to CSM core application and login with valid credentials
And user_614 click on Date to Change the Current Date in the CSM core application
And user_614 Enters the Date in user_614 Running Date in the CSM core application
And user_614 click on Use Button in Change Running Date Popup in the CSM core application
And user_614 click Ok Button in Information PopUp menu in the CSM core application
And user_614 click on Close Button in Change Running Date Popup in the CSM core application
And user_614 click on Technical Details Icon in the CSM core application
And user_614 click Clear Cache in Technical Details Icon in the CSM core application
And user_614 click Ok Button Under Information PopUp Menu in the CSM core application
And user_614 click on Transactions under CSM application in the CSM core application
And user_614 click on Maintenance under Transactions in the CSM core application
And user_614 enters the transaction type
And user_614 Enter the Branch Code for AC1 in Maintenance Screen
And user_614 Enter Currency Code for AC1 in Maintenance Screen
And user_614 Enter GL Code for AC1 in Maintenance Screen
And user_614 Enter CIF Code for AC1 in Maintenance Screen
And user_614 Enter Serial for AC1 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 Enter the Currency in Maintenance Screen
And user_614 Enter the Amount in Maintenance Screen
#And user_614 Enter the Branch Code for AC2 in Maintenance Screen
#And user_614 Enter Currency Code for AC2 in Maintenance Screen
And user_614 Enter GL Code for AC2 in Maintenance Screen
And user_614 Enter CIF Code for AC2 in Maintenance Screen
And user_614 Enter Serial for AC2 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 click Save Button in Maintenance Screen
And user_614 Get the Transaction No in Success PopUo Menu
And user_614 click Ok Button in Success PopUp Menu
And user_614 click on Approve Screen under Transactions menu
And user_614 Enter the Transaction No in Approve Screens
And user_614 Double click on the Transaction No
And user_614 click on Approve Button for approve the Transaction
And user_614 click on Ok Button in Success PopUp Menu for Approve Transcation
And user_614 click on Maintenance under Transactions
And user_614 click Ok Button in Warning PopUp to go back to Maintenance
And user_614 click on Search Button in Maintenance Screen
And user_614 Enter the Transaction No in Search Boxs
And user_614 Double click on the Searched Transaction No in Search Box
And user_614 click on Booked Entries in Maintenance Screen
And user_614 click on Maintenance under Transactions
And user_614 click Ok Button in Warning PopUp to go back to Maintenance
And user_614 get the data from the excel sheet for the test case id TRS_194
And user_614 enters the transaction type
#And user_614 Enter the Branch Code for AC1_01 in Maintenance Screen
And user_614 Enter Currency Code for AC1_01 in Maintenance Screen
And user_614 Enter GL Code for AC1_01 in Maintenance Screen
And user_614 Enter CIF Code for AC1_01 in Maintenance Screen
And user_614 Enter Serial for AC1_01 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 Enter the Currency in Maintenance Screen
And user_614 Enter the Amount in Maintenance Screen
#And user_614 Enter the Branch Code for AC2_01 in Maintenance Screen
#And user_614 Enter Currency Code for AC2_01 in Maintenance Screen
And user_614 Enter GL Code for AC2_01 in Maintenance Screen
And user_614 Enter CIF Code for AC2_01 in Maintenance Screen
And user_614 Enter Serial for AC2_01 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 click Save Button in Maintenance Screen
And user_614 Get the Transaction No in Success PopUo Menu
And user_614 click Ok Button in Success PopUp Menu
And user_614 click on Approve Screen under Transactions menu
And user_614 click Ok Button in Warning PopUp to go back to Maintenance
And user_614 Enter the Transaction No in Approve Screens
And user_614 Double click on the Transaction No
And user_614 click on Approve Button for approve the Transaction
And user_614 click on Ok Button in Success PopUp Menu for Approve Transcation
And user_614 click on Maintenance under Transactions
And user_614 click Ok Button in Warning PopUp to go back to Maintenance
And user_614 click on Search Button in Maintenance Screen
And user_614 Enter the Transaction No in Search Boxs
And user_614 Double click on the Searched Transaction No in Search Box
And user_614 click on Booked Entries in Maintenance Screen


#Post requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_194
And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the CIF Priority charges button
And user_614 click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user_614 click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user_614 click on the OK button to close the CIF Priority Charges popup menu
And user_614 click on the dummy check both to save the changes
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes


@TRS_195
Scenario: Transactions -> Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account - CIF Type Charges - Specific Used - Account

#Pre-requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_195

And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the CIF Type charges button
And user_614 click on the any existing added data in the CIF Type Charges and click on the delete button to delete it
And user_614 click on the plus button to add the CIF Type Charges under the CIF Type Charges to link the charge code for AC1
And user_614 enters the CIF Type Charges under the CIF Type Charges column
And user_614 enters the charge scheme code under the Charge Schema Details column
And user_614 selects all from the dropdown list before the cash account column for CIF Type charge
And user_614 selects account option from the cash account column for CIF Type charge
And user_614 selects the Authorize from the action column for CIF Type charge
And user_614 click on the OK button to close the CIF Type Charges popup menu
And user_614 click or check the Transfer Type is Intra Bank
And user_614 click or check the radio button is Main Acc is Debit 
And user_614 click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes
And user_614 click on Log Out icon to log out from the CSM Params application

#Test case execution
Given user_614 Navigate to CSM core application and login with valid credentials
And user_614 click on Date to Change the Current Date in the CSM core application
And user_614 Enters the Date in user_614 Running Date in the CSM core application
And user_614 click on Use Button in Change Running Date Popup in the CSM core application
And user_614 click Ok Button in Information PopUp menu in the CSM core application
And user_614 click on Close Button in Change Running Date Popup in the CSM core application
And user_614 click on Technical Details Icon in the CSM core application
And user_614 click Clear Cache in Technical Details Icon in the CSM core application
And user_614 click Ok Button Under Information PopUp Menu in the CSM core application
And user_614 click on Transactions under CSM application in the CSM core application
And user_614 click on Maintenance under Transactions in the CSM core application
And user_614 enters the transaction type
And user_614 Enter the Branch Code for AC1 in Maintenance Screen
And user_614 Enter Currency Code for AC1 in Maintenance Screen
And user_614 Enter GL Code for AC1 in Maintenance Screen
And user_614 Enter CIF Code for AC1 in Maintenance Screen
And user_614 Enter Serial for AC1 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 Enter the Currency in Maintenance Screen
And user_614 Enter the Amount in Maintenance Screen
#And user_614 Enter the Branch Code for AC2 in Maintenance Screen
#And user_614 Enter Currency Code for AC2 in Maintenance Screen
And user_614 Enter GL Code for AC2 in Maintenance Screen
And user_614 Enter CIF Code for AC2 in Maintenance Screen
And user_614 Enter Serial for AC2 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 click Save Button in Maintenance Screen
And user_614 Get the Transaction No in Success PopUo Menu
And user_614 click Ok Button in Success PopUp Menu
And user_614 click on Approve Screen under Transactions menu
And user_614 Enter the Transaction No in Approve Screens
And user_614 Double click on the Transaction No
And user_614 click on Approve Button for approve the Transaction
And user_614 click on Ok Button in Success PopUp Menu for Approve Transcation
And user_614 click on Maintenance under Transactions
And user_614 click Ok Button in Warning PopUp to go back to Maintenance
And user_614 click on Search Button in Maintenance Screen
And user_614 Enter the Transaction No in Search Boxs
And user_614 Double click on the Searched Transaction No in Search Box
And user_614 click on Booked Entries in Maintenance Screen


#Post requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_195
And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the CIF Type charges button
And user_614 click on the any existing added data in the CIF Type Charges and click on the delete button to delete it
And user_614 click on the OK button to close the CIF Type Charges popup menu
And user_614 click on the dummy check both to save the changes
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes


@TRS_196
Scenario: Transactions -> Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account - CIF Type Charges - Specific NOT Used - Account

#Pre-requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_196

And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the CIF Type charges button
And user_614 click on the any existing added data in the CIF Type Charges and click on the delete button to delete it
And user_614 click on the plus button to add the CIF Type Charges under the CIF Type Charges to link the charge code for AC2
And user_614 enters the CIF Type Charges under the CIF Type Charges column
And user_614 enters the charge scheme code under the Charge Schema Details column
And user_614 selects all from the dropdown list before the cash account column for CIF Type charge
And user_614 selects account option from the cash account column for CIF Type charge
And user_614 selects the Authorize from the action column for CIF Type charge
And user_614 click on the OK button to close the CIF Type Charges popup menu
And user_614 click or check the Transfer Type is Intra Bank
And user_614 click or check the radio button is Main Acc is Debit 
And user_614 click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes
And user_614 click on Log Out icon to log out from the CSM Params application

#Test case execution
Given user_614 Navigate to CSM core application and login with valid credentials
And user_614 click on Date to Change the Current Date in the CSM core application
And user_614 Enters the Date in user_614 Running Date in the CSM core application
And user_614 click on Use Button in Change Running Date Popup in the CSM core application
And user_614 click Ok Button in Information PopUp menu in the CSM core application
And user_614 click on Close Button in Change Running Date Popup in the CSM core application
And user_614 click on Technical Details Icon in the CSM core application
And user_614 click Clear Cache in Technical Details Icon in the CSM core application
And user_614 click Ok Button Under Information PopUp Menu in the CSM core application
And user_614 click on Transactions under CSM application in the CSM core application
And user_614 click on Maintenance under Transactions in the CSM core application
And user_614 enters the transaction type
And user_614 Enter the Branch Code for AC1 in Maintenance Screen
And user_614 Enter Currency Code for AC1 in Maintenance Screen
And user_614 Enter GL Code for AC1 in Maintenance Screen
And user_614 Enter CIF Code for AC1 in Maintenance Screen
And user_614 Enter Serial for AC1 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 Enter the Currency in Maintenance Screen
And user_614 Enter the Amount in Maintenance Screen
#And user_614 Enter the Branch Code for AC2 in Maintenance Screen
#And user_614 Enter Currency Code for AC2 in Maintenance Screen
And user_614 Enter GL Code for AC2 in Maintenance Screen
And user_614 Enter CIF Code for AC2 in Maintenance Screen
And user_614 Enter Serial for AC2 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 click Save Button in Maintenance Screen
And user_614 Get the Transaction No in Success PopUo Menu
And user_614 click Ok Button in Success PopUp Menu
And user_614 click on Approve Screen under Transactions menu
And user_614 Enter the Transaction No in Approve Screens
And user_614 Double click on the Transaction No
And user_614 click on Approve Button for approve the Transaction
And user_614 click on Ok Button in Success PopUp Menu for Approve Transcation
And user_614 click on Maintenance under Transactions
And user_614 click Ok Button in Warning PopUp to go back to Maintenance
And user_614 click on Search Button in Maintenance Screen
And user_614 Enter the Transaction No in Search Boxs
And user_614 Double click on the Searched Transaction No in Search Box
And user_614 click on Booked Entries in Maintenance Screen


#Post requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_196
And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the CIF Type charges button
And user_614 click on the any existing added data in the CIF Type Charges and click on the delete button to delete it
And user_614 click on the OK button to close the CIF Type Charges popup menu
And user_614 click on the dummy check both to save the changes
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes



@TRS_197
Scenario: Transactions -> Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account - CIF Type Charges - General (CIF1) - Account

#Pre-requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_197

And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the CIF Type charges button
And user_614 click on the any existing added data in the CIF Type Charges and click on the delete button to delete it
And user_614 click on the plus button to add the CIF Type Charges under the CIF Type Charges to link the charge code for all account
And user_614 enters the CIF Type Charges under the CIF Type Charges column
And user_614 enters the charge scheme code under the Charge Schema Details column
And user_614 selects all from the dropdown list before the cash account column for CIF Type charge
And user_614 selects account option from the cash account column for CIF Type charge
And user_614 selects the Authorize from the action column for CIF Type charge
And user_614 click on the OK button to close the CIF Type Charges popup menu
And user_614 click or check the Transfer Type is Intra Bank
And user_614 click or check the radio button is Main Acc is Debit 
And user_614 click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes
And user_614 click on Log Out icon to log out from the CSM Params application

#Test case execution
Given user_614 Navigate to CSM core application and login with valid credentials
And user_614 click on Date to Change the Current Date in the CSM core application
And user_614 Enters the Date in user_614 Running Date in the CSM core application
And user_614 click on Use Button in Change Running Date Popup in the CSM core application
And user_614 click Ok Button in Information PopUp menu in the CSM core application
And user_614 click on Close Button in Change Running Date Popup in the CSM core application
And user_614 click on Technical Details Icon in the CSM core application
And user_614 click Clear Cache in Technical Details Icon in the CSM core application
And user_614 click Ok Button Under Information PopUp Menu in the CSM core application
And user_614 click on Transactions under CSM application in the CSM core application
And user_614 click on Maintenance under Transactions in the CSM core application
And user_614 enters the transaction type
And user_614 Enter the Branch Code for AC1 in Maintenance Screen
And user_614 Enter Currency Code for AC1 in Maintenance Screen
And user_614 Enter GL Code for AC1 in Maintenance Screen
And user_614 Enter CIF Code for AC1 in Maintenance Screen
And user_614 Enter Serial for AC1 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 Enter the Currency in Maintenance Screen
And user_614 Enter the Amount in Maintenance Screen
#And user_614 Enter the Branch Code for AC2 in Maintenance Screen
#And user_614 Enter Currency Code for AC2 in Maintenance Screen
And user_614 Enter GL Code for AC2 in Maintenance Screen
And user_614 Enter CIF Code for AC2 in Maintenance Screen
And user_614 Enter Serial for AC2 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 click Save Button in Maintenance Screen
And user_614 Get the Transaction No in Success PopUo Menu
And user_614 click Ok Button in Success PopUp Menu
And user_614 click on Approve Screen under Transactions menu
And user_614 Enter the Transaction No in Approve Screens
And user_614 Double click on the Transaction No
And user_614 click on Approve Button for approve the Transaction
And user_614 click on Ok Button in Success PopUp Menu for Approve Transcation
And user_614 click on Maintenance under Transactions
And user_614 click Ok Button in Warning PopUp to go back to Maintenance
And user_614 click on Search Button in Maintenance Screen
And user_614 Enter the Transaction No in Search Boxs
And user_614 Double click on the Searched Transaction No in Search Box
And user_614 click on Booked Entries in Maintenance Screen


#Post requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_197
And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the CIF Type charges button
And user_614 click on the any existing added data in the CIF Type Charges and click on the delete button to delete it
And user_614 click on the OK button to close the CIF Type Charges popup menu
And user_614 click on the dummy check both to save the changes
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes





@TRS_198
Scenario: Transactions -> Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account - CIF Type Charges - General (CIF2) - Account

#Pre-requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_198

And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the CIF Type charges button
And user_614 click on the any existing added data in the CIF Type Charges and click on the delete button to delete it
And user_614 click on the plus button to add the CIF Type Charges under the CIF Type Charges to link the charge code for all account
And user_614 enters the CIF Type Charges under the CIF Type Charges column
And user_614 enters the charge scheme code under the Charge Schema Details column
And user_614 selects all from the dropdown list before the cash account column for CIF Type charge
And user_614 selects account option from the cash account column for CIF Type charge
And user_614 selects the Authorize from the action column for CIF Type charge
And user_614 click on the OK button to close the CIF Type Charges popup menu
And user_614 click or check the Transfer Type is Intra Bank
And user_614 click or check the radio button is Main Acc is Debit 
And user_614 click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes
And user_614 click on Log Out icon to log out from the CSM Params application

#Test case execution
Given user_614 Navigate to CSM core application and login with valid credentials
And user_614 click on Date to Change the Current Date in the CSM core application
And user_614 Enters the Date in user_614 Running Date in the CSM core application
And user_614 click on Use Button in Change Running Date Popup in the CSM core application
And user_614 click Ok Button in Information PopUp menu in the CSM core application
And user_614 click on Close Button in Change Running Date Popup in the CSM core application
And user_614 click on Technical Details Icon in the CSM core application
And user_614 click Clear Cache in Technical Details Icon in the CSM core application
And user_614 click Ok Button Under Information PopUp Menu in the CSM core application
And user_614 click on Transactions under CSM application in the CSM core application
And user_614 click on Maintenance under Transactions in the CSM core application
And user_614 enters the transaction type
And user_614 Enter the Branch Code for AC1 in Maintenance Screen
And user_614 Enter Currency Code for AC1 in Maintenance Screen
And user_614 Enter GL Code for AC1 in Maintenance Screen
And user_614 Enter CIF Code for AC1 in Maintenance Screen
And user_614 Enter Serial for AC1 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 Enter the Currency in Maintenance Screen
And user_614 Enter the Amount in Maintenance Screen
#And user_614 Enter the Branch Code for AC2 in Maintenance Screen
#And user_614 Enter Currency Code for AC2 in Maintenance Screen
And user_614 Enter GL Code for AC2 in Maintenance Screen
And user_614 Enter CIF Code for AC2 in Maintenance Screen
And user_614 Enter Serial for AC2 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 click Save Button in Maintenance Screen
And user_614 Get the Transaction No in Success PopUo Menu
And user_614 click Ok Button in Success PopUp Menu
And user_614 click on Approve Screen under Transactions menu
And user_614 Enter the Transaction No in Approve Screens
And user_614 Double click on the Transaction No
And user_614 click on Approve Button for approve the Transaction
And user_614 click on Ok Button in Success PopUp Menu for Approve Transcation
And user_614 click on Maintenance under Transactions
And user_614 click Ok Button in Warning PopUp to go back to Maintenance
And user_614 click on Search Button in Maintenance Screen
And user_614 Enter the Transaction No in Search Boxs
And user_614 Double click on the Searched Transaction No in Search Box
And user_614 click on Booked Entries in Maintenance Screen


#Post requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_198
And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the CIF Type charges button
And user_614 click on the any existing added data in the CIF Type Charges and click on the delete button to delete it
And user_614 click on the OK button to close the CIF Type Charges popup menu
And user_614 click on the dummy check both to save the changes
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes






@TRS_199
Scenario: Transactions -> Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account - CIF Type Charges - Specific Vs. General - Account

#Pre-requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_199

And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the CIF Type charges button
And user_614 click on the any existing added data in the CIF Type Charges and click on the delete button to delete it
And user_614 click on the plus button to add the CIF Type Charges under the CIF Type Charges to link the charge code for all account
And user_614 enters the CIF Type Charges under the CIF Type Charges column
And user_614 enters the charge scheme code under the Charge Schema Details column
And user_614 selects all from the dropdown list before the cash account column for CIF Type charge
And user_614 selects account option from the cash account column for CIF Type charge
And user_614 selects the Authorize from the action column for CIF Type charge
And user_614 click on the plus button to add the CIF Type Charges under the CIF Type Charges to link the charge code for all account
And user_614 enters the CIF Type Charges under the CIF Type Charges column1_01
And user_614 enters the charge scheme code under the Charge Schema Details column1_01
And user_614 selects all from the dropdown list before the cash account column for CIF Type charge
And user_614 selects account option from the cash account column for CIF Type charge
And user_614 selects the Authorize from the action column for CIF Type charge
And user_614 click on the OK button to close the CIF Type Charges popup menu
And user_614 click or check the Transfer Type is Intra Bank
And user_614 click or check the radio button is Main Acc is Debit 
And user_614 click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes
And user_614 click on Log Out icon to log out from the CSM Params application


#Test case execution
And user_614 get the data from the excel sheet for the test case id TRS_199
Given user_614 Navigate to CSM core application and login with valid credentials
And user_614 click on Date to Change the Current Date in the CSM core application
And user_614 Enters the Date in user_614 Running Date in the CSM core application
And user_614 click on Use Button in Change Running Date Popup in the CSM core application
And user_614 click Ok Button in Information PopUp menu in the CSM core application
And user_614 click on Close Button in Change Running Date Popup in the CSM core application
And user_614 click on Technical Details Icon in the CSM core application
And user_614 click Clear Cache in Technical Details Icon in the CSM core application
And user_614 click Ok Button Under Information PopUp Menu in the CSM core application
And user_614 click on Transactions under CSM application in the CSM core application
And user_614 click on Maintenance under Transactions in the CSM core application
And user_614 enters the transaction type
And user_614 Enter the Branch Code for AC1 in Maintenance Screen
And user_614 Enter Currency Code for AC1 in Maintenance Screen
And user_614 Enter GL Code for AC1 in Maintenance Screen
And user_614 Enter CIF Code for AC1 in Maintenance Screen
And user_614 Enter Serial for AC1 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 Enter the Currency in Maintenance Screen
And user_614 Enter the Amount in Maintenance Screen
#And user_614 Enter the Branch Code for AC2 in Maintenance Screen
#And user_614 Enter Currency Code for AC2 in Maintenance Screen
And user_614 Enter GL Code for AC2 in Maintenance Screen
And user_614 Enter CIF Code for AC2 in Maintenance Screen
And user_614 Enter Serial for AC2 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 click Save Button in Maintenance Screen
And user_614 Get the Transaction No in Success PopUo Menu
And user_614 click Ok Button in Success PopUp Menu
And user_614 click on Approve Screen under Transactions menu
And user_614 Enter the Transaction No in Approve Screens
And user_614 Double click on the Transaction No
And user_614 click on Approve Button for approve the Transaction
And user_614 click on Ok Button in Success PopUp Menu for Approve Transcation
And user_614 click on Maintenance under Transactions
And user_614 click Ok Button in Warning PopUp to go back to Maintenance
And user_614 click on Search Button in Maintenance Screen
And user_614 Enter the Transaction No in Search Boxs
And user_614 Double click on the Searched Transaction No in Search Box
And user_614 click on Booked Entries in Maintenance Screen
And user_614 click on Maintenance under Transactions
And user_614 click Ok Button in Warning PopUp to go back to Maintenance
And user_614 get the data from the excel sheet for the test case id TRS_199
And user_614 enters the transaction type
#And user_614 Enter the Branch Code for AC1_01 in Maintenance Screen
And user_614 Enter Currency Code for AC1_01 in Maintenance Screen
And user_614 Enter GL Code for AC1_01 in Maintenance Screen
And user_614 Enter CIF Code for AC1_01 in Maintenance Screen
And user_614 Enter Serial for AC1_01 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 Enter the Currency in Maintenance Screen
And user_614 Enter the Amount in Maintenance Screen
#And user_614 Enter the Branch Code for AC2_01 in Maintenance Screen
#And user_614 Enter Currency Code for AC2_01 in Maintenance Screen
And user_614 Enter GL Code for AC2_01 in Maintenance Screen
And user_614 Enter CIF Code for AC2_01 in Maintenance Screen
And user_614 Enter Serial for AC2_01 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 click Save Button in Maintenance Screen
And user_614 Get the Transaction No in Success PopUo Menu
And user_614 click Ok Button in Success PopUp Menu
And user_614 click on Approve Screen under Transactions menu
And user_614 click Ok Button in Warning PopUp to go back to Maintenance
And user_614 Enter the Transaction No in Approve Screens
And user_614 Double click on the Transaction No
And user_614 click on Approve Button for approve the Transaction
And user_614 click on Ok Button in Success PopUp Menu for Approve Transcation
And user_614 click on Maintenance under Transactions
And user_614 click Ok Button in Warning PopUp to go back to Maintenance
And user_614 click on Search Button in Maintenance Screen
And user_614 Enter the Transaction No in Search Boxs
And user_614 Double click on the Searched Transaction No in Search Box
And user_614 click on Booked Entries in Maintenance Screen


#Post requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_199
And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the CIF Priority charges button
And user_614 click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user_614 click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user_614 click on the OK button to close the CIF Priority Charges popup menu
And user_614 click on the dummy check both to save the changes
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes




@TRS_200
Scenario: Transactions -> Checking Charges Priority Deduction - Account Charges

#Pre-requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_200
And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the Account charges button
And user_614 click on the any existing added data in the Account charges and click on the delete button to delete it
And user_614 click on the plus button to add the Account code under the Account charges
And user_614 enters the Account code under the Account code column
And user_614 enters the charge scheme code under the Charge Schema Details column
And user_614 selects all from the dropdown list before the cash account column under Account charges
#And user_614 selects account option from the cash account column
#And user_614 selects the Authorize from the action column
And user_614 click on the OK button to close the Account charges popup menu
And user_614 click on the CIF charges button
And user_614 click on the any existing added data in the CIF charges and click on the delete button to delete it
And user_614 click on the plus button to add the CIF code under the CIF charges
And user_614 enters the CIF Charge code under the CIF code column1
And user_614 enters the charge scheme code under the Charge Schema Details column for schema2
And user_614 selects all from the dropdown list before the cash account column for CIF charges
#And user_614 selects account option from the cash account column
#And user_614 selects the Authorize from the action column
And user_614 click on the OK button to close the CIF charges popup menu
And user_614 click on the CIF Priority charges button
And user_614 click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user_614 click on the plus button to add the CIF Priority Charges under the CIF Priority Charges to link the charge code for All account
And user_614 enters the CIF priority charge code under the CIF code column2
And user_614 enters the charge scheme code under the Charge Schema Details column for schema3
And user_614 selects all from the dropdown list before the cash account column under the CIF Priority Charges column
#And user_614 selects account option from the cash account column
#And user_614 selects the Authorize from the action column
And user_614 click on the OK button to close the CIF Priority Charges popup menu
And user_614 click on the GL charges button
And user_614 click on the any existing added data in the GL charges and click on the delete button to delete it
And user_614 click on the plus button to add the GL code under the GL charges
And user_614 enters the GL code under the CIF code column3
And user_614 enters the charge scheme code under the Charge Schema Details column for schema4
And user_614 selects all from the dropdown list before the cash account column under the GL Charges column
#And user_614 selects account option from the cash account column
#And user_614 selects the Authorize from the action column
And user_614 click on the OK button to close the GL charges popup menu
And user_614 click on the CIF Type charges button
And user_614 click on the any existing added data in the CIF Type Charges and click on the delete button to delete it
And user_614 click on the plus button to add the CIF Type Charges under the CIF Type Charges to link the charge code for all account
And user_614 enters the CIF Type code under the CIF code column4
And user_614 enters the charge scheme code under the Charge Schema Details column for schema5
And user_614 selects all from the dropdown list before the cash account column for CIF Type charge
#And user_614 selects account option from the cash account column
#And user_614 selects the Authorize from the action column
And user_614 click on the OK button to close the CIF Type Charges popup menu
And user_614 click or check the Transfer Type is Intra Bank
And user_614 click or check the radio button is Main Acc is Debit 
And user_614 click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes
And user_614 click on Log Out icon to log out from the CSM Params application

#Test case execution
And user_614 get the data from the excel sheet for the test case id TRS_200
Given user_614 Navigate to CSM core application and login with valid credentials
And user_614 click on Date to Change the Current Date in the CSM core application
And user_614 Enters the Date in user_614 Running Date in the CSM core application
And user_614 click on Use Button in Change Running Date Popup in the CSM core application
And user_614 click Ok Button in Information PopUp menu in the CSM core application
And user_614 click on Close Button in Change Running Date Popup in the CSM core application
And user_614 click on Technical Details Icon in the CSM core application
And user_614 click Clear Cache in Technical Details Icon in the CSM core application
And user_614 click Ok Button Under Information PopUp Menu in the CSM core application
And user_614 click on Transactions under CSM application in the CSM core application
And user_614 click on Maintenance under Transactions in the CSM core application
And user_614 enters the transaction type
And user_614 Enter the Branch Code for AC1 in Maintenance Screen
And user_614 Enter Currency Code for AC1 in Maintenance Screen
And user_614 Enter GL Code for AC1 in Maintenance Screen
And user_614 Enter CIF Code for AC1 in Maintenance Screen
And user_614 Enter Serial for AC1 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 Enter the Currency in Maintenance Screen
And user_614 Enter the Amount in Maintenance Screen
#And user_614 Enter the Branch Code for AC2 in Maintenance Screen
#And user_614 Enter Currency Code for AC2 in Maintenance Screen
And user_614 Enter GL Code for AC2 in Maintenance Screen
And user_614 Enter CIF Code for AC2 in Maintenance Screen
And user_614 Enter Serial for AC2 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 click Save Button in Maintenance Screen
And user_614 Get the Transaction No in Success PopUo Menu
And user_614 click Ok Button in Success PopUp Menu
And user_614 click on Approve Screen under Transactions menu
And user_614 Enter the Transaction No in Approve Screens
And user_614 Double click on the Transaction No
And user_614 click on Approve Button for approve the Transaction
And user_614 click on Ok Button in Success PopUp Menu for Approve Transcation
And user_614 click on Maintenance under Transactions
And user_614 click Ok Button in Warning PopUp to go back to Maintenance
And user_614 click on Search Button in Maintenance Screen
And user_614 Enter the Transaction No in Search Boxs
And user_614 Double click on the Searched Transaction No in Search Box
And user_614 click on Booked Entries in Maintenance Screen


#Post requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_200
And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the Account charges button
And user_614 click on the any existing added data in the Account charges and click on the delete button to delete it
And user_614 click on the OK button to close the Account charges popup menu
And user_614 click on the CIF charges button
And user_614 click on the any existing added data in the CIF charges and click on the delete button to delete it
And user_614 click on the OK button to close the CIF charges popup menu
And user_614 click on the CIF Priority charges button
And user_614 click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user_614 click on the OK button to close the CIF Priority Charges popup menu
And user_614 click on the GL charges button
And user_614 click on the any existing added data in the GL charges and click on the delete button to delete it
And user_614 click on the OK button to close the GL charges popup menu
And user_614 click on the CIF Type charges button
And user_614 click on the any existing added data in the CIF Type Charges and click on the delete button to delete it
And user_614 click on the OK button to close the CIF Type Charges popup menu
And user_614 click on the dummy check both to save the changes
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes

@TRS_201
Scenario: Transactions -> Checking Charges Priority Deduction - CIF Charges

#Pre-requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_201
And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the Account charges button
And user_614 click on the any existing added data in the Account charges and click on the delete button to delete it
And user_614 click on the OK button to close the Account charges popup menu
And user_614 click on the CIF charges button
And user_614 click on the any existing added data in the CIF charges and click on the delete button to delete it
And user_614 click on the plus button to add the CIF code under the CIF charges
And user_614 enters the CIF Charge code under the CIF code column1
And user_614 enters the charge scheme code under the Charge Schema Details column for schema column1
And user_614 selects all from the dropdown list before the cash account column for CIF charges
#And user_614 selects account option from the cash account column
#And user_614 selects the Authorize from the action column
And user_614 click on the OK button to close the CIF charges popup menu
And user_614 click on the CIF Priority charges button
And user_614 click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user_614 click on the plus button to add the CIF Priority Charges under the CIF Priority Charges to link the charge code for All account
And user_614 enters the CIF priority charge code under the CIF code column2
And user_614 enters the charge scheme code under the Charge Schema Details column for schema column2
And user_614 selects all from the dropdown list before the cash account column under the CIF Priority Charges column
#And user_614 selects account option from the cash account column
#And user_614 selects the Authorize from the action column
And user_614 click on the OK button to close the CIF Priority Charges popup menu
And user_614 click on the GL charges button
And user_614 click on the any existing added data in the GL charges and click on the delete button to delete it
And user_614 click on the plus button to add the GL code under the GL charges
And user_614 enters the GL code under the CIF code column3
And user_614 enters the charge scheme code under the Charge Schema Details column for schema column3
And user_614 selects all from the dropdown list before the cash account column under the GL Charges column
#And user_614 selects account option from the cash account column
#And user_614 selects the Authorize from the action column
And user_614 click on the OK button to close the GL charges popup menu
And user_614 click on the CIF Type charges button
And user_614 click on the any existing added data in the CIF Type Charges and click on the delete button to delete it
And user_614 click on the plus button to add the CIF Type Charges under the CIF Type Charges to link the charge code for all account
And user_614 enters the CIF Type code under the CIF code column4
And user_614 enters the charge scheme code under the Charge Schema Details column for schema column4
And user_614 selects all from the dropdown list before the cash account column for CIF Type charge
#And user_614 selects account option from the cash account column
#And user_614 selects the Authorize from the action column
And user_614 click on the OK button to close the CIF Type Charges popup menu
And user_614 click or check the Transfer Type is Intra Bank
And user_614 click or check the radio button is Main Acc is Debit 
And user_614 click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes
And user_614 click on Log Out icon to log out from the CSM Params application

#Test case execution
And user_614 get the data from the excel sheet for the test case id TRS_201
Given user_614 Navigate to CSM core application and login with valid credentials
And user_614 click on Date to Change the Current Date in the CSM core application
And user_614 Enters the Date in user_614 Running Date in the CSM core application
And user_614 click on Use Button in Change Running Date Popup in the CSM core application
And user_614 click Ok Button in Information PopUp menu in the CSM core application
And user_614 click on Close Button in Change Running Date Popup in the CSM core application
And user_614 click on Technical Details Icon in the CSM core application
And user_614 click Clear Cache in Technical Details Icon in the CSM core application
And user_614 click Ok Button Under Information PopUp Menu in the CSM core application
And user_614 click on Transactions under CSM application in the CSM core application
And user_614 click on Maintenance under Transactions in the CSM core application
And user_614 enters the transaction type
And user_614 Enter the Branch Code for AC1 in Maintenance Screen
And user_614 Enter Currency Code for AC1 in Maintenance Screen
And user_614 Enter GL Code for AC1 in Maintenance Screen
And user_614 Enter CIF Code for AC1 in Maintenance Screen
And user_614 Enter Serial for AC1 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 Enter the Currency in Maintenance Screen
And user_614 Enter the Amount in Maintenance Screen
#And user_614 Enter the Branch Code for AC2 in Maintenance Screen
#And user_614 Enter Currency Code for AC2 in Maintenance Screen
And user_614 Enter GL Code for AC2 in Maintenance Screen
And user_614 Enter CIF Code for AC2 in Maintenance Screen
And user_614 Enter Serial for AC2 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 click Save Button in Maintenance Screen
And user_614 Get the Transaction No in Success PopUo Menu
And user_614 click Ok Button in Success PopUp Menu
And user_614 click on Approve Screen under Transactions menu
And user_614 Enter the Transaction No in Approve Screens
And user_614 Double click on the Transaction No
And user_614 click on Approve Button for approve the Transaction
And user_614 click on Ok Button in Success PopUp Menu for Approve Transcation
And user_614 click on Maintenance under Transactions
And user_614 click Ok Button in Warning PopUp to go back to Maintenance
And user_614 click on Search Button in Maintenance Screen
And user_614 Enter the Transaction No in Search Boxs
And user_614 Double click on the Searched Transaction No in Search Box
And user_614 click on Booked Entries in Maintenance Screen


#Post requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_201
And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the CIF charges button
And user_614 click on the any existing added data in the CIF charges and click on the delete button to delete it
And user_614 click on the OK button to close the CIF charges popup menu
And user_614 click on the CIF Priority charges button
And user_614 click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user_614 click on the OK button to close the CIF Priority Charges popup menu
And user_614 click on the GL charges button
And user_614 click on the any existing added data in the GL charges and click on the delete button to delete it
And user_614 click on the OK button to close the GL charges popup menu
And user_614 click on the CIF Type charges button
And user_614 click on the any existing added data in the CIF Type Charges and click on the delete button to delete it
And user_614 click on the OK button to close the CIF Type Charges popup menu
And user_614 click on the dummy check both to save the changes
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes

@TRS_202
Scenario: Transactions -> Checking Charges Priority Deduction - CIF Priority Charges

#Pre-requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_202
And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the Account charges button
And user_614 click on the any existing added data in the Account charges and click on the delete button to delete it
And user_614 click on the OK button to close the Account charges popup menu
And user_614 click on the CIF charges button
And user_614 click on the any existing added data in the CIF charges and click on the delete button to delete it
And user_614 click on the OK button to close the CIF charges popup menu
And user_614 click on the CIF Priority charges button
And user_614 click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user_614 click on the plus button to add the CIF Priority Charges under the CIF Priority Charges to link the charge code for All account
And user_614 enters the CIF priority charge code under the CIF code column1
And user_614 enters the charge scheme code for the Charge Schema Details column1 under CIF priority charge
And user_614 selects all from the dropdown list before the cash account column under the CIF Priority Charges column
#And user_614 selects account option from the cash account column
#And user_614 selects the Authorize from the action column
And user_614 click on the OK button to close the CIF Priority Charges popup menu
And user_614 click on the GL charges button
And user_614 click on the any existing added data in the GL charges and click on the delete button to delete it
And user_614 click on the plus button to add the GL code under the GL charges
And user_614 enters the GL code under the CIF code column2
And user_614 enters the charge scheme code for the Charge Schema Details column2 under GL charge
And user_614 selects all from the dropdown list before the cash account column under the GL Charges column
#And user_614 selects account option from the cash account column
#And user_614 selects the Authorize from the action column
And user_614 click on the OK button to close the GL charges popup menu
And user_614 click on the CIF Type charges button
And user_614 click on the any existing added data in the CIF Type Charges and click on the delete button to delete it
And user_614 click on the plus button to add the CIF Type Charges under the CIF Type Charges to link the charge code for all account
And user_614 enters the CIF Type code under the CIF code column3
And user_614 enters the charge scheme code for the Charge Schema Details column3 under CIF Type charge
And user_614 selects all from the dropdown list before the cash account column for CIF Type charge
#And user_614 selects account option from the cash account column
#And user_614 selects the Authorize from the action column
And user_614 click on the OK button to close the CIF Type Charges popup menu
And user_614 click or check the Transfer Type is Intra Bank
And user_614 click or check the radio button is Main Acc is Debit 
And user_614 click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes
And user_614 click on Log Out icon to log out from the CSM Params application

#Test case execution
And user_614 get the data from the excel sheet for the test case id TRS_202
Given user_614 Navigate to CSM core application and login with valid credentials
And user_614 click on Date to Change the Current Date in the CSM core application
And user_614 Enters the Date in user_614 Running Date in the CSM core application
And user_614 click on Use Button in Change Running Date Popup in the CSM core application
And user_614 click Ok Button in Information PopUp menu in the CSM core application
And user_614 click on Close Button in Change Running Date Popup in the CSM core application
And user_614 click on Technical Details Icon in the CSM core application
And user_614 click Clear Cache in Technical Details Icon in the CSM core application
And user_614 click Ok Button Under Information PopUp Menu in the CSM core application
And user_614 click on Transactions under CSM application in the CSM core application
And user_614 click on Maintenance under Transactions in the CSM core application
And user_614 enters the transaction type
And user_614 Enter the Branch Code for AC1 in Maintenance Screen
And user_614 Enter Currency Code for AC1 in Maintenance Screen
And user_614 Enter GL Code for AC1 in Maintenance Screen
And user_614 Enter CIF Code for AC1 in Maintenance Screen
And user_614 Enter Serial for AC1 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 Enter the Currency in Maintenance Screen
And user_614 Enter the Amount in Maintenance Screen
#And user_614 Enter the Branch Code for AC2 in Maintenance Screen
#And user_614 Enter Currency Code for AC2 in Maintenance Screen
And user_614 Enter GL Code for AC2 in Maintenance Screen
And user_614 Enter CIF Code for AC2 in Maintenance Screen
And user_614 Enter Serial for AC2 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 click Save Button in Maintenance Screen
And user_614 Get the Transaction No in Success PopUo Menu
And user_614 click Ok Button in Success PopUp Menu
And user_614 click on Approve Screen under Transactions menu
And user_614 Enter the Transaction No in Approve Screens
And user_614 Double click on the Transaction No
And user_614 click on Approve Button for approve the Transaction
And user_614 click on Ok Button in Success PopUp Menu for Approve Transcation
And user_614 click on Maintenance under Transactions
And user_614 click Ok Button in Warning PopUp to go back to Maintenance
And user_614 click on Search Button in Maintenance Screen
And user_614 Enter the Transaction No in Search Boxs
And user_614 Double click on the Searched Transaction No in Search Box
And user_614 click on Booked Entries in Maintenance Screen


#Post requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_202
And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the CIF Priority charges button
And user_614 click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user_614 click on the OK button to close the CIF Priority Charges popup menu
And user_614 click on the GL charges button
And user_614 click on the any existing added data in the GL charges and click on the delete button to delete it
And user_614 click on the OK button to close the GL charges popup menu
And user_614 click on the CIF Type charges button
And user_614 click on the any existing added data in the CIF Type Charges and click on the delete button to delete it
And user_614 click on the OK button to close the CIF Type Charges popup menu
And user_614 click on the dummy check both to save the changes
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes

@TRS_203
Scenario: Transactions -> Checking Charges Priority Deduction - GL Charges

#Pre-requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_203
And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the Account charges button
And user_614 click on the any existing added data in the Account charges and click on the delete button to delete it
And user_614 click on the OK button to close the Account charges popup menu
And user_614 click on the CIF charges button
And user_614 click on the any existing added data in the CIF charges and click on the delete button to delete it
And user_614 click on the OK button to close the CIF charges popup menu
And user_614 click on the CIF Priority charges button
And user_614 click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user_614 click on the OK button to close the CIF Priority Charges popup menu
And user_614 click on the GL charges button
And user_614 click on the any existing added data in the GL charges and click on the delete button to delete it
And user_614 click on the plus button to add the GL code under the GL charges
And user_614 enters the GL code under the CIF code column1
And user_614 enters the charge scheme code for the Charge Schema Details column1 under GL charge
And user_614 selects all from the dropdown list before the cash account column under the GL Charges column
#And user_614 selects account option from the cash account column
#And user_614 selects the Authorize from the action column
And user_614 click on the OK button to close the GL charges popup menu
And user_614 click on the CIF Type charges button
And user_614 click on the any existing added data in the CIF Type Charges and click on the delete button to delete it
And user_614 click on the plus button to add the CIF Type Charges under the CIF Type Charges to link the charge code for all account
And user_614 enters the CIF Type code under the CIF code column2
And user_614 enters the charge scheme code for the Charge Schema Details column2 under CIF Type charge
And user_614 selects all from the dropdown list before the cash account column for CIF Type charge
#And user_614 selects account option from the cash account column
#And user_614 selects the Authorize from the action column
And user_614 click on the OK button to close the CIF Type Charges popup menu
And user_614 click or check the Transfer Type is Intra Bank
And user_614 click or check the radio button is Main Acc is Debit 
And user_614 click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes
And user_614 click on Log Out icon to log out from the CSM Params application

#Test case execution
And user_614 get the data from the excel sheet for the test case id TRS_203
Given user_614 Navigate to CSM core application and login with valid credentials
And user_614 click on Date to Change the Current Date in the CSM core application
And user_614 Enters the Date in user_614 Running Date in the CSM core application
And user_614 click on Use Button in Change Running Date Popup in the CSM core application
And user_614 click Ok Button in Information PopUp menu in the CSM core application
And user_614 click on Close Button in Change Running Date Popup in the CSM core application
And user_614 click on Technical Details Icon in the CSM core application
And user_614 click Clear Cache in Technical Details Icon in the CSM core application
And user_614 click Ok Button Under Information PopUp Menu in the CSM core application
And user_614 click on Transactions under CSM application in the CSM core application
And user_614 click on Maintenance under Transactions in the CSM core application
And user_614 enters the transaction type
And user_614 Enter the Branch Code for AC1 in Maintenance Screen
And user_614 Enter Currency Code for AC1 in Maintenance Screen
And user_614 Enter GL Code for AC1 in Maintenance Screen
And user_614 Enter CIF Code for AC1 in Maintenance Screen
And user_614 Enter Serial for AC1 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 Enter the Currency in Maintenance Screen
And user_614 Enter the Amount in Maintenance Screen
#And user_614 Enter the Branch Code for AC2 in Maintenance Screen
#And user_614 Enter Currency Code for AC2 in Maintenance Screen
And user_614 Enter GL Code for AC2 in Maintenance Screen
And user_614 Enter CIF Code for AC2 in Maintenance Screen
And user_614 Enter Serial for AC2 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 click Save Button in Maintenance Screen
And user_614 Get the Transaction No in Success PopUo Menu
And user_614 click Ok Button in Success PopUp Menu
And user_614 click on Approve Screen under Transactions menu
And user_614 Enter the Transaction No in Approve Screens
And user_614 Double click on the Transaction No
And user_614 click on Approve Button for approve the Transaction
And user_614 click on Ok Button in Success PopUp Menu for Approve Transcation
And user_614 click on Maintenance under Transactions
And user_614 click Ok Button in Warning PopUp to go back to Maintenance
And user_614 click on Search Button in Maintenance Screen
And user_614 Enter the Transaction No in Search Boxs
And user_614 Double click on the Searched Transaction No in Search Box
And user_614 click on Booked Entries in Maintenance Screen


#Post requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_203
And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the CIF Priority charges button
And user_614 click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user_614 click on the OK button to close the CIF Priority Charges popup menu
And user_614 click on the GL charges button
And user_614 click on the any existing added data in the GL charges and click on the delete button to delete it
And user_614 click on the OK button to close the GL charges popup menu
And user_614 click on the CIF Type charges button
And user_614 click on the any existing added data in the CIF Type Charges and click on the delete button to delete it
And user_614 click on the OK button to close the CIF Type Charges popup menu
And user_614 click on the dummy check both to save the changes
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes

@TRS_204
Scenario: Transactions -> Checking Charges Priority Deduction - CIF Type Charges

#Pre-requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_204
And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the Account charges button
And user_614 click on the any existing added data in the Account charges and click on the delete button to delete it
And user_614 click on the OK button to close the Account charges popup menu
And user_614 click on the CIF charges button
And user_614 click on the any existing added data in the CIF charges and click on the delete button to delete it
And user_614 click on the OK button to close the CIF charges popup menu
And user_614 click on the CIF Priority charges button
And user_614 click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user_614 click on the OK button to close the CIF Priority Charges popup menu
And user_614 click on the GL charges button
And user_614 click on the any existing added data in the GL charges and click on the delete button to delete it
And user_614 click on the OK button to close the GL charges popup menu
And user_614 click on the CIF Type charges button
And user_614 click on the any existing added data in the CIF Type Charges and click on the delete button to delete it
And user_614 click on the plus button to add the CIF Type Charges under the CIF Type Charges to link the charge code for all account
And user_614 enters the CIF Type code under the CIF code column1
And user_614 enters the charge scheme code for the Charge Schema Details column1 under CIF Type charge
And user_614 selects all from the dropdown list before the cash account column for CIF Type charge
#And user_614 selects account option from the cash account column
#And user_614 selects the Authorize from the action column
And user_614 click on the OK button to close the CIF Type Charges popup menu
And user_614 click or check the Transfer Type is Intra Bank
And user_614 click or check the radio button is Main Acc is Debit 
And user_614 click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes
And user_614 click on Log Out icon to log out from the CSM Params application

#Test case execution
And user_614 get the data from the excel sheet for the test case id TRS_204
Given user_614 Navigate to CSM core application and login with valid credentials
And user_614 click on Date to Change the Current Date in the CSM core application
And user_614 Enters the Date in user_614 Running Date in the CSM core application
And user_614 click on Use Button in Change Running Date Popup in the CSM core application
And user_614 click Ok Button in Information PopUp menu in the CSM core application
And user_614 click on Close Button in Change Running Date Popup in the CSM core application
And user_614 click on Technical Details Icon in the CSM core application
And user_614 click Clear Cache in Technical Details Icon in the CSM core application
And user_614 click Ok Button Under Information PopUp Menu in the CSM core application
And user_614 click on Transactions under CSM application in the CSM core application
And user_614 click on Maintenance under Transactions in the CSM core application
And user_614 enters the transaction type
And user_614 Enter the Branch Code for AC1 in Maintenance Screen
And user_614 Enter Currency Code for AC1 in Maintenance Screen
And user_614 Enter GL Code for AC1 in Maintenance Screen
And user_614 Enter CIF Code for AC1 in Maintenance Screen
And user_614 Enter Serial for AC1 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 Enter the Currency in Maintenance Screen
And user_614 Enter the Amount in Maintenance Screen
#And user_614 Enter the Branch Code for AC2 in Maintenance Screen
#And user_614 Enter Currency Code for AC2 in Maintenance Screen
And user_614 Enter GL Code for AC2 in Maintenance Screen
And user_614 Enter CIF Code for AC2 in Maintenance Screen
And user_614 Enter Serial for AC2 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 click Save Button in Maintenance Screen
And user_614 Get the Transaction No in Success PopUo Menu
And user_614 click Ok Button in Success PopUp Menu
And user_614 click on Approve Screen under Transactions menu
And user_614 Enter the Transaction No in Approve Screens
And user_614 Double click on the Transaction No
And user_614 click on Approve Button for approve the Transaction
And user_614 click on Ok Button in Success PopUp Menu for Approve Transcation
And user_614 click on Maintenance under Transactions
And user_614 click Ok Button in Warning PopUp to go back to Maintenance
And user_614 click on Search Button in Maintenance Screen
And user_614 Enter the Transaction No in Search Boxs
And user_614 Double click on the Searched Transaction No in Search Box
And user_614 click on Booked Entries in Maintenance Screen


#Post requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_204
And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the CIF Type charges button
And user_614 click on the any existing added data in the CIF Type Charges and click on the delete button to delete it
And user_614 click on the OK button to close the CIF Type Charges popup menu
And user_614 click on the dummy check both to save the changes
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes



@TRS_205
Scenario: Transactions -> Checking Charges Priority Deduction - Specific Vs. General

#Pre-requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_205
And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the Account charges button
And user_614 click on the any existing added data in the Account charges and click on the delete button to delete it
And user_614 click on the OK button to close the Account charges popup menu
And user_614 click on the CIF charges button
And user_614 click on the any existing added data in the CIF charges and click on the delete button to delete it
And user_614 click on the plus button to add the CIF code under the CIF charges
And user_614 enters the CIF Charge code under the CIF code column1
And user_614 enters the charge scheme code under the Charge Schema Details column for schema1
And user_614 selects all from the dropdown list before the cash account column for CIF charges
#And user_614 selects account option from the cash account column
#And user_614 selects the Authorize from the action column
And user_614 click on the OK button to close the CIF charges popup menu
And user_614 click on the CIF Priority charges button
And user_614 click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user_614 click on the OK button to close the CIF Priority Charges popup menu
And user_614 click on the GL charges button
And user_614 click on the any existing added data in the GL charges and click on the delete button to delete it
And user_614 click on the plus button to add the GL code under the GL charges
And user_614 enters the GL code under the CIF code column2
And user_614 enters the charge scheme code2 for the Charge Schema Details column2 under GL charge
And user_614 selects all from the dropdown list before the cash account column under the GL Charges column
And user_614 click on the plus button to add the GL code under the GL charges
And user_614 enters the GL code under the CIF code column2_1
And user_614 enters the charge scheme code3 for the Charge Schema Details column2 under GL charge
And user_614 selects all from the dropdown list before the cash account column under the GL Charges column
And user_614 click on the OK button to close the GL charges popup menu
And user_614 click on the CIF Type charges button
And user_614 click on the any existing added data in the CIF Type Charges and click on the delete button to delete it
And user_614 click on the OK button to close the CIF Type Charges popup menu
And user_614 click or check the Transfer Type is Intra Bank
And user_614 click or check the radio button is Main Acc is Debit 
And user_614 click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes
And user_614 click on Log Out icon to log out from the CSM Params application

#Test case execution
And user_614 get the data from the excel sheet for the test case id TRS_205
Given user_614 Navigate to CSM core application and login with valid credentials
And user_614 click on Date to Change the Current Date in the CSM core application
And user_614 Enters the Date in user_614 Running Date in the CSM core application
And user_614 click on Use Button in Change Running Date Popup in the CSM core application
And user_614 click Ok Button in Information PopUp menu in the CSM core application
And user_614 click on Close Button in Change Running Date Popup in the CSM core application
And user_614 click on Technical Details Icon in the CSM core application
And user_614 click Clear Cache in Technical Details Icon in the CSM core application
And user_614 click Ok Button Under Information PopUp Menu in the CSM core application
And user_614 click on Transactions under CSM application in the CSM core application
And user_614 click on Maintenance under Transactions in the CSM core application
And user_614 enters the transaction type
And user_614 Enter the Branch Code for AC1 in Maintenance Screen
And user_614 Enter Currency Code for AC1 in Maintenance Screen
And user_614 Enter GL Code for AC1 in Maintenance Screen
And user_614 Enter CIF Code for AC1 in Maintenance Screen
And user_614 Enter Serial for AC1 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 Enter the Currency in Maintenance Screen
And user_614 Enter the Amount in Maintenance Screen
#And user_614 Enter the Branch Code for AC2 in Maintenance Screen
#And user_614 Enter Currency Code for AC2 in Maintenance Screen
And user_614 Enter GL Code for AC2 in Maintenance Screen
And user_614 Enter CIF Code for AC2 in Maintenance Screen
And user_614 Enter Serial for AC2 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 click Save Button in Maintenance Screen
And user_614 Get the Transaction No in Success PopUo Menu
And user_614 click Ok Button in Success PopUp Menu
And user_614 click on Approve Screen under Transactions menu
And user_614 Enter the Transaction No in Approve Screens
And user_614 Double click on the Transaction No
And user_614 click on Approve Button for approve the Transaction
And user_614 click on Ok Button in Success PopUp Menu for Approve Transcation
And user_614 click on Maintenance under Transactions
And user_614 click Ok Button in Warning PopUp to go back to Maintenance
And user_614 click on Search Button in Maintenance Screen
And user_614 Enter the Transaction No in Search Boxs
And user_614 Double click on the Searched Transaction No in Search Box
And user_614 click on Booked Entries in Maintenance Screen


#Post requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_205
And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the CIF charges button
And user_614 click on the any existing added data in the CIF charges and click on the delete button to delete it
And user_614 click on the OK button to close the CIF charges popup menu
And user_614 click on the GL charges button
And user_614 click on the any existing added data in the GL charges and click on the delete button to delete it
And user_614 click on the OK button to close the GL charges popup menu
And user_614 click on the dummy check both to save the changes
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes

@TRS_383
Scenario: Transactions -> Check if the system accept multiple CIF whenever creating Transfer Trx - International - Single Transfer - Mode of Payment A/C

#Pre-requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_383
And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click or check the Transfer Type is Intra Bank
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes
And user_614 click on Log Out icon to log out from the CSM Params application

#Test case execution
And user_614 get the data from the excel sheet for the test case id TRS_383
Given user_614 Navigate to CSM core application and login with valid credentials
And user_614 click on Date to Change the Current Date in the CSM core application
And user_614 Enters the Date in user_614 Running Date in the CSM core application
And user_614 click on Use Button in Change Running Date Popup in the CSM core application
And user_614 click Ok Button in Information PopUp menu in the CSM core application
And user_614 click on Close Button in Change Running Date Popup in the CSM core application
And user_614 click on Technical Details Icon in the CSM core application
And user_614 click Clear Cache in Technical Details Icon in the CSM core application
And user_614 click Ok Button Under Information PopUp Menu in the CSM core application
And user_614 click on Transactions under CSM application in the CSM core application
And user_614 click on Maintenance under Transactions in the CSM core application
And user_614 enters the transaction type
And user_614 Enter the Branch Code for AC1 in Maintenance Screen
And user_614 Enter Currency Code for AC1 in Maintenance Screen
And user_614 Enter GL Code for AC1 in Maintenance Screen
And user_614 Enter CIF Code for AC1 in Maintenance Screen
And user_614 Enter Serial for AC1 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 Enter the Currency in Maintenance Screen
And user_614 Enter the Amount in Maintenance Screen
#And user_614 Enter the Branch Code for AC2 in Maintenance Screen
#And user_614 Enter Currency Code for AC2 in Maintenance Screen
And user_614 Enter GL Code for AC2 in Maintenance Screen
And user_614 Enter CIF Code for AC2 in Maintenance Screen
And user_614 Enter Serial for AC2 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 click Save Button in Maintenance Screen
And user_614 Get the Transaction No in Success PopUo Menu
And user_614 click Ok Button in Success PopUp Menu
And user_614 click on Approve Screen under Transactions menu
And user_614 Enter the Transaction No in Approve Screens
And user_614 Double click on the Transaction No
And user_614 click on Approve Button for approve the Transaction
And user_614 click on Ok Button in Success PopUp Menu for Approve Transcation
And user_614 click on Maintenance under Transactions
And user_614 click Ok Button in Warning PopUp to go back to Maintenance
And user_614 click on Search Button in Maintenance Screen
And user_614 Enter the Transaction No in Search Boxs
And user_614 Double click on the Searched Transaction No in Search Box
And user_614 click on Booked Entries in Maintenance Screen


#Post requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_383
And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the dummy check both to save the changes
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes


@TRS_388
Scenario: Transactions -> Check if the system accept multiple CIF whenever creating Transfer Trx - Intrabank - Single Transfer - Mode of Payment Cash

#Pre-requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_388
And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click or check the Transfer Type is Intra Bank
And user_614 uncheck the forbid multiple cif in transaction screen if already checked
And user_614 click on the dummy check both to save the changes
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes
And user_614 click on Log Out icon to log out from the CSM Params application

#Test case execution
And user_614 get the data from the excel sheet for the test case id TRS_388
Given user_614 Navigate to CSM core application and login with valid credentials
And user_614 click on Date to Change the Current Date in the CSM core application
And user_614 Enters the Date in user_614 Running Date in the CSM core application
And user_614 click on Use Button in Change Running Date Popup in the CSM core application
And user_614 click Ok Button in Information PopUp menu in the CSM core application
And user_614 click on Close Button in Change Running Date Popup in the CSM core application
And user_614 click on Technical Details Icon in the CSM core application
And user_614 click Clear Cache in Technical Details Icon in the CSM core application
And user_614 click Ok Button Under Information PopUp Menu in the CSM core application
And user_614 click on Transactions under CSM application in the CSM core application
And user_614 click on Maintenance under Transactions in the CSM core application
And user_614 enters the transaction type
And user_614 selects the mode of payment as cash for the transaction in maintenance screen
#And user_614 Enter the Branch Code for AC1 in Maintenance Screen
#And user_614 Enter Currency Code for AC1 in Maintenance Screen
#And user_614 Enter GL Code for AC1 in Maintenance Screen
#And user_614 Enter CIF Code for AC1 in Maintenance Screen
#And user_614 Enter Serial for AC1 in Maintenance Screen
#And user_614 click Ok Button in Warning PopUp Menu
And user_614 Enter the Currency in Maintenance Screen
And user_614 Enter the Amount in Maintenance Screen
#And user_614 Enter the Branch Code for AC2 in Maintenance Screen
#And user_614 Enter Currency Code for AC2 in Maintenance Screen
And user_614 Enter GL Code for AC2 in Maintenance Screen
And user_614 Enter CIF Code for AC2 in Maintenance Screen
And user_614 Enter Serial for AC2 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 click Save Button in Maintenance Screen
And user_614 Get the Transaction No in Success PopUo Menu
And user_614 click Ok Button in Success PopUp Menu
And user_614 click on Approve Screen under Transactions menu
And user_614 Enter the Transaction No in Approve Screens
And user_614 Double click on the Transaction No
And user_614 click on Approve Button for approve the Transaction
And user_614 click on Ok Button in Success PopUp Menu for Approve Transcation
And user_614 click on Maintenance under Transactions
And user_614 click Ok Button in Warning PopUp to go back to Maintenance
And user_614 click on Search Button in Maintenance Screen
And user_614 Enter the Transaction No in Search Boxs
And user_614 Double click on the Searched Transaction No in Search Box
And user_614 click on Booked Entries in Maintenance Screen



@TRS_395
Scenario: Transactions -> Check if the system accept multiple CIF whenever creating Transfer Trx - International - Single Transfer - Mode of Payment A/C

#Pre-requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_395
And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click or check the Transfer Type is Intra Bank
And user_614 uncheck the forbid multiple cif in transaction screen if already checked
And user_614 click on the dummy check both to save the changes
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes
And user_614 click on Log Out icon to log out from the CSM Params application

#Test case execution
And user_614 get the data from the excel sheet for the test case id TRS_395
Given user_614 Navigate to CSM core application and login with valid credentials
And user_614 click on Date to Change the Current Date in the CSM core application
And user_614 Enters the Date in user_614 Running Date in the CSM core application
And user_614 click on Use Button in Change Running Date Popup in the CSM core application
And user_614 click Ok Button in Information PopUp menu in the CSM core application
And user_614 click on Close Button in Change Running Date Popup in the CSM core application
And user_614 click on Technical Details Icon in the CSM core application
And user_614 click Clear Cache in Technical Details Icon in the CSM core application
And user_614 click Ok Button Under Information PopUp Menu in the CSM core application
And user_614 click on Transactions under CSM application in the CSM core application
And user_614 click on Maintenance under Transactions in the CSM core application
And user_614 enters the transaction type
And user_614 Enter the Branch Code for AC1 in Maintenance Screen
And user_614 Enter Currency Code for AC1 in Maintenance Screen
And user_614 Enter GL Code for AC1 in Maintenance Screen
And user_614 Enter CIF Code for AC1 in Maintenance Screen
And user_614 Enter Serial for AC1 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 Enter the Currency in Maintenance Screen
And user_614 Enter the Amount in Maintenance Screen
#And user_614 Enter the Branch Code for AC2 in Maintenance Screen
#And user_614 Enter Currency Code for AC2 in Maintenance Screen
And user_614 Enter GL Code for AC2 in Maintenance Screen
And user_614 Enter CIF Code for AC2 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 Enter Serial for AC2 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 click Save Button in Maintenance Screen
And user_614 Get the Transaction No in Success PopUo Menu
And user_614 click Ok Button in Success PopUp Menu
And user_614 click on Approve Screen under Transactions menu
And user_614 Enter the Transaction No in Approve Screens
And user_614 Double click on the Transaction No
And user_614 click on Approve Button for approve the Transaction
And user_614 click on Ok Button in Success PopUp Menu for Approve Transcation
And user_614 click on Maintenance under Transactions
And user_614 click Ok Button in Warning PopUp to go back to Maintenance
And user_614 click on Search Button in Maintenance Screen
And user_614 Enter the Transaction No in Search Boxs
And user_614 Double click on the Searched Transaction No in Search Box
And user_614 click on Booked Entries in Maintenance Screen


#Post requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_395
And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the dummy check both to save the changes
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes

@TRS_398
Scenario: Transactions -> Check if the system accept multiple CIF whenever creating Transfer Trx - International - Multi Transfer - Mode of Payment Cash

#Pre-requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_398
And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click or check the Transfer Type is Intra Bank
And user_614 uncheck the forbid multiple cif in transaction screen if already checked
And user_614 click on the dummy check both to save the changes
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes
And user_614 click on Log Out icon to log out from the CSM Params application

#Test case execution
And user_614 get the data from the excel sheet for the test case id TRS_398
Given user_614 Navigate to CSM core application and login with valid credentials
And user_614 click on Date to Change the Current Date in the CSM core application
And user_614 Enters the Date in user_614 Running Date in the CSM core application
And user_614 click on Use Button in Change Running Date Popup in the CSM core application
And user_614 click Ok Button in Information PopUp menu in the CSM core application
And user_614 click on Close Button in Change Running Date Popup in the CSM core application
And user_614 click on Technical Details Icon in the CSM core application
And user_614 click Clear Cache in Technical Details Icon in the CSM core application
And user_614 click Ok Button Under Information PopUp Menu in the CSM core application
And user_614 click on Transactions under CSM application in the CSM core application
And user_614 click on Maintenance under Transactions in the CSM core application
And user_614 enters the transaction type
And user_614 Enter the Branch Code for AC1 in Maintenance Screen
And user_614 Enter Currency Code for AC1 in Maintenance Screen
And user_614 Enter GL Code for AC1 in Maintenance Screen
And user_614 Enter CIF Code for AC1 in Maintenance Screen
And user_614 Enter Serial for AC1 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 Enter the Currency in Maintenance Screen
And user_614 Enter the Amount in Maintenance Screen
#And user_614 Enter the Branch Code for AC2 in Maintenance Screen
#And user_614 Enter Currency Code for AC2 in Maintenance Screen
And user_614 Enter GL Code for AC2 in Maintenance Screen
And user_614 Enter CIF Code for AC2 in Maintenance Screen
And user_614 Enter Serial for AC2 in Maintenance Screen
And user_614 click Ok Button in Warning PopUp Menu
And user_614 click Save Button in Maintenance Screen
And user_614 Get the Transaction No in Success PopUo Menu
And user_614 click Ok Button in Success PopUp Menu
And user_614 click on Approve Screen under Transactions menu
And user_614 Enter the Transaction No in Approve Screens
And user_614 Double click on the Transaction No
And user_614 click on Approve Button for approve the Transaction
And user_614 click on Ok Button in Success PopUp Menu for Approve Transcation
And user_614 click on Maintenance under Transactions
And user_614 click Ok Button in Warning PopUp to go back to Maintenance
And user_614 click on Search Button in Maintenance Screen
And user_614 Enter the Transaction No in Search Boxs
And user_614 Double click on the Searched Transaction No in Search Box
And user_614 click on Booked Entries in Maintenance Screen


#Post requisties
Given user_614 Navigate to CSM Params application and login with valid credentials
And user_614 get the data from the excel sheet for the test case id TRS_398
And user_614 click on the parameters menu under the menu options in the CSM params application
And user_614 click on the system paramters under the parameters menu
And user_614 click on the transaction type under the system parameters
And user_614 click on the update after approve field under the transaction type
And user_614 enters the transaction type code in the code column under the update after approve
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the dummy check both to save the changes
And user_614 click on the update after approve button to save the changes
And user_614 click on the approve field under the transaction type menu
And user_614 enters the transaction type code in the code column under the approve menu
And user_614 double clicks on the entered transaction type code from the list to view the transaction type details
And user_614 click on the approve button to approve the changes
@EndExecution
Scenario: End the Test in Excel runner
Given End the Test


