Feature: To Test the ammend cheque card status
@ACSD_001
Scenario: Checking if the system is changing the chequebook status from submitted to apply to submit
Given navigate to CSM application and login with valid credentials of AJITH user ID
And click on amend cheque card status module
And click on maintenance screen under cheque card status module
And User_482 update test data set id for ACSD_001 
And change the product type to cheque book
And enter the request no in amend cheque
And click on retrive in amend cheque
And User Click the Checkbox for retrieved record
And click on update in amend cheque
And click on ok button in amend cheque update confirmation
And User Success Ok pop up message
And click on cheque request module
And User Click Maintanence sub menu in chequebook request
And User_482 click search icon in MaintenanceScreen under chequebook request
And User_482 Search chequebook code in MaintenanceScreen under chequebook request
And User_482 Validate the chequebook status changed from submitted to apply to submit

@ACSD_001_PostReq
Scenario: checking if the user is able to submit a chequebook - short process
Given navigate to CSM application and login with valid credentials of AJITH user ID
And click on cheque request module
And User click Submit Sub Menu
And User_482 update test data set id for ACSD_001 
And User_482 Search Cheque Book Code in Submit Screen
And User_482 Select Cheque Book Code in Submit Screen
And User Click Submit button 
And User_482 Click Ok button in Warning pop up Message in Submit screen
And User_482 click ok button for no signatures and no finger print pop up warning Message
And User Click Maintanence sub menu in chequebook request
And User_482 click search icon in MaintenanceScreen under chequebook request
And User_482 Search Submitted chequebook code in Cheque book Request Maintenance Screen
Then User Validate the Submitted chequebook record in Cheque book Request Maintenance Screen
@ACSD_002
Scenario: checking if the system is changing the chequebook status from SUBMITTED to APPLY TO SUBMIT
Given navigate to CSM application and login with valid credentials
And click on amend cheque card status module
And click on maintenance screen under cheque card status module
And get the test data for test case ACSD_002
And change the product type to cheque book
And enter the branch code in amend cheque
And enter the request no in amend cheque
And give the status in submitted
And click on retrive in amend cheque
And select the retrived record from amend cheque
And click on update in amend cheque
And click on ok button in amend cheque update confirmation
Then validate system through the validation for the amend cheque record
@ACSD_003
Scenario: checking if the system is changing the chequebook status from DESTROYED to APPROVED
Given navigate to CSM application and login with valid credentials
And click on amend cheque card status module
And click on maintenance screen under cheque card status module
And get the test data for test case ACSD_003
And change the product type to cheque book
And enter the branch code in amend cheque
And enter the currency code in amend cheque
And enter the GL code in amend cheque
And enter the CIF No in amend cheque
And enter the serial number in amend cheque
And enter the request no in amend cheque
And give the status in destroyed
And click on retrive in amend cheque
And select the retrived record from amend cheque
And click on update in amend cheque
And click on ok button in amend cheque update confirmation
And click on ok button after saving the amend cheque status record
And click on cheque request module
And click on cheque query module
And enter the branch code in chequebook query
And enter the currency code in chequebook query
And enter the GL code in chequebook query
And enter the CIF code in chequebook query
And enter the serial number in chequebook query
And enter the cheque request number in search grid
Then verify status of the cheque should changed destroyed to approved
@ACSD_004
Scenario: checking if the system is reversing the charges transaction if charges were applied at the destroy
And get the test data for ACSD_004 test case
Given navigate to CSM application and login with valid credentials
And change the system date in CSM
And click on cheque request module
And click on to be destroyed module
And search the cheque code for to be destroyed cheque code
And click on to destroy button
Then verify server got loaded for to be destroyed record
And click on destroy module
And search for destroy record cheque code
And select the destroy record
And click on destroy button
Then get the transaction number and click on alert ok button
And click on Transaction module
And click on maintenance scree under transaction module
And click on search in transaction screen
And search the transaction number in transaction screen
And verify transaction status should be approved
And close the tranaction screen
And click on amend cheque card status module
And click on maintenance screen under cheque card status module
And change the product type to cheque book
And enter the branch code in amend cheque
And enter the currency code in amend cheque
And enter the GL code in amend cheque
And enter the CIF No in amend cheque
And enter the serial number in amend cheque
And enter the request no in amend cheque
And give the status in destroyed
And click on retrive in amend cheque
And select the retrived record from amend cheque
And click on update in amend cheque
And click on ok button in amend cheque update confirmation
And click on ok button after saving the amend cheque status record
And click on cheque book request maintenance screen
And click on search in cheque book request maintenance scren
And search the cheque code in cheque book request maintenance screen
Then verify system should show the status to approved for the cheque
And click on maintenance scree under transaction module
And click on search in transaction screen
And search the transaction number in transaction screen
Then verify system should reverse the transaction of the charged cheque
@ACSD_003_Prereq
Scenario: checking if the system is reversing the charges transaction if charges were applied at the destroy
Given navigate to CSM application and login with valid credentials
And click on cheque request module
And click on to be destroyed module
And get the test data for test case ACSD_003_Prereq
And search the cheque code for to be destroyed cheque code
And click on to destroy button
Then verify server got loaded for to be destroyed record
And click on destroy module
And search for destroy record cheque code
And select the destroy record
And click on destroy button
Then verify server got loaded while we destroy the cheque in destroy stage 



