Feature: Testing functionalities of Chequebook feature screen
#Short process -uncheck Advanced cheque book creation in system parameters control record
#Fail due to issue
@CHB_001
Scenario: checking if the user is able to create a chequebook - short process
Given User Launch CSM Core Application
And User Click Chequebook Request Menu
And User Click Maintanence sub menu in chequebook request
And User Update the test data id for CHB_001
And User Enter the Number of Cheque Books
And User Cheque Code in Cheque book Maintenance Screen
And User Enter the Branch Code in Cheque book Maintenance Screen
And User Enter the Currency Code in Cheque book Maintenance Screen
And User Enter the GL Code in Cheque book Maintenance Screen
And User Enter the CIF Code in Cheque book Maintenance Screen
And User Enter the Serial No in Cheque book Maintenance Screen
And User Click Save button in Cheque book Maintenance Screen
And User click ok button for no signatures and no finger print pop up warning Message  
And User Click Search button in chequebook request Maintenance Screen
And User Validate Cheque book created
And User Store the newly created Cheque book code
@CHB_002
Scenario: checking if the user is able to create a chequebook - short process
Given User Launch CSM Core Application
And User Click Chequebook Request Menu
And User Click Approve Sub Menu
And User Update the test data id for CHB_002
And User Search Cheque Book Code in Approve Screen
And User Select Cheque Book Code in Approve Screen
And User Click Approve button in Approve Screen
And User Click Ok button in Warning pop up Message in Approve Screen
And User Click Maintanence sub menu in chequebook request
And User Click Search button in chequebook request Maintenance Screen
And User Search Approved chequebook code in Cheque book Request Maintenance Screen
Then User Validate the Approved chequebook record in Cheque book Request Maintenance Screen
#Fail no test data available
@CHB_003
Scenario: checking if the user is able to submit a chequebook - short process
Given User Launch CSM Core Application
And User Click Chequebook Request Menu
And User Click Approve Sub Menu
And User Update the test data id for CHB_002
And User Search Cheque Book Code in Approve Screen
And User Select Cheque Book Code in Approve Screen
And User Click Approve button in Approve Screen
And User Click Ok button in Warning pop up Message in Approve Screen
And User Click Apply to Submit Sub Menu
And User Search Cheque Book Code in Apply to Submit Screen
And User Select Cheque Book Code in Apply to Submit Screen
And User Click Apply to Submit button
And User Submit Sub Menu
And User Search Cheque Book Code in Submit Screen
And User Select Cheque Book Code in Submit Screen
And User Click Submit button 
And User Click Maintanence sub menu in chequebook request
And User Click Search button in chequebook request Maintenance Screen
And User Search Submitted chequebook code in Cheque book Request Maintenance Screen
Then User Validate the Submitted chequebook record in Cheque book Request Maintenance Screen
#pass
@CHB_004
Scenario: checking if the user is able to cancel a chequebook without a reason - short process 
Given User Launch CSM Core Application
And User Click Chequebook Request Menu
And User Click To Cancel Sub Menu
And User Update the test data id for CHB_004
And User Search Cheque Book Code in To Cancel Screen
And User Select Cheque Book Code in To Cancel Screen
And User Click To Cancel button	in To Cancel Screen
And User Click Approve Cancel Sub Menu
And User Search Cheque Book Code in Approve Cancel Screen
And User Select Cheque Book Code in Approve Cancel Screen
And User Click Cancel button in Approve Cancel Screen
And User Click Ok button in Warning pop up Message in Approve Cancel Screen
And User Click Maintanence sub menu in chequebook request
And User Click Search button in chequebook request Maintenance Screen
And User Search Cancelled chequebook code in Cheque book Request Maintenance Screen
Then User Validate the Cancelled chequebook record in Cheque book Request Maintenance Screen
@ACSD_004_PostReq
Scenario: checking if the system is changing the chequebook status from DESTROYED to APPROVED
Given navigate to CSM application and login with valid credentials
And click on amend cheque card status module
And click on maintenance screen under cheque card status module
And User Update the test data id for CHB_004
#And User update Test data id for test case CHB_006
And change the product type to cheque book
#And enter the branch code in amend cheque
#And enter the currency code in amend cheque
#And enter the GL code in amend cheque
#And enter the CIF No in amend cheque
#And enter the serial number in amend cheque
And enter the request no in amend cheque
And Select the chequebook Status as cancelled
And click on retrive in amend cheque
And select the retrived record from amend cheque
And click on update in amend cheque
And click on ok button in amend cheque update confirmation
And click on ok button after saving the amend cheque status record
And click on cheque request module
And User Click Search button in chequebook request Maintenance Screen
And User Click Maintanence sub menu in chequebook request
And User Search Approved chequebook code in Cheque book Request Maintenance Screen
Then User Validate the Approved chequebook record in Cheque book Request Maintenance Screen
#pass
@CHB_005
Scenario: checking if the user is abel to cancel the chequebook with a reason -short process
Given User Launch CSM Core Application
And User Click Chequebook Request Menu
And User Click To Cancel Sub Menu
And User Update the test data id for CHB_005
And User Search Cheque Book Code in To Cancel Screen
And User Select Cheque Book Code in To Cancel Screen
And User Click To Cancel button	in To Cancel Screen
And User Validate Missing Reason Pop up
And User Enter Cancel Reason in To Cancel Screen
And User Click Approve Cancel Sub Menu
And User Search Cheque Book Code in Approve Cancel Screen
And User Select Cheque Book Code in Approve Cancel Screen
And User Click Cancel button in Approve Cancel Screen
And User Click Maintanence sub menu in chequebook request
And User Click Search button in chequebook request Maintenance Screen
And User Search Cancelled chequebook code in Cheque book Request Maintenance Screen
Then User Validate the Cancelled chequebook record in Cheque book Request Maintenance Screen
#pass
@CHB_006
Scenario: checking if the user is able to destroy a  chequebook  - short process
Given navigate to CSM application and login with valid credentials
And click on cheque request module
And click on to be destroyed module
And User update Test data id for test case CHB_006
#And get the test data for test case ACSD_003
And search the cheque code for to be destroyed cheque code
And User enter reason to suspend chequebook record
And click on to destroy button
Then verify server got loaded for to be destroyed record
And click on destroy module
And search for destroy record cheque code
And select the destroy record
And click on destroy button
Then verify server got loaded while we destroy the cheque in destroy stage
And User Click Maintanence sub menu in chequebook request
And User Click Search button in chequebook request Maintenance Screen
And User Search destroyed chequebook code in Cheque book Request Maintenance Screen
Then User Validate the destroyed chequebook record in Cheque book Request Maintenance Screen
#pass
@CHB_007
Scenario: checking if the user is able to suspend a chequebook - short process
Given User Launch CSM Core Application
And User Click Chequebook Request Menu
And User Click Suspend Sub Menu
And User update Test data id for checking if the user is able to suspend a chequebook short process
And User search the chequebook code in chequebook request Maintenance Screen
And User Select the Searched Record in chequebook request Maintenance Screen
And User click suspend button to suspend the cheque book record
And User Click Maintanence sub menu in chequebook request
And User Click Search button in chequebook request Maintenance Screen
And User Search Suspended chequebook code in Cheque book Request Maintenance Screen
Then User Validate the suspended chequebook record in Cheque book Request Maintenance Screen
#fail
@CHB_035
Scenario: checking if the user is able to approve reverse cancellation record under "approve cancellation reversal " screen 
Given User Launch CSM Core Application
And User Click Chequebook Request Menu
And User Click To Reverse Cancellation Sub Menu
And User update Test data id for checking if the user is able to suspend a chequebook short process
And User Search the chequebook code in To Reverse Cancellation Screen
And User Select the chequebook code in To Reverse Cancellation Screen
And User Click Reverse button in To Reverse Cancellation Screen
And User Click Approve Cancellation Reversal Sub Menu
And User Search the chequebook code in Approve Cancellation Reversal Screen
And User Select the chequebook code in Approve Cancellation Reversal Screen
And User Click Reverse button in Approve Cancellation Reversal Screen
And User Click Maintanence sub menu in chequebook request
And User Click Search button in chequebook request Maintenance Screen
And User Search the Reversed Cancellation chequebook code in Cheque book Request Maintenance Screen
Then User Validate the Reversed Cancellation chequebook record in Cheque book Request Maintenance Screen
@CHB_036
Scenario: checking if the user is able approve cancellation reversal throught alert  
Given User Launch CSM Core Application
And User Click Chequebook Request Menu
And User Click To Reverse Cancellation Sub Menu
And User update Test data id for checking if the user is able approve cancellation reversal throught alert
And User Search the chequebook code in To Reverse Cancellation Screen
And User Select the chequebook code in To Reverse Cancellation Screen
And User Click Reverse button in To Reverse Cancellation Screen
And User Click Approve button in Send Alert To Reverse Cancellation Screen
And User Enter BM User Name in User Information pop up
And User Enter BM Password in User Information pop up
And User Click Submit button in User Information pop up
And User Click Approve button in approve item pop up
And User Search the chequebook code in Approve Cancellation Reversal Screen
And User Select the chequebook code in Approve Cancellation Reversal Screen
And User Click Reverse button in Approve Cancellation Reversal Screen
And User Click Maintanence sub menu in chequebook request
And User Click Search button in chequebook request Maintenance Screen
And User Search the To be Cancelled  chequebook code in Cheque book Request Maintenance Screen
Then User Validate the To be Cancelled chequebook record in Cheque book Request Maintenance Screen
@CHB_037
Scenario: checking if the user is able reject cancellation reversal throught alert   
Given User Launch CSM Core Application
And User Click Chequebook Request Menu
And User Click To Reverse Cancellation Sub Menu
And User update Test data id for checking if the user is able reject cancellation reversal throught alert  
And User Search the chequebook code in To Reverse Cancellation Screen
And User Select the chequebook code in To Reverse Cancellation Screen
And User Click Reverse button in To Reverse Cancellation Screen
And User Click Approve button in Send Alert To Reverse Cancellation Screen
And User Enter BM User Name in User Information pop up
And User Enter BM Password in User Information pop up
And User Click Submit button in User Information pop up
And User Click Reject button in approve item pop up
And User Click Maintanence sub menu in chequebook request
And User Click Search button in chequebook request Maintenance Screen
And User Search Cancelled chequebook code in Cheque book Request Maintenance Screen
Then User Validate the Cancelled chequebook record in Cheque book Request Maintenance Screen
@CHB_038
Scenario: checking if the user is able to reverse cancellation with batch record under "to reverse cancellation batch  " screen 
Given User Launch CSM Core Application
And User Click Chequebook Request Menu
And User Click To Reverse Cancellation Batch Sub Menu
And User Click the Retrieve button in To Reverse Cancellation Batch Screen
And User update Test data id for checking if the user is able to reverse cancellation with batch record
And User Select the Chequebook code in To Reverse Cancellation Batch Screen
And User Click Reverse button in To Reverse Cancellation Batch Screen
And User Click Maintanence sub menu in chequebook request
And User Click Search button in chequebook request Maintenance Screen
And User Search To Reverse Cancellation chequebook code in Cheque book Request Maintenance Screen
Then User Validate the To Reverse Cancellation chequebook record in Cheque book Request Maintenance Screen
@CHB_039
Scenario: checking if the user is able to approve reverse cancellation with batch record under "approve reversal cancellation batch  " screen 
Given User Launch CSM Core Application
And User Click Chequebook Request Menu
And User Click Approve Reversal of Cancellation Batch Sub Menu
And User Click the Retrieve button in Approve Reversal of Cancellation Batch Screen
And User Select the Chequebook code in Approve Reversal of Cancellation Batch Screen
And User update Test data id for checking if the user is able to approve reverse cancellation with batch record 
And User Click Approve Reverse button in Approve Reversal of Cancellation Batch Screen
And User Click Maintanence sub menu in chequebook request
And User Click Search button in chequebook request Maintenance Screen
And User Search the To be Cancelled  chequebook code in Cheque book Request Maintenance Screen
Then User Validate the To be Cancelled chequebook record in Cheque book Request Maintenance Screen
@ACSD_003
Scenario: checking if the system is changing the chequebook status from DESTROYED to APPROVED
Given navigate to CSM application and login with valid credentials
And click on amend cheque card status module
And click on maintenance screen under cheque card status module
And User update Test data id for test case CHB_006
And change the product type to cheque book
#And enter the branch code in amend cheque
#And enter the currency code in amend cheque
#And enter the GL code in amend cheque
#And enter the CIF No in amend cheque
#And enter the serial number in amend cheque
And enter the request no in amend cheque
And give the status in destroyed
And click on retrive in amend cheque
And select the retrived record from amend cheque
And click on update in amend cheque
And click on ok button in amend cheque update confirmation
And click on ok button after saving the amend cheque status record
And click on cheque request module
And User Click Search button in chequebook request Maintenance Screen
And User Click Maintanence sub menu in chequebook request
And User Search Approved chequebook code in Cheque book Request Maintenance Screen
Then User Validate the Approved chequebook record in Cheque book Request Maintenance Screen



 
