Feature: Testing the functionality of chequebook
@CHB_021
Scenario: checking if the user is able to reactivate a chequebook - long process
Given navigate to CSM application and login with valid credentials
Then select data set ID to check user is able to reactivate chequebook
Then navigate to chequebook request menu option
Then click on To Reactivate submenu
Then select suspended record
And click on To Reactivate button
Then remove the current tab
Then navigate to Reactivate screen
Then select the record to reactivate
And click on Reactivate button
Then remove the current tab
Then navigate to maintenance screen
Then click on search button
Then select the reactivated record
And check the status should be Approved
And logout from the application

@CHB_022
Scenario: checking if the user is able to reverse a chequebook - long process
Given navigate to CSM application and login with valid credentials
Then select data set ID to check user is able to reverse chequebook
Then navigate to chequebook request menu option
Then navigate to To Be Reversed screen
Then select Approved record
And click on To Be Reversed button
Then remove the current tab
Then navigate to Reverse Chequebook screen
Then select the record to reverse
And click on Reverse button
Then remove the current tab
Then navigate to maintenance screen
Then click on search button
Then select the reversed record
And check the status should be Reversed
And logout from the application

@CHB_023
Scenario: checking if the BM is able to approve a record under chequebook request  - short process
Given navigate to CSM application and login with valid credentials
Then select data set ID to check BM user is able to approve a record under chequebook request
Then navigate to chequebook request menu option
Then navigate to maintenance screen
Then create a new chequebook with user A
Then click on save button
Then click on search button
Then update the new record code
And logout from the application
Then Login with Branch Manager user
Then navigate to chequebook request menu option
Then navigate to approve screen
Then select the record to approve
And click on approve button
Then remove the current tab
Then navigate to maintenance screen
Then click on search button
Then select the approved record
And check the status of the record approved by BM
And check the status should be added in the status table with the user ID and time
And logout from the application

@CHB_024
Scenario: checking if the BM is able to submit a chequebook  - short process
Given navigate to CSM application and login with valid credentials
Then select data set ID to check BM user is able to submit a chequebook
Then navigate to chequebook request menu option
Then navigate to apply to submit screen
Then select a approved chequebook request
Then click on apply submit button
And logout from the application
Then Login with Branch Manager user
Then navigate to chequebook request menu option
Then navigate to submit screen
Then open the chequebook request
Then click on submit button
Then remove the current tab
Then navigate to maintenance screen
Then click on search button
Then retrieve the submitted chequebook in maintenance screen
And check the status of the record approved by BM
And check the status should be added in the status table with the user ID and time
And logout from the application

@CHB_025
Scenario: checking if the BM is able to cancel a chequebook  - short process
Given navigate to CSM application and login with valid credentials
Then select data set ID to check BM user is able to cancel a chequebook
Then navigate to chequebook request menu option
Then navigate to To Cancel screen
Then retrieve the submitted chequebook request
Then click on To Cancel button
And logout from the application
Then Login with Branch Manager user
Then navigate to chequebook request menu option
Then navigate to Approve cancel screen
Then open the chequebook request
Then click on cancel button
Then remove the current tab
Then navigate to maintenance screen
Then click on search button
Then retrieve the approved cancelled chequebook in maintenance screen
And check the status of the record approved by BM
And check the status should be added in the status table with the user ID and time

@CHB_026
Scenario: checking if the BM is able to destroy a  chequebook  - short process
Given navigate to CSM application and login with valid credentials
Then select data set ID to check BM user is able to destroy a chequebook
Then navigate to chequebook request menu option
Then navigate to To be destroyed screen
Then retrieve the submitted chequebook request
Then click on To Destroy button
And logout from the application
Then Login with Branch Manager user
Then navigate to chequebook request menu option
Then navigate to Approve Destroyed screen
Then open the chequebook request
Then click on Destory button
Then remove the current tab
Then navigate to maintenance screen
Then click on search button
Then retrieve the approved destroyed chequebook in maintenance screen
And check the status of the record approved by BM
And check the status should be added in the status table with the user ID and time
And logout from the application

