Feature: Checking the functionality of transactions

@TRS_188
Scenario: Transactions -> Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account - GL Charges - General (CIF2) - Account

#Pre-requisties
Given user Navigate to CSM Params application and login with valid credentials
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
#And user click or check the Transfer Type is Intra Bank
#And user click or check the radio button is Main Acc is Debit 
#And user click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the approve button to approve the changes
#And user click on Log Out icon to log out from the CSM Params application

#Test case execution
Given user Navigate to CSM core application and login with valid credentials
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
And user enters the transaction type for test case
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
Given user Navigate to CSM Params application and login with valid credentials

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
Given user Navigate to CSM Params application and login with valid credentials
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
And user selects all from the dropdown list before the cash account column
And user selects account option from the cash account column
And user selects the Authorize from the action column
And user click on the OK button to close the GL charges popup menu
And user click on the OK button to close the GL charges popup menu
And user click or check the Transfer Type is Intra Bank
And user click or check the radio button is Main Acc is Debit 
And user click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the approve button to approve the changes
And user click on Log Out icon to log out from the CSM Params application

#Test case execution
Given user Navigate to CSM core application and login with valid credentials
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
And user enters the transaction type for test case
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
And user enters the transaction type for test case id TRS_189
And user Enter the Branch Code for AC1 in Maintenance Screen for test case id TRS_189_02
And user Enter Currency Code for AC1 in Maintenance Screen for test case id TRS_189_02
And user Enter GL Code for AC1 in Maintenance Screen for test case id TRS_189_02
And user Enter CIF Code for AC1 in Maintenance Screen for test case id TRS_189_02
And user Enter Serial for AC1 in Maintenance Screen for test case id TRS_189_02
And user click Ok Button in Warning PopUp Menu
And user Enter the Currency in Maintenance Screen for test case id TRS_189_02
And user Enter the Amount in Maintenance Screen for test case id TRS_189_02
And user Enter the Branch Code for AC2 in Maintenance Screen for test case id TRS_189_02
And user Enter Currency Code for AC2 in Maintenance Screen for test case id TRS_189_02
And user Enter GL Code for AC2 in Maintenance Screen for test case id TRS_189_02
And user Enter CIF Code for AC2 in Maintenance Screen for test case id TRS_189_02
And user Enter Serial for AC2 in Maintenance Screen for test case id TRS_189_02
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
Given user Navigate to CSM Params application and login with valid credentials

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


@TRS_190
Scenario: Transactions -> Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account - CIF Priority  Charges - Specific Used - Account

#Pre-requisties
Given user Navigate to CSM Params application and login with valid credentials
And user get the data from the excel sheet for the test case id TRS_190

And user click on the parameters menu under the menu options in the CSM params application
And user click on the system paramters under the parameters menu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the CIF Priority charges button
And user click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user click on the plus button to add the CIF Priority Charges under the CIF Priority Charges to link the charge code for AC1 
And user enters the CIF Priority Charges under the CIF Priority Charges column
And user enters the charge scheme code under the Charge Schema Details column
And user selects all from the dropdown list before the cash account column
And user selects account option from the cash account column
And user selects the Authorize from the action column
And user click on the OK button to close the CIF Priority Charges popup menu
And user click or check the Transfer Type is Intra Bank
And user click or check the radio button is Main Acc is Debit 
And user click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the approve button to approve the changes
And user click on Log Out icon to log out from the CSM Params application

#Test case execution
Given user Navigate to CSM core application and login with valid credentials
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
And user enters the transaction type for test case
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
Given user Navigate to CSM Params application and login with valid credentials

And user click on the parameters menu under the menu options in the CSM params application
And user click on the system paramters under the parameters menu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the CIF Priority charges button
And user click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user click on the OK button to close the CIF Priority Charges popup menu
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the approve button to approve the changes



@TRS_191
Scenario: Transactions -> Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account - CIF Priority  Charges - Specific NOT Used - Account

#Pre-requisties
Given user Navigate to CSM Params application and login with valid credentials
And user get the data from the excel sheet for the test case id TRS_191

