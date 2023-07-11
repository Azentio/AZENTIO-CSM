Feature: Checking the functionalities of Transfer Account

  @TA_059
  Scenario: Account transfer for account having to be voided transaction
    Given navigate to CSM application and login with valid credentials
    And User_612 update test data set id for TA_059
    And user close the popup Tab
    And User_612 Click on Date to Change the Current Date
    And User_612 Enter the Date in User Running Date
    And User_612 Click on Use Button in Change Running Date Popup
    And User Click Ok Button for confirmation PopUp for Company Holiday
    And User_612 Click Ok Button in Information PopUp menu
    And User_612 Click on Close Button in Change Running Date Popup
    And User_612 Click on Technical Details Icon
    And User_612 Click Clear Cache in Technical Details Icon
    And User_612 Click Ok Button Under Information PopUp Menu
    #transaction 
     And User_612 Click onTransactions under CSM application
    And User_612 Click onMaintenance under Transactions
    And User_612 Enter TRXType in Maintenance Screen
    And User_612 Enter the BranchCode in debit Ac in Maintenance Screen
    And User_612 Enter CurrencyCode in debit Ac in Maintenance Screen
    And User_612 Enter GLCode in debit Ac in Maintenance Screen
    And User_612 Enter CIFCode in debit Ac in Maintenance Screen
    And User_612 Click OkButton in Warning PopUp Menu
    And User_612 Enter Serialin debit Ac in Maintenance Screen
    And User_612 Click OkButton in Warning PopUp Menu
    And User_612 Click OkButton in Warning PopUp Menu
    And User_612 Enter theCurrency in Maintenance Screen
    And User_612 Enter the Amountin Maintenance Screen
    #And user_612 check if the  value is entered or not
    And User_612 Click SaveButton in Maintenance Screen
    And User_612 Get the Transaction No in Success PopUp Menu for059
    And User_612 Click OkButton in Success PopUp Menu
    And User_612 Click on ApproveScreen under Transactions
    And User_612 Enter the TransactionNo in Approve Screen
    And User_612 Double Click on the TransactionNo
    And User_612 Click on ApproveButton for approve the Transaction
    And User_612 Click on Ok Button in Success PopUp Menu for ApproveTranscation
    #APPLY VOID
    And User_612 Click  on Apply to Void House Cheque under Transactions
    And User_612 Enter the Transaction no in Apply to Void House Cheque 
     And User_612 Double Click on the TransactionNo in Apply to Void House Cheque 
     And User_612 Select the void Reason in Apply to Void House Cheque 
     And User_612 Click on Apply to Void House Cheque Button
    #transfer
    And user click TransferAccount field on CSMCore
    And user click maintenance field under TransferAccount
    And user enter the Reason under maintanence screen
    And user enter the Destination Branch under maintanence screen
    And user enter the BranchCode under FromAccount
    And user enter the CurrencyCode under FromAccount
    And user enter the GLCode under FromAccount
    And user enter the CIFCode under FromAccount
       And User_612 Click Ok Button in Warning PopUp Menu
    And user enter the SerialNumber under FromAccount
    And User_612 Click Ok Button in Warning PopUp Menu
    And user enter the BranchCode under TOAccount
    And user enter the CurrencyCode under TOAccount
    And user enter the GLCode under TOAccount
    And user enter the CIFCode under TOAccount
    And User_612 Click Ok Button in Warning PopUp Menu
    And user enter the SerialNumber under TOAccount
    And User_612 Click Ok Button in Warning PopUp Menu
    And user click the retrive button under maintenance screen
    And user select the Record no1 under TransferMaintanence screen
    And user click the Save button under maintanance screen
    And user click the Approve field under TransferAccount field
    And user enter the Record in Approve field
   And user double click the record in approve field
    And user click the Approve button under Approve field
    And user click the Transfer field under TransferAccount field
    And user enter the Record in Transfer field
    And user double click the record in Transfer field
    And user click the Transfer button under Transfer field
    Then User_612 validate the pop message under Transfer field
    #VOID 
    And User_612 Click on Void House Cheque under Transactions
    And User_612 Enter the Transaction no in Void House Cheque 
     And User_612 Double Click on the TransactionNo in  Void House Cheque 
     And User_612 Click on Void House Cheque Button
   #transfer
    And user click TransferAccount field on CSMCore
    And user click maintenance field under TransferAccount
       And user enter the Reason under maintanence screen
    And user enter the Destination Branch under maintanence screen
    And user enter the BranchCode under FromAccount
    And user enter the CurrencyCode under FromAccount
    And user enter the GLCode under FromAccount
    And user enter the CIFCode under FromAccount
    And User_612 Click Ok Button in Warning PopUp Menu
    And user enter the SerialNumber under FromAccount
    And User_612 Click Ok Button in Warning PopUp Menu
    And user enter the BranchCode under TOAccount
    And user enter the CurrencyCode under TOAccount
    And user enter the GLCode under TOAccount
    And user enter the CIFCode under TOAccount
    And User_612 Click Ok Button in Warning PopUp Menu
    And user enter the SerialNumber under TOAccount
    And User_612 Click Ok Button in Warning PopUp Menu
    And user click the retrive button under maintenance screen
    And user select the Record no1 under TransferMaintanence screen
    And user click the Save button under maintanance screen
    And user click the Approve field under TransferAccount field
    And user enter the Record in Approve field
   And user double click the record in approve field
    And user click the Approve button under Approve field
    And user click the Transfer field under TransferAccount field
    And user enter the Record in Transfer field
    And user double click the record in Transfer field
    And user click the Transfer button under Transfer field
    Then User_612 validate the pop message under Transfer field
 
  @TA_060
    Scenario: Account transfer for account having a to be Suspended status
   Given navigate to CSM application and login with valid credentials
    And User_612 update test data set id for TA_060
    And User_612 Click on Date to Change the Current Date
    And User_612 Enter the Date in User Running Date
    And User_612 Click on Use Button in Change Running Date Popup
    And User Click Ok Button for confirmation PopUp for Company Holiday
    And User_612 Click Ok Button in Information PopUp menu
    And User_612 Click on Close Button in Change Running Date Popup
    And User_612 Click on Technical Details Icon
    And User_612 Click Clear Cache in Technical Details Icon
    And User_612 Click Ok Button Under Information PopUp Menu
    And User_612 Click AccountsMenu under CSMApplication
    And User_612 Click General Accounts in AccountsMenu
    And User_612 Click Supsend field in GeneralAccounts
    And User_612 Enter the Glcode in Supsend field
    And User_612 Double click a record in Supsend field
    And User_612 Select StatusReason in Supsend field
     And User_612 Enter a describtion in Supsend field
    Then User_612 Click a Supsend Button under Supsend field
    #transfer
    And user click TransferAccount field on CSMCore
    And user click maintenance field under TransferAccount
    And user enter the Reason under maintanence screen
    And user enter the Destination Branch under maintanence screen
    And user enter the BranchCode under FromAccount
    And user enter the CurrencyCode under FromAccount
    And user enter the GLCode under FromAccount
    And user enter the CIFCode under FromAccount
    And User_612 Click Ok Button in Warning PopUp Menu
    And user enter the SerialNumber under FromAccount
    And User_612 Click Ok Button in Warning PopUp Menu
    And user enter the BranchCode under TOAccount
    And user enter the CurrencyCode under TOAccount
    And user enter the GLCode under TOAccount
    And user enter the CIFCode under TOAccount
    And User_612 Click Ok Button in Warning PopUp Menu
    And user enter the SerialNumber under TOAccount
    And User_612 Click Ok Button in Warning PopUp Menu
    And user click the retrive button under maintenance screen
    And user select the Record no1 under TransferMaintanence screen
    And user select the Record no2 under TransferMaintanence screen
    And user click the Save button under maintanance screen
    And user click the Approve field under TransferAccount field
    And user enter the Record in Approve field
   And user double click the record in approve field
    And user click the Approve button under Approve field
    And user click the Transfer field under TransferAccount field
    And user enter the Record in Transfer field
    And user double click the record in Transfer field
    And user click the Transfer button under Transfer field
    Then User_612  validate the pop message under Transfer field
    And User_612 Click AccountsMenu under CSMApplication
    And User_612 Click General Accounts in AccountsMenu
    And User_612 Click Approve Suspend In GeneralAccounts
    And User_612 Enter the Glcode in Approve Suspend
    And User_612 Double click the record under Approve Suspend
    And User_612 Click a Authorize Suspend Button under Approve Suspend