@CHB_027
Scenario: checking if the BM is able to suspend a chequebook  - short process
Given navigate to CSM application and login with valid credentials
Then select data set ID to check BM user is able to suspend a chequebook
Then navigate to chequebook request menu option
Then navigate to To Suspend screen
Then retrieve the submitted chequebook request
Then click on To Suspend button
And logout from the application
Then Login with Branch Manager user
Then navigate to chequebook request menu option
Then navigate to Suspend screen
Then open the chequebook request
Then click on Suspend button
Then remove the current tab
Then navigate to maintenance screen
Then click on search button
Then retrieve the approved suspended chequebook in maintenance screen
And check the status of the record approved by BM
And check the status should be added in the status table with the user ID and time
And logout from the application

#------------------------------------------------------------------------------------------#

@CHB_055_01
Scenario: Create a chequebook for system behavior - "Allow Auto Approve" --------Checked
																						  		- "Allow Auto Submit" ---------unchecked
																							  	- "Auto Submit upon Approval"--unchecked
#Pre-requisite
#Unique cheque code need to give everytime
Given navigate to csm param and login with valid credentials
Then select data set Id to create a chequebook for system behavior Allow Auto Approve is Checked
Then navigate to system parameters under parameters menu option
Then navigate to ChequeBook under Cheques Menu
Then open maintenance screen
Then fill the valid details to create chequebook
Then click on the Allow auto approve flag
Then Click on save button
Then navigate to approve screen to approve the saved chequebook
Then retrive the chequebook record
Then click on approve button to approve the chequebook record
Then open maintenance screen
Then click on search button to search approved chequebook
Then retrieve the approved record in maintenance screen
And verify the chequebook is created

@CHB_055_02
Scenario: Checking for Current System Behavior - "Allow Auto Approve" --------Checked
																						  	- "Allow Auto Submit" ---------unchecked
																							  - "Auto Submit upon Approval"--unchecked																	  																  
Given navigate to CSM application and login with valid credentials
Then select data set ID to check for Current System Behavior when Allow auto approve is checked
Then navigate to chequebook request menu option
Then navigate to maintenance screen
Then create a new chequebook request
Then click on save button
Then click on search button
Then update the new record code
Then remove the current tab
Then navigate to apply to submit screen
Then select a approved chequebook request
Then click on apply submit button
Then remove the current tab
Then navigate to maintenance screen
Then click on search button
Then retrieve the submitted chequebook request
And Check the status of the submitted record
Then remove the current tab
Then navigate to submit screen
Then open the chequebook request
Then click on submit button
Then remove the current tab
Then navigate to maintenance screen
Then click on search button
Then retrieve the submitted chequebook request
And Check the status of the submitted record after submit
And logout from the application

@CHB_057_01
Scenario: Create a chequebook for system behavior - "Allow Auto Approve" --------unchecked
																						  		- "Allow Auto Submit" ---------unchecked
																							  	- "Auto Submit upon Approve"--Checked
#Pre-requisite
#Unique cheque code need to give everytime
Given navigate to csm param and login with valid credentials
Then select data set Id to create a chequebook for system behavior Auto Submit upon Approve is checked
Then navigate to system parameters under parameters menu option
Then navigate to ChequeBook under Cheques Menu
Then open maintenance screen
Then fill the valid details to create chequebook
Then click on the Auto Submit upon Approve flag
Then Click on save button
Then navigate to approve screen to approve the saved chequebook
Then retrive the chequebook record
Then click on approve button to approve the chequebook record
Then open maintenance screen
Then click on search button to search approved chequebook
Then retrieve the approved record in maintenance screen
And verify the chequebook is created

@CHB_057_02
Scenario: Checking for Current System Behavior - "Allow Auto Approve" --------unchecked
																						  	- "Allow Auto Submit" ---------unchecked
																							  - "Auto Submit upon Approval"--Checked																		  
