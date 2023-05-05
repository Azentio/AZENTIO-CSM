Feature: To verify the functionality of chequebook request
@CHB_014
Scenario: checking if the Chequebook is updated to sent to branch status
Given user login as csm core application
And user update test data set id for CHB_014
And Navigate to Chequebook request section
And Navigate to Sent to branch page in chequebook request
And Search the particular code in sent to branch page
And Click on the particular record in sent to branch page
And Click on Sent to branch button
And Navigate to Maintanence page in chequebook request
And Click on Search icon in maintenance page
And Search the particular code in maintenance page
And Validate the record is present with sent to branch status

@CHB_016
Scenario: checking if the Chequebook is updated to In branch status
#This test case also covers the functionality of CHB_015
Given user login as csm core application
And user update test data set id for CHB_016
And Navigate to Chequebook request section
And Navigate to In branch page in chequebook request
And Search the particular code in In branch page
And Click on the particular record in In branch page
And Click on In branch button
And Navigate to Maintanence page in chequebook request
And Click on Search icon in maintenance page
And Search the particular code in maintenance page
And Validate the record is present with In branch status

@CHB_017
Scenario: checking if the user can able to submit chequebook long process
Given user login as csm core application
And user update test data set id for CHB_017
And Navigate to Chequebook request section
And Navigate to Apply to submit section
And Search the particular code in Apply to submit
And Click on the particular record in Apply to submit
And Click on Apply submit button
And Navigate to submit section
And Search the particular code in submit
And Click on the particular code in submit
And Click on Submit button in Submit section
And Navigate to Maintanence page in chequebook request
And Click on Search icon in maintenance page
And Search the particular code in maintenance page
And Validate the record is present with Submitted status

@CHB_018	
Scenario: checking if the user can able to cancel chequebook long process
Given user login as csm core application
And user update test data set id for CHB_018
And Navigate to Chequebook request section
And Navigate to To cancel section
And Search the particular code in To Cancel
And Click on the particular record in To Cancel
And Select the Cancel reason in To Cancel
And Click on To Cancel button
And Navigate to Approve Cancel section
And Search the particular code in Approve Cancel
And Click on the particular record in Approve Cancel
And Click on Cancel button in Approve Cancel
And Navigate to Maintanence page in chequebook request
And Click on Search icon in maintenance page
And Search the particular code in maintenance page
And Validate the record is present with Cancelled status

@CHB_019
Scenario: checking if the user can able to destroy chequebook long process
Given user login as csm core application
And user update test data set id for CHB_019
And Navigate to Chequebook request section
And Navigate to To be destroyed section
And Search the particular code in To be destroyed
And Click on the particular record in To be destroyed
And Enter the Cancel reason in To be destroyed
And Click on To Destroy button
And Navigate to Approve Destroyed section
And Search the particular code in Approve Destroyed
And Click on the particular record in Approve Destroyed
And Click on Destroy buttonin Approve Destroyed
And Navigate to Maintanence page in chequebook request
And Click on Search icon in maintenance page
And Search the particular code in maintenance page
And Validate the record is present with Destroyed status

@CHB_020
Scenario: checking if the user can able to suspend chequebook long process
Given user login as csm core application
And user update test data set id for CHB_020
And Navigate to Chequebook request section
And Navigate to To Suspend section
And Search the particular code in To Suspend
And Click on the particular record in To Suspend
And Click on To Suspend button
And Navigate to Suspend section
And Search the particular code in Suspend
And Click on the particular record in Suspend
And Click on Suspend button in Suspend
And Navigate to Maintanence page in chequebook request
And Click on Search icon in maintenance page
And Search the particular code in maintenance page
And Validate the record is present with Suspended status

@CHB_046
Scenario: checking if Collected by field is disable in Chequebook request submit screen
Given user login as csm core application
And user update test data set id for CHB_046
And Navigate to Chequebook request section
And Navigate to submit section
And Search the particular code in submit
And Click on the particular code in submit
And Click on Request Information section
And Validate Collected by field is disable in Submit screen

@CHB_045
Scenario: checking if Collected by id field is editable in Chequebook request Apply to submit screen
Given user login as csm core application
And user update test data set id for CHB_045
And Navigate to Chequebook request section
And Navigate to Apply to submit section
And Search the particular code in Apply to submit
And Click on the particular record in Apply to submit
And Click on Request Information section
And Validate that Collected by id field is editable in Apply to submit screen

