Feature: To verify the functionality of Transaction on Staff Accounts module

  @TSA_157
  Scenario: Check if the user is able to see his account at the level of list of transaction- the flag is checked and the account is not related to the user and  not under the restiction
    Given navigate to CSM sads application and login with valid credentials
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
    Given navigate to CSM application and login with valid credentials
    And user update test data set id for TSA_157
    And User Click on Date to Change the Current Date
    And User Enter the Date in User Running Date
    And User Click on Use Button in Change Running Date Popup
    And User Click Ok Button in Information PopUp menu
    And User Click on Close Button in Change Running Date Popup
    And User Click on Technical Details Icon
    And User Click Clear Cache in Technical Details Icon
    And User Click Ok Button Under Information PopUp Menu
    And User Click on Transactions under CSM application
    And User Click on Maintenance under Transactions
    And User Enter TRX Type in Maintenance Screen
    #And User Click Transactions Maintenance for loading TRX Type
    And User Enter the Branch Code in Credit Ac in Maintenance Screen
    #And User Click Transactions Maintenance for loading Branch Code
    And User Enter Currency Code in Credit Ac in Maintenance Screen
    #And User Click Transactions Maintenance for loading Currency Code
    And User Enter GL Code in Credit Ac in Maintenance Screen
    #And User Click Transactions Maintenance for loading GL Code
    And User Enter CIF Code in Credit Ac in Maintenance Screen
    And User Enter Serial in Credit Ac in Maintenance Screen
    And User Click Ok Button in Warning PopUp Menu
    And User Enter the Currency in Maintenance Screen
    #And User Click Transactions Maintenance for loading Currency code
    #And user Enter the BranchCode under TRXType for debitAccounts
    #And user check if the  value is entered or not
    #And user Enter the CurrencyCode under TRXType for debitAccounts
    #And user Enter the GLCode under TRXType for debitAccounts
    #And user Enter the CifCode under TRXType for debitAccounts
    #And user Enter the SerialNo under TRXType for debitAccounts
    And User Enter the Amount in Maintenance Screen
    And user check if the  values is entered or not
    #And User Click Transactions Maintenance for loading Amount
    And User Click Save Button in Maintenance Screen
    And User get Transaction number from sucess pop up
    And User Click Ok Button in Success PopUp Menu
    And User click the Approve screens
    Then user Enter the Transaction number
    And double click the Value
    Then click the Approve buttons
    And system show the popup success user clicks the ok button
    And User Click on Queries under CSM application
    And User Click on Statement Of Accounts in Queries under CSM application
    And User Click on By Trade Date under Statement Of Accounts Sub Menu
    And User Enter the Currency Value in Account under By Trade Date Screen
    And User Enter the GL Code in Account under By Trade Date Screen
    And User Enter the CIF Code in Account under By Trade Date Screen
    And User Enter the Serial in Account under By Trade Date Screen
    And User Enter From Date in Periodicity Of Statement under By Trade Date Screen
    And User Enter To Date in Periodicity Of Statement under By Trade Date Screen
    And User Click Retrieve Button under By Trade Date Screen
    Then User Validate If the Statement of Account Displayed as Access Denied
    And User Click on Ok Button in Access Denied PopUp Menu
     ###########################################################
  #And User Click on User in Parameters under SADS application
  #And User Click on Maintenance in User under Parameters
  #And User Click on Search Button under Maintenance Screen
  #And User Enter User ID in search under Maintenance Screen
  #And User Click on Searched ID under Maintenance Screen
  #And User Click on Search Button in Employee Details under Maintenance Screen
  #And User Enter the CIF No in SearchBox
  #And User Click the Searched CIF NO in Search Box
  #And User Check the Physical User CheckBox in Privilege under Maintenance Screen
  #And User Click on Save Button in Maintenance Screen
  #And User Click on Ok Button in Success PopUp in User
  #Given User Navigate to SADS1 application and login with valid credentials
  #And User Click on Parameter in SADS Application
  #And User Click on User in Parameters under SADS application
  #And User Click on Approve in User under Parameters
  #And User Click on Search Button under Approve Screen
  #And User Enter User ID in search under Approve Screen
  #And User Click on Searched ID under Approve Screen
  #And User Click on Approve button in Approve Screen under Parameter