Given navigate to CSM application and login with valid credentials
Then select data set ID to check for Current System Behavior when Auto Submit upon Approve is checked
Then navigate to chequebook request menu option
Then navigate to maintenance screen
Then create a new chequebook request
Then click on save button
Then click on search button
Then update the new record code
Then click on search button
Then retrieve the saved chequebook in maintenance screen
Then verify the chequebook is created successfully with active status
Then remove the current tab
Then navigate to approve screen
Then select the record to approve
And click on approve button
Then remove the current tab
Then navigate to maintenance screen
Then click on search button
Then select the approved record
Then verify the chequebook is created successfully with Submitted status

@CHB_058_01
Scenario: Create a chequebook for system behavior - "Allow Auto Approve" --------unchecked
																						  		- "Allow Auto Submit" ---------Checked
																							  	- "Auto Submit upon Approve"--Checked
#Pre-requisite
#Unique cheque code need to give everytime
Given navigate to csm param and login with valid credentials
Then select data set Id to create a chequebook for system behavior Allow Auto Submit and auto submit upon approve is checked
Then navigate to system parameters under parameters menu option
Then navigate to ChequeBook under Cheques Menu
Then open maintenance screen
Then fill the valid details to create chequebook
Then click on the Allow auto submit and Auto Submit upon Approve flag
Then Click on save button
Then navigate to approve screen to approve the saved chequebook
Then retrive the chequebook record
Then click on approve button to approve the chequebook record
Then open maintenance screen
Then click on search button to search approved chequebook
Then retrieve the approved record in maintenance screen
And verify the chequebook is created

@CHB_058_02
Scenario: Checking for Current System Behavior - "Allow Auto Approve" --------unchecked
																						  	- "Allow Auto Submit" ---------Checked
																							  - "Auto Submit upon Approval"--Checked																		  
Given navigate to CSM application and login with valid credentials
Then select data set ID to check for Current System Behavior when Allow Auto Submit and auto submit upon approval is checked
Then navigate to chequebook request menu option
Then navigate to maintenance screen
Then create a new chequebook request
Then click on save button
Then click on search button
Then update the new record code
Then click on search button
Then retrieve the saved chequebook in maintenance screen
Then verify the chequebook is created successfully with active status
Then remove the current tab
Then navigate to approve screen
Then select the record to approve
And click on approve button
Then remove the current tab
Then navigate to maintenance screen
Then click on search button
Then select the approved record
Then verify the chequebook is created successfully with Submitted status

@CHB_059_01
Scenario: Create a chequebook for system behavior - "Allow Auto Approve" --------unchecked
																						  		- "Allow Auto Submit" ---------Checked
																							  	- "Auto Submit upon Approve"--unchecked
#Pre-requisite
#Unique cheque code need to give everytime
Given navigate to csm param and login with valid credentials
Then select data set Id to create a chequebook for system behavior Allow Auto Submit is checked
Then navigate to system parameters under parameters menu option
Then navigate to ChequeBook under Cheques Menu
Then open maintenance screen
Then fill the valid details to create chequebook
Then click on the Allow auto submit flag
Then Click on save button
Then navigate to approve screen to approve the saved chequebook
Then retrive the chequebook record
Then click on approve button to approve the chequebook record
Then open maintenance screen
Then click on search button to search approved chequebook
Then retrieve the approved record in maintenance screen
And verify the chequebook is created

@CHB_059_02
Scenario: Checking for Current System Behavior - "Allow Auto Approve" --------unchecked
																						  	- "Allow Auto Submit" ---------Checked
																							  - "Auto Submit upon Approval"--unchecked																		  
Given navigate to CSM application and login with valid credentials
Then select data set ID to check for Current System Behavior when Allow Auto Submit is checked
Then navigate to chequebook request menu option
Then navigate to maintenance screen
Then create a new chequebook request
Then click on save button
Then click on search button
Then update the new record code
Then retrieve the saved chequebook in maintenance screen
Then verify the chequebook is created successfully with active status
Then remove the current tab
#approve
Then navigate to approve screen
Then select the record to approve
And click on approve button
Then remove the current tab
Then navigate to maintenance screen
Then click on search button
Then select the approved record
Then verify the chequebook will be approved successfully
Then remove the current tab
#apply to submit
Then navigate to apply to submit screen
Then select a approved chequebook request
Then click on apply submit button
Then remove the current tab
Then navigate to maintenance screen
Then click on search button
Then select the apply to submit record
Then verify the chequebook will be submitted directly

