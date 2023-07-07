Feature: User_inin72 create the Amend Transfer Account in GL exception 
@TA_018
Scenario: Creating batch record when GL exception is defined
Given User_inin72 Login to CSM Param in Transfer Account
And User_inin72 click the Parameters in Transfer Account 
And User_inin72 click the System Parameters in Transfer Account 
And User_inin72 Click the Control Record in Transfer Account
And User_inin72 Click the Update after Approve 
And User_inin72 Click the Alert Activation in Transfer Account
And User_inin72 Click the No Access Privilege button
And User_inin72 Click the transfer Branch creation uncheck button 
And User_inin72 Click the Transfer Cancellation uncheck button
And User_inin72 Click the No Access Privelege uncheck button
And User_inin72 Enter the Transfer creation process uncheck
And User_inin72 Enter the Cancel process in uncheck
And User_inin72 Enter the Privilege Access process uncheck
And User_inin72 Click the Submit Update After Aprrove button
And User_inin72 Click the ok button Popup menu
And User_inin72 Click the Success button in Popup menu
And User_inin72 click the Approve button in Tansfer Account
And User_inin72 click submit Approve Box in Transfer Account
Given navigate to CSM application and login with valid credentials
    #And User_inin72 update test data set id for TA_001
    And User_inin72 click on Date to Change the Current Date in the CSM core application
    And User_inin72 Enters the Date in User_inin72 Running Date in the CSM core application
    And User_inin72 click on Use Button in Change Running Date Popup in the CSM core application
    And User_inin72 Click Ok Button for confirmation PopUp for Company Holiday
    And User_inin72 click Ok Button in Information PopUp menu in the CSM core application
    And User_inin72 click on Close Button in Change Running Date Popup in the CSM core application
    And User_inin72 click on Technical Details Icon in the CSM core application
    And User_inin72 click Clear Cache in Technical Details Icon in the CSM core application
    And User_inin72 click Ok Button Under Information PopUp Menu in the CSM core application
    And User_inin72 click TransferAccount field on CSMCore
    And User_inin72 click maintenance field under TransferAccount
    And User_inin72 enter the TransferType under maintanence screen
    And User_inin72 enter the Reason under maintanence screen
    And User_inin72 enter the Destination Branch under maintanence screen
    And User_inin72 enter the BranchCode under FromAccount
    And User_inin72 enter the CurrencyCode under FromAccount
    And User_inin72 enter the GLCode under FromAccount
    And User_inin72 enter the CIFCode under FromAccount
    And User_inin72 enter the SerialNumber under FromAccount
    And User_inin72 enter the BranchCode under TOAccount
    And User_inin72 enter the CurrencyCode under TOAccount
    And User_inin72 enter the GLCode under TOAccount
    And User_inin72 enter the CIFCode under TOAccount
    And User_inin72 enter the SerialNumber under TOAccount
    And User_inin72 click the retrive button under maintenance screen
    And User_inin72 click the Set Exceptions in Transfer Account
    And User_inin72 click the Add Button Transfer Account
    And User_inin72 click the Transfer Accounts Criteria Tb
    And User_inin72 click the Exception Select filed Transfer Account
    And User_inin72 click the Search Button Transfer Account
    And User_inin72 click the GL Code TransferAccount
    And User_inin72 Double Click on the GL Code Transfer Account
    And User_inin72 click the Click Ok Button Transfer Account
    And User_inin72 select the Record under TransferManagement screen
    And User_inin72 click the Save button under maintanance screen
    And User_inin72 click the Approve field under TransferAccount field
    And User_inin72 enter the Record in Approve field
    And User_inin72 double click the record in approve field
    #And User_inin72 click the Approve button under Approve field
    And User_inin72 click the Transfer field under TransferAccount field
    And User_inin72 enter the Record in Transfer field
    And User_inin72 double click the record in Transfer field
    And User_inin72 click the Transfer button under Transfer field
    And User_inin72 click Ok Button Under Information PopUp Menu in the CSM core application
    
    @TA_019
    Scenario: Creating batch record when multi GL exceptions are defined
    Given User_inin72 Login to CSM Param in Transfer Account
