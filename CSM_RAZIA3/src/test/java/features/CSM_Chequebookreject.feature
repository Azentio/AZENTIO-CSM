 Feature: Checking the functionalities of chequebook

  @CHB_115
  Scenario: Unchecking the flag Records rejection reason is mandatory and  rejecting a chequebook under Approve Cancel screen
    Given Navigate to CSM application and login with valid credentials
     And User_612 update test data set id for CHB_115
    And Click the chequebook request flag under CSM
    Then Click the approve cancel button under chequebook request
    And Search the Code and select the existing record under approve cancel
    And double tab the existing record under approve cancel
    Then Click the reject that record by clicking the reject button under approve cancel
    And click the ok  popmsg when enter reject that record
    And enter the reason under approve cancel
    Then Click the reject that record by clicking the reject button under approve cancell

  @CHB_116
  Scenario: check the flag Records rejection reason is mandatory and  rejecting a chequebook under Approve Cancel screen
    Given Navigate to CSM application and login with valid credentials
     And User_612 update test data set id for CHB_116
    And Click the chequebook request flag under CSM
    Then Click the approve cancel button under chequebookrequest
    And Search the Code and select the existingrecord under approve cancel
    And double tab the existing record in under approvecancel
    And enter the Reason under the approvecancel
    Then Click the reject button under approve cancel

  @CHB_164
  Scenario: checking if the system is showing the correct description for charges entries(chequebook)and bill flag unchecked
    Given Navigate to CSM application and login with valid credentials
   And User_612 update test data set id for CHB_164
    And Click the chequebook request flag under CSM
    Then click the Maintenance screen under chequebookrequest
    And enter the no of chequebooks under Maintenance screen
    Then enter the value in chequecode under Maintenance screen
    And enter the branchcode under Maintenance screen
    Then enter the currencycode under Maintenance screen
    And enter the glcode under Maintenance screen
    And enter the cifcode under Maintenance screen
    And enter the Serialno under Maintenance screen
    And click on save button under  Maintenance screen
    Then click the charge button and verify the changes

  @CHB_165
  Scenario: checking if the system is showing the correct description for charges entries(chequebook)and bill flagchecked
    Given Navigate to CSM application and login with valid credentials
     And User_612 update test data set id for CHB_165
     And Click the chequebook request flag under CSM
    Then click the Maintenance screen under chequebookrequest
    And enter the no of chequebooks under Maintenance screen
    Then enter the value in chequecode under Maintenance screen
    And enter the branchcode under Maintenance screen
    Then enter the currencycode under Maintenance screen
    And enter the glcode under Maintenance screen
    And enter the cifcode under Maintenance screen
    And enter the Serialno under Maintenance screen
    And click on save button under  Maintenance screen
    Then click the charge button and verify the changes
    
#@CHB_166,@CHB_167,@CHB_168
  @CHB_166
  Scenario: To check whether user is able to create a Chequebook If the DDL value is Warn and Proceed and show a pop (ID has Expired)
    Given Navigate to CSM application and login with valid credentials
     And User_612 update test data set id for CHB_166
    And Click a date avaible in csm application
    And Clear the date and update today date under CSM
    And Click the use button in date menu under CSM
   # And Click the pop ok button in date menu under CSM
    And Click the information pop ok button in date menu under CSM
    And Close the date menu under CSM
    And Click the chequebookRequest flag under CSM
    And click the maintenance  screen under the chequebookRequest
    And Enter the values  in noOf ChequeBooks under Maintenance screen
    And Enter the values in Chequecode  under Maintenance
    And Random click for leavesclick under Maintenance
    And Enter the values in branchcode under Maintenance
    And Enter the values in Curencycode under Maintenance
    And Enter the values in Gl under Maintenance
    And Enter the values in Cif under Maintenance
    And Enter the values in serialno under Maintenance
    And  Click the Charges under Maintenance
    Then Click the save button  under Maintenance
    And Click the warningmsg ok button
    And Click the Alert ok button
    And Click the approveflag under chequebookRequest
    And Enter the chequecode under approveflag 
    And user select the Existing record and double the data under approve flag
    Then click the  approve button under approve flags
    
    @CHB_167
    Scenario: To check whether user is able to create a Chequebook If the DDL value is Warn and Stop
    Given Navigate to CSM application and login with valid credentials
     And User_612 update test data set id for CHB_167
    And Click a date avaible in csm application
    And Clear the date and update today date under CSM
    And Click the use button in date menu under CSM
   # And Click the pop ok button in date menu under CSM
    And Click the information pop ok button in date menu under CSM
    And Close the date menu under CSM
    And Click the chequebookRequest flag under CSM
    And click the maintenance  screen under the chequebookRequest
    And Enter the values  in noOf ChequeBooks under Maintenance screen
    And Enter the values in Chequecode  under Maintenance
    And Random click for leavesclick under Maintenance
    And Enter the values in branchcode under Maintenance
    And Enter the values in Curencycode under Maintenance
    And Enter the values in Gl under Maintenance
    And Enter the values in Cif under Maintenance
    And Enter the values in serialno under Maintenance
    And  Click the Charges under Maintenance
    Then Click the save button  under Maintenance
    And Click the warningmsg ok button
    And Click the Alert ok button
    And Click the approveflag under chequebookRequest
    And Enter the chequecode under approveflag 
    And user select the Existing record and double the data under approve flag
    Then click the  approve button under approve flags
    
    @CHB_168
     Scenario: To check whether user is able to create a Chequebook If the DDL value is N/a
    Given Navigate to CSM application and login with valid credentials
     And User_612 update test data set id for CHB_168
    And Click a date avaible in csm application
    And Clear the date and update today date under CSM
    And Click the use button in date menu under CSM
#  And Click the information pop ok button in date menu under CSM
    And Close the date menu under CSM
    And Click the chequebookRequest flag under CSM
    And click the maintenance  screen under the chequebookRequest
    And Enter the values  in noOf ChequeBooks under Maintenance screen
    And Enter the values in Chequecode  under Maintenance
    And Random click for leavesclick under Maintenance
    And Enter the values in branchcode under Maintenance
    And Enter the values in Curencycode under Maintenance
    And Enter the values in Gl under Maintenance
    And Enter the values in Cif under Maintenance
    And Enter the values in serialno under Maintenance
    And  Click the Charges under Maintenance
    Then Click the save button  under Maintenance
    And Click the warningmsg ok button
    And Click the Alert ok button
    And Click the approveflag under chequebookRequest
    And Enter the chequecode under approveflag 
    And user select the Existing record and double the data under approve flag
    Then click the  approve button under approve flags
    
    
    
    