And user click on the parameters menu under the menu options in the CSM params application
And user click on the system paramters under the parameters menu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the CIF Priority charges button
And user click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user click on the plus button to add the CIF Priority Charges under the CIF Priority Charges to link the charge code for AC2 
And user enters the CIF Priority Charges under the CIF Priority Charges column
And user enters the charge scheme code under the Charge Schema Details column
And user selects all from the dropdown list before the cash account column
And user selects account option from the cash account column
And user selects the Authorize from the action column
And user click on the OK button to close the CIF Priority Charges popup menu
And user click or check the Transfer Type is Intra Bank
And user click or check the radio button is Main Acc is Debit 
And user click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the approve button to approve the changes
And user click on Log Out icon to log out from the CSM Params application

#Test case execution
Given user Navigate to CSM core application and login with valid credentials
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
And user enters the transaction type for test case
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
Given user Navigate to CSM Params application and login with valid credentials

And user click on the parameters menu under the menu options in the CSM params application
And user click on the system paramters under the parameters menu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the CIF Priority charges button
And user click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user click on the OK button to close the CIF Priority Charges popup menu
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the approve button to approve the changes



@TRS_192
Scenario: Transactions -> Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account - CIF Priority  Charges - General (CIF1) - Account

#Pre-requisties
Given user Navigate to CSM Params application and login with valid credentials
And user get the data from the excel sheet for the test case id TRS_192

And user click on the parameters menu under the menu options in the CSM params application
And user click on the system paramters under the parameters menu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the CIF Priority charges button
And user click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user click on the plus button to add the CIF Priority Charges under the CIF Priority Charges to link the charge code for All account
And user enters the CIF Priority Charges under the CIF Priority Charges column
And user enters the charge scheme code under the Charge Schema Details column
And user selects all from the dropdown list before the cash account column
And user selects account option from the cash account column
And user selects the Authorize from the action column
And user click on the OK button to close the CIF Priority Charges popup menu
And user click or check the Transfer Type is Intra Bank
And user click or check the radio button is Main Acc is Debit 
And user click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the approve button to approve the changes
And user click on Log Out icon to log out from the CSM Params application

#Test case execution
Given user Navigate to CSM core application and login with valid credentials
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
And user enters the transaction type for test case
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
Given user Navigate to CSM Params application and login with valid credentials

And user click on the parameters menu under the menu options in the CSM params application
And user click on the system paramters under the parameters menu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the CIF Priority charges button
And user click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user click on the OK button to close the CIF Priority Charges popup menu
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the approve button to approve the changes


@TRS_193
Scenario: Transactions -> Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account - CIF Priority  Priority  Charges - General (CIF2) - Account

#Pre-requisties
Given user Navigate to CSM Params application and login with valid credentials
And user get the data from the excel sheet for the test case id TRS_193

And user click on the parameters menu under the menu options in the CSM params application
And user click on the system paramters under the parameters menu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the CIF Priority charges button
And user click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user click on the plus button to add the CIF Priority Charges under the CIF Priority Charges to link the charge code for AC1
And user enters the CIF Priority Charges under the CIF Priority Charges column
And user enters the charge scheme code under the Charge Schema Details column
And user selects all from the dropdown list before the cash account column
And user selects account option from the cash account column
And user selects the Authorize from the action column
And user click on the OK button to close the CIF Priority Charges popup menu
And user click or check the Transfer Type is Intra Bank
And user click or check the radio button is Main Acc is Debit 
And user click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the approve button to approve the changes
And user click on Log Out icon to log out from the CSM Params application

#Test case execution
Given user Navigate to CSM core application and login with valid credentials
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
And user enters the transaction type for test case
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
Given user Navigate to CSM Params application and login with valid credentials

And user click on the parameters menu under the menu options in the CSM params application
And user click on the system paramters under the parameters menu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the CIF Priority charges button
And user click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user click on the OK button to close the CIF Priority Charges popup menu
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the approve button to approve the changes


@TRS_194
Scenario: Transactions -> Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account - CIF Priority  Charges - Specific Vs. General - Account

#Pre-requisties
Given user Navigate to CSM Params application and login with valid credentials
And user get the data from the excel sheet for the test case id TRS_194

