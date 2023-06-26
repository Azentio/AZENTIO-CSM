Feature: Checking functionality of transaction
@TRS_218
Scenario: Checking the transaction - GL type field - Don’t notify and proceed - Proceed on insufficient funds flag unchecked

#Pre-requisties
Given user Navigate to CSM Params application and login with valid credentials
And user update test data set id for TRS_218
And user click the parameters menu
And user navigate to account parameters
Then user navigate to general ledger under account parameters
And user click the Update after approve in general ledger flag
Then user enter the code in the code column under update after approve
Then user double click the entered code to view the details in update after approve screen
And user click the additional details button in the update after approve
Then user select the dropdown values under allow overdraw option
And user click the update button to save the record in update after approve screen
Then user click the ok popup to close the confirmation box
And user click the approve in general ledger
Then user enter the code in the code column in approve flag
Then user double click the entered code to view the details in approve screen
And user click the approve button to save the record in approve screen
Then user click the ok button in the confirmation box to save the record
Then user click the ok popup to close the confirmation box
And user click the system parameters submenu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And User unCheck the ProceedOnInsufficientFund flag chequebox 
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details in approve screen
And user click on the approve button to approve the changes
And user click on Log Out icon to log out from the CSM Params application

#Test case execution
Given user Navigate to CSM core application and login with valid credentials
And user click on Date to Change the Current Date in the CSM core application
And user Enters the Date in user Running Date in the CSM core application
And user click on Use Button in Change Running Date Popup in the CSM core application
And User Click Ok Button for confirmation PopUp for Company Holiday
And user click Ok Button in Information PopUp menu in the CSM core application
And user click on Close Button in Change Running Date Popup in the CSM core application
And user click on Technical Details Icon in the CSM core application
And user click Clear Cache in Technical Details Icon in the CSM core application
And user click Ok Button Under Information PopUp Menu in the CSM core application
And user click on Transactions under CSM application in the CSM core application
And user click on Maintenance under Transactions in the CSM core application
And user enters the transaction type
#Then user Enter the Branch Code for AC1 in Maintenance Screen
And user Enter Currency Code for AC1 in Maintenance Screen
And user click random click
And user Enter GL Code for AC1 in Maintenance Screen
And user click random click
Then user Enter CIF Code for AC1 in Maintenance Screen 
And user click random click
And user Enter Serial for AC1 in Maintenance Screen
And user click random click
Then user Enter the Currency in Maintenance Screen
And user click random click
Then user Enter the Amount in Maintenance Screen
#Then user verify the cannot proceed message 

@TRS_219
Scenario: Transaction with template entries - Checking the transaction where GL type field is 'Don’t notify and proceed,'Proceed on insufficient funds' flag checked at Transaction type
#Pre-requisties
Given user Navigate to CSM Params application and login with valid credentials
And user update test data set id for TRS_219
And user click the parameters menu
And user navigate to account parameters
Then user navigate to general ledger under account parameters
And user click the Update after approve in general ledger flag
Then user enter the code in the code column under update after approve
Then user double click the entered code to view the details in update after approve screen
And user click the additional details button in the update after approve
Then user select the dropdown values under allow overdraw option
And user click the update button to save the record in update after approve screen
Then user click the ok popup to close the confirmation box
And user click the approve in general ledger
Then user enter the code in the code column in approve flag
Then user double click the entered code to view the details in approve screen
And user click the approve button to save the record in approve screen
Then user click the ok button in the confirmation box to save the record
Then user click the ok popup to close the confirmation box
And user click the system parameters submenu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And User Check the ProceedOnInsufficientFund flag chequebox 
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details in approve screen
And user click on the approve button to approve the changes

