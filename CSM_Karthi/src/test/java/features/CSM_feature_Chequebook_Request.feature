Feature: To verify the functionality of Chequebook request module



  @CHB_186
  Scenario: Functional testing -Testing "Chequebook Request - Send To/Receive From Provider" Screen If the DDL is set to logged-in branch
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for CHB_186
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the User screen in system parameters
    And user click the update after approve screen
    #And user update test data set id for CHB_186
    And user click and send the values in user id under update after approve screen
    And user double click the user id
    #And user retrive the existing data in update after approve screen
    And user select the logged in branch
    And user click the update after approve button
    And user click the save ok button
    And user click the ok
    And user click the approve in user screen
    And user update test data set id for CHB_186
    And user click and send the values in user id under Approve screen
    And user double click the user id in approve screen
    And user click the approve box
    And user click the save ok button
    And user click the ok
    Given navigate to CSM application and login with valid credentials
    And user click the chequebook request in csmcore
    And user click the send to receive from provider
    And user click the send to provider screen
    And user click the retrive button in send to provider
    And user update test data set id for CHB_186_D3 in send to provider screen
    
    And user click the receive from provider screen
    And user update test data set id for CHB_186_D3 in receive from provider screen
 
  @CHB_187
  Scenario: Functional testing -Testing "Chequebook Request - Send To/Receive From Provider" Screen If the DDL is set to all branches
    Given navigate to CSM param application and login with valid credentials
   And user click the parameters menu
    And user click the system parameters submenu
    And user click the User screen in system parameters
    And user click the update after approve screen
    And user update test data set id for CHB_187
    And user click and send the values in user id under update after approve screen
    And user double click the user id
    #And user retrive the existing data in update after approve screen
    And user select All the Branch in dropdown
    And user click the update after approve button
    And user click the save ok button
    And user click the ok
    And user click the approve in user screen
    And user update test data set id for CHB_187
    And user click and send the values in user id under Approve screen
    And user double click the user id in approve screen
    And user click the approve box
    And user click the save ok button
    And user click the ok
    Given navigate to CSM application and login with valid credentials
    And user click the chequebook request in csmcore
    And user click the send to receive from provider
    And user click the send to provider screen
    And user click the retrive button in send to provider
    And user update test data set id for CHB_187_D3 in send to provider screen
    #And user Enter the  branch code in send to provider
    And user click the receive from provider screen
    And user update test data set id for CHB_187_D3 in receive from provider screen
  #And user Enter the  branch code in receive from provider

 @CHB_180
  Scenario: Cheque book - GL type field is 'Notify and Don’t Proceed','Proceed on insufficient funds' flag checked at Transaction type
    Given navigate to CSM param application and login with valid credentials
     And user update test data set id for CHB_180
    And user click the parameters menu
    And user click the Account parameters submenu
    And user click the General Ledger submenu
    And user click the update after approve screen under general ledger
    And user update test data set id for CHB_180 in update after screen
    And user double click the record in Update after approve screen
    And user click Additional Details
    And user change the value as Notify and dont proceed in drop down
    And user click update button under the drop down
    And user click the ok
    And user click approve sub menu under General Ledger
    And user update test data set id for CHB_180 in approve screen
    And user double click the record in Approve screen
    And user click Additional Details
    And user click the Approve button under drop down menu
    And user click the ok button on information popup
    And user click the ok 
    And user click the system parameters submenu
    And user click the transationtype submenu under systemparameters
    And user click the updateafterapprove menu under transationtype
    And user Enter the code in inputfield on updateafterapprove screen under transactiontype
    And User double click the record under updateafterapprove screen
    And User Check the ProceedOnInsufficientFund chequebox
    And User click UpdateAfterApprove button on updateafterapprove field
    And user click the save ok button
    And user click the ok
    And user click the Approve field under the transactiontype
    And user Enter the code in inputfield on Approve screen under transactiontype
    And User double click the record Approve screen
    And user click the Approve button on Approve field
    And user click the save ok button
    And user click the ok   
  Given navigate to CSM application and login with valid credentials 
   And User Click on Date to Change the Current Date
    And User Enter the Date in User Running Date for CHB_180
    And User Click on Use Button in Change Running Date Popup
    And User Click Ok Button in Information PopUp menu
    And User Click on Close Button in Change Running Date Popup
    And User Click on Technical Details Icon
    And User Click Clear Cache in Technical Details Icon
    And User Click Ok Button Under Information PopUp Menu
    And user click the Chequebookrequest submenu on CSMCORE
    And user click the maintanance under the chequebookrequest screen
    And user Enter the NoOfCheques in the field
    And user Enter the code on chequebookrequest maintanance screen
   # And user click on some thing in visible screen
    And user Enter the Branchcode on chequebookrequest maintenance screen
    And user Enter the Currencycode on chequebookrequest maintenance screen
    And user Enter the GLCode on chequebookrequest maintenance screen
    And user Enter the CIFCode on chequebookrequest maintenance screen
    And user Enter the SerialNo on chequebookrequest maintance screen
    And user click the ok
    #And that warning popup
    And user click the Save button on maintance screen
    And user click the Approve field under chequebookrequest field
    And user enter the cheque code on approve screen
    And user double click the cheque code on approve screen
    And user click the ok
   # And that warning popup
    And user Approve the cheque record on Approve field
    And user validate the cannot Proceed Message
    
    @CHB_181
  Scenario: Cheque book - GL type field is 'Notify and Proceed ','Proceed on insufficient funds' flag unchecked at Transaction type
    Given navigate to CSM param application and login with valid credentials
     And user update test data set id for CHB_181
    And user click the parameters menu
    And user click the Account parameters submenu
    And user click the General Ledger submenu
    And user click the update after approve screen under general ledger
    And user update test data set id for CHB_180 in update after screen
    And user double click the record in Update after approve screen
    And user click Additional Details
    And user change the value as Notify and  proceed in drop down
    And user click update button under the drop down
    And user click the ok
    And user click approve sub menu under General Ledger
    And user update test data set id for CHB_180 in approve screen
    And user double click the record in Approve screen
    And user click Additional Details
    And user click the Approve button under drop down menu
    And user click the ok button on information popup
    And user click the ok 
    And user click the system parameters submenu
    And user click the transationtype submenu under systemparameters
    And user click the updateafterapprove menu under transationtype
    And user Enter the code in inputfield on updateafterapprove screen under transactiontype
    And User double click the record under updateafterapprove screen
    And User Uncheck the ProceedOnInsufficientFund chequebox
    And User click UpdateAfterApprove button on updateafterapprove field
    And user click the save ok button
    And user click the ok
    And user click the Approve field under the transactiontype
    And user Enter the code in inputfield on Approve screen under transactiontype
    And User double click the record Approve screen
    And user click the Approve button on Approve field
    And user click the save ok button
    And user click the ok  
  Given navigate to CSM application and login with valid credentials
  And User Click on Date to Change the Current Date
  And User Enter the Date in User Running Date for CHB_180
    And User Click on Use Button in Change Running Date Popup
    And User Click Ok Button in Information PopUp menu
    And User Click on Close Button in Change Running Date Popup
    And User Click on Technical Details Icon
    And User Click Clear Cache in Technical Details Icon
    And User Click Ok Button Under Information PopUp Menu
    And user click the Chequebookrequest submenu on CSMCORE
    And user click the maintanance under the chequebookrequest screen
    And user Enter the NoOfCheques in the field
    And user Enter the code on chequebookrequest maintanance screen
   # And user click on some thing in visible screen
    And user Enter the Branchcode on chequebookrequest maintenance screen
    And user Enter the Currencycode on chequebookrequest maintenance screen
    And user Enter the GLCode on chequebookrequest maintenance screen
    And user Enter the CIFCode on chequebookrequest maintenance screen
    And user Enter the SerialNo on chequebookrequest maintance screen
    And user click the ok
    #And that warning popup
    And user click the Save button on maintance screen
    And user click the Approve field under chequebookrequest field
    And user enter the cheque code on approve screen
    And user double click the cheque code on approve screen
    And user click the ok
   # And that warning popup
    And user Approve the cheque record on Approve field
    And user validate the cannot Proceed Message
    
    
    @CHB_182
  Scenario: Cheque book -  GL type field is 'Notify and Proceed ','Proceed on insufficient funds' flag checked at Transaction type
    Given navigate to CSM param application and login with valid credentials
     And user update test data set id for CHB_181
    And user click the parameters menu
    And user click the Account parameters submenu
    And user click the General Ledger submenu
    And user click the update after approve screen under general ledger
    And user update test data set id for CHB_180 in update after screen
    And user double click the record in Update after approve screen
    And user click Additional Details
    And user change the value as Notify and  proceed in drop down
    And user click update button under the drop down
    And user click the ok
    And user click approve sub menu under General Ledger
    And user update test data set id for CHB_180 in approve screen
    And user double click the record in Approve screen
    And user click Additional Details
    And user click the Approve button under drop down menu
    And user click the ok button on information popup
    And user click the ok 
    And user click the system parameters submenu
    And user click the transationtype submenu under systemparameters
    And user click the updateafterapprove menu under transationtype
    And user Enter the code in inputfield on updateafterapprove screen under transactiontype
    And User double click the record under updateafterapprove screen
   And User Check the ProceedOnInsufficientFund chequebox
    And User click UpdateAfterApprove button on updateafterapprove field
    And user click the save ok button
    And user click the ok
    And user click the Approve field under the transactiontype
    And user Enter the code in inputfield on Approve screen under transactiontype
    And User double click the record Approve screen
    And user click the Approve button on Approve field
    And user click the save ok button
    And user click the ok  
  Given navigate to CSM application and login with valid credentials
  And User Click on Date to Change the Current Date
  And User Enter the Date in User Running Date for CHB_180
    And User Click on Use Button in Change Running Date Popup
    And User Click Ok Button in Information PopUp menu
    And User Click on Close Button in Change Running Date Popup
    And User Click on Technical Details Icon
    And User Click Clear Cache in Technical Details Icon
    And User Click Ok Button Under Information PopUp Menu
    And user click the Chequebookrequest submenu on CSMCORE
    And user click the maintanance under the chequebookrequest screen
    And user Enter the NoOfCheques in the field
    And user Enter the code on chequebookrequest maintanance screen
   # And user click on some thing in visible screen
    And user Enter the Branchcode on chequebookrequest maintenance screen
    And user Enter the Currencycode on chequebookrequest maintenance screen
    And user Enter the GLCode on chequebookrequest maintenance screen
    And user Enter the CIFCode on chequebookrequest maintenance screen
    And user Enter the SerialNo on chequebookrequest maintance screen
    And user click the ok
    #And that warning popup
    And user click the Save button on maintance screen
    And user click the Approve field under chequebookrequest field
    And user enter the cheque code on approve screen
    And user double click the cheque code on approve screen
    And user click the ok
   # And that warning popup
    And user Approve the cheque record on Approve field
    #And user validate the cannot Proceed Message
    
    
    