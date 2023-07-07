Feature: To verify the Funcnality on the Transfer Accounts module

  @TA_001
  Scenario: Accounts retrieval based on account details at the level of transfer accounts - maintenance screen / From branch to branch
    Given navigate to CSM application and login with valid credentials
    And user update test data set id for TA_001
    And user click on Date to Change the Current Date in the CSM core application
    And user Enter the Date in user Running Date in the CSM core application
    And user click on Use Button in Change Running Date Popup in the CSM core application
    And User Click Ok Button for confirmation PopUp for Company Holiday
    And user click Ok Button Under Information PopUp Menu in the CSM core application
    And user click on Close Button in Change Running Date Popup in the CSM core application
    And user click on Technical Details Icon in the CSM core application
    And user click Clear Cache in Technical Details Icon in the CSM core application
    And user click Ok Button Under Information PopUp Menu in the CSM core application
    And user click TransferAccount field on CSMCore
    And user click maintenance field under TransferAccount
    And user enter the TransferType under maintanence screen
    And user enter the Reason under maintanence screen
    And user enter the Destination Branch under maintanence screen
    And user enter the BranchCode under FromAccount
    And user enter the CurrencyCode under FromAccount
    And user enter the GLCode under FromAccount
    And user enter the CIFCode under FromAccount
    And user close the popup Tab
    And user enter the SerialNumber under FromAccount
    And user close the popup Tab
    And user enter the BranchCode under TOAccount
    And user enter the CurrencyCode under TOAccount
    And user enter the GLCode under TOAccount
    And user enter the CIFCode under TOAccount
    And user close the popup Tab
    And user enter the SerialNumber under TOAccount
    And user close the popup Tab
    And user click the retrive button under maintenance screen
    
  #And user click the Approve field under TransferAccount field
  #And user enter the Record in Approve field
  #And user double click the record in approve field
  #And user click the Approve button under Approve field
  #And user click the Transfer field under TransferAccount field
  #And user enter the Record in Transfer field
  #And user double click the record in Transfer field
  #And user click the Transfer button under Transfer field
  #And user click Ok Button Under Information PopUp Menu in the CSM core application
  @TA_002
  Scenario: Accounts retrieval based on additional reference at the level of transfer accounts - maintenance screen/ From branch to branch
    Given navigate to CSM application and login with valid credentials
    And user update test data set id for TA_002
    And user click on Date to Change the Current Date in the CSM core application
    And user Enter the Date in user Running Date in the CSM core application
    And user click on Use Button in Change Running Date Popup in the CSM core application
    And User Click Ok Button for confirmation PopUp for Company Holiday
    And user click Ok Button Under Information PopUp Menu in the CSM core application
    And user click on Close Button in Change Running Date Popup in the CSM core application
    And user click on Technical Details Icon in the CSM core application
    And user click Clear Cache in Technical Details Icon in the CSM core application
    And user click Ok Button Under Information PopUp Menu in the CSM core application
    And user click TransferAccount field on CSMCore
    And user click maintenance field under TransferAccount
    And user enter the TransferType under maintanence screen
    And user enter the Reason under maintanence screen
    And user enter the Destination Branch under maintanence screen
    And user enter the BranchCode under FromAccount
    And user enter the CurrencyCode under FromAccount
    And user enter the GLCode under FromAccount
    And user enter the CIFCode under FromAccount
    And user close the popup Tab
    And user enter the SerialNumber under FromAccount
    And user close the popup Tab
    And user enter the BranchCode under TOAccount
    And user enter the CurrencyCode under TOAccount
    And user enter the GLCode under TOAccount
    And user enter the CIFCode under TOAccount
    And user close the popup Tab
    And user enter the SerialNumber under TOAccount
    And user close the popup Tab
    And user click the retrive button under maintenance screen
  

  #And user click the Approve field under TransferAccount field
  #And user enter the Record in Approve field
  #And user double click the record in approve field
  #And user click the Approve button under Approve field
  #And user click the Transfer field under TransferAccount field
  #And user enter the Record in Transfer field
  #And user double click the record in Transfer field
  #And user click the Transfer button under Transfer field
  #And user click Ok Button Under Information PopUp Menu in the CSM core application
  
  ###############################################################################################################
  #@TA_003_PreReq it was check if the alert flag is check or not if it is checked the 
  #code will be un check the flag whether the flag is notchecked the code will check the flag
  @TA_003_PreReq
  Scenario: Saving the accounts when all are checked and the alert flag is not checked/ From branch to branch
    Given navigate to CSM param application and login with valid credentials
    And User click the Parameters in Transfer Account
    And user click the System Parameters in Transfer Account
    And User Click the Control Record in Transfer Account
    And User Click the Update after Approve
    And User Click the Alert Activation in Transfer Account
    And User Click the No Access Privilege flag
    And User Click the transfer Branch creation flag
    And User Click the transfer Branch creation uncheck thebox
    And User Click the Transfer Cancellation flag
    And User Click the Transfer Cancellation uncheck thebox
    And User Click the No Access Privelege flag
    And User Click the No Access Privelege uncheck thebox
    And User Click the Submit Update After Aprrove button
    And User Click the ok button Popup menu
    And User Click the Success button in Popup menu
    And User Click the Approve field in Control Records
    And User Click the Approve button in Control Records
    And user click confirm ok Button

  @TA_003
  Scenario: Saving the accounts when all are checked and the alert flag is not checked/ From branch to branch
    Given navigate to CSM application and login with valid credentials TellerUser
    And user update test data set id for TA_003
    And user click on Date to Change the Current Date in the CSM core application
    And user Enter the Date in user Running Date in the CSM core application
    And user click on Use Button in Change Running Date Popup in the CSM core application
    And User Click Ok Button for confirmation PopUp for Company Holiday
    And user click Ok Button Under Information PopUp Menu in the CSM core application
    And user click on Close Button in Change Running Date Popup in the CSM core application
    And user click on Technical Details Icon in the CSM core application
    And user click Clear Cache in Technical Details Icon in the CSM core application
    And user click Ok Button Under Information PopUp Menu in the CSM core application
    And user click TransferAccount field on CSMCore
    And user click maintenance field under TransferAccount
    And user enter the TransferType under maintanence screen
    And user enter the Reason under maintanence screen
    And user enter the Destination Branch under maintanence screen
    And user enter the BranchCode under FromAccount
    And user enter the CurrencyCode under FromAccount
    
    And user enter the GLCode under FromAccount
    And user enter the CIFCode under FromAccount
    And user close the popup Tab
    And user enter the SerialNumber under FromAccount
    And user close the popup Tab
    And user enter the BranchCode under TOAccount
    And user enter the CurrencyCode under TOAccount
    And user enter the GLCode under TOAccount
    And user enter the CIFCode under TOAccount
    And user close the popup Tab
    And user enter the SerialNumber under TOAccount
    And user close the popup Tab
    And user click the retrive button under maintenance screen
   
    And user click the Save button under maintanance screen
      #The bellow steps are reject the record to show in the maintenence screen 
      And user click the Approve field under TransferAccount field
    And user enter the Record in Approve field
   And user double click the record in approve field
   And user click the Reject button in Approve field

  #And user click the Approve field under TransferAccount field
  #And user enter the Record in Approve field
  #And user double click the record in approve field
  #And user click the Approve button under Approve field
  #And user click the Transfer field under TransferAccount field
  #And user enter the Record in Transfer field
  #And user double click the record in Transfer field
  #And user click the Transfer button under Transfer field
  #And user click Ok Button Under Information PopUp Menu in the CSM core application
  @TA_026_toTA_030_PreReq
  Scenario: Prerequisties for Test cases TA_026 to TA_031 for check or uncheck the alert flags
    Given navigate to CSM param application and login with valid credentials
    And User click the Parameters in Transfer Account
    And user click the System Parameters in Transfer Account
    And User Click the Control Record in Transfer Account
    And User Click the Update after Approve
    And User Click the Alert Activation in Transfer Account
    And User Click the No Access Privilege flag
    And User Click the transfer Branch creation flag
    And User Click the transfer Branch creation uncheck thebox
    And User Click the Transfer Cancellation flag
    And User Click the Transfer Cancellation uncheck thebox
    And User Click the No Access Privelege flag
    And User Click the No Access Privelege uncheck thebox
    And User Click the Submit Update After Aprrove button
    And User Click the ok button Popup menu
    And User Click the Success button in Popup menu
    And User Click the Approve field in Control Records
    And User Click the Approve button in Control Records
    And user click confirm ok Button

  @TA_026
  Scenario: Saving the accounts when some of the accounts are checked and the alert flag is not checked/ From GL to GL
    Given navigate to CSM application and login with valid credentials TellerUser
    And user update test data set id for TA_026
    And user click on Date to Change the Current Date in the CSM core application
    And user Enter the Date in user Running Date in the CSM core application
    And user click on Use Button in Change Running Date Popup in the CSM core application
    And User Click Ok Button for confirmation PopUp for Company Holiday
    And user click Ok Button Under Information PopUp Menu in the CSM core application
    And user click on Close Button in Change Running Date Popup in the CSM core application
    And user click on Technical Details Icon in the CSM core application
    And user click Clear Cache in Technical Details Icon in the CSM core application
    And user click Ok Button Under Information PopUp Menu in the CSM core application
    And user click TransferAccount field on CSMCore
    And user click maintenance field under TransferAccount
    And user enter the Reason under maintanence screen
    And user enter the TransferType under maintanence screen
    And user enter the CIF under maintanence screen
    And user enter the OriginlGl under maintanence screen
    And user enter the DestinationGl under maintanence screen
    And user click the retrive button under maintenance screen
    And user select the Record no1 under TransferMaintanence screen
    And user select the Record no2 under TransferMaintanence screen    
    And user click the Save button under maintanance screen
     #The bellow steps are reject the record to show in the maintenence screen 
      And user click the Approve field under TransferAccount field
    And user enter the Record in Transfer field
  And user double click the record in Transfer field
   And user click the Reject button in Approve field

  #And user click the BranchManager Account in the Alert popup
  #And user click the send button in Alert popup
  #And user click the Approve field under TransferAccount field
  #And user enter the Record in Approve field
  #And user double click the record in approve field
  #And user click the Approve button under Approve field
  #And user click the Transfer field under TransferAccount field
  #And user enter the Record in Transfer field
  #And user double click the record in Transfer field
  #And user click the Transfer button under Transfer field
  #And user click Ok Button Under Information PopUp Menu in the CSM core application
  @TA_027
  Scenario: Saving the accounts when some of the accounts are checked and the alert flag is checked/ From GL to GL
    Given navigate to CSM application and login with valid credentials TellerUser
    And user update test data set id for TA_027
    And user click on Date to Change the Current Date in the CSM core application
    And user Enter the Date in user Running Date in the CSM core application
    And user click on Use Button in Change Running Date Popup in the CSM core application
    And User Click Ok Button for confirmation PopUp for Company Holiday
    And user click Ok Button Under Information PopUp Menu in the CSM core application
    And user click on Close Button in Change Running Date Popup in the CSM core application
    And user click on Technical Details Icon in the CSM core application
    And user click Clear Cache in Technical Details Icon in the CSM core application
    And user click Ok Button Under Information PopUp Menu in the CSM core application
    And user click TransferAccount field on CSMCore
    And user click maintenance field under TransferAccount
    And user enter the Reason under maintanence screen
    And user enter the TransferType under maintanence screen
    And user enter the CIF under maintanence screen
    And user enter the OriginlGl under maintanence screen
    And user enter the DestinationGl under maintanence screen
    And user click the retrive button under maintenance screen
    And user select the Record no1 under TransferMaintanence screen
    And user select the Record no2 under TransferMaintanence screen
    And user click the Save button under maintanance screen
    And user click the BranchManager Account in the Alert popup
    And user click the send button in Alert popup
     #The bellow steps are reject the record to show in the maintenence screen 
      And user click the Approve field under TransferAccount field
    And user enter the Record in Transfer field
  And user double click the record in Transfer field
   And user click the Reject button in Approve field

  #And user click the Approve field under TransferAccount field
  #And user enter the Record in Approve field
  #And user double click the record in approve field
  #And user click the Approve button under Approve field
  #And user click the Transfer field under TransferAccount field
  #And user enter the Record in Transfer field
  #And user double click the record in Transfer field
  #And user click the Transfer button under Transfer field
  #And user click Ok Button Under Information PopUp Menu in the CSM core application
  @TA_028
  Scenario: Saving the accounts when all the accounts are checked and the alert flag is checked/ From GL to GL
    Given navigate to CSM application and login with valid credentials TellerUser
    And user update test data set id for TA_028
     And user close the popup Tab
    And user click on Date to Change the Current Date in the CSM core application
     
    And user Enter the Date in user Running Date in the CSM core application
    And user click on Use Button in Change Running Date Popup in the CSM core application
    And User Click Ok Button for confirmation PopUp for Company Holiday
    And user click Ok Button Under Information PopUp Menu in the CSM core application
    And user click on Close Button in Change Running Date Popup in the CSM core application
    And user click on Technical Details Icon in the CSM core application
    And user click Clear Cache in Technical Details Icon in the CSM core application
    And user click Ok Button Under Information PopUp Menu in the CSM core application
    And user click TransferAccount field on CSMCore
    And user click maintenance field under TransferAccount
    And user enter the Reason under maintanence screen
    And user enter the TransferType under maintanence screen
    And user enter the CIF under maintanence screen
    And user enter the OriginlGl under maintanence screen
    And user enter the DestinationGl under maintanence screen
    And user click the retrive button under maintenance screen
    And user click the Save button under maintanance screen
    And user click the BranchManager Account in the Alert popup
    And user click the send button in Alert popup
     #The bellow steps are reject the record to show in the maintenence screen 
      And user click the Approve field under TransferAccount field
    And user enter the Record in Transfer field
  And user double click the record in Transfer field
   And user click the Reject button in Approve field

  #And user click the Approve field under TransferAccount field
  #And user enter the Record in Approve field
  #And user double click the record in approve field
  #And user click the Approve button under Approve field
  #And user click the Transfer field under TransferAccount field
  #And user enter the Record in Transfer field
  #And user double click the record in Transfer field
  #And user click the Transfer button under Transfer field
  #And user click Ok Button Under Information PopUp Menu in the CSM core application
 

  @TA_029
  Scenario: Amending an existing created batch record when the alert flag is checked/ From GL to GL
    Given navigate to CSM application and login with valid credentials TellerUser
    And user update test data set id for TA_029
     And user close the popup Tab
    And user click on Date to Change the Current Date in the CSM core application
    
    And user Enter the Date in user Running Date in the CSM core application
    And user click on Use Button in Change Running Date Popup in the CSM core application
    And User Click Ok Button for confirmation PopUp for Company Holiday
    And user click Ok Button Under Information PopUp Menu in the CSM core application
    And user click on Close Button in Change Running Date Popup in the CSM core application
    And user click on Technical Details Icon in the CSM core application
    And user click Clear Cache in Technical Details Icon in the CSM core application
    And user click Ok Button Under Information PopUp Menu in the CSM core application
    And user click TransferAccount field on CSMCore
    And user click maintenance field under TransferAccount
    And user enter the Reason under maintanence screen
    And user enter the TransferType under maintanence screen
    And user enter the CIF under maintanence screen
    And user enter the OriginlGl under maintanence screen
    And user enter the DestinationGl under maintanence screen
    And user click the retrive button under maintenance screen
    And user select the Record no1 under TransferMaintanence screen
    And user select the Record no2 under TransferMaintanence screen
    And user select the Record no3 under TransferMaintanence screen
    And user click the Save button under maintanance screen
    And user click the BranchManager Account in the Alert popup
    And user click the send button in Alert popup
    And user click the search button in maintenance screen
    And user enter the record for search the record
    And user double click the record under search button
    And user select the Record no1 under TransferMaintanence screen
    #And  user select the Record no2 under TransferMaintanence screen
    And user click the Save button under maintanance screen
    And user click the BranchManager Account in the Alert popup
    And user click the send button in Alert popup
     #The bellow steps are reject the record to show in the maintenence screen 
      And user click the Approve field under TransferAccount field
    And user enter the Record in Transfer field
  And user double click the record in Transfer field
   And user click the Reject button in Approve field
   

  #And user click the Approve field under TransferAccount field
  #And user enter the Record in Approve field
  #And user double click the record in approve field
  #And user click the Approve button under Approve field
  #And user click the Transfer field under TransferAccount field
  #And user enter the Record in Transfer field
  #And user double click the record in Transfer field
  #And user click the Transfer button under Transfer field
  #And user click Ok Button Under Information PopUp Menu in the CSM core application
 
  @TA_030
  Scenario: Amending an existing created batch record when the alert flag is not checked/ From GL to GL
    Given navigate to CSM application and login with valid credentials TellerUser
    And user update test data set id for TA_030
     And user close the popup Tab
    And user click on Date to Change the Current Date in the CSM core application
    
    And user Enter the Date in user Running Date in the CSM core application
    And user click on Use Button in Change Running Date Popup in the CSM core application
    And User Click Ok Button for confirmation PopUp for Company Holiday
    And user click Ok Button Under Information PopUp Menu in the CSM core application
    And user click on Close Button in Change Running Date Popup in the CSM core application
    And user click on Technical Details Icon in the CSM core application
    And user click Clear Cache in Technical Details Icon in the CSM core application
    And user click Ok Button Under Information PopUp Menu in the CSM core application
    And user click TransferAccount field on CSMCore
    And user click maintenance field under TransferAccount
    And user enter the Reason under maintanence screen
    And user enter the TransferType under maintanence screen
    And user enter the CIF under maintanence screen
    And user enter the OriginlGl under maintanence screen
    And user enter the DestinationGl under maintanence screen
    And user click the retrive button under maintenance screen
    And user select the Record no1 under TransferMaintanence screen
    And user select the Record no2 under TransferMaintanence screen
    And user select the Record no3 under TransferMaintanence screen
    And user click the Save button under maintanance screen
    And user click the search button in maintenance screen
    And user enter the record for search the record
    And user double click the record under search button
    And user select the Record no1 under TransferMaintanence screen
    #And  user select the Record no2 under TransferMaintanence screen
    And user click the Save button under maintanance screen
       #The bellow steps are reject the record to show in the maintenence screen 
      And user click the Approve field under TransferAccount field
    And user enter the Record in Transfer field
  And user double click the record in Transfer field
   And user click the Reject button in Approve field
    
    
    
    @TA_031_PreReq
  Scenario: Amending an existing created batch record when the alert flag"no access privilege" is checked/ From branch to branch
    Given navigate to CSM param application and login with valid credentials
    And User click the Parameters in Transfer Account
    And user click the System Parameters in Transfer Account
    And User Click the Control Record in Transfer Account
    And User Click the Update after Approve
    And User Click the Alert Activation in Transfer Account
    And User Click the No Access Privilege flag
    And User Click the transfer Branch creation flag
    And User Click the transfer Branch creation uncheck thebox
    And User Click the Transfer Cancellation flag
    And User Click the Transfer Cancellation uncheck thebox
    And User Click the No Access Privelege flag
    And User Click the No Access Privelege uncheck thebox
    And User Click the Submit Update After Aprrove button
    And User Click the ok button Popup menu
    And User Click the Success button in Popup menu
    And User Click the Approve field in Control Records
    And User Click the Approve button in Control Records
    And user click confirm ok Button
    

  @TA_031
  Scenario: Amending an existing created batch record when the alert flag"no access privilege" is checked/ From branch to branch
    Given navigate to CSM application and login with valid credentials TellerUser
    And user update test data set id for TA_031
     And user close the popup Tab
    And user click on Date to Change the Current Date in the CSM core application
    
    And user Enter the Date in user Running Date in the CSM core application
    And user click on Use Button in Change Running Date Popup in the CSM core application
    And User Click Ok Button for confirmation PopUp for Company Holiday
    And user click Ok Button Under Information PopUp Menu in the CSM core application
    And user click on Close Button in Change Running Date Popup in the CSM core application
    And user click on Technical Details Icon in the CSM core application
    And user click Clear Cache in Technical Details Icon in the CSM core application
    And user click Ok Button Under Information PopUp Menu in the CSM core application
    And user click TransferAccount field on CSMCore
    And user click maintenance field under TransferAccount
   
    And user enter the TransferType under maintanence screen
   And user enter the Reason under maintanence screen
   And user enter the same Destination Branch under maintanence screen
    And user click Ok Button Under Information PopUp Menu in the CSM core application
    And user enter the Destination Branch under maintanence screen
    And user enter the BranchCode under FromAccount
    And user enter the CurrencyCode under FromAccount
    And user enter the GLCode under FromAccount
    And user enter the CIFCode under FromAccount
    And user close the popup Tab
    And user enter the SerialNumber under FromAccount
    And user close the popup Tab
    And user enter the BranchCode under TOAccount
    And user enter the CurrencyCode under TOAccount
    And user enter the GLCode under TOAccount
    And user enter the CIFCode under TOAccount
    And user close the popup Tab
    And user enter the SerialNumber under TOAccount
    And user close the popup Tab
    And user click the retrive button under maintenance screen
    And user select the Record no1 under TransferMaintanence screen
    And user select the Record no2 under TransferMaintanence screen
    And user select the Record no3 under TransferMaintanence screen
    And user click the Save button under maintanance screen
     And user click the BranchManager Account in the Alert popup
    And user click the send button in Alert popup
    And user click the search button in maintenance screen
   And user enter the original gl under search button
  And user doubleclick the original gl under search button
    And user select the Record no1 under TransferMaintanence screen
    #And  user select the Record no2 under TransferMaintanence screen
    And user click the Save button under maintanance screen
     And user click the BranchManager Account in the Alert popup
    And user click the send button in Alert popup
    #The bellow steps are reject the record to show in the maintenence screen 
      And user click the Approve field under TransferAccount field
    And user enter the Record in Approve field
   And user double click the record in approve field
   And user click the Reject button in Approve field
    
    
   
    