#Test case execution
Given user Navigate to CSM core application and login with valid credentials
And user click on Date to Change the Current Date in the CSM core application
And user Enters the Date in user Running Date in the CSM core application
And user click on Use Button in Change Running Date Popup in the CSM core application
And User Click Ok Button for confirmation PopUp for Company Holiday
And user click Ok Button in Information PopUp menu in the CSM core application
And user click on Close Button in Change Running Date Popup in the CSM core application
And user click on Technical Details Icon in the CSM core application
And user click Clear Cache in Technical Details Icon in the CSM core application
And user click Ok Button Under Information PopUp Menu in the CSM core application
And user click on Transactions under CSM application in the CSM core application
And user click on Maintenance under Transactions in the CSM core application
And user enters the transaction type
And user Enter Currency Code for AC1 in Maintenance Screen
And user click random click
And user Enter GL Code for AC1 in Maintenance Screen
And user click random click
Then user Enter CIF Code for AC1 in Maintenance Screen 
And user click random click
And user Enter Serial for AC1 in Maintenance Screen
And user click random click
And user click Ok Button in Warning PopUp Menu
Then user Enter the Currency in Maintenance Screen
And user click random click
And user Enter Currency Code for AC2 in Maintenance Screen
And user click random click
Then user Enter GL Code for AC2 in Maintenance Screen
And user click random click
And user Enter CIF Code for AC2 in Maintenance Screen
And user click random click
Then user Enter Serial for AC2 in Maintenance Screen
And user click random click
Then user Enter the Amount in Maintenance Screen
And user click random click
And user click Ok Button in Warning PopUp Menu
Then user click Save Button in Maintenance Screen
And user Get the Transaction No in Success PopUp Menu
And user click Ok Button in Success PopUp Menu
And user click on Approve Screen under Transactions menu
And user Enter the Transaction No in Approve Screens
And user Double click on the Transaction No
And user click on Approve Button for approve the Transaction
And user click on Ok Button in Success PopUp Menu for Approve Transcation

@TRS_220
Scenario: Transaction with template entries - Checking the transaction where GL type field is 'Notify and Don’t Proceed', 'Proceed on insufficient funds' flag unchecked at Transaction type
#Pre-requisties
Given user Navigate to CSM Params application and login with valid credentials
And user update test data set id for TRS_220
And user click the parameters menu
And user navigate to account parameters
Then user navigate to general ledger under account parameters
And user click the Update after approve in general ledger flag
Then user enter the code in the code column under update after approve
Then user double click the entered code to view the details in update after approve screen
And user click the additional details button in the update after approve
Then user select the dropdown values under allow overdraw option
And user click the update button to save the record in update after approve screen
Then user click the ok popup to close the confirmation box
And user click the approve in general ledger
Then user enter the code in the code column in approve flag
Then user double click the entered code to view the details in approve screen
And user click the approve button to save the record in approve screen
Then user click the ok button in the confirmation box to save the record
Then user click the ok popup to close the confirmation box
And user click the system parameters submenu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And User unCheck the ProceedOnInsufficientFund flag chequebox 
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details in approve screen
And user click on the approve button to approve the changes

#Test case execution
Given user Navigate to CSM core application and login with valid credentials
And user click on Date to Change the Current Date in the CSM core application
And user Enters the Date in user Running Date in the CSM core application
And user click on Use Button in Change Running Date Popup in the CSM core application
And User Click Ok Button for confirmation PopUp for Company Holiday
And user click Ok Button in Information PopUp menu in the CSM core application
And user click on Close Button in Change Running Date Popup in the CSM core application
And user click on Technical Details Icon in the CSM core application
And user click Clear Cache in Technical Details Icon in the CSM core application
And user click Ok Button Under Information PopUp Menu in the CSM core application
And user click on Transactions under CSM application in the CSM core application
And user click on Maintenance under Transactions in the CSM core application
And user enters the transaction type
And user Enter Currency Code for AC1 in Maintenance Screen
And user click random click
And user Enter GL Code for AC1 in Maintenance Screen
And user click random click
Then user Enter CIF Code for AC1 in Maintenance Screen 
And user click random click
And user Enter Serial for AC1 in Maintenance Screen
And user click random click
#And user click Ok Button in Warning PopUp Menu
Then user Enter the Currency in Maintenance Screen
And user click random click
Then user Enter the Amount in Maintenance Screen
#Then user verify the cannot proceed message 