@CHB_044
Scenario: checking if Collected by id field is editable in Chequebook request Apply to submit screen
Given user login as csm core application
And user update test data set id for CHB_044
And Navigate to Chequebook request section
And Navigate to Apply to submit section
And Search the particular code in Apply to submit
And Click on the particular record in Apply to submit
And Click on Request Information section
And Validate that Collected by field is editable in Apply to submit screen

@CHB_043
Scenario: checking if search results are retrieved in Chequebook query page
Given user login as csm core application
And user update test data set id for CHB_043
And Navigate to Chequebook request section
And Navigate to Chequebook query screen
And Enter the Branch code in Chequebook query
And Enter the Currency code in Chequebook query
And Enter the GL code in Chequebook query
And Enter the CIF code in Chequebook query
And Enter the Serial in Chequebook query
And Click on Chequebook query header
And Validate the record with Active status in Chequebook query
And Validate the record with Approved status in Chequebook query
And Validate the record with Sent to provider status in Chequebook query
And Validate the record with Received from provider status in Chequebook query
And Validate the record with In branch status in Chequebook query
And Validate the record with Sent to branch status in Chequebook query
And Validate the record with Apply to submit status in Chequebook query
And Validate the record with Submitted status in Chequebook query
And Validate the record with To Cancel status in Chequebook query
And Validate the record with Cancelled status in Chequebook query
And Validate the record with To Destroy status in Chequebook query
And Validate the record with Destroyed status in Chequebook query
And Validate the record with To Suspend status in Chequebook query
And Validate the record with Suspended status in Chequebook query
And Validate the record with To Reverse status in Chequebook query
And Validate the record with Reversed status in Chequebook query
And Validate the record with To Reverse cancellation status in Chequebook query
And Validate the record with To Reactivate status in Chequebook query
And Validate all status of chequebookquery

@CHB_042
Scenario: checking if Search results are retrieved in Chequebook request List screen
Given user login as csm core application
And user update test data set id for CHB_042
And Navigate to Chequebook request section
And Navigate to List section in Chequebook request
And Enter Branch code in list page
And Enter From CIF in list page
And Enter To CIF in list page
And Enter Status as Active in list page
And Click on Retrieve button in list page
And Validate the record is retrieved with Active status
And Click on Parameters section in list page
And Enter Status as Approved in list page
And Click on Retrieve button in list page
And Validate the record is retrieved with Approved status
And Click on Parameters section in list page
And Enter Status as Sent to Provider in list page
And Click on Retrieve button in list page
And Validate the record is retrieved with Sent to Provider status
And Click on Parameters section in list page
And Enter Status as Received from Provider in list page
And Click on Retrieve button in list page
And Validate the record is retrieved with Received from Provider status
And Click on Parameters section in list page
And Enter Status as In Branch in list page
And Click on Retrieve button in list page
And Validate the record is retrieved with In Branch status
And Click on Parameters section in list page
And Enter Status as Send To Branch in list page
And Click on Retrieve button in list page
And Validate the record is retrieved with Send To Branch status
And Click on Parameters section in list page
And Enter Status as Apply To Submit in list page
And Click on Retrieve button in list page
And Validate the record is retrieved with Apply To Submit status
And Click on Parameters section in list page
And Enter Status as Submitted in list page
And Click on Retrieve button in list page
And Validate the record is retrieved with Submitted status
And Click on Parameters section in list page
And Enter Status as to cancel in list page
And Click on Retrieve button in list page
And Validate the record is retrieved with to cancel status
And Click on Parameters section in list page
And Enter Status as cancelled in list page
And Click on Retrieve button in list page
And Validate the record is retrieved with cancelled status
And Click on Parameters section in list page
And Enter Status as to destroy in list page
And Click on Retrieve button in list page
And Validate the record is retrieved with to destroy status
And Click on Parameters section in list page
And Enter Status as destroyed in list page
And Click on Retrieve button in list page
And Validate the record is retrieved with destroyed status
And Click on Parameters section in list page
And Enter Status as to suspend in list page
And Click on Retrieve button in list page
And Validate the record is retrieved with to suspend status
And Click on Parameters section in list page
And Enter Status as suspended in list page
And Click on Retrieve button in list page
And Validate the record is retrieved with suspended status
And Click on Parameters section in list page
And Enter Status as to reverse in list page
And Click on Retrieve button in list page
And Validate the record is retrieved with to reverse status
And Click on Parameters section in list page
And Enter Status as reversed in list page
And Click on Retrieve button in list page
And Validate the record is retrieved with reversed status
And Click on Parameters section in list page
And Enter Status as To Reverse Cancellation in list page
And Click on Retrieve button in list page
And Validate the record is retrieved with To Reverse Cancellation status
And Click on Parameters section in list page
And Enter Status as to reactivate in list page
And Click on Retrieve button in list page
And Validate the record is retrieved with to reactivate status
And Click on Parameters section in list page
And Validate all status of list page