@CHB_060_01
Scenario: Create a chequebook for system behavior - "Allow Auto Approve" --------unchecked
																						  		- "Allow Auto Submit" ---------unchecked
																							  	- "Auto Submit upon Approve"--unchecked
#Pre-requisite
#Unique cheque code need to give everytime
Given navigate to csm param and login with valid credentials
Then select data set Id to create a chequebook for system behaviors is unchecked
Then navigate to system parameters under parameters menu option
Then navigate to ChequeBook under Cheques Menu
Then open maintenance screen
Then fill the valid details to create chequebook
Then Click on save button
Then navigate to approve screen to approve the saved chequebook
Then retrive the chequebook record
Then click on approve button to approve the chequebook record
Then open maintenance screen
Then click on search button to search approved chequebook
Then retrieve the approved record in maintenance screen
And verify the chequebook is created

@CHB_060_02
Scenario: Checking for Current System Behavior - "Allow Auto Approve" --------unchecked
																						  	- "Allow Auto Submit" ---------unchecked
																							  - "Auto Submit upon Approval"--unchecked																		  
Given navigate to CSM application and login with valid credentials
Then select data set ID to check for Current System Behaviors is unchecked
Then navigate to chequebook request menu option
Then navigate to maintenance screen
Then create a new chequebook request
Then click on save button
Then click on search button
Then update the new record code
Then retrieve the saved chequebook in maintenance screen
Then verify the chequebook is created successfully with active status
Then remove the current tab
#approve
Then navigate to approve screen
Then select the record to approve
And click on approve button
Then remove the current tab
Then navigate to maintenance screen
Then click on search button
Then select the approved record
Then verify the chequebook will be approved successfully
Then remove the current tab
#apply to submit
Then navigate to apply to submit screen
Then select a approved chequebook request
Then click on apply submit button
Then remove the current tab
Then navigate to maintenance screen
Then click on search button
Then select the apply to submit record
Then verify the chequebook will be applied to submission sucessfully
Then remove the current tab
#submit
Then navigate to submit screen
Then open the chequebook request
Then click on submit button
Then remove the current tab
Then navigate to maintenance screen
Then click on search button
Then retrieve the submitted chequebook request
Then verify the chequebook will be submitted successfully

@CHB_075
Scenario: Checking if system is defaulting Deleted sequences under From Number and To Number 
							for a new account if "Reuse Cancelled/ Reversed/ Deleted Chq Nbr" flag is checked
Given navigate to CSM application and login with valid credentials
Then select data set ID to check if system is defaulting Deleted sequences
Then navigate to chequebook request menu option
Then navigate to maintenance screen
Then create a new chequebook request
Then click on save button
Then click on search button
Then update the new record code
Then retrieve the saved chequebook in maintenance screen
Then verify the chequebook is created successfully with active status
Then click on delete button
Then click on search button
Then verify system will default chq no From number 1 and To number 10


@CHB_095
Scenario: checking if the system is retrieving only approved chequebook under To Be Reversed Screen.
Given navigate to CSM application and login with valid credentials
Then select data set ID for checking if the system is retrieving only approved chequebook under To Be Reversed Screen
Then navigate to chequebook request menu option
Then navigate to To Be Reversed screen
Then check the system is retrieving only approved chequebook
And click on To Be Reversed button
Then remove the current tab
Then navigate to Reverse Chequebook screen
Then verify chequebook status should be To be Reversed
And click on Reverse button
Then remove the current tab
Then navigate to maintenance screen
Then click on search button
Then verify the chequebook status should be Reversed

