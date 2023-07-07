Feature: To check the functionalitites of chequebook request

                                            #  ********* Sprint -6 ********** #
  @CHB_117
  Scenario: Unchecking the flags Reason on Rejecting and Records rejection reason and  rejecting a chequebook under Approve Cancel screen
    Given User_613 navigate to CSM application and login with valid credentials
    And User_613 update test data set id for CHB_117
    Then User_613 Click the chequebook request
    And User_613 Click the To Cancel under chequebook request
    Then User_613 search and choose the existing data
    And User_613 click the cancel reason to fill the reason
    And User_613 Cancel that record by clicking the to cancel button
    Then User_613 Select the record in the alert box
    And User_613 Approve the record by clicking approve button in the alert screen
    Then User_613 Enter the teller User information
    #And Click the submit button under the user information
    Then User_613 Enter the reason under the teller account
    And User_613 Reject and validate the record

  @CHB_118
  Scenario: Checking "Reason on Rejecting" flag upon rejecting a chequebook underr Approve Cancel screen for alert
    Given User_613 navigate to CSM application and login with valid credentials
    Then User_613 Click the chequebook request
    And User_613 Click the To Cancel under chequebook request
    Then User_613 search and choose the existing data
    And User_613 click the cancel reason to fill the reason
    And User_613 Cancel that record by clicking the to cancel button
    Then User_613 Select the record in the alert box
    And User_613 Approve the record by clicking approve button in the alert screen
    Then User_613 Enter the teller User information
    And User_613 Click the submit button under the user information
    Then User_613 Enter the reason under the teller account
    And User_613 Reject and validate the record

                                       # ********* Sprint -7 *********  #
  @CHB_149
  Scenario: UnCheck the "Reason on Rejecting"and "Records rejection reason is mandatory" flag reject chequebook Destroy screen
    Given User_613 navigate to CSM application and login with valid credentials
    Then User_613 Click the chequebook request
    And User_613 Click the Approve
    Then User_613 search and choose the existing data
    And User_613 Select the Active existing data
    Then User_613 Click the Approve button
    And User_613 Approve the record by clicking approve button in the alert screen
    Then User_613 Enter the teller User information
    And User_613 Click the submit button under the user information
    Then User_613 Enter the reason under the teller account
    And User_613 Reject and validate the record

  @CHB_150
  Scenario: Checking if "Approve/Reject Destroy" screen the same as "Approve Destroy"or"Reject Destroy" screens
    Given User_613 navigate to CSM application and login with valid credentials
    Then User_613 Click the chequebook request
    And User_613 Click the Bulk Destroy
    Then User_613 Choose the Existing data from Bulk Destroy
    And User_613 Enter the ok in Remarks
    Then User_613 Click the To Destroy button
    And User_613 Select the Approve Reject Bulk Destroy
    And User_613 Click the Retrive button
    Then User_613 Same data will Appear in Approve Reject Bulk Destroy

  @CHB_151
  Scenario: Checking if "Bulk Destroy" screen same as "To be Destroyed" screen with the "Approved" chequebooks
    Given User_613 navigate to CSM application and login with valid credentials
    Then User_613 Click the chequebook request
    And User_613 Click the Bulk Destroy
    And User_613 click the Retrive buton
    Then User_613 click the Search button
    And User_613 Enter the value in search box
    And User_613 click the Find button
    And User_613 click the To be Destroy
    And User_613 enter the value in the code box
    Then User_613 check the same Data will Appear in To be Destroy

                                      #     ********* Sprint -8 (1)  **********  #
  @CHB_152
  Scenario: Checking if "Bulk Destroy" screen is the same as "To be Destroyed" screen with the "In branch" chequebooks
    Given User_613 navigate to CSM application and login with valid credentials
    Then User_613 Click the chequebook request
    And User_613 Click the Bulk Destroy
    And User_613 click the Retrive buton
    Then User_613 click the Search button
    And User_613 enter the value in search box
    And User_613 click the Find button
    And User_613 click the To be Destroy
    And User_613 Enter the value in the code box
    Then User_613 check the same Data will Appear in To be Destroy