And user click on the parameters menu under the menu options in the CSM params application
And user click on the system paramters under the parameters menu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the CIF Priority charges button
And user click on the any existing added data in the CIF Prioritycharges and click on the delete button to delete it
And user click on the plus button to add the CIF Priority code under the CIF Priority charges
And user enters the CIF Prioritycode under the CIF Priority code column for AC1
And user enters the charge scheme code under the Charge Schema Details column
And user selects all from the dropdown list before the cash account column
And user selects account option from the cash account column
And user selects the Authorize from the action column
And user click on the plus button to add the CIF Priority code under the CIF Priority charges
And user enters the CIF Priority code under the CIF Priority code column to link charge code 2 for AC2
And user enters the charge scheme code under the Charge Schema Details column to link charge code 2
And user selects all from the dropdown list before the cash account column to link charge code 2
And user selects account option from the cash account column to link charge code 2
And user selects the Authorize from the action column to link charge code 2
And user click on the OK button to close the CIF Priority Charges popup menu
And user click or check the Transfer Type is Intra Bank
And user click or check the radio button is Main Acc is Debit 
And user click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the approve button to approve the changes
And user click on Log Out icon to log out from the CSM Params application

#Test case execution
Given user Navigate to CSM core application and login with valid credentials
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
And user enters the transaction type for test case
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
And user enters the transaction type for test case id TRS_194
And user Enter the Branch Code for AC1 in Maintenance Screen for test case id TRS_194_02
And user Enter Currency Code for AC1 in Maintenance Screen for test case id TRS_194_02
And user Enter CIF PriorityCode for AC1 in Maintenance Screen for test case id TRS_194_02
And user Enter CIF Code for AC1 in Maintenance Screen for test case id TRS_194_02
And user Enter Serial for AC1 in Maintenance Screen for test case id TRS_194_02
And user click Ok Button in Warning PopUp Menu
And user Enter the Currency in Maintenance Screen for test case id TRS_194_02
And user Enter the Amount in Maintenance Screen for test case id TRS_194_02
And user Enter the Branch Code for AC2 in Maintenance Screen for test case id TRS_194_02
And user Enter Currency Code for AC2 in Maintenance Screen for test case id TRS_194_02
And user Enter CIF PriorityCode for AC2 in Maintenance Screen for test case id TRS_194_02
And user Enter CIF Code for AC2 in Maintenance Screen for test case id TRS_194_02
And user Enter Serial for AC2 in Maintenance Screen for test case id TRS_194_02
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
Given user Navigate to CSM Params application and login with valid credentials

And user click on the parameters menu under the menu options in the CSM params application
And user click on the system paramters under the parameters menu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the CIF Priority charges button
And user click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user click on the OK button to close the CIF Priority Charges popup menu
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the approve button to approve the changes


@TRS_195
Scenario: Transactions -> Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account - CIF Type Charges - Specific Used - Account

#Pre-requisties
Given user Navigate to CSM Params application and login with valid credentials
And user get the data from the excel sheet for the test case id TRS_195

And user click on the parameters menu under the menu options in the CSM params application
And user click on the system paramters under the parameters menu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the CIF Type charges button
And user click on the any existing added data in the CIF Type Charges and click on the delete button to delete it
And user click on the plus button to add the CIF Type Charges under the CIF Type Charges to link the charge code for AC1
And user enters the CIF Type Charges under the CIF Type Charges column
And user enters the charge scheme code under the Charge Schema Details column
And user selects all from the dropdown list before the cash account column
And user selects account option from the cash account column
And user selects the Authorize from the action column
And user click on the OK button to close the CIF Type Charges popup menu
And user click or check the Transfer Type is Intra Bank
And user click or check the radio button is Main Acc is Debit 
And user click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the approve button to approve the changes
And user click on Log Out icon to log out from the CSM Params application

#Test case execution
Given user Navigate to CSM core application and login with valid credentials
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
And user enters the transaction type for test case
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
Given user Navigate to CSM Params application and login with valid credentials

And user click on the parameters menu under the menu options in the CSM params application
And user click on the system paramters under the parameters menu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the CIF Type charges button
And user click on the any existing added data in the CIF Type Charges and click on the delete button to delete it
And user click on the OK button to close the CIF Type Charges popup menu
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the approve button to approve the changes


@TRS_196
Scenario: Transactions -> Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account - CIF Type Charges - Specific NOT Used - Account

#Pre-requisties
Given user Navigate to CSM Params application and login with valid credentials
And user get the data from the excel sheet for the test case id TRS_196

And user click on the parameters menu under the menu options in the CSM params application
And user click on the system paramters under the parameters menu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the CIF Type charges button
And user click on the any existing added data in the CIF Type Charges and click on the delete button to delete it
And user click on the plus button to add the CIF Type Charges under the CIF Type Charges to link the charge code for AC2
And user enters the CIF Type Charges under the CIF Type Charges column
And user enters the charge scheme code under the Charge Schema Details column
And user selects all from the dropdown list before the cash account column
And user selects account option from the cash account column
And user selects the Authorize from the action column
And user click on the OK button to close the CIF Type Charges popup menu
And user click or check the Transfer Type is Intra Bank
And user click or check the radio button is Main Acc is Debit 
And user click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the approve button to approve the changes
And user click on Log Out icon to log out from the CSM Params application