@CHB_096
Scenario: checking if chequebooks with status "received" are only shown under Send to Branch Screen
Given navigate to CSM application and login with valid credentials
Then select data set ID for checking if chequebooks with status received are only shown under Send to Branch Screen
Then navigate to chequebook request menu option
Then navigate to Send To Branch screen
Then check the chequebook with status Received should be retrieved
Then get the destination branch code
And logout from the application
Then login with the destination branch code
Then navigate to chequebook request menu option
Then navigate to In Branch screen
And check the chequebook should be received at the selected branch

@CHB_097
Scenario: checking if the user is able to create chequebook without InHouse Charges
Given navigate to CSM application and login with valid credentials
Then select data set ID for checking if the user is able to create chequebook without InHouse Charges
Then navigate to chequebook request menu option
Then navigate to maintenance screen
Then create a new chequebook without InHouse Charges with type 12
Then click on save button
Then click on search button
Then update the new record code
Then remove the current tab
#approve
Then navigate to approve screen
#Then select the record to approve
#And click on approve button
#Then remove the current tab
#Then navigate to maintenance screen
#Then click on search button
#Then select the approved record
#Then verify the chequebook will be approved successfully

#Then retrive the chequebook record
Then select the record to approve
And click on approve button
Then navigate to maintenance screen
Then click on search button
And verify the chequebook should be approved with status Submitted

@CHB_098
Scenario: checking if the system is creating same sequence for other chequebook if the uniqueness is set to company
Given navigate to CSM application and login with valid credentials
Then select data set ID checking if the system is creating same sequence for other chequebook if the uniqueness is set to company
Then navigate to chequebook request menu option
Then navigate to maintenance screen
Then create a chequebook request in company 1
Then verify the sequence will be from 1 to 10
Then create a chequebook request in company 2
Then verify the sequence will be from 11 to 20
Then create a chequebook request in company 3
Then verify the sequence will be from 21 to 30

@CHB_099
Scenario: checking if the system is creating same sequence for other chequebook if the uniqueness is set to branch
Given navigate to CSM application and login with valid credentials
Then select data set ID checking if the system is creating same sequence for other chequebook if the uniqueness is set to branch
Then navigate to chequebook request menu option
Then navigate to maintenance screen
Then create a chequebook request in branch 1
Then verify the sequence will be from 1 to 10
Then create a chequebook request in branch 2
Then verify the sequence will be from 1 to 10
Then create a chequebook request in branch 3
Then verify the sequence will be from 1 to 10

#Prerequisite
@CHB_155_01
Scenario: checking if the destroy charges are deducted after destroying multi chequebook
Given navigate to CSM param application and login with valid credentials
Then select data set ID to create multi chequebook 
Then navigate to system parameters under parameters menu option
Then navigate to ChequeBook under Cheques Menu
Then open maintenance screen
Then fill the valid details to create a specific chequebook code
Then Click on save button
Then navigate to approve screen to approve the saved chequebook
Then retrive the chequebook record
Then click on approve button to approve the chequebook record
Then open maintenance screen
Then click on search button to search approved chequebook
Then retrieve the approved record in maintenance screen and update new cheque code
And verify the chequebook is created
And logout from the application
#Chequebook request 1
Given navigate to CSM application and login with valid credentials
Then select data set ID for checking if the destroy charges are deducted after destroying multi chequebook
Then navigate to chequebook request menu option
Then navigate to maintenance screen
Then create a new chequebook request
Then click on save button
Then click on search button
Then update the new record code
Then retrieve the saved chequebook in maintenance screen
Then verify the chequebook is created successfully with active status
Then remove the current tab
#approve
Then navigate to approve screen
Then select the record to approve
And click on approve button and waive charges
Then remove the current tab
Then navigate to maintenance screen
Then click on search button
Then select the approved record
Then verify the chequebook will be approved successfully
Then remove the current tab
#Chequebook request 2
Then navigate to maintenance screen
Then create a new chequebook request
Then click on save button
Then click on search button
Then update the new record code1
Then retrieve the saved chequebook request code1 in maintenance screen
Then verify the chequebook is created successfully with active status
Then remove the current tab
#approve
Then navigate to approve screen
Then select the record to approve record code1
And click on approve button and waive charges
Then remove the current tab
Then navigate to maintenance screen
Then click on search button
Then select the approved record code1
Then verify the chequebook will be approved successfully
Then remove the current tab
#Bulk Destoy
Then user should select current system date
Then navigate to bulk destroy screen
Then click on retrieve button
Then user should select approved chequebooks
Then user should fill the remark field
Then user should invoke destroy button