@TRS_221
Scenario: Transaction with template entries - Checking the transaction where GL type field is 'Notify and Don’t Proceed','Proceed on insufficient funds' flag checked at Transaction type
#Pre-requisties
Given user Navigate to CSM Params application and login with valid credentials
And user update test data set id for TRS_221
And user click the parameters menu
And user navigate to account parameters
Then user navigate to general ledger under account parameters
And user click the Update after approve in general ledger flag
Then user enter the code in the code column under update after approve
Then user double click the entered code to view the details in update after approve screen
And user click the additional details button in the update after approve
Then user select the dropdown values under allow overdraw option
And user click the update button to save the record in update after approve screen
Then user click the ok popup to close the confirmation box
And user click the approve in general ledger
Then user enter the code in the code column in approve flag
Then user double click the entered code to view the details in approve screen
And user click the approve button to save the record in approve screen
Then user click the ok button in the confirmation box to save the record
Then user click the ok popup to close the confirmation box
And user click the system parameters submenu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And User Check the ProceedOnInsufficientFund flag chequebox 
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details in approve screen
And user click on the approve button to approve the changes

#Test case execution
Given user Navigate to CSM core application and login with valid credentials
And user click on Date to Change the Current Date in the CSM core application
And user Enters the Date in user Running Date in the CSM core application
And user click on Use Button in Change Running Date Popup in the CSM core application
And User Click Ok Button for confirmation PopUp for Company Holiday
And user click Ok Button in Information PopUp menu in the CSM core application
And user click on Close Button in Change Running Date Popup in the CSM core application
And user click on Technical Details Icon in the CSM core application
And user click Clear Cache in Technical Details Icon in the CSM core application
And user click Ok Button Under Information PopUp Menu in the CSM core application
And user click on Transactions under CSM application in the CSM core application
And user click on Maintenance under Transactions in the CSM core application
And user enters the transaction type
And user Enter Currency Code for AC1 in Maintenance Screen
And user click random click
And user Enter GL Code for AC1 in Maintenance Screen
And user click random click
Then user Enter CIF Code for AC1 in Maintenance Screen 
And user click random click
And user Enter Serial for AC1 in Maintenance Screen
And user click random click
#And user click Ok Button in Warning PopUp Menu
Then user Enter the Currency in Maintenance Screen
And user click random click
Then user Enter the Amount in Maintenance Screen
#Then user verify the cannot proceed message 

@TRS_222
Scenario: Transaction with template entries  - Checking the transaction where GL type field is 'Notify and Proceed ','Proceed on insufficient funds' flag unchecked at Transaction type
#Pre-requisties
Given user Navigate to CSM Params application and login with valid credentials
And user update test data set id for TRS_222
And user click the parameters menu
And user navigate to account parameters
Then user navigate to general ledger under account parameters
And user click the Update after approve in general ledger flag
Then user enter the code in the code column under update after approve
Then user double click the entered code to view the details in update after approve screen
And user click the additional details button in the update after approve
Then user select the dropdown values under allow overdraw option
And user click the update button to save the record in update after approve screen
Then user click the ok popup to close the confirmation box
And user click the approve in general ledger
Then user enter the code in the code column in approve flag
Then user double click the entered code to view the details in approve screen
And user click the approve button to save the record in approve screen
Then user click the ok button in the confirmation box to save the record
Then user click the ok popup to close the confirmation box
And user click the system parameters submenu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And User unCheck the ProceedOnInsufficientFund flag chequebox 
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details in approve screen
And user click on the approve button to approve the changes

#Test case execution
Given user Navigate to CSM core application and login with valid credentials
And user click on Date to Change the Current Date in the CSM core application
And user Enters the Date in user Running Date in the CSM core application
And user click on Use Button in Change Running Date Popup in the CSM core application
And User Click Ok Button for confirmation PopUp for Company Holiday
And user click Ok Button in Information PopUp menu in the CSM core application
And user click on Close Button in Change Running Date Popup in the CSM core application
And user click on Technical Details Icon in the CSM core application
And user click Clear Cache in Technical Details Icon in the CSM core application
And user click Ok Button Under Information PopUp Menu in the CSM core application
And user click on Transactions under CSM application in the CSM core application
And user click on Maintenance under Transactions in the CSM core application
And user enters the transaction type
And user Enter Currency Code for AC1 in Maintenance Screen
And user click random click
And user Enter GL Code for AC1 in Maintenance Screen
And user click random click
Then user Enter CIF Code for AC1 in Maintenance Screen 
And user click random click
And user Enter Serial for AC1 in Maintenance Screen
And user click random click
#And user click Ok Button in Warning PopUp Menu
Then user Enter the Currency in Maintenance Screen
And user click random click
Then user Enter the Amount in Maintenance Screen
#Then user verify the cannot proceed message 