#Test case execution
Given user Navigate to CSM core application and login with valid credentials
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
And user enters the transaction type for test case
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
Given user Navigate to CSM Params application and login with valid credentials

And user click on the parameters menu under the menu options in the CSM params application
And user click on the system paramters under the parameters menu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the CIF Type charges button
And user click on the any existing added data in the CIF Type Charges and click on the delete button to delete it
And user click on the OK button to close the CIF Type Charges popup menu
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the approve button to approve the changes



@TRS_197
Scenario: Transactions -> Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account - CIF Type Charges - General (CIF1) - Account

#Pre-requisties
Given user Navigate to CSM Params application and login with valid credentials
And user get the data from the excel sheet for the test case id TRS_197

And user click on the parameters menu under the menu options in the CSM params application
And user click on the system paramters under the parameters menu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the CIF Type charges button
And user click on the any existing added data in the CIF Type Charges and click on the delete button to delete it
And user click on the plus button to add the CIF Type Charges under the CIF Type Charges to link the charge code for all account
And user enters the CIF Type Charges under the CIF Type Charges column
And user enters the charge scheme code under the Charge Schema Details column
And user selects all from the dropdown list before the cash account column
And user selects account option from the cash account column
And user selects the Authorize from the action column
And user click on the OK button to close the CIF Type Charges popup menu
And user click or check the Transfer Type is Intra Bank
And user click or check the radio button is Main Acc is Debit 
And user click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the approve button to approve the changes
And user click on Log Out icon to log out from the CSM Params application

#Test case execution
Given user Navigate to CSM core application and login with valid credentials
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
And user enters the transaction type for test case
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
Given user Navigate to CSM Params application and login with valid credentials

And user click on the parameters menu under the menu options in the CSM params application
And user click on the system paramters under the parameters menu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the CIF Type charges button
And user click on the any existing added data in the CIF Type Charges and click on the delete button to delete it
And user click on the OK button to close the CIF Type Charges popup menu
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the approve button to approve the changes





@TRS_198
Scenario: Transactions -> Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account - CIF Type Charges - General (CIF2) - Account

#Pre-requisties
Given user Navigate to CSM Params application and login with valid credentials
And user get the data from the excel sheet for the test case id TRS_198

And user click on the parameters menu under the menu options in the CSM params application
And user click on the system paramters under the parameters menu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the CIF Type charges button
And user click on the any existing added data in the CIF Type Charges and click on the delete button to delete it
And user click on the plus button to add the CIF Type Charges under the CIF Type Charges to link the charge code for all account
And user enters the CIF Type Charges under the CIF Type Charges column
And user enters the charge scheme code under the Charge Schema Details column
And user selects all from the dropdown list before the cash account column
And user selects account option from the cash account column
And user selects the Authorize from the action column
And user click on the OK button to close the CIF Type Charges popup menu
And user click or check the Transfer Type is Intra Bank
And user click or check the radio button is Main Acc is Debit 
And user click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the approve button to approve the changes
And user click on Log Out icon to log out from the CSM Params application

#Test case execution
Given user Navigate to CSM core application and login with valid credentials
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
And user enters the transaction type for test case
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
Given user Navigate to CSM Params application and login with valid credentials

And user click on the parameters menu under the menu options in the CSM params application
And user click on the system paramters under the parameters menu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the CIF Type charges button
And user click on the any existing added data in the CIF Type Charges and click on the delete button to delete it
And user click on the OK button to close the CIF Type Charges popup menu
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the approve button to approve the changes






@TRS_199
Scenario: Transactions -> Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account - CIF Type Charges - Specific Vs. General - Account

#Pre-requisties
Given user Navigate to CSM Params application and login with valid credentials
And user get the data from the excel sheet for the test case id TRS_199

