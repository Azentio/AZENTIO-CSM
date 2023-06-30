Feature: To verify the Funcnality on the Transfer Accounts module

  @TA_001
  Scenario: Accounts retrieval based on account details at the level of transfer accounts - maintenance screen / From branch to branch
    Given navigate to CSM application and login with valid credentials
    And user update test data set id for TA_001
    And user click on Date to Change the Current Date in the CSM core application
    And user Enters the Date in user Running Date in the CSM core application
    And user click on Use Button in Change Running Date Popup in the CSM core application
    And User Click Ok Button for confirmation PopUp for Company Holiday
    And user click Ok Button in Information PopUp menu in the CSM core application
    And user click on Close Button in Change Running Date Popup in the CSM core application
    And user click on Technical Details Icon in the CSM core application
    And user click Clear Cache in Technical Details Icon in the CSM core application
    And user click Ok Button Under Information PopUp Menu in the CSM core application
    And user click TransferAccount field on CSMCore
    #And user click maintenance field under TransferAccount
    #And user enter the TransferType under maintanence screen
    #And user enter the Reason under maintanence screen
    #And user enter the Destination Branch under maintanence screen
    #And user enter the BranchCode under FromAccount
    #And user enter the CurrencyCode under FromAccount
    #And user enter the GLCode under FromAccount
    #And user enter the CIFCode under FromAccount
    #And user enter the SerialNumber under FromAccount
    #And user enter the BranchCode under TOAccount
    #And user enter the CurrencyCode under TOAccount
    #And user enter the GLCode under TOAccount
    #And user enter the CIFCode under TOAccount
    #And user enter the SerialNumber under TOAccount
    #And user click the retrive button under maintenance screen
    #And user select the Record under TransferManagement screen
    #And user click the Save button under maintanance screen
    And user click the Approve field under TransferAccount field
    And user enter the Record in Approve field
    And user double click the record in approve field
    #And user click the Approve button under Approve field
    And user click the Transfer field under TransferAccount field
    And user enter the Record in Transfer field
    And user double click the record in Transfer field
    And user click the Transfer button under Transfer field
    And user click Ok Button Under Information PopUp Menu in the CSM core application