@CHB_041
Scenario: checking if the user is able to reject reverse cancellation with batch through alert
Given user login as csm core application
And Navigate to Chequebook request section
And User Click To Reverse Cancellation Batch Sub Menu
And User Click the Retrieve button in To Reverse Cancellation Batch Screen
And User update Test data id for checking if the user is able to reverse cancellation with batch record
And User Select the Chequebook code in To Reverse Cancellation Batch Screen
And User Click Reverse button in To Reverse Cancellation Batch Screen
And User Click Approve button in Send Alert To Reverse Cancellation Screen
And User Enter BM User Name in User Information pop up
And User Enter BM Password in User Information pop up
And User Click Submit button in User Information pop up
And User Click Reject button in approve item pop up
And User Click Maintanence sub menu in chequebook request
And User Click Search button in chequebook request Maintenance Screen
And User Search Cancelled chequebook code in Cheque book Request Maintenance Screen
Then User Validate the cancelled chequebook record in Cheque book Request Maintenance Screen

@CHB_040
Scenario: checking if the user is able to approve reverse cancellation with batch through alert 
Given user login as csm core application
And Navigate to Chequebook request section
And User Click To Reverse Cancellation Batch Sub Menu
And User Click the Retrieve button in To Reverse Cancellation Batch Screen
And User update Test data id for checking if the user is able to reverse cancellation with batch record
And User Select the Chequebook code in To Reverse Cancellation Batch Screen
And User Click Reverse button in To Reverse Cancellation Batch Screen
And User Click Approve button in Send Alert To Reverse Cancellation Screen
And User Enter BM User Name in User Information pop up
And User Enter BM Password in User Information pop up
And User Click Submit button in User Information pop up
And User Click Approve button in approve item pop up
And User Click Approve Reversal of Cancellation Batch Sub Menu
And User Click the Retrieve button in Approve Reversal of Cancellation Batch Screen
And User Select the Chequebook code in Approve Reversal of Cancellation Batch Screen
And User update Test data id for checking if the user is able to approve reverse cancellation with batch record
And User Click Approve Reverse button in Approve Reversal of Cancellation Batch Screen
And User Click Maintanence sub menu in chequebook request
And User Click Search button in chequebook request Maintenance Screen
And User Search the To be Cancelled  chequebook code in Cheque book Request Maintenance Screen
Then User Validate the To be cancelled chequebook record in Cheque book Request Maintenance Screen

@CHB_104 
Scenario: checking if the user is able to define the chequebook reject reason under "submit" screen
Given user login as csm core application
And Navigate to Chequebook request section
And user update test data set id for CHB_104
And Navigate to submit section
And Search the particular code in submit
And Click on the particular code in submit
And Click on the Reject button in Submit
And Validate the Missing reason code popup

@CHB_105
Scenario: checking if the user is able to define the chequebook reject reason under "Approve destroy" screen
Given user login as csm core application
And Navigate to Chequebook request section
And user update test data set id for CHB_105
And Navigate to Approve Destroyed section
And Search the particular code in Approve Destroyed
And Click on the particular record in Approve Destroyed
And Click on Reject button in Approve Destroyed
And Validate the Missing reason code popup

@CHB_122
Scenario: Check if the system is  validating the value of the "Reason on Rejecting" flag upon rejecting a chequebook underr Approve  screen
Given user login as csm core application
And Navigate to Chequebook request section
And user update test data set id for CHB_122
And Navigate to Approve section
And Search the particular code in Approve
And Click on the particular record in Approve
And Click on the Reject button in Approve
And Validate the Missing reason code popup