And User_inin72 click the Parameters in Transfer Account 
And User_inin72 click the System Parameters in Transfer Account 
And User_inin72 Click the Control Record in Transfer Account
And User_inin72 Click the Update after Approve 
And User_inin72 Click the Alert Activation in Transfer Account
And User_inin72 Click the No Access Privilege button
And User_inin72 Click the transfer Branch creation uncheck button 
And User_inin72 Click the Transfer Cancellation uncheck button
And User_inin72 Click the No Access Privelege uncheck button
And User_inin72 Enter the Transfer creation process uncheck
And User_inin72 Enter the Cancel process in uncheck
And User_inin72 Enter the Privilege Access process uncheck
And User_inin72 Click the Submit Update After Aprrove button
And User_inin72 Click the ok button Popup menu
And User_inin72 Click the Success button in Popup menu
And User_inin72 click the Approve button in Tansfer Account
And User_inin72 click submit Approve Box in Transfer Account
Given navigate to CSM application and login with valid credentials
    #And User_inin72 update test data set id for TA_001
    And User_inin72 click on Date to Change the Current Date in the CSM core application
    And User_inin72 Enters the Date in User_inin72 Running Date in the CSM core application
    And User_inin72 click on Use Button in Change Running Date Popup in the CSM core application
    And User_inin72 Click Ok Button for confirmation PopUp for Company Holiday
    And User_inin72 click Ok Button in Information PopUp menu in the CSM core application
    And User_inin72 click on Close Button in Change Running Date Popup in the CSM core application
    And User_inin72 click on Technical Details Icon in the CSM core application
    And User_inin72 click Clear Cache in Technical Details Icon in the CSM core application
    And User_inin72 click Ok Button Under Information PopUp Menu in the CSM core application
    And User_inin72 click TransferAccount field on CSMCore
    And User_inin72 click maintenance field under TransferAccount
    And User_inin72 enter the TransferType under maintanence screen
    And User_inin72 enter the Reason under maintanence screen
    And User_inin72 enter the Destination Branch under maintanence screen
    And User_inin72 enter the BranchCode under FromAccount
    And User_inin72 enter the CurrencyCode under FromAccount
    And User_inin72 enter the GLCode under FromAccount
    And User_inin72 enter the CIFCode under FromAccount
    And User_inin72 enter the SerialNumber under FromAccount
    And User_inin72 enter the BranchCode under TOAccount
    And User_inin72 enter the CurrencyCode under TOAccount
    And User_inin72 enter the GLCode under TOAccount
    And User_inin72 enter the CIFCode under TOAccount
    And User_inin72 enter the SerialNumber under TOAccount
    And User_inin72 click the retrive button under maintenance screen
    And User_inin72 click the Set Exceptions in Transfer Account
    And User_inin72 click the Add Button Transfer Account
    And User_inin72 click the Transfer Accounts Criteria Tb
    And User_inin72 click the Exception Select filed Transfer Account
    And User_inin72 click the Search Button Transfer Account
    And User_inin72 click the GL Code TransferAccount
    And User_inin72 Double Click on the GL Code Transfer Account
    And User_inin72 click the Click Ok Button Transfer Account
     And User_inin72 click the Set Exceptions in Transfer Account
    And User_inin72 click the Add Button Transfer Account
    And User_inin72 click the Transfer Accounts Criteria Tb
    And User_inin72 click the Exception Select filed Transfer Account
    And User_inin72 click the Search Button Transfer Account
    And User_inin72 click the GL Code TransferAccount
    And User_inin72 Double Click on the GL Code Transfer Account
    And User_inin72 click the Click Ok Button Transfer Account
    And User_inin72 select the Record under TransferManagement screen
    And User_inin72 click the Save button under maintanance screen
    And User_inin72 click the Approve field under TransferAccount field
    And User_inin72 enter the Record in Approve field
    And User_inin72 double click the record in approve field
    #And User_inin72 click the Approve button under Approve field
    And User_inin72 click the Transfer field under TransferAccount field
    And User_inin72 enter the Record in Transfer field
    And User_inin72 double click the record in Transfer field
    And User_inin72 click the Transfer button under Transfer field
    And User_inin72 click Ok Button Under Information PopUp Menu in the CSM core application
    
    @TA_020
    Scenario: Creating batch record when multi Account currency exceptions are defined
    Given User_inin72 Login to CSM Param in Transfer Account
