Feature: Transactions of staff account
@TSA_001_01
Scenario: Checking if the Suspend user in logged in branch flag is not checked, the User Code field is populated to the branches defined under the Destination Branches tab without being suspended
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And click on user module under system parameter
And get the test data for test case id TSA_001_01
And click on populate user feature
And click on maintenance under populate user feature
And enter the code under populate user feature
And enter the brief description in populate user feature
And enter the long description in populate user feature
And enter the brief description of arab in populate user feature
And enter the long description of arab in populate user feature
And enter the user code in populate user feature
And click on add button under destination branch area
And enter the destination branch code
And enter the template code in destination branch
And click on save button in populate maintenance screen
And click on ok button of save confirmation in populate user feature
And click on ok button after save the record successfully in populate user feature 
And close the miantenance under the populate screen
#Aproval of populate feature
And click on approve under populate user feature
And search for populate code in populate approve feature
And click on approve button in populate user feature
And click on approve confirmation in populate user feature
And click on ok button after record got apprved in populate user feature
And close the approve screen under populate user
#Populate feature
And click on populate feature under populate user
And search for populate code in populate feature
And click on populate button in populate feature
And click on ok button to confirm the populate process 
And click on ok button after populate process success
And close the populate screen under populate user
@TSA_001_02
Scenario: Checking if the Suspend user in logged in branch flag is not checked, the User Code field is populated to the branches defined under the Destination Branches tab without being suspended
Given navigate to CSM Param with populated user ID
And click on parameter module
And click on system parameter
And click on user module under system parameter
And get the test data for test case id TSA_001_02
And click on update after approve screen under user module
And search the populated user ID under the user feature
Then verify user ID should available in destination branch

@TSA_002_01
Scenario: Checking if the Suspend user in logged in branch flag is not checked, the User Code field is populated to the branches defined under the Destination Branches tab without being suspended
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And click on user module under system parameter
And get the test data for test case id TSA_002_01
And click on populate user feature
And click on maintenance under populate user feature
And enter the code under populate user feature
And enter the brief description in populate user feature
And enter the long description in populate user feature
And enter the brief description of arab in populate user feature
And enter the long description of arab in populate user feature
And enter the user code in populate user feature
And check the suspend user in logged in branch flag in populate user maintenance feature
And click on add button under destination branch area
And enter the destination branch code
And enter the template code in destination branch
And click on save button in populate maintenance screen
And click on ok button of save confirmation in populate user feature
And click on ok button after save the record successfully in populate user feature 
And close the miantenance under the populate screen
#Aproval of populate feature
And click on approve under populate user feature
And search for populate code in populate approve feature
Then verify suspend user in falg is checked in approval screen
And click on approve button in populate user feature
And click on approve confirmation in populate user feature
And click on ok button after record got apprved in populate user feature
And close the approve screen under populate user
#Populate feature
And click on populate feature under populate user
And search for populate code in populate feature
Then verify suspend user in falg is checked in suspend screen
And click on populate button in populate feature
And click on ok button to confirm the populate process 
And click on ok button after populate process success
And close the populate screen under populate user
@TSA_002_02
Scenario: Checking if the Suspend user in logged in branch flag is not checked, the User Code field is populated to the branches defined under the Destination Branches tab without being suspended
Given navigate to CSM Param URL
And get the test data for test case id TSA_002_02
And enter the user name which got suspended in logged in branch
And enter the password in CSM Param
And enter the branch code in CSM Param
And enter the company code in CSM Param
And click on contine button in CSM Param
Then verify system wont allow user to login
@TSA_003
Scenario: Checking if pending transactions exist and the destination branch have access to approve it, then the flag “Suspend user in logged in branch” can be checked
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And click on user module under system parameter
And get the test data for test case id TSA_003_01
And click on populate user feature
And click on maintenance under populate user feature
And enter the code under populate user feature
And enter the brief description in populate user feature
And enter the long description in populate user feature
And enter the brief description of arab in populate user feature
And enter the long description of arab in populate user feature
And enter the user code in populate user feature
And check the suspend user in logged in branch flag in populate user maintenance feature
Then verify user can able to get the valiadation pop up foruser have active transaction
@TSA_004
Scenario: Checking if pending transactions exist and the destination branch have access to approve it, then the flag “Suspend user in logged in branch” can be checked
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And click on user module under system parameter
And get the test data for test case id TSA_004_01
And click on populate user feature
And click on maintenance under populate user feature
And enter the code under populate user feature
And enter the brief description in populate user feature
And enter the long description in populate user feature
And enter the brief description of arab in populate user feature
And enter the long description of arab in populate user feature
And enter the user code in populate user feature
And check the suspend user in logged in branch flag in populate user maintenance feature
Then verify user can able to get the valiadation pop up foruser have active transaction

@TSA_006
Scenario: Checking if pending transactions exist and the destination branch have access to approve it, then the flag “Suspend user in logged in branch” can be checked
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And click on user module under system parameter
And get the test data for test case id TSA_006
And click on populate user feature
And click on maintenance under populate user feature
And enter the code under populate user feature
And enter the brief description in populate user feature
And enter the long description in populate user feature
And enter the brief description of arab in populate user feature
And enter the long description of arab in populate user feature
And enter the user code in populate user feature
And check the suspend user in logged in branch flag in populate user maintenance feature
Then verify user can able to get the valiadation pop up foruser have active transaction
@TSA_007
Scenario: Checking if a new sub status “Transferred” is added on the user –maintenance screen when the user is suspended due to the flag “Suspend user in logged in branch”
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And get the test data for test case TSA_007
And click on user module under system parameter
And click on maintenance screen under user feature
And click on search in user feature
And search for suspended user in user feature
And select the user in user feature
Then verify new status suspended got added along with new sub status
@TSA_023
Scenario: Checking if the new  alert “Staff Accounts Transaction” will be added under “Transactions” in Alert activation tab
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And click on control records sub feature 
And click on update after approve in control records
And click on alert activation tab under control records
And open the account balance over drawn section
Then verify transaction on staff account field got added in control records