#    transfer
    And user click TransferAccount field on CSMCore
    And user click maintenance field under TransferAccount
   # And user enter the TransferType under maintanence screen
    And user enter the Reason under maintanence screen
    And user enter the Destination Branch under maintanence screen
    And user enter the BranchCode under FromAccount
    And user enter the CurrencyCode under FromAccount
    And user enter the GLCode under FromAccount
    And user enter the CIFCode under FromAccount
    And User_612 Click Ok Button in Warning PopUp Menu
    And user enter the SerialNumber under FromAccount
    And User_612 Click Ok Button in Warning PopUp Menu
    And user enter the BranchCode under TOAccount
    And user enter the CurrencyCode under TOAccount
    And user enter the GLCode under TOAccount
    And user enter the CIFCode under TOAccount
    And User_612 Click Ok Button in Warning PopUp Menu
    And user enter the SerialNumber under TOAccount
    And User_612 Click Ok Button in Warning PopUp Menu
    And user click the retrive button under maintenance screen
    And user select the Record no1 under TransferMaintanence screen
    And user select the Record no2 under TransferMaintanence screen
    And user click the Save button under maintanance screen
    And user click the Approve field under TransferAccount field
    And user enter the Record in Approve field
    And user double click the record in approve field
    And user click the Approve button under Approve field
    And user click the Transfer field under TransferAccount field
    And user enter the Record in Transfer field
    And user double click the record in Transfer field
    And user click the Transfer button under Transfer field
    Then User_612 validate the pop message under Transfer field
    
