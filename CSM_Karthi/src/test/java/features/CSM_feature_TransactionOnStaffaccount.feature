
Feature: To verify the functionality of Transaction module
 @TSA_157
 Scenario:Check if the user is able to see his account at the level of list of transaction- the flag is checked and the account is not related to the user and  not under the restiction

    Given Navigate to SADS application and login with valid credentials
    And User Click on Parameters under SADS application
    And User Click on Account Restrictions in Parameters under SADS application
    And User Click on Maintenance in Account Restrictions under Parameters
    And user click the save ok button
    And User Enter the value in Code under Maintenance Screen
    And User Enter the value in Description  under Maintenance Screen
    #And User Click the CheckBox in Grant Access to Personal Accounts under Maintenance Screen
    And User Click the RootIcon in ApplicationsOROPTs under maintenance secreen
    And User Click on RADM application in ApplicationsOROPTs
    And User Click on RADM application Checkbox in ApplicationsOROPTs
    And User Click on RET application in ApplicationsOROPTs
    And User Click on RET application Checkbox in ApplicationsOROPTs
    And User Click on RootIcon in Companies OR Branches in maintenance secreen
    And User Click on 1BAJ application in Companies OR Branches
    And User Click on  1BAJ application Checkbox in Companies OR Branches
    And User Enter the User ID in UserID tab
    And User Click on User ID Checkbox under UserID tab
    And User Click on Add button in Restriction Type under Maintenance Screen
    And User Click on Select Icon under Restriction Type
    And user select all account info under Restriction Level
    And User Click on Add Button under Restriction Level
    And User Click on Search Icon in  CIF NO Under the Restriction Level
    And User Enter the CIF No in the Search box
    And User double the data in the Search box
        And User Click on Add Button under Restriction Level
    And User Enter the GL No in the Search box
    And User double the data on Gl  in the Search box
    And User Click on Save Button under Maintenance Screen
    And User Click on Ok Button in Success PopUp Menu
    And User Click on Approve under Account Restrictions
    And User Enter the Code in Approve Screen
    And User Click the Selected code in Approve Screen
    Then User Click on Approve button in Approve Screen
Given navigate to CSM application and login with valid credentials
And User Click on Queries under CSM application
And User Click on Statement Of Accounts in Queries under CSM application
And User Click on By Trade Date under Statement Of Accounts Sub Menu
And User Enter the Currency Value in Account under By Trade Date Screen
And User Enter the GL Code in Account under By Trade Date Screen
And User Enter the CIF Code in Account under By Trade Date Screen
And User Enter the Serial in Account under By Trade Date Screen
And User Click Retrieve Button under By Trade Date Screen
 And user click the ok
#And User Click on Ok Button in Access Denied PopUp Menu