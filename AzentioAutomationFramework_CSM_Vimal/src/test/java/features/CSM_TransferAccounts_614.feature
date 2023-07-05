Feature: Checking the functionality of Transfer Accounts

  @TA_008
  Scenario: Transfer Accounts -> Amending an existing created batch record when the alert flag is not checked/ From branch to branch
    Given User_614 Navigate to CSM application and login with valid credentialsVimal
    And user_614 get the data from the excel sheet for the test case id TA_008
    And User_614 Click on Date to Change the Current Date
    And User_614 Enters the Date in User Running Date
    And User_614 Click on Use Button in Change Running Date Popup
    And User_614 Click Ok Button in Information PopUp menu
    And User_614 Click on Close Button in Change Running Date Popup
    And User_614 Click on Technical Details Icon
    And User_614 Click Clear Cache in Technical Details Icon
    And User_614 Click Ok Button Under Information PopUp Menu

  @TA_062
  Scenario: Transfer Accounts -> Account transfer for account having a to be Rejected status
    And user_614 get the data from the excel sheet for the test case id TA_062

  @TA_063
  Scenario: Transfer Accounts -> Account transfer for account having a to be Reactivated status
    And user_614 get the data from the excel sheet for the test case id TA_063

  @TA_064
  Scenario: Transfer Accounts -> Technical testing - Checking if Choose Button is added under ransfer accounts Maitenance screen
    Given User_614 Navigate to CSM application and login with valid credentialsVimal
    And user_614 get the data from the excel sheet for the test case id TA_064
    And User_614 Click on Date to Change the Current Date
    And User_614 Enters the Date in User Running Date
    And User_614 Click on Use Button in Change Running Date Popup
    And User_614 Click Ok Button in Information PopUp menu
    And User_614 Click on Close Button in Change Running Date Popup
    And User_614 Click on Technical Details Icon
    And User_614 Click Clear Cache in Technical Details Icon
    And User_614 Click Ok Button Under Information PopUp Menu
    And user_614 click on the transfer accounts section in CSM core applications
    And user_614 click on the maintenance field under the transfer accounts section in transfer accounts
    And user_614 selects the branch to branch options from the transfer type dropdown in transfer accounts
    And user_614 checks if the choose file button is added under the transfer accounts maintenance screen
    And user_614 selects the GL to GL options from the transfer type dropdown in transfer accounts
    And user_614 checks if the choose file button is added under the transfer accounts maintenance screen
    And user_614 click on the logout icon to logout from the CSM core application

  @TA_065
  Scenario: Transfer Accounts -> Technical testing - Checking if the system is accepting only excel file while browsing through Choose File Button
    Given User_614 Navigate to CSM application and login with valid credentialsVimal
    And user_614 get the data from the excel sheet for the test case id TA_065
    And User_614 Click on Date to Change the Current Date
    And User_614 Enters the Date in User Running Date
    And User_614 Click on Use Button in Change Running Date Popup
    And User_614 Click Ok Button in Information PopUp menu
    And User_614 Click on Close Button in Change Running Date Popup
    And User_614 Click on Technical Details Icon
    And User_614 Click Clear Cache in Technical Details Icon
    And User_614 Click Ok Button Under Information PopUp Menu
    And user_614 click on the transfer accounts section in CSM core applications
    And user_614 click on the maintenance field under the transfer accounts section in transfer accounts
    And user_614 enters the branch code in the designation branch field in transfer accounts
    And user_614 click and sends the txt file in the choose file option
    And user_614 validates if the system is not accepting the txt file by showing the stopper message
    And user_614 clicks on the ok button in the error popup in maintenance under transfer screen
    And user_614 click and sends the excel file in the choose file option
    And user_614 validates if the system is accepting the excel file
    And user_614 click on the logout icon to logout from the CSM core application

  @TA_066
  Scenario: Transfer Accounts -> Technical Testing - Checking if the system is allowing the user to browse the Excel file if the Destination Branch is not defined
    Given User_614 Navigate to CSM application and login with valid credentialsVimal
    And user_614 get the data from the excel sheet for the test case id TA_066
    And User_614 Click on Date to Change the Current Date
    And User_614 Enters the Date in User Running Date
    And User_614 Click on Use Button in Change Running Date Popup
    And User_614 Click Ok Button in Information PopUp menu
    And User_614 Click on Close Button in Change Running Date Popup
    And User_614 Click on Technical Details Icon
    And User_614 Click Clear Cache in Technical Details Icon
    And User_614 Click Ok Button Under Information PopUp Menu
    And user_614 click on the transfer accounts section in CSM core applications
    And user_614 click on the maintenance field under the transfer accounts section in transfer accounts
    And user_614 click and sends the excel file in the choose file option
    And user_614 validates if the system is not accepting the excel file by showing the stopper message
    And user_614 clicks on the ok button in the error popup in maintenance under transfer screen
    And user_614 enters the branch code in the designation branch field in transfer accounts
    And user_614 click and sends the excel file in the choose file option
    And user_614 validates if the system is accepting the excel file
    And user_614 click on the logout icon to logout from the CSM core application

  @TA_067
  Scenario: Transfer Accounts -> Technical testing - checking if the system is allowing to brose an Excel file when from To account are defined
    Given User_614 Navigate to CSM application and login with valid credentialsVimal
    And user_614 get the data from the excel sheet for the test case id TA_067
    And User_614 Click on Date to Change the Current Date
    And User_614 Enters the Date in User Running Date
    And User_614 Click on Use Button in Change Running Date Popup
    And User_614 Click Ok Button in Information PopUp menu
    And User_614 Click on Close Button in Change Running Date Popup
    And User_614 Click on Technical Details Icon
    And User_614 Click Clear Cache in Technical Details Icon
    And User_614 Click Ok Button Under Information PopUp Menu
    And user_614 click on the transfer accounts section in CSM core applications
    And user_614 click on the maintenance field under the transfer accounts section in transfer accounts
    And user_614 enters the branch code for FROM account in maintenace screen on the transfer accounts
    And user_614 enters the currency code for FROM account in maintenace screen on the transfer accounts
    And user_614 enters the GL code for FROM account in maintenace screen on the transfer accounts
    And user_614 enters the CIF code for FROM account in maintenace screen on the transfer accounts
    And user_614 enters the SL no code for FROM account in maintenace screen on the transfer accounts
    And user_614 enters the branch code for TO account in maintenace screen on the transfer accounts
    And user_614 enters the currency code for TO account in maintenace screen on the transfer accounts
    And user_614 enters the GL code for TO account in maintenace screen on the transfer accounts
    And user_614 enters the CIF code for TO account in maintenace screen on the transfer accounts
    And user_614 enters the SL no code for TO account in maintenace screen on the transfer accounts
    And user_614 enters the branch code in the designation branch field in transfer accounts
    And user_614 click and sends the excel file in the choose file option
    And user_614 validates if the system is not accepting the excel file by showing the stopper message
    And user_614 clicks on the ok button in the error popup in maintenance under transfer screen
    And user_614 removes the FROM and TO account
    And user_614 click and sends the excel file in the choose file option
    And user_614 validates if the system is accepting the excel file
    And user_614 click on the logout icon to logout from the CSM core application
