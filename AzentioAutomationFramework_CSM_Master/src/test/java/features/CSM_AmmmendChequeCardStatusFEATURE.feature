Feature: Checking the functionality of Amend Cheque Book feature
@ACSD_001
Scenario: Checking if the system is changing the chequebook status from submitted to apply to submit
Given User Launch CSM Core Application
And User Click Amend Cheque book Menu
And User Click Maintanence sub menu
And User Select the Product type
And User Enter the Request Number in Amend Cheque Maintanence screen
And User Click Retrieve button
And User Click the Checkbox for retrieved record
And User click the Update button
And User Confirm Save Record
And User Success Ok pop up message
And User Click Chequebook Request Menu
And User Click Chequebook Query Sub Menu
And User Enter Branch Code in Chequebook Query Screen
And User Enter Currency Code in Chequebook Query Screen
And User Enter GL Code in Chequebook Query Screen
And User Enter CIF Code in Chequebook Query Screen
And User Enter Serial no in Chequebook Query Screen
And User Enter Cheque book search code in Chequebook Query Screen
Then User Verify the system is changing the chequebook status from submitted to apply to submit
@ACSD_002
Scenario: checking if the system is changing the chequebook status from SUBMITTED to APPLY TO SUBMIT
Given navigate to CSM application and login with valid credentials
And click on amend cheque card status module
And click on maintenance screen under cheque card status module
And get the test data for test case ACSD_002
And change the product type to cheque book
And enter the branch code in amend cheque
#And enter the currency code in amend cheque
#And enter the GL code in amend cheque
#And enter the CIF No in amend cheque
#And click on ok button in amend cheque screen
#And close the warningpopupin amend cheque screen
#And enter the serial number in amend cheque
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
@ACSD_006
Scenario: checking if the system is changing the chequebook status from "cancelled" to its old status "send to provider"
Given navigate to CSM application and login with valid credentials
Then Click the Amend cheque card status flag
And Click the maintainance under amend cheque card status
Then Choose the product type as chequebook in amend cheque card status
And Enter the branch code in amend cheque card status
Then Enter the currency code under amend cheque card status
And Enter the GL code under amend cheque card status
Then Enter the CIF code under amend cheque card status
And Enter the serial number under amend cheque card status
Then Enter the request number under amend cheque card status
And Change the status as cancelled under amend cheque card status
Then Click the retrive button under the amend cheque card status
And Click the equivalent code check box under amend cheque card status
Then Click the update button and update the record under amend cheque card status
@ACSD_010
Scenario: User login to Amend cheque card status in cheque book cancelled to submit
Given User login to Card Status for cheque book 
And User click on the Amend cheque card status in cancelled Record
And user click on the maintenance in cancelled Record
And user Select on the Product type in cancelled Record
And User click on the chequeNo in Cancelled Record
And User Select on the Status in Cancelled Record
And User click on the Branch code in Cancelled Record
And User click on the Currency button in Cancelled Record
And User click on the GL code in Cancelled Record
And User click on the CIF type in Cancelled Record
And User click on the Serial Number in Cancelled Record
And User click on the Update button in Cancelled Record
And User click on the icon button in Cancelled Record

@ACSD_011
Scenario: checking if the system is reversing the charges transaction if charges were applied on the cancellation
Given User login to Card Status for cheque book 
And User click on the Amend cheque card status in cancelled Record
And user click on the maintenance in cancelled Record
And user Select on the Product type in cancelled Record
And User click on the chequeNo in Cancelled Record
And User Select on the Status in Cancelled Record
And User click on the Branch code in Cancelled Record
And User click on the Currency button in Cancelled Record
And User click on the GL code in Cancelled Record
And User click on the CIF type in Cancelled Record
And User click on the Serial Number in Cancelled Record
And User click on the Update button in Cancelled Record
And User click on the icon button in Cancelled Record
@ACSD_013 
Scenario: checking if the system will allow the user to amend the cheque by a paid cheque   
    Given user login as csm core application
    And user update test data set id for ACSD_013
    And user click the amend cheque card status icon 
    And user click the maintenance under amend cheque card status
    And user select the product type under maintenance
    And user enter the branch code value under product type
    And user enter the currency code value under product type 
    And user enter the GL code value under product type
    And user enter the CIF code value under product type
    And user enter the serial no under product type
    And user enter the cheque no under product type
    And user click the retrieve button
    And user click the check box
    And user click the update button
    Then user verify the save popup
    And user click the ok button
    @ACSD_014
Scenario: checking if the system will allow the user to amend the cheque by a valid cheque
    Given user login as csm core application
    And user update test data set id for ACSD_014
    And user enter the branch code value under product type
    And user enter the currency code value under product type 
    And user enter the GL code value under product type
    And user enter the CIF code value under product type
    And user enter the serial no under product type
    And user enter the cheque no under product type
    And user click the retrieve button
    And user click the check box
    And user click the update button
    Then user verify the save popup
    And user click the ok button
    
    @ACSD_015
Scenario: checking if the system is retrieving the card if the account has a status different than active/inactive
    Given user login as csm core application
    And user update test data set id for ACSD_015
    And user click the amend cheque card status icon 
    And user click the maintenance under amend cheque card status
    And user select the product type under maintenance
    Then user enter the card type value under maintenance
    And user select the status under maintenance
    And user enter the card number value under maintenance
    And user click the retrieve button
    Then user verify the pop message
    And user click the ok button under maintenance