@TA_061 
Scenario: Account transfer for account having a to be Closed status
Given navigate to CSM application and login with valid credentials
    And User_612 update test data set id for TA_061
    And User_612 Click on Date to Change the Current Date
    And User_612 Enter the Date in User Running Date
    And User_612 Click on Use Button in Change Running Date Popup
    And User Click Ok Button for confirmation PopUp for Company Holiday
    And User_612 Click Ok Button in Information PopUp menu
    And User_612 Click on Close Button in Change Running Date Popup
    And User_612 Click on Technical Details Icon
    And User_612 Click Clear Cache in Technical Details Icon
    And User_612 Click Ok Button Under Information PopUp Menu
    And User_612 Click AccountsMenu under CSMApplication
    And User_612 Click General Accounts in AccountsMenu
    And User_612 Click on Close field under General Accounts 
    And User_612 Enter the Glcode in Close field
    And User_612 Double click the record in Close field
    And User_612 Click Close Button in Close field
    #transfer
    And user click TransferAccount field on CSMCore
    And user click maintenance field under TransferAccount
    #And user enter the TransferType under maintanence screen
    And user enter the Reason under maintanence screen
    And user enter the Destination Branch under maintanence screen
    And user enter the BranchCode under FromAccount
    And user enter the CurrencyCode under FromAccount
    And user enter the GLCode under FromAccount
    And user enter the CIFCode under FromAccount
    And User_612 Click Ok Button in Warning PopUp Menu
    And user enter the SerialNumber under FromAccount
    And User_612 Click Ok Button in Warning PopUp Menu
    And user enter the BranchCode under TOAccount
    And user enter the CurrencyCode under TOAccount
    And user enter the GLCode under TOAccount
    And user enter the CIFCode under TOAccount
    And User_612 Click Ok Button in Warning PopUp Menu
    And user enter the SerialNumber under TOAccount
    And User_612 Click Ok Button in Warning PopUp Menu
    And user click the retrive button under maintenance screen
    And user select the Record no1 under TransferMaintanence screen
    And user click the Save button under maintanance screen
    And user click the Approve field under TransferAccount field
    And user enter the Record in Approve field
   And user double click the record in approve field
    And user click the Approve button under Approve field
    And user click the Transfer field under TransferAccount field
    And user enter the Record in Transfer field
    And user double click the record in Transfer field
    And user click the Transfer button under Transfer field
    Then User_612  validate the pop message under Transfer field
    And User_612 Click AccountsMenu under CSMApplication
    And User_612 Click General Accounts in AccountsMenu
    And User_612 Click Authorize Close in General Accounts
    And User_612 Enter the Glcode under Authorize Close 
    And User_612 Double click the record in Authorize Close
   Then User_612 Click the Authorize Close Button  
    #transfer
    And user click TransferAccount field on CSMCore
    And user click maintenance field under TransferAccount
    And user enter the TransferType under maintanence screen
    And user enter the Reason under maintanence screen
    And user enter the Destination Branch under maintanence screen
    And user enter the BranchCode under FromAccount
    And user enter the CurrencyCode under FromAccount
    And user enter the GLCode under FromAccount
    And user enter the CIFCode under FromAccount
    And User_612 Click Ok Button in Warning PopUp Menu
    And user enter the SerialNumber under FromAccount
    And User_612 Click Ok Button in Warning PopUp Menu
    And user enter the BranchCode under TOAccount
    And user enter the CurrencyCode under TOAccount
    And user enter the GLCode under TOAccount
    And user enter the CIFCode under TOAccount
    And User_612 Click Ok Button in Warning PopUp Menu
    And user enter the SerialNumber under TOAccount
    And User_612 Click Ok Button in Warning PopUp Menu
    And user click the retrive button under maintenance screen
    And user select the Record no1 under TransferMaintanence screen
    And user click the Save button under maintanance screen
    And user click the Approve field under TransferAccount field
    And user enter the Record in Approve field
   And user double click the record in approve field
    And user click the Approve button under Approve field
    And user click the Transfer field under TransferAccount field
    And user enter the Record in Transfer field
    And user double click the record in Transfer field
    And user click the Transfer button under Transfer field
    Then User_612 validate the pop message under Transfer field
    







   
   @TA_058   
 Scenario: Account transfer for account having to be reversed transaction
  Given navigate to CSM application and login with valid credentials
    And User_612 update test data set id for TA_058
    And user close the popup Tab
    And User_612 Click on Date to Change the Current Date
    And User_612 Enter the Date in User Running Date
    And User_612 Click on Use Button in Change Running Date Popup
    And User Click Ok Button for confirmation PopUp for Company Holiday
    And User_612 Click Ok Button in Information PopUp menu
    And User_612 Click on Close Button in Change Running Date Popup
    And User_612 Click on Technical Details Icon
    And User_612 Click Clear Cache in Technical Details Icon
    And User_612 Click Ok Button Under Information PopUp Menu
    #transaction 
     And User_612 Click onTransactions under CSM application
    And User_612 Click onMaintenance under Transactions
    And User_612 Enter TRXType in Maintenance Screen
    And User_612 Enter the BranchCode in debit Ac in Maintenance Screen
    And User_612 Enter CurrencyCode in debit Ac in Maintenance Screen
    And User_612 Enter GLCode in debit Ac in Maintenance Screen
    And User_612 Enter CIFCode in debit Ac in Maintenance Screen
    And User_612 Click OkButton in Warning PopUp Menu
    And User_612 Enter Serialin debit Ac in Maintenance Screen
    And User_612 Click OkButton in Warning PopUp Menu
    And User_612 Click OkButton in Warning PopUp Menu
    And User_612 Enter theCurrency in Maintenance Screen
    And User_612 Enter the Amountin Maintenance Screen
    #And user_612 check if the  value is entered or not
    And User_612 Click SaveButton in Maintenance Screen
    And User_612 Get the Transaction No in Success PopUp Menu for058
    And User_612 Click OkButton in Success PopUp Menu
    And User_612 Click on ApproveScreen under Transactions
    And User_612 Enter the TransactionNo in Approve Screen
    And User_612 Double Click on the TransactionNo
    And User_612 Click on ApproveButton for approve the Transaction
    And User_612 Click OkButton in Success PopUp Menu
    #reverse
    And User_612 Click ReverseMenu Under Transaction Screen
    And User_612 Enter the TransactionNo Under ReverseMenu
    And User_612 Double Click on the TransactionNo in ReverseMenu
     And User_612 Select a Reason in ReverseMenu 
     And User_612 Click ToReverseButton in ReverseMenu
      #transfer
    And user click TransferAccount field on CSMCore
    And user click maintenance field under TransferAccount
    #And user enter the TransferType under maintanence screen
    And user enter the Reason under maintanence screen
    And user enter the Destination Branch under maintanence screen
    And user enter the BranchCode under FromAccount
    And user enter the CurrencyCode under FromAccount
    And user enter the GLCode under FromAccount
    And user enter the CIFCode under FromAccount
    And User_612 Click Ok Button in Warning PopUp Menu
    And user enter the SerialNumber under FromAccount
    And User_612 Click Ok Button in Warning PopUp Menu
    And user enter the BranchCode under TOAccount
    And user enter the CurrencyCode under TOAccount
    And user enter the GLCode under TOAccount
    And user enter the CIFCode under TOAccount
    And User_612 Click Ok Button in Warning PopUp Menu
    And user enter the SerialNumber under TOAccount
    And User_612 Click Ok Button in Warning PopUp Menu
    And user click the retrive button under maintenance screen
    And user select the Record no1 under TransferMaintanence screen
     And user select the Record no2 under TransferManagement screen
      And user click the Save button under maintanance screen
    And user click the Approve field under TransferAccount field
    And user enter the Record in Approve field
   And user double click the record in approve field
    And user click the Approve button under Approve field
    And user click the Transfer field under TransferAccount field
    And user enter the Record in Transfer field
    And user double click the record in Transfer field
    And user click the Transfer button under Transfer field
    Then User_612 validate the pop message under Transfer field
  #Approve Reverse
  And User_612 Click  Approve ReverseMenu Under Transaction Screen
  And User_612 Enter a transaction No in ApproveReverseMenu
  And User_612 Double Click the record in ApproveReverseMenu
  And User_612 Click Reverse Button in ApproveReverseMenu