And User_inin72 click the Parameters in Transfer Account 
And User_inin72 click the System Parameters in Transfer Account 
And User_inin72 Click the Control Record in Transfer Account
And User_inin72 Click the Update after Approve 
And User_inin72 Click the Alert Activation in Transfer Account
And User_inin72 Click the No Access Privilege button
And User_inin72 Click the transfer Branch creation uncheck button 
And User_inin72 Click the Transfer Cancellation uncheck button
And User_inin72 Click the No Access Privelege uncheck button
And User_inin72 Enter the Transfer creation process uncheck
And User_inin72 Enter the Cancel process in uncheck
And User_inin72 Enter the Privilege Access process uncheck
And User_inin72 Click the Submit Update After Aprrove button
And User_inin72 Click the ok button Popup menu
And User_inin72 Click the Success button in Popup menu
And User_inin72 click the Approve button in Tansfer Account
And User_inin72 click submit Approve Box in Transfer Account
Given navigate to CSM application and login with valid credentials
    #And User_inin72 update test data set id for TA_001
    And User_inin72 click on Date to Change the Current Date in the CSM core application
    And User_inin72 Enters the Date in User_inin72 Running Date in the CSM core application
    And User_inin72 click on Use Button in Change Running Date Popup in the CSM core application
    And User_inin72 Click Ok Button for confirmation PopUp for Company Holiday
    And User_inin72 click Ok Button in Information PopUp menu in the CSM core application
    And User_inin72 click on Close Button in Change Running Date Popup in the CSM core application
    And User_inin72 click on Technical Details Icon in the CSM core application
    And User_inin72 click Clear Cache in Technical Details Icon in the CSM core application
    And User_inin72 click Ok Button Under Information PopUp Menu in the CSM core application
    And User_inin72 click TransferAccount field on CSMCore
    And User_inin72 click maintenance field under TransferAccount
    And User_inin72 enter the TransferType under maintanence screen
    And User_inin72 enter the Reason under maintanence screen
    And User_inin72 enter the Destination Branch under maintanence screen
    And User_inin72 enter the BranchCode under FromAccount
    And User_inin72 enter the CurrencyCode under FromAccount
    And User_inin72 enter the GLCode under FromAccount
    And User_inin72 enter the CIFCode under FromAccount
    And User_inin72 enter the SerialNumber under FromAccount
    And User_inin72 enter the BranchCode under TOAccount
    And User_inin72 enter the CurrencyCode under TOAccount
    And User_inin72 enter the GLCode under TOAccount
    And User_inin72 enter the CIFCode under TOAccount
    And User_inin72 enter the SerialNumber under TOAccount
    And User_inin72 click the retrive button under maintenance screen
    And User_inin72 click the Set Exceptions in Transfer Account
    And User_inin72 click the Add Button Transfer Account
    And User_inin72 click the Transfer Accounts Criteria Tb
    And User_inin72 click the Exception Select filed Transfer Account
    And User_inin72 click the Search Button Transfer Account
    And User_inin72 click the GL Code TransferAccount11
    And User_inin72 Double Click on the GL Code Transfer Account
    And User_inin72 click the Click Ok Button Transfer Account
    And User_inin72 select the Record under TransferManagement screen
    And User_inin72 click the Save button under maintanance screen
    And User_inin72 click the Approve field under TransferAccount field
    And User_inin72 enter the Record in Approve field
    And User_inin72 double click the record in approve field
    #And User_inin72 click the Approve button under Approve field
    And User_inin72 click the Transfer field under TransferAccount field
    And User_inin72 enter the Record in Transfer field
    And User_inin72 double click the record in Transfer field
    And User_inin72 click the Transfer button under Transfer field
    And User_inin72 click Ok Button Under Information PopUp Menu in the CSM core application
    
    @TA_21
    Scenario: Accounts retrieval based on account details at the level of transfer accounts - maintenance screen / From GL to GL
    Scenario: Creating batch record when multi GL exceptions are defined
    Given User_inin72 Login to CSM Param in Transfer Account
