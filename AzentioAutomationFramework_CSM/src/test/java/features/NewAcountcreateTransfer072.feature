Feature: user created New Account transfer after closed thed Account
@TA_043
Scenario: Account transfer and creation of a new account / From branch to branch
Given navigate to CSM application and login with valid credentials
    #And User_7210 update test data set id for TA_001
    And User_7210 click on Date to Change the Current Date in the CSM core application
    And User_7210 Enters the Date in User_7210 Running Date in the CSM core application
    And User_7210 click on Use Button in Change Running Date Popup in the CSM core application
    And User_7210 Click Ok Button for confirmation PopUp for Company Holiday
    And User_7210 click Ok Button in Information PopUp menu in the CSM core application
    And User_7210 click on Close Button in Change Running Date Popup in the CSM core application
    And User_7210 click on Technical Details Icon in the CSM core application
    And User_7210 click Clear Cache in Technical Details Icon in the CSM core application
    And User_7210 click Ok Button Under Information PopUp Menu in the CSM core application
    And User_7210 click TransferAccount field on CSMCore
    And User_7210 click maintenance field under TransferAccount
    And User_7210 enter the TransferType under maintanence screen
    And User_7210 enter the Reason under maintanence screen
    And User_7210 enter the Destination Branch under maintanence screen
    And User_7210 enter the BranchCode under FromAccount
    And User_7210 enter the CurrencyCode under FromAccount
    And User_7210 enter the GLCode under FromAccount
    And User_7210 enter the CIFCode under FromAccount
    And User_7210 enter the SerialNumber under FromAccount
    And User_7210 enter the BranchCode under TOAccount
    And User_7210 enter the CurrencyCode under TOAccount
    And User_7210 enter the GLCode under TOAccount
    And User_7210 enter the CIFCode under TOAccount
    And User_7210 enter the SerialNumber under TOAccount
    And User_7210 click the retrive button under maintenance screen
    And User_7210 select the Record under TransferManagement screen
    And User_7210 click the Save button under maintanance screen
    And User_7210 click the Approve field under TransferAccount field
    And User_7210 enter the Record in Approve field
    And User_7210 double click the record in approve field
    #And User_7210 click the Approve button under Approve field
    And User_7210 click the Transfer field under TransferAccount field
    And User_7210 enter the Record in Transfer field
    And User_7210 double click the record in Transfer field
    And User_7210 click the Transfer button under Transfer field
    And User_7210 click Ok Button Under Information PopUp Menu in the CSM core application
    And User_7210 click the Accounts in Transfer Accounts
    And User_7210 click the General Account in Transfer Account
    And User_7210 Click the Opening Account in Transfer
    And User_7210 Click the Maintenance 
    And User_7210 click the Batch No in Tarnsfer Account
    And User_7210 click the Authorized in Transfer Account
    And User_7210 click the Maintenance button in Transfer Account
    And User_7210 Click the closed status view in Accounts