#   transfer
    And user click TransferAccount field on CSMCore
    And user click maintenance field under TransferAccount
    And user enter the TransferType under maintanence screen
    And user enter the Reason under maintanence screen
    And user enter the Destination Branch under maintanence screen
    And user enter the BranchCode under FromAccount
    And user enter the CurrencyCode under FromAccount
    And user enter the GLCode under FromAccount
    And user enter the CIFCode under FromAccount
    And User_612 Click Ok Button in Warning PopUp Menu
    And user enter the SerialNumber under FromAccount
    And User_612 Click Ok Button in Warning PopUp Menu
    And user enter the BranchCode under TOAccount
    And user enter the CurrencyCode under TOAccount
    And user enter the GLCode under TOAccount
    And user enter the CIFCode under TOAccount
    And User_612 Click Ok Button in Warning PopUp Menu
    And user enter the SerialNumber under TOAccount
    And User_612 Click Ok Button in Warning PopUp Menu
    And user click the retrive button under maintenance screen
    And user select the Record no1 under TransferMaintanence screen
    And user click the Save button under maintanance screen
    And user click the Approve field under TransferAccount field
    And user enter the Record in Approve field
   And user double click the record in approve field
    And user click the Approve button under Approve field
    And user click the Transfer field under TransferAccount field
    And user enter the Record in Transfer field
    And user double click the record in Transfer field
    And user click the Transfer button under Transfer field
    Then User_612 validate the pop message under Transfer field
    

       
    
    
    
    
    
    
    