And user click on the parameters menu under the menu options in the CSM params application
And user click on the system paramters under the parameters menu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the CIF Priority charges button
And user click on the any existing added data in the CIF Prioritycharges and click on the delete button to delete it
And user click on the plus button to add the CIF Priority code under the CIF Priority charges
And user enters the CIF Prioritycode under the CIF Priority code column for AC1
And user enters the charge scheme code under the Charge Schema Details column
And user selects all from the dropdown list before the cash account column
And user selects account option from the cash account column
And user selects the Authorize from the action column
And user click on the plus button to add the CIF Priority code under the CIF Priority charges
And user enters the CIF Priority code under the CIF Priority code column to link charge code 2 for AC2
And user enters the charge scheme code under the Charge Schema Details column to link charge code 2
And user selects all from the dropdown list before the cash account column to link charge code 2
And user selects account option from the cash account column to link charge code 2
And user selects the Authorize from the action column to link charge code 2
And user click on the OK button to close the CIF Priority Charges popup menu
And user click or check the Transfer Type is Intra Bank
And user click or check the radio button is Main Acc is Debit 
And user click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the approve button to approve the changes
And user click on Log Out icon to log out from the CSM Params application

#Test case execution
Given user Navigate to CSM core application and login with valid credentials
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
And user enters the transaction type for test case
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
And user enters the transaction type for test case
And user Enter the Branch Code for AC1 in Maintenance Screen for test case id TRS_194_02
And user Enter Currency Code for AC1 in Maintenance Screen for test case id TRS_194_02
And user Enter CIF PriorityCode for AC1 in Maintenance Screen for test case id TRS_194_02
And user Enter CIF Code for AC1 in Maintenance Screen for test case id TRS_194_02
And user Enter Serial for AC1 in Maintenance Screen for test case id TRS_194_02
And user click Ok Button in Warning PopUp Menu
And user Enter the Currency in Maintenance Screen for test case id TRS_194_02
And user Enter the Amount in Maintenance Screen for test case id TRS_194_02
And user Enter the Branch Code for AC2 in Maintenance Screen for test case id TRS_194_02
And user Enter Currency Code for AC2 in Maintenance Screen for test case id TRS_194_02
And user Enter CIF PriorityCode for AC2 in Maintenance Screen for test case id TRS_194_02
And user Enter CIF Code for AC2 in Maintenance Screen for test case id TRS_194_02
And user Enter Serial for AC2 in Maintenance Screen for test case id TRS_194_02
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
Given user Navigate to CSM Params application and login with valid credentials

And user click on the parameters menu under the menu options in the CSM params application
And user click on the system paramters under the parameters menu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the CIF Priority charges button
And user click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user click on the OK button to close the CIF Priority Charges popup menu
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the approve button to approve the changes




@TRS_200
Scenario: Transactions -> Checking Charges Priority Deduction - Account Charges

#Pre-requisties
Given user Navigate to CSM Params application and login with valid credentials
And user get the data from the excel sheet for the test case id TRS_200

And user click on the system paramters under the parameters menu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the Account charges button
And user click on the any existing added data in the Account charges and click on the delete button to delete it
And user click on the plus button to add the Account code under the Account charges
And user enters the Account code under the Account code column
And user enters the charge scheme code under the Charge Schema Details column
And user selects all from the dropdown list before the cash account column
And user selects account option from the cash account column
And user selects the Authorize from the action column
And user click on the OK button to close the Account charges popup menu
And user click on the CIF charges button
And user click on the any existing added data in the CIF charges and click on the delete button to delete it
And user click on the plus button to add the CIF code under the CIF charges
And user enters the CIF code under the CIF code column
And user enters the charge scheme code under the Charge Schema Details column
And user selects all from the dropdown list before the cash account column
And user selects account option from the cash account column
And user selects the Authorize from the action column
And user click on the OK button to close the CIF charges popup menu
And user click on the CIF Priority charges button
And user click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user click on the plus button to add the CIF Priority Charges under the CIF Priority Charges to link the charge code for All account
And user enters the CIF Priority Charges under the CIF Priority Charges column
And user enters the charge scheme code under the Charge Schema Details column
And user selects all from the dropdown list before the cash account column
And user selects account option from the cash account column
And user selects the Authorize from the action column
And user click on the OK button to close the CIF Priority Charges popup menu
And user click on the GL charges button
And user click on the any existing added data in the GL charges and click on the delete button to delete it
And user click on the plus button to add the GL code under the GL charges
And user enters the GL code under the GL code column
And user enters the charge scheme code under the Charge Schema Details column
And user selects all from the dropdown list before the cash account column
And user selects account option from the cash account column
And user selects the Authorize from the action column
And user click on the OK button to close the GL charges popup menu
And user click on the CIF Type charges button
And user click on the any existing added data in the CIF Type Charges and click on the delete button to delete it
And user click on the plus button to add the CIF Type Charges under the CIF Type Charges to link the charge code for AC1
And user enters the CIF Type Charges under the CIF Type Charges column
And user enters the charge scheme code under the Charge Schema Details column
And user selects all from the dropdown list before the cash account column
And user selects account option from the cash account column
And user selects the Authorize from the action column
And user click on the OK button to close the CIF Type Charges popup menu
And user click or check the Transfer Type is Intra Bank
And user click or check the radio button is Main Acc is Debit 
And user click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the approve button to approve the changes
And user click on Log Out icon to log out from the CSM Params application