@TRS_223
Scenario: Transaction with template entries  - Checking the transaction where GL type field is 'Notify and Proceed ','Proceed on insufficient funds' flag checked at Transaction type
#Pre-requisties
Given user Navigate to CSM Params application and login with valid credentials
And user update test data set id for TRS_223
And user click the parameters menu
And user navigate to account parameters
Then user navigate to general ledger under account parameters
And user click the Update after approve in general ledger flag
Then user enter the code in the code column under update after approve
Then user double click the entered code to view the details in update after approve screen
And user click the additional details button in the update after approve
Then user select the dropdown values under allow overdraw option
And user click the update button to save the record in update after approve screen
Then user click the ok popup to close the confirmation box
And user click the approve in general ledger
Then user enter the code in the code column in approve flag
Then user double click the entered code to view the details in approve screen
And user click the approve button to save the record in approve screen
Then user click the ok button in the confirmation box to save the record
Then user click the ok popup to close the confirmation box
And user click the system parameters submenu
And user click on the transaction type under the system parameters
And user click on the update after approve field under the transaction type
And user enters the transaction type code in the code column under the update after approve
And user double clicks on the entered transaction type code from the list to view the transaction type details
And User Check the ProceedOnInsufficientFund flag chequebox  
And user click on the update after approve button to save the changes
And user click on the approve field under the transaction type menu
And user enters the transaction type code in the code column under the approve menu
And user double clicks on the entered transaction type code from the list to view the transaction type details in approve screen
And user click on the approve button to approve the changes

#Test case execution
Given user Navigate to CSM core application and login with valid credentials
And user click on Date to Change the Current Date in the CSM core application
And user Enters the Date in user Running Date in the CSM core application
And user click on Use Button in Change Running Date Popup in the CSM core application
And User Click Ok Button for confirmation PopUp for Company Holiday
And user click Ok Button in Information PopUp menu in the CSM core application
And user click on Close Button in Change Running Date Popup in the CSM core application
And user click on Technical Details Icon in the CSM core application
And user click Clear Cache in Technical Details Icon in the CSM core application
And user click Ok Button Under Information PopUp Menu in the CSM core application
And user click on Transactions under CSM application in the CSM core application
And user click on Maintenance under Transactions in the CSM core application
And user enters the transaction type
And user Enter Currency Code for AC1 in Maintenance Screen
And user click random click
And user Enter GL Code for AC1 in Maintenance Screen
And user click random click
Then user Enter CIF Code for AC1 in Maintenance Screen 
And user click random click
And user Enter Serial for AC1 in Maintenance Screen
And user click random click
#And user click Ok Button in Warning PopUp Menu
Then user Enter the Currency in Maintenance Screen
And user click random click
Then user Enter the Amount in Maintenance Screen
And user click Ok Button in Warning PopUp Menu
Then user Enter the Currency in Maintenance Screen
And user click random click
And user Enter Currency Code for AC2 in Maintenance Screen
And user click random click
Then user Enter GL Code for AC2 in Maintenance Screen
And user click random click
And user Enter CIF Code for AC2 in Maintenance Screen
And user click random click
Then user Enter Serial for AC2 in Maintenance Screen
And user click random click
Then user Enter the Amount in Maintenance Screen
And user click random click
And user click Ok Button in Warning PopUp Menu
Then user click Save Button in Maintenance Screen
And user Get the Transaction No in Success PopUp Menu
And user click Ok Button in Success PopUp Menu
And user click on Approve Screen under Transactions menu
And user Enter the Transaction No in Approve Screens
And user Double click on the Transaction No
And user click on Approve Button for approve the Transaction
And user click on Ok Button in Success PopUp Menu for Approve Transcation














