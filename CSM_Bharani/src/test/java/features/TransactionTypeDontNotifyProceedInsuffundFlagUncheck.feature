Feature: Checking functionality of transaction
@TRS_218
Scenario: Checking the transaction - GL type field - Don’t notify and proceed - Proceed on insufficient funds flag unchecked

#Pre-requisties
Given user Navigate to CSM Params application and login with valid credentials
And user navigate to account parameters
Then user navigate to general ledger under account parameters
And user click the Update after approve in general ledger flag
Then user enter the code in the code column under update after approve
Then user double click the entered code to view the details in update after approve screen
And user click the additional details button in the update after approve
Then user select the dont notify and proceed under allow overdraw option
And user click the update button to save the record in update after approve screen
Then user click the ok popup to close the confirmation box
And user click the approve in general ledger
Then user enter the code in the code column in approve flag
Then user double click the entered code to view the details in approve screen
And user click the approve button to save the record in approve screen
Then user click the ok button in the confirmation box to save the record
Then user click the ok popup to close the confirmation box

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
And user click the transaction flag un CSM core application
Then user click the maintenance under transaction flag
And user enters the transaction type code under maintenance flag
Then user enters the currency code for AC1 in maintenance flag 
And user enters the GL code for AC1 in maintenance flag 
Then user enters the cif code for AC1 in maintenance flag 
And user enters the serial number for AC1 in maintenance flag
Then user enters the currency in maintenance flag
And user enters the currecy code for AC2 in maintenance flag
Then user enters the GL code for AC2 in maintenance flag
And user enters the cif code for AC2 in maintenance flag
Then user enters the serial number for AC2 in maintenance flag
And click the ok button in the warning popup
Then enter the amount in the maintenance screen
And click the ok button in the warning popup
Then Click the save button to save the record in maintenance screen
And click the ok button in the warning popup
Then user click the ok popup to close the confirmation box






