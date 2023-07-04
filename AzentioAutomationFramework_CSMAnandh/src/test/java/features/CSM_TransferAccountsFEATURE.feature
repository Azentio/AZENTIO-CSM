Feature: To test the transfer accounts feature
@TA_011
Scenario: Created batch record when multi CIF types exception are defined
Given navigate to CSM application and login with valid credentials
And click on tech option
And click on clear cache option
Then verify system shows success pop up for clearing the cache
And get the test data for test case ID TA_011
And click on transfer accounts feature
And click on maintenance screen under transfer accounts feature
And select the transfer type as from branch to branch option
And enter the branch code in from account of transfer account
And enter the currency code in from account of transfer account
And enter the gl code in from account of transfer account
And enter the CIF number in from account of transfer account
And enter the serial number in from account of transfer account
And enter the branch code in to account of transfer account
And enter the currency code in to account of transfer account
And enter the gl code in to account of transfer account
And enter the CIF number in to account of transfer account
And enter the serial number in to account of transfer account
And enter the reason for transfering record
And enter the destination branch in transfer account
And click on set exception in transfer account
And click on add button in set exception pop up
And select the exception type as cif type
And enter the cif type in set exception input
And click on add button in set exception pop up
And select the exception type as cif type in second grid
And enter the cif type in set exception input in second grid
And click on ok button in set exception pop up
And click on retrive buttton
Then verify system should not show the cif related account which we done the exception

@TA_012
Scenario: Created batch record when Legal status exception is defined/ From branch to branch
Given navigate to CSM application and login with valid credentials
And click on tech option
And click on clear cache option
Then verify system shows success pop up for clearing the cache
And get the test data for test case ID TA_012
And click on transfer accounts feature
And click on maintenance screen under transfer accounts feature
And select the transfer type as from branch to branch option
And enter the branch code in from account of transfer account
And enter the currency code in from account of transfer account
And enter the gl code in from account of transfer account
And enter the CIF number in from account of transfer account
And enter the serial number in from account of transfer account
And enter the branch code in to account of transfer account
And enter the currency code in to account of transfer account
And enter the gl code in to account of transfer account
And enter the CIF number in to account of transfer account
And enter the serial number in to account of transfer account
And enter the reason for transfering record
And enter the destination branch in transfer account
And click on set exception in transfer account
And click on add button in set exception pop up
And select the exception type as legal status
And enter the legal status in set exception input
And click on ok button in set exception pop up
And click on retrive buttton
Then verify system should not show the legal status related account which we done the exception other accounts should display

@TA_013
Scenario: Created batch record when multi Legal status exception are defined/ From branch to branch
Given navigate to CSM application and login with valid credentials
And click on tech option
And click on clear cache option
Then verify system shows success pop up for clearing the cache
And get the test data for test case ID TA_013
And click on transfer accounts feature
And click on maintenance screen under transfer accounts feature
And select the transfer type as from branch to branch option
And enter the branch code in from account of transfer account
And enter the currency code in from account of transfer account
And enter the gl code in from account of transfer account
And enter the CIF number in from account of transfer account
And enter the serial number in from account of transfer account
And enter the branch code in to account of transfer account
And enter the currency code in to account of transfer account
And enter the gl code in to account of transfer account
And enter the CIF number in to account of transfer account
And enter the serial number in to account of transfer account
And enter the reason for transfering record
And enter the destination branch in transfer account
And click on set exception in transfer account
And click on add button in set exception pop up
And select the exception type as legal status
And enter the legal status in set exception input
And click on add button in set exception pop up
And select the exception type as legal status in second grid
And enter the legal status in set exception input in second grid
And click on ok button in set exception pop up
And click on retrive buttton
Then verify system should not show the legal status related account which we done the exception other accounts should display for multiple legal status
@TA_014
Scenario: Created batch record when multi Legal status exception are defined/ From branch to branch
Given navigate to CSM application and login with valid credentials
And click on tech option
And click on clear cache option
Then verify system shows success pop up for clearing the cache
And get the test data for test case ID TA_014
And click on transfer accounts feature
And click on maintenance screen under transfer accounts feature
And select the transfer type as from branch to branch option
And enter the branch code in from account of transfer account
And enter the currency code in from account of transfer account
And enter the gl code in from account of transfer account
And enter the CIF number in from account of transfer account
And enter the serial number in from account of transfer account
And enter the branch code in to account of transfer account
And enter the currency code in to account of transfer account
And enter the gl code in to account of transfer account
And enter the CIF number in to account of transfer account
And enter the serial number in to account of transfer account
And enter the reason for transfering record
And enter the destination branch in transfer account
And click on set exception in transfer account
And click on add button in set exception pop up
And select the exception type as ranking in first grid
And enter the exception value in first grid
And click on add button in set exception pop up
And select the exception type as ranking in second grid
And enter the exception value in second grid
And click on ok button in set exception pop up
And click on retrive buttton
Then verify should not show the accounts for the multiple ranking exception account and should show the account which is not included in the exception
@TA_015
Scenario: Created batch record when multi Legal status exception are defined/ From branch to branch
Given navigate to CSM application and login with valid credentials
And click on tech option
And click on clear cache option
Then verify system shows success pop up for clearing the cache
And get the test data for test case ID TA_015
And click on transfer accounts feature
And click on maintenance screen under transfer accounts feature
And select the transfer type as from branch to branch option
And enter the branch code in from account of transfer account
And enter the currency code in from account of transfer account
And enter the gl code in from account of transfer account
And enter the CIF number in from account of transfer account
And enter the serial number in from account of transfer account
And enter the branch code in to account of transfer account
And enter the currency code in to account of transfer account
And enter the gl code in to account of transfer account
And enter the CIF number in to account of transfer account
And enter the serial number in to account of transfer account
And enter the reason for transfering record
And enter the destination branch in transfer account
And click on set exception in transfer account
And click on add button in set exception pop up
And select the exception type as ranking in first grid
And enter the exception value in first grid
And click on ok button in set exception pop up
And click on retrive buttton
Then verify should not show the accounts for the single ranking exception account and should show the account which is not included in the exception