@ACSD_005
Scenario: checking if the system is changing the chequebook status from "cancelled" to its old status "approved"
Given navigate to CSM application and login with valid credentials of AJITH user ID
And click on amend cheque card status module
And click on maintenance screen under cheque card status module
And User_482 update test data set id for ACSD_005
And change the product type to cheque book
And enter the request no in amend cheque
And User_482 select Chequebookstatus in Amend Cheque Maintanence screen
And click on retrive in amend cheque
And User Click the Checkbox for retrieved record
And click on update in amend cheque
And click on ok button in amend cheque update confirmation
And User Success Ok pop up message
And click on cheque request module
And User Click Maintanence sub menu in chequebook request
And User_482 click search icon in MaintenanceScreen under chequebook request
And User_482 Search chequebook code in MaintenanceScreen under chequebook request
And User_482 Validate the chequebook status changed from cancelled to apply to approved


@ACSD_005_postReq
Scenario: checking if the user is able to cancel a chequebook without a reason - short process 
Given navigate to CSM application and login with valid credentials of AJITH user ID
And click on cheque request module
And User Click To Cancel Sub Menu
And User_482 update test data set id for ACSD_005
And User_482 Search Cheque Book Code in To Cancel Screen
And User_482 Select Cheque Book Code in To Cancel Screen
And User Click To Cancel button	in To Cancel Screen
And User Click Approve Cancel Sub Menu
And User_482 Search Cheque Book Code in Approve Cancel Screen
And User_482 Select Cheque Book Code in Approve Cancel Screen
And User Click Cancel button in Approve Cancel Screen
And User Click Maintanence sub menu in chequebook request
And User Click Search button in chequebook request Maintenance Screen
And User_482 Search Cancelled chequebook code in Cheque book Request Maintenance Screen
Then User Validate the Cancelled chequebook record in Cheque book Request Maintenance Screen

@ACSD_006
Scenario: checking if the system is changing the chequebook status from "cancelled" to its old status "send to provider"
Given navigate to CSM application and login with valid credentials of AJITH user ID
And User Click Amend Cheque book Menu
And User Click Maintanence sub menu
And User_482 update test data set id for ACSD_006
And change the product type to cheque book
And User Enter the Request Number in Amend Cheque Maintanence screen
And User_482 select Chequebookstatus in Amend Cheque Maintanence screen
And User Click Retrieve button
And User Click the Checkbox for retrieved record
And User click the Update button
And User Confirm Save Record
And User Success Ok pop up message
And User Click Chequebook Request Menu
And User Click Maintanence sub menu in chequebook request
And User_482 click search icon in MaintenanceScreen under chequebook request
And User_482 Search chequebook code in MaintenanceScreen under chequebook request
And User_482 Validate the chequebook status changed from cancelled to send to provider


@ACSD_006_postReq
Scenario: checking if the user is able to cancel a chequebook without a reason - short process 
Given navigate to CSM application and login with valid credentials of AJITH user ID
And User Click Chequebook Request Menu
And User Click To Cancel Sub Menu
And User_482 update test data set id for ACSD_006
And User_482 Search Cheque Book Code in To Cancel Screen
And User_482 Select Cheque Book Code in To Cancel Screen
And User Click To Cancel button	in To Cancel Screen
And User Click Approve Cancel Sub Menu
And User_482 Search Cheque Book Code in Approve Cancel Screen
And User_482 Select Cheque Book Code in Approve Cancel Screen
And User Click Cancel button in Approve Cancel Screen
And User Click Maintanence sub menu in chequebook request
And User Click Search button in chequebook request Maintenance Screen
And User_482 Search Cancelled chequebook code in Cheque book Request Maintenance Screen
Then User Validate the Cancelled chequebook record in Cheque book Request Maintenance Screen