#Test case execution
Given user Navigate to CSM core application and login with valid credentials
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
And user enters the transaction type for test case
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
Given user Navigate to CSM Params application and login with valid credentials

And user click on the parameters menu under the menu options in the CSM params application
And user click on the system paramters under the parameters menu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the Account charges button
And user click on the any existing added data in the Account charges and click on the delete button to delete it
And user click on the OK button to close the Account charges popup menu
And user click on the CIF charges button
And user click on the any existing added data in the CIF charges and click on the delete button to delete it
And user click on the OK button to close the CIF charges popup menu
And user click on the CIF Priority charges button
And user click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user click on the OK button to close the CIF Priority Charges popup menu
And user click on the GL charges button
And user click on the any existing added data in the GL charges and click on the delete button to delete it
And user click on the OK button to close the GL charges popup menu
And user click on the CIF Type charges button
And user click on the any existing added data in the CIF Type Charges and click on the delete button to delete it
And user click on the OK button to close the CIF Type Charges popup menu
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the approve button to approve the changes

@TRS_201
Scenario: Transactions -> Checking Charges Priority Deduction - CIF Charges

#Pre-requisties
Given user Navigate to CSM Params application and login with valid credentials
And user get the data from the excel sheet for the test case id TRS_201

And user click on the parameters menu under the menu options in the CSM params application
And user click on the system paramters under the parameters menu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the CIF charges button
And user click on the any existing added data in the CIF charges and click on the delete button to delete it
And user click on the plus button to add the CIF code under the CIF charges
And user enters the CIF code under the CIF code column
And user enters the charge scheme code under the Charge Schema Details column
And user selects all from the dropdown list before the cash account column
And user selects account option from the cash account column
And user selects the Authorize from the action column
And user click on the OK button to close the CIF charges popup menu
And user click on the CIF Priority charges button
And user click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user click on the plus button to add the CIF Priority Charges under the CIF Priority Charges to link the charge code for All account
And user enters the CIF Priority Charges under the CIF Priority Charges column
And user enters the charge scheme code under the Charge Schema Details column
And user selects all from the dropdown list before the cash account column
And user selects account option from the cash account column
And user selects the Authorize from the action column
And user click on the OK button to close the CIF Priority Charges popup menu
And user click on the GL charges button
And user click on the any existing added data in the GL charges and click on the delete button to delete it
And user click on the plus button to add the GL code under the GL charges
And user enters the GL code under the GL code column
And user enters the charge scheme code under the Charge Schema Details column
And user selects all from the dropdown list before the cash account column
And user selects account option from the cash account column
And user selects the Authorize from the action column
And user click on the OK button to close the GL charges popup menu
And user click on the CIF Type charges button
And user click on the any existing added data in the CIF Type Charges and click on the delete button to delete it
And user click on the plus button to add the CIF Type Charges under the CIF Type Charges to link the charge code for AC1
And user enters the CIF Type Charges under the CIF Type Charges column
And user enters the charge scheme code under the Charge Schema Details column
And user selects all from the dropdown list before the cash account column
And user selects account option from the cash account column
And user selects the Authorize from the action column
And user click on the OK button to close the CIF Type Charges popup menu
And user click or check the Transfer Type is Intra Bank
And user click or check the radio button is Main Acc is Debit 
And user click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the approve button to approve the changes
And user click on Log Out icon to log out from the CSM Params application

#Test case execution
Given user Navigate to CSM core application and login with valid credentials
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
And user enters the transaction type for test case
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
Given user Navigate to CSM Params application and login with valid credentials