And User_inin72 click the Parameters in Transfer Account 
And User_inin72 click the System Parameters in Transfer Account 
And User_inin72 Click the Control Record in Transfer Account
And User_inin72 Click the Update after Approve 
And User_inin72 Click the Alert Activation in Transfer Account
And User_inin72 Click the No Access Privilege button
And User_inin72 Click the transfer Branch creation uncheck button 
And User_inin72 Click the Transfer Cancellation uncheck button
And User_inin72 Click the No Access Privelege uncheck button
And User_inin72 Enter the Transfer creation process uncheck
And User_inin72 Enter the Cancel process in uncheck
And User_inin72 Enter the Privilege Access process uncheck
And User_inin72 Click the Submit Update After Aprrove button
And User_inin72 Click the ok button Popup menu
And User_inin72 Click the Success button in Popup menu
And User_inin72 click the Approve button in Tansfer Account
And User_inin72 click submit Approve Box in Transfer Account
Given navigate to CSM application and login with valid credentials
    #And User_inin72 update test data set id for TA_001
    And User_inin72 click on Date to Change the Current Date in the CSM core application
    And User_inin72 Enters the Date in User_inin72 Running Date in the CSM core application
    And User_inin72 click on Use Button in Change Running Date Popup in the CSM core application
    And User_inin72 Click Ok Button for confirmation PopUp for Company Holiday
    And User_inin72 click Ok Button in Information PopUp menu in the CSM core application
    And User_inin72 click on Close Button in Change Running Date Popup in the CSM core application
    And User_inin72 click on Technical Details Icon in the CSM core application
    And User_inin72 click Clear Cache in Technical Details Icon in the CSM core application
    And User_inin72 click Ok Button Under Information PopUp Menu in the CSM core application
    And User_inin72 click TransferAccount field on CSMCore
    And User_inin72 click maintenance field under TransferAccount
    And User_inin72 enter the TransferType under maintanence screen
    And User_inin72 enter the Reason under maintanence screen
    And User_inin72 enter the Destination Branch under maintanence screen
    And User_inin72 enter the BranchCode under FromAccount
    And User_inin72 enter the CurrencyCode under FromAccount
    And User_inin72 enter the GLCode under FromAccount
    And User_inin72 enter the CIFCode under FromAccount
    And User_inin72 enter the SerialNumber under FromAccount
    And User_inin72 enter the BranchCode under TOAccount
    And User_inin72 enter the CurrencyCode under TOAccount
    And User_inin72 enter the GLCode under TOAccount
    And User_inin72 enter the CIFCode under TOAccount
    And User_inin72 enter the SerialNumber under TOAccount
    And User_inin72 click the retrive button under maintenance screen
    And User_inin72 click the Set Exceptions in Transfer Account
    And User_inin72 click the Add Button Transfer Account
    And User_inin72 click the Transfer Accounts Criteria Tb
    And User_inin72 click the Exception Select filed Transfer Account
    And User_inin72 click the Search Button Transfer Account
    And User_inin72 click the GL Code TransferAccount11
    And User_inin72 Double Click on the GL Code Transfer Account
    And User_inin72 click the Click Ok Button Transfer Account
     And User_inin72 click the Set Exceptions in Transfer Account
    And User_inin72 click the Add Button Transfer Account
    And User_inin72 click the Transfer Accounts Criteria Tb
    And User_inin72 click the Exception Select filed Transfer Account
    And User_inin72 click the Search Button Transfer Account
    And User_inin72 click the GL Code TransferAccount11
    And User_inin72 Double Click on the GL Code Transfer Account
    And User_inin72 click the Click Ok Button Transfer Account
    And User_inin72 select the Record under TransferManagement screen
    And User_inin72 click the Save button under maintanance screen
    And User_inin72 click the Approve field under TransferAccount field
    And User_inin72 enter the Record in Approve field
    And User_inin72 double click the record in approve field
    #And User_inin72 click the Approve button under Approve field
    And User_inin72 click the Transfer field under TransferAccount field
    And User_inin72 enter the Record in Transfer field
    And User_inin72 double click the record in Transfer field
    And User_inin72 click the Transfer button under Transfer field
    And User_inin72 click Ok Button Under Information PopUp Menu in the CSM core application
    
    
    