@CHB_155
Scenario: checking if the destroy charges are deducted after destroying multi chequebook
Given navigate to CSM application and login with valid credentials
Then select data set ID for checking if the destroy charges are deducted after destroying multi chequebook
Then navigate to chequebook request menu option
Then navigate to approve or reject and destroy screen
Then click on retrieve button in approve reject bulk destroy screen
Then select multiple chequebook
Then click on destroy button
Then navigate to maintenance screen
Then click on search button
Then verify the chequebook will be destroyed
Then navigate to transaction screen
Then click on maintenance screen under transaction menu
Then retrieve the transaction for destroyed charges
Then verify the transaction is created successfully

#Prerequisite
@CHB_156_01
Scenario: Checking if the inputted Bulk Destroy Period is applicable on retrieved cheques
Given navigate to CSM param application and login with valid credentials
Then select data set ID to set Bulk Destroy Period 
Then navigate to system parameters under parameters menu option
Then navigate to Control Record
And Click on update and approve under control record
Then update bulk destroy period to 40
And uncheck chequebook advanced process flag
Then click on update after approve button
Then navigate to approve under control record
Then click on approve button under control record approve

@CHB_156
Scenario: Checking if the inputted Bulk Destroy Period is applicable on retrieved cheques
Given navigate to CSM application and login with valid credentials
Then select data set ID for Checking if the inputted Bulk Destroy Period is applicable on retrieved cheques
#create a chequebook
Then navigate to chequebook request menu option
Then navigate to maintenance screen
Then create a new chequebook request
Then click on save button
Then click on search button
Then update the new record code
Then retrieve the saved chequebook in maintenance screen
Then verify the chequebook is created successfully with active status
Then remove the current tab
#approve
Then navigate to approve screen
Then select the record to approve
And click on approve button
Then remove the current tab
Then navigate to maintenance screen
Then click on search button
Then select the approved record
Then verify the chequebook will be approved successfully
Then remove the current tab
#Bulk Destroy
Then user should login after 40 days
Then navigate to bulk destroy screen
Then click on retrieve button
Then verify system will show all chequebooks having the approve status for 40 days and above

@CHB_159_01
Scenario: Checking if the user is able to select all rows
Given navigate to CSM application and login with valid credentials
Then select data set ID for Checking if the user is able to select all rows 
#create a chequebook
Then navigate to chequebook request menu option
Then navigate to maintenance screen
Then create a new chequebook request
Then click on save button
Then click on search button
Then update the new record code
Then retrieve the saved chequebook in maintenance screen
Then verify the chequebook is created successfully with active status
Then remove the current tab
#approve
Then navigate to approve screen
Then select the record to approve
And click on approve button
Then remove the current tab
Then navigate to maintenance screen
Then click on search button
Then select the approved record
Then verify the chequebook will be approved successfully
Then remove the current tab
#Chequebook request 2
Then navigate to maintenance screen
Then create a new chequebook request
Then click on save button
Then click on search button
Then update the new record code1
Then retrieve the saved chequebook request code1 in maintenance screen
Then verify the chequebook is created successfully with active status
Then remove the current tab
#approve
Then navigate to approve screen
Then select the record to approve record code1
And click on approve button and waive charges
Then remove the current tab
Then navigate to maintenance screen
Then click on search button
Then select the approved record code1
Then verify the chequebook will be approved successfully
@CHB_159
Scenario: Checking if the user is able to select all rows
Given navigate to CSM application and login with valid credentials
Then select data set ID for Checking if the user is able to select all rows
Then navigate to chequebook request menu option
Then navigate to approve or reject and destroy screen
Then click on retrieve button in approve reject bulk destroy screen
Then user should select all rows
Then verify system will select all rows