And user click on the parameters menu under the menu options in the CSM params application
And user click on the system paramters under the parameters menu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the CIF charges button
And user click on the any existing added data in the CIF charges and click on the delete button to delete it
And user click on the OK button to close the CIF charges popup menu
And user click on the CIF Priority charges button
And user click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user click on the OK button to close the CIF Priority Charges popup menu
And user click on the GL charges button
And user click on the any existing added data in the GL charges and click on the delete button to delete it
And user click on the OK button to close the GL charges popup menu
And user click on the CIF Type charges button
And user click on the any existing added data in the CIF Type Charges and click on the delete button to delete it
And user click on the OK button to close the CIF Type Charges popup menu
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the approve button to approve the changes

@TRS_202
Scenario: Transactions -> Checking Charges Priority Deduction - CIF Priority Charges

#Pre-requisties
Given user Navigate to CSM Params application and login with valid credentials
And user get the data from the excel sheet for the test case id TRS_202

And user click on the parameters menu under the menu options in the CSM params application
And user click on the system paramters under the parameters menu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the CIF Priority charges button
And user click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user click on the plus button to add the CIF Priority Charges under the CIF Priority Charges to link the charge code for All account
And user enters the CIF Priority Charges under the CIF Priority Charges column
And user enters the charge scheme code under the Charge Schema Details column
And user selects all from the dropdown list before the cash account column
And user selects account option from the cash account column
And user selects the Authorize from the action column
And user click on the OK button to close the CIF Priority Charges popup menu
And user click on the GL charges button
And user click on the any existing added data in the GL charges and click on the delete button to delete it
And user click on the plus button to add the GL code under the GL charges
And user enters the GL code under the GL code column
And user enters the charge scheme code under the Charge Schema Details column
And user selects all from the dropdown list before the cash account column
And user selects account option from the cash account column
And user selects the Authorize from the action column
And user click on the OK button to close the GL charges popup menu
And user click on the CIF Type charges button
And user click on the any existing added data in the CIF Type Charges and click on the delete button to delete it
And user click on the plus button to add the CIF Type Charges under the CIF Type Charges to link the charge code for AC1
And user enters the CIF Type Charges under the CIF Type Charges column
And user enters the charge scheme code under the Charge Schema Details column
And user selects all from the dropdown list before the cash account column
And user selects account option from the cash account column
And user selects the Authorize from the action column
And user click on the OK button to close the CIF Type Charges popup menu
And user click or check the Transfer Type is Intra Bank
And user click or check the radio button is Main Acc is Debit 
And user click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the approve button to approve the changes
And user click on Log Out icon to log out from the CSM Params application

#Test case execution
Given user Navigate to CSM core application and login with valid credentials
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
And user enters the transaction type for test case
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
Given user Navigate to CSM Params application and login with valid credentials

And user click on the parameters menu under the menu options in the CSM params application
And user click on the system paramters under the parameters menu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the CIF Priority charges button
And user click on the any existing added data in the CIF Priority Charges and click on the delete button to delete it
And user click on the OK button to close the CIF Priority Charges popup menu
And user click on the GL charges button
And user click on the any existing added data in the GL charges and click on the delete button to delete it
And user click on the OK button to close the GL charges popup menu
And user click on the CIF Type charges button
And user click on the any existing added data in the CIF Type Charges and click on the delete button to delete it
And user click on the OK button to close the CIF Type Charges popup menu
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the approve button to approve the changes

@TRS_203
Scenario: Transactions -> Checking Charges Priority Deduction - GL Charges

#Pre-requisties
Given user Navigate to CSM Params application and login with valid credentials
And user get the data from the excel sheet for the test case id TRS_202

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
And user click on the CIF Type charges button
And user click on the any existing added data in the CIF Type Charges and click on the delete button to delete it
And user click on the plus button to add the CIF Type Charges under the CIF Type Charges to link the charge code for AC1
And user enters the CIF Type Charges under the CIF Type Charges column
And user enters the charge scheme code under the Charge Schema Details column
And user selects all from the dropdown list before the cash account column
And user selects account option from the cash account column
And user selects the Authorize from the action column
And user click on the OK button to close the CIF Type Charges popup menu
And user click or check the Transfer Type is Intra Bank
And user click or check the radio button is Main Acc is Debit 
And user click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the approve button to approve the changes
And user click on Log Out icon to log out from the CSM Params application

#Test case execution
Given user Navigate to CSM core application and login with valid credentials
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
And user enters the transaction type for test case
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
Given user Navigate to CSM Params application and login with valid credentials

