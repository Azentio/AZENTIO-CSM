Feature: User_0072 create the Amend Transfer Account in Branch to Branch
@TA_007
Scenario: Amending an existing created batch record when the alert flag is checked/ From branch to branch
Given User_0072 Login to CSM Param in Transfer Account
And User_0072 click the Parameters in Transfer Account 
And User_0072 click the System Parameters in Transfer Account 
And User_0072 Click the Control Record in Transfer Account
And User_0072 Click the Update after Approve 
And User_0072 Click the Alert Activation in Transfer Account
And User_0072 Click the No Access Privilege button
And User_0072 Click the transfer Branch creation uncheck button 
And User_0072 Click the Transfer Cancellation uncheck button
And User_0072 Click the No Access Privelege uncheck button
And User_0072 Enter the Transfer creation process uncheck
And User_0072 Enter the Cancel process in uncheck
And User_0072 Enter the Privilege Access process uncheck
And User_0072 Click the Submit Update After Aprrove button
And User_0072 Click the ok button Popup menu
And User_0072 Click the Success button in Popup menu
And User_0072 click the Approve button in Tansfer Account
And User_0072 click submit Approve Box in Transfer Account
Given navigate to CSM application and login with valid credentials
    #And User_0072 update test data set id for TA_001
    And User_0072 click on Date to Change the Current Date in the CSM core application
    And User_0072 Enters the Date in User_0072 Running Date in the CSM core application
    And User_0072 click on Use Button in Change Running Date Popup in the CSM core application
    And User_0072 Click Ok Button for confirmation PopUp for Company Holiday
    And User_0072 click Ok Button in Information PopUp menu in the CSM core application
    And User_0072 click on Close Button in Change Running Date Popup in the CSM core application
    And User_0072 click on Technical Details Icon in the CSM core application
    And User_0072 click Clear Cache in Technical Details Icon in the CSM core application
    And User_0072 click Ok Button Under Information PopUp Menu in the CSM core application
    And User_0072 click TransferAccount field on CSMCore
    And User_0072 click maintenance field under TransferAccount
    And User_0072 enter the TransferType under maintanence screen
    And User_0072 enter the Reason under maintanence screen
    And User_0072 enter the Destination Branch under maintanence screen
    And User_0072 enter the BranchCode under FromAccount
    And User_0072 enter the CurrencyCode under FromAccount
    And User_0072 enter the GLCode under FromAccount
    And User_0072 enter the CIFCode under FromAccount
    And User_0072 enter the SerialNumber under FromAccount
    And User_0072 enter the BranchCode under TOAccount
    And User_0072 enter the CurrencyCode under TOAccount
    And User_0072 enter the GLCode under TOAccount
    And User_0072 enter the CIFCode under TOAccount
    And User_0072 enter the SerialNumber under TOAccount
    And User_0072 click the retrive button under maintenance screen
    And User_0072 select the Record under TransferManagement screen
    And User_0072 click the Save button under maintanance screen
    And User_0072 click the Approve field under TransferAccount field
    And User_0072 enter the Record in Approve field
    And User_0072 double click the record in approve field
    #And User_0072 click the Approve button under Approve field
    And User_0072 click the Transfer field under TransferAccount field
    And User_0072 enter the Record in Transfer field
    And User_0072 double click the record in Transfer field
    And User_0072 click the Transfer button under Transfer field
    And User_0072 click Ok Button Under Information PopUp Menu in the CSM core application

@TA_009
Scenario: Amending an existing created batch record when the alert flag"no access privilege" is checked/ From branch to branch
Given User_0072 Login to CSM Param in Transfer Account
And User_0072 click the Parameters in Transfer Account 
And User_0072 click the System Parameters in Transfer Account 
And User_0072 Click the Control Record in Transfer Account
And User_0072 Click the Update after Approve 
And User_0072 Click the Alert Activation in Transfer Account
And User_0072 Click the No Access Privilege button
And User_0072 Click the transfer Branch creation uncheck button 
And User_0072 Click the Transfer Cancellation uncheck button
And User_0072 Click the No Access Privelege uncheck button
And User_0072 Enter the Transfer creation process uncheck
And User_0072 Enter the Cancel process in uncheck
And User_0072 Enter the Privilege Access process uncheck
And User_0072 Click the Submit Update After Aprrove button
And User_0072 Click the ok button Popup menu
And User_0072 Click the Success button in Popup menu
And User_0072 click the Approve button in Tansfer Account
And User_0072 click submit Approve Box in Transfer Account
Given navigate to CSM application and login with valid credentials
    #And User_0072 update test data set id for TA_001
    And User_0072 click on Date to Change the Current Date in the CSM core application
    And User_0072 Enters the Date in User_0072 Running Date in the CSM core application
    And User_0072 click on Use Button in Change Running Date Popup in the CSM core application
    And User_0072 Click Ok Button for confirmation PopUp for Company Holiday
    And User_0072 click Ok Button in Information PopUp menu in the CSM core application
    And User_0072 click on Close Button in Change Running Date Popup in the CSM core application
    And User_0072 click on Technical Details Icon in the CSM core application
    And User_0072 click Clear Cache in Technical Details Icon in the CSM core application
    And User_0072 click Ok Button Under Information PopUp Menu in the CSM core application
    And User_0072 click TransferAccount field on CSMCore
    And User_0072 click maintenance field under TransferAccount
    And User_0072 enter the TransferType under maintanence screen
    And User_0072 enter the Reason under maintanence screen
    And User_0072 enter the Destination Branch under maintanence screen
    And User_0072 enter the BranchCode under FromAccount
    And User_0072 enter the CurrencyCode under FromAccount
    And User_0072 enter the GLCode under FromAccount
    And User_0072 enter the CIFCode under FromAccount
    And User_0072 enter the SerialNumber under FromAccount
    And User_0072 enter the BranchCode under TOAccount
    And User_0072 enter the CurrencyCode under TOAccount
    And User_0072 enter the GLCode under TOAccount
    And User_0072 enter the CIFCode under TOAccount
    And User_0072 enter the SerialNumber under TOAccount
    And User_0072 click the retrive button under maintenance screen
    And User_0072 select the Record under TransferManagement screen
    And User_0072 click the Save button under maintanance screen
    And User_0072 click the Approve field under TransferAccount field
    And User_0072 enter the Record in Approve field
    And User_0072 double click the record in approve field
    And User_0072 click the Approve button under Approve field
    And User_0072 click the Transfer field under TransferAccount field
    And User_0072 enter the Record in Transfer field
    And User_0072 double click the record in Transfer field
    And User_0072 click the Transfer button under Transfer field
    And User_0072 click Ok Button Under Information PopUp Menu in the CSM core application