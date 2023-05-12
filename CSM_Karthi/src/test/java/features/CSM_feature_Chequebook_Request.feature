Feature: To verify the functionality of Chequebook request module



  @CHB_186
  Scenario: Functional testing -Testing "Chequebook Request - Send To/Receive From Provider" Screen If the DDL is set to logged-in branch
    Given navigate to CSM param application and login with valid credentials
    
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the User screen in system parameters
    And user click the update after approve screen
    And user update test data set id for CHB_186
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
    And user double click the user id
    And user click the approve box
    And user click the save ok button
    And user click the ok
    Given navigate to CSM application and login with valid credentials
    And user click the chequebook request in csmcore
    And user click the send to receive from provider
    And user click the send to provider screen
    And user click the retrive button in send to provider
    And user update test data set id for CHB_186_D3
    #And user Enter the  branch code in send to provider
    And user click the receive from provider screen
    And user update test data set id for CHB_186_D3
  #And user Enter the  branch code in receive from provider

  @CHB_187
  Scenario: Functional testing -Testing "Chequebook Request - Send To/Receive From Provider" Screen If the DDL is set to all branches
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for CHB_187
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the User screen in system parameters
    And user click the update after approve screen
    And user click and send the values in user id under update after approve screen
    And user double click the user id
    And user select the all branches
    And user click the update after approve button
    And user click the save ok button
    And user click the ok
    And user click the approve in user screen
    And user click and send the values in user id under Approve screen
    And user click the approve box
    And user click the save ok button
    And user click the ok
    Given navigate to CSM application and login with valid credentials
    And user click the chequebook request in csmcore
    And user click the send to receive from provider
    And user click the send to provider screen
    And user click the retrive button in send to provider
    #And user click the branch code in send to provider
    And user click the receive from provider screen
    #And user click the branch code in receive from provider
@CHB_180
  Scenario: Cheque book - GL type field is 'Notify and Don’t Proceed','Proceed on insufficient funds' flag checked at Transaction type
    Given navigate to CSM param application and login with valid credentials
    And user click the parameters menu
    And user click the Account parameters submenu
    And user click the General Ledger submenu
    And user click the update after approve screen under general ledger
    And user update test data set id for CHB_180
    And user double click the record in Update after approve screen
    And user click Additional Details
    And user change the value as Notify and dont proceed in drop down
    And user click update button under the drop down
    And user click the ok
    And user click approve sub menu under General Ledger
    And user enter the code in Approve screen
    And user double click the record in Approve screen
    And user click Additional Details
    And user click the Approve button under drop down menu
    And user click the ok button on information popup
  