And user click on the parameters menu under the menu options in the CSM params application
And user click on the system paramters under the parameters menu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the GL charges button
And user click on the any existing added data in the GL charges and click on the delete button to delete it
And user click on the OK button to close the GL charges popup menu
And user click on the CIF Type charges button
And user click on the any existing added data in the CIF Type Charges and click on the delete button to delete it
And user click on the OK button to close the CIF Type Charges popup menu
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the approve button to approve the changes

@TRS_204
Scenario: Transactions -> Checking Charges Priority Deduction - CIF Type Charges

#Pre-requisties
Given user Navigate to CSM Params application and login with valid credentials
And user get the data from the excel sheet for the test case id TRS_202

And user click on the parameters menu under the menu options in the CSM params application
And user click on the system paramters under the parameters menu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the CIF Type charges button
And user click on the any existing added data in the CIF Type Charges and click on the delete button to delete it
And user click on the plus button to add the CIF Type Charges under the CIF Type Charges to link the charge code for AC1
And user enters the CIF Type Charges under the CIF Type Charges column
And user enters the charge scheme code under the Charge Schema Details column
And user selects all from the dropdown list before the cash account column
And user selects account option from the cash account column
And user selects the Authorize from the action column
And user click on the OK button to close the CIF Type Charges popup menu
And user click or check the Transfer Type is Intra Bank
And user click or check the radio button is Main Acc is Debit 
And user click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the approve button to approve the changes
And user click on Log Out icon to log out from the CSM Params application

#Test case execution
Given user Navigate to CSM core application and login with valid credentials
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
And user enters the transaction type for test case
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
Given user Navigate to CSM Params application and login with valid credentials

And user click on the parameters menu under the menu options in the CSM params application
And user click on the system paramters under the parameters menu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the CIF Type charges button
And user click on the any existing added data in the CIF Type Charges and click on the delete button to delete it
And user click on the OK button to close the CIF Type Charges popup menu
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the approve button to approve the changes



@TRS_205
Scenario: Transactions -> Checking Charges Priority Deduction - Specific Vs. General

#Pre-requisties
Given user Navigate to CSM Params application and login with valid credentials
And user get the data from the excel sheet for the test case id TRS_202

And user click on the parameters menu under the menu options in the CSM params application
And user click on the system paramters under the parameters menu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the CIF charges button
And user click on the any existing added data in the CIF charges and click on the delete button to delete it
And user click on the plus button to add the CIF code under the CIF charges
And user enters the CIF code under the CIF code column
And user enters the charge scheme code under the Charge Schema Details column
And user selects all from the dropdown list before the cash account column
And user selects account option from the cash account column
And user selects the Authorize from the action column
And user click on the OK button to close the CIF charges popup menu
And user click on the GL charges button
And user click on the any existing added data in the GL charges and click on the delete button to delete it
And user click on the plus button to add the GL code under the GL charges
And user enters the GL code under the GL code column
And user enters the charge scheme code under the Charge Schema Details column
And user selects all from the dropdown list before the cash account column
And user selects account option from the cash account column
And user selects the Authorize from the action column
And user click on the plus button to add the GL code under the GL charges for all account
And user enters the GL code under the GL code column for all account
And user enters the charge scheme code under the Charge Schema Details column for all account
And user selects all from the dropdown list before the cash account column for all account
And user selects account option from the cash account column for all account
And user selects the Authorize from the action column for all account
And user click on the OK button to close the GL charges popup menu
And user click or check the Transfer Type is Intra Bank
And user click or check the radio button is Main Acc is Debit 
And user click or check the radio button Deduct From Debtor Account under Available Options for Deduct I menu
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the approve button to approve the changes
And user click on Log Out icon to log out from the CSM Params application

#Test case execution
Given user Navigate to CSM core application and login with valid credentials
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
And user enters the transaction type for test case
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
Given user Navigate to CSM Params application and login with valid credentials

And user click on the parameters menu under the menu options in the CSM params application
And user click on the system paramters under the parameters menu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the CIF charges button
And user click on the any existing added data in the CIF charges and click on the delete button to delete it
And user click on the OK button to close the CIF charges popup menu
And user click on the GL charges button
And user click on the any existing added data in the GL charges and click on the delete button to delete it
And user click on the any existing added data in the GL charges and click on the delete button to delete it
And user click on the OK button to close the GL charges popup menu
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details
And user click on the approve button to approve the changes















