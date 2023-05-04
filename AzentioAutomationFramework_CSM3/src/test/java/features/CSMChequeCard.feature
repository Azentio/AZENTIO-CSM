Feature: To verify the functionality of amend cheque card update
@ACSD_005
Scenario: checking if the system is retrieving the card if the account has a status different than active/inactive
Given user login as csm core application
And user update test data set id for ACSD_005
And user click the amend cheque card status icon 
And user click the maintenance under amend cheque card status
And user select the product type under maintenance
Then user enter the card type value under maintenance
And user select the status under maintenance
And user enter the card number value under maintenance
And user click the retrieve button
Then user verify the pop message
And user click the ok button under maintenance


@ACSD_006
Scenario: checking if the system is retrieving the card if the account has a status different than active/inactive
Given user login as csm core application
And user update test data set id for ACSD_006
And user click the amend cheque card status icon 
And user click the maintenance under amend cheque card status
And user select the product type under maintenance
Then user enter the card type value under maintenance
And user select the status under maintenance
And user enter the card number value under maintenance
And user click the retrieve button
Then user verify the pop message
And user click the ok button under maintenance