@CHB_160_01
Scenario: Checking if the user is able to select all rows with the new checkbox column checked
Given navigate to CSM application and login with valid credentials
Then select data set ID for Checking if the user is able to select all rows with the new checkbox column checked
#create a chequebook
Then navigate to chequebook request menu option
Then navigate to maintenance screen
Then create a new chequebook request
Then click on save button
Then click on search button
Then update the new record code
Then retrieve the saved chequebook in maintenance screen
Then verify the chequebook is created successfully with active status
Then remove the current tab
#approve
Then navigate to approve screen
Then select the record to approve
And click on approve button
Then remove the current tab
Then navigate to maintenance screen
Then click on search button
Then select the approved record
Then verify the chequebook will be approved successfully
Then remove the current tab
#Chequebook request 2
Then navigate to maintenance screen
Then create a new chequebook request
Then click on save button
Then click on search button
Then update the new record code1
Then retrieve the saved chequebook request code1 in maintenance screen
Then verify the chequebook is created successfully with active status
Then remove the current tab
#approve
Then navigate to approve screen
Then select the record to approve record code1
And click on approve button and waive charges
Then remove the current tab
Then navigate to maintenance screen
Then click on search button
Then select the approved record code1
Then verify the chequebook will be approved successfully
@CHB_160
Scenario: Checking if the user is able to select all rows with the new checkbox column checked
Given navigate to CSM application and login with valid credentials
Then select data set ID for Checking if the user is able to select all rows with the new checkbox column checked
Then navigate to chequebook request menu option
Then navigate to bulk destroy screen
Then click on retrieve button
Then user should select new checkbox
Then user should select all chequebook
Then user should fill the remark field
Then user should invoke destroy button
Then navigate to maintenance screen
Then click on search button
Then verify status will be To be destroy for all rows

@CHB_163_01
Scenario: Checking if the user is able to select any row and click To Destroy
Given navigate to CSM application and login with valid credentials
Then select data set ID for Checking if the user is able to select any row and click To Destroy
#create a chequebook
Then navigate to chequebook request menu option
Then navigate to maintenance screen
Then create a new chequebook request
Then click on save button
Then click on search button
Then update the new record code
Then retrieve the saved chequebook in maintenance screen
Then verify the chequebook is created successfully with active status
Then remove the current tab
#approve
Then navigate to approve screen
Then select the record to approve
And click on approve button
Then remove the current tab
Then navigate to maintenance screen
Then click on search button
Then select the approved record
Then verify the chequebook will be approved successfully
Then remove the current tab
#Chequebook request 2
Then navigate to maintenance screen
Then create a new chequebook request
Then click on save button
Then click on search button
Then update the new record code1
Then retrieve the saved chequebook request code1 in maintenance screen
Then verify the chequebook is created successfully with active status
Then remove the current tab
#approve
Then navigate to approve screen
Then select the record to approve record code1
And click on approve button and waive charges
Then remove the current tab
Then navigate to maintenance screen
Then click on search button
Then select the approved record code1
Then verify the chequebook will be approved successfully
#Chequebook request 3
Then navigate to maintenance screen
Then create a new chequebook request
Then click on save button
Then click on search button
Then update the new record code2
Then retrieve the saved chequebook request code2 in maintenance screen
Then verify the chequebook is created successfully with active status
Then remove the current tab
#approve
Then navigate to approve screen
Then select the record to approve record code2
And click on approve button and waive charges
Then remove the current tab
Then navigate to maintenance screen
Then click on search button
Then select the approved record code2
Then verify the chequebook will be approved successfully
@CHB_163
Scenario: Checking if the user is able to select any row and click To Destroy
Given navigate to CSM application and login with valid credentials
Then select data set ID for Checking if the user is able to select any row and click To Destroy
#Then user should select current system date
Then user should login after 40 days
Then navigate to chequebook request menu option
Then navigate to bulk destroy screen
Then click on retrieve button
Then user should select a specific row
Then user should fill the remark field
Then user should click on To Destroy button
Then navigate to maintenance screen
Then click on search button
Then verify the selected chequebook status will be To be destroyed

@CHB_157_01
Scenario: checking if the user is able to destroy by alert
Given navigate to CSM application and login with valid credentials
Then select data set ID to update bulk destroy period to 40 days
Then navigate to system parameters under parameters menu option
Then navigate to Control Record
And Click on update and approve under control record
Then update bulk destroy period to 40
And uncheck chequebook advanced process flag
Then click on update after approve button
Then navigate to approve under control record
Then click on approve button under control record approve

@CHB_157
Scenario: checking if the user is able to destroy by alert
Given navigate to CSM application and login with valid credentials
Then select data set ID for checking if the user is able to destroy by alert
#create a chequebook
Then navigate to chequebook request menu option
Then navigate to maintenance screen
Then create a new chequebook request
Then click on save button
Then click on search button
Then update the new record code
Then retrieve the saved chequebook in maintenance screen
Then verify the chequebook is created successfully with active status
Then remove the current tab
#approve
Then navigate to approve screen
Then select the record to approve
And click on approve button
Then remove the current tab
Then navigate to maintenance screen
Then click on search button
Then select the approved record
Then verify the chequebook will be approved successfully
Then remove the current tab
#Chequebook request 2
Then navigate to maintenance screen
Then create a new chequebook request
Then click on save button
Then click on search button
Then update the new record code1
Then retrieve the saved chequebook request code1 in maintenance screen
Then verify the chequebook is created successfully with active status
Then remove the current tab
#approve
Then navigate to approve screen
Then select the record to approve record code1
And click on approve button and waive charges
Then remove the current tab
Then navigate to maintenance screen
Then click on search button
Then select the approved record code1
Then verify the chequebook will be approved successfully
Then remove the current tab
#Bulk Destroy after 40 days
Then user should login after 40 days
Then navigate to bulk destroy screen
Then click on retrieve button
Then user should select approved chequebooks
Then user should fill the remark field
Then user should click on To Destroy button
And logout from the application
Then Login with Branch Manager user
Then open the alert to invoke destroy
Then select the row to destoy
Then branch manager should invoke destroy

@CHB_158_01
Scenario: checking if the user is able to reject destroy by alert
Given navigate to CSM application and login with valid credentials
Then select data set ID to update bulk destroy period to 40 days
Then navigate to system parameters under parameters menu option
Then navigate to Control Record
And Click on update and approve under control record
Then update bulk destroy period to 40
And uncheck chequebook advanced process flag
Then click on update after approve button
Then navigate to approve under control record
Then click on approve button under control record approve
@CHB_158
Scenario: checking if the user is able to reject destroy by alert
Given navigate to CSM application and login with valid credentials
Then select data set ID for checking if the user is able to reject destroy by alert
#create a chequebook
Then navigate to chequebook request menu option
Then navigate to maintenance screen
Then create a new chequebook request
Then click on save button
Then click on search button
Then update the new record code
Then retrieve the saved chequebook in maintenance screen
Then verify the chequebook is created successfully with active status
Then remove the current tab
#approve
Then navigate to approve screen
Then select the record to approve
And click on approve button
Then remove the current tab
Then navigate to maintenance screen
Then click on search button
Then select the approved record
Then verify the chequebook will be approved successfully
Then remove the current tab
#Chequebook request 2
Then navigate to maintenance screen
Then create a new chequebook request
Then click on save button
Then click on search button
Then update the new record code1
Then retrieve the saved chequebook request code1 in maintenance screen
Then verify the chequebook is created successfully with active status
Then remove the current tab
#approve
Then navigate to approve screen
Then select the record to approve record code1
And click on approve button and waive charges
Then remove the current tab
Then navigate to maintenance screen
Then click on search button
Then select the approved record code1
Then verify the chequebook will be approved successfully
#Bulk Destroy after 40 days
Then user should login after 40 days
Then navigate to chequebook request menu option
Then navigate to bulk destroy screen
Then user should select new checkbox
Then user should fill the remark field
Then user should click on To Destroy button
And logout from the application
Then Login with Branch Manager user
Then navigate to chequebook request menu option




