Feature: Checking the functionalities of transaction on staff account

  @TSA_149
  Scenario: Check if the user is able to see his account the flag is unchecked grant access personal account
    Given User Navigate to SADS application and login with valid credentials
    And User Click on Parameters under SADS application
    And User Click on Account Restrictions in Parameters under SADS application
    And User Click on Maintenance in Account Restrictions under Parameters
    And User Enter the value in Code under Maintenance Screen
    And User Enter the value in Description  under Maintenance Screen
    And User Click the RootIcon in ApplicationsOROPTs under maintenance secreen
    And User Click on RADM application in ApplicationsOROPTs
    And User Click on RADM application Checkbox in ApplicationsOROPTs
    And User Click on RET application in ApplicationsOROPTs
    And User Click on RET application Checkbox in ApplicationsOROPTs
    And User Click on RootIcon in Companies OR Branches in maintenance secreen
    And User Click on 1 BAJ application in Companies OR Branches
    And User Click on  1 BAJ application Checkbox in Companies OR Branches
    And User Enter the User ID in UserID tab
    And User Click on User ID Checkbox under UserID tab
    And User Click on Add button in Restriction Type under Maintenance Screen
    And User Click on Select Icon for CIF under Restriction Type
    And User Click on Account Balance select Tab in Restriction Level
    And User Click on Add Button under Restriction Level
    And User Click on Search Icon in  CIF NO Under the Restriction Level
    And User Enter the CIF No in the Search box
    And User Click on Searched CIF No in search popup
    And User Click on Save Button under Maintenance Screen
    And User Click on Ok Button in Success PopUp Menu
    And User Click on Approve under Account Restrictions
    And User Enter the Code in Approve Screen
    And User Click the Selected code in Approve Screen
    And User Click on Approve button in Approve Screen
    And User Click on Ok Button in Success PopUp Menu

  @TSA_149_1
  Scenario: Check if the user is able to see his account the flag is unchecked grant access personal account
    Given Navigate to CSM application and login with valid credentials
    And User click 360degree view flag under CSM
    And User click ok button in warning msg
    And User give Cifno in 360degreeview screen

  @TSA_150
  Scenario: Check if the user is able to see his account the flag is checked and the account is not related to the user and under the restiction
    			is not related to the user and under the restiction

    Given User Navigate to SADS application and login with valid credentials
    And User Click on Parameters under SADS application
    And User Click on Account Restrictions in Parameters under SADS application
    And User Click on Maintenance in Account Restrictions under Parameters
    And User Enter the value in Code under Maintenance Screen
    And User Enter the value in Description  under Maintenance Screen
    And User Click the CheckBox in Grant Access to Personal Accounts under Maintenance Screen
    And User Click the RootIcon in ApplicationsOROPTs under maintenance secreen
    And User Click on RADM application in ApplicationsOROPTs
    And User Click on RADM application Checkbox in ApplicationsOROPTs
    And User Click on RET application in ApplicationsOROPTs
    And User Click on RET application Checkbox in ApplicationsOROPTs
    And User Click on RootIcon in Companies OR Branches in maintenance secreen
    And User Click on 1 BAJ application in Companies OR Branches
    And User Click on  1 BAJ application Checkbox in Companies OR Branches
    And User Enter the User ID in UserID tab
    And User Click on User ID Checkbox under UserID tab
    And User Click on Add button in Restriction Type under Maintenance Screen
    And User Click on Select Icon for GL under Restriction Type
    And User Search the GL code in the Restriction Type
    And User Enter the GL code in the GL code search popup
    And User Click on Searched GL code in search popup
    And User Click on Add button in Restriction Type under Maintenance Screen
    And User Click on Select Icon for CIF under Restriction Type
    And User Click on Account Balance select Tab in Restriction Level
    And User Click on Add Button under Restriction Level
    And User Click on Search Icon in  CIF NO Under the Restriction Level
    And User Enter the CIF No in the Search box
    And User Click on Searched CIF No in search popup
    And User Click on Save Button under Maintenance Screen
    And User Click on Ok Button in Success PopUp Menu
    And User Click on Approve under Account Restrictions
    And User Enter the Code in Approve Screen
    And User Click the Selected code in Approve Screen
    And User Click on Approve button in Approve Screen
    And User Click on Ok Button in Success PopUp Menu
    And User Click on User in Parameters under SADS application
    And User Click on Maintenance in User under Parameters
    And User Click on Search Button under Maintenance Screen
    And User Enter User ID in search under Maintenance Screen
    And User Click on Searched ID under Maintenance Screen
    And User Click on Search Button in Employee Details under Maintenance Screen
    And User Enter the CIF No in SearchBox
    And User Click the Searched CIF NO in Search Box
    And User Check the Physical User CheckBox in Privilege under Maintenance Screen
    And User Click on Save Button in Maintenance Screen
    And User Click on Ok Button in Success PopUp in User

  @TSA_150_1
  Scenario: Check if the user is able to see his account the flag is checked and the account is not related to the user and under the restiction
    			is not related to the user and under the restiction

    Given User Navigate to SADS1 application and login with valid credentials
    And User Click on Parameter in SADS Application
    And User Click on User in Parameters under SADS application
    And User Click on Approve in User under Parameters
    And User Click on Search Button under Approve Screen
    And User Enter User ID in search under Approve Screen
    And User Click on Searched ID under Approve Screen
    And User Click on Approve button in Approve Screen under Parameter

  @TSA_150_2
  Scenario: Check if the user is able to see his account the flag is checked and the account is not related to the user and under the restiction
    			is not related to the user and under the restiction

    Given Navigate to CSM application and login with valid credentials
    And User click 360degree view flag under CSM
    And User click ok button in warning msg
    And User give Cifno in 360degreeview screen

  @TSA_151
  Scenario: Check if the user is able to see his account the flag is checked and the account is not related to the user and  not under the restiction
    Given User Navigate to SADS application and login with valid credentials
    And User Click on Parameters under SADS application
    #And User Click on Account Restrictions in Parameters under SADS application
    And User Click on Maintenance in Account Restrictions under Parameters
    And User Enter the value in Code under Maintenance Screen
    And User Enter the value in Description  under Maintenance Screen
    And User Click the CheckBox in Grant Access to Personal Accounts under Maintenance Screen
    And User Click the RootIcon in ApplicationsOROPTs under maintenance secreen
    And User Click on RADM application in ApplicationsOROPTs
    And User Click on RADM application Checkbox in ApplicationsOROPTs
    And User Click on RET application in ApplicationsOROPTs
    And User Click on RET application Checkbox in ApplicationsOROPTs
    And User Click on RootIcon in Companies OR Branches in maintenance secreen
    And User Click on 1 BAJ application in Companies OR Branches
    And User Click on  1 BAJ application Checkbox in Companies OR Branches
    And User Enter the User ID in UserID tab
    And User Click on User ID Checkbox under UserID tab
    And User Click on Add button in Restriction Type under Maintenance Screen
    And User Click on Select Icon for GL under Restriction Type
    And User Search the GL code in the Restriction Type
    And User Enter the GL code in the GL code search popup
    And User Click on Searched GL code in search popup
    And User Click on Add button in Restriction Type under Maintenance Screen
    And User Click on Select Icon for CIF under Restriction Type
    And User Click on Account Balance select Tab in Restriction Level
    And User Click on Add Button under Restriction Level
    And User Click on Search Icon in  CIF NO Under the Restriction Level
    And User Enter the CIF No in the Search box
    And User Click on Searched CIF No in search popup
    And User Click on Save Button under Maintenance Screen
    And User Click on Ok Button in Success PopUp Menu
    And User Click on Approve under Account Restrictions
    And User Enter the Code in Approve Screen
    And User Click the Selected code in Approve Screen
    And User Click on Approve button in Approve Screen
    And User Click on Ok Button in Success PopUp Menu
    And User Click on User in Parameters under SADS application
    And User Click on Maintenance in User under Parameters
    And User Click on Search Button under Maintenance Screen
    And User Enter User ID in search under Maintenance Screen
    And User Click on Searched ID under Maintenance Screen
    And User Click on Search Button in Employee Details under Maintenance Screen
    And User Enter the CIF No in SearchBox
    And User Click the Searched CIF NO in Search Box
    And User Check the Physical User CheckBox in Privilege under Maintenance Screen
    And User Click on Save Button in Maintenance Screen
    And User Click on Ok Button in Success PopUp in User

  @TSA_151_1
  Scenario: Check if the user is able to see his account the flag is checked and the account is not related to the user and  not under the restiction
    Given User Navigate to SADS1 application and login with valid credentials
    And User Click on Parameter in SADS Application
    And User Click on User in Parameters under SADS application
    And User Click on Approve in User under Parameters
    And User Click on Search Button under Approve Screen
    And User Enter User ID in search under Approve Screen
    And User Click on Searched ID under Approve Screen
    And User Click on Approve button in Approve Screen under Parameter

  @TSA_151_2
  Scenario: Check if the user is able to see his account the flag is checked and the account is not related to the user and  not under the restiction
    Given Navigate to CSM application and login with valid credentials
    And User click 360degree view flag under CSM
    And User click ok button in warning msg
    And User give Cifno in 360degreeview screen
