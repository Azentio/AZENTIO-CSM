Feature: Checking the functionalities of transaction

  @TRS_029
  Scenario: Checking Multi Transfer (Main Credit) Transaction - CV/FC
    Given Navigate to CSM application and login with valid credentials
      And user update test data set id for TRS_029
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
    And User Enter the Branch Code in Credit Ac in Maintenance Screen
    And User Enter Currency Code in Credit Ac in Maintenance Screen
    And User Enter GL Code in Credit Ac in Maintenance Screen
    And User Enter CIF Code in Credit Ac in Maintenance Screen
    And User Enter Serial in Credit Ac in Maintenance Screen
    And User Click Ok Button in Warning PopUp Menu
    And User Enter the Currency in Maintenance Screen
    And User Enter the Amount in Maintenance Screen
    And User Click the Account Details in Maintenance Screen
    And User Click Add button in AccountDetails
    And User Enter the Branch in AccountDetails
    And User Enter the Gl in AccountDetails
    And user Enetr the cif in AccountDetails
    And User Enter the Serial in AccountDetails
    And User Enter the Amount in AccountDetails
    And User give some Msg Instruction1 in AccountDetails
    And User give some Msg Instruction2 in AccountDetails
    And User Click the ok button in AccountDetails
    And User Click Save Button in Maintenance Screen
    And User Get the Transaction No in Success PopUp Menu for29
    And User Click Ok Button in Success PopUp Menu
    And User Click on Approve Screen under Transactions
    And User Enter the Transaction No in Approve Screen
    And User Double Click on the Transaction No
    And User Click on Approve Button for approve the Transaction
    And User Click on Ok Button in Success PopUp Menu for Approve Transcation
    And User Click on Maintenance under Transactions
    And User Click Ok Button in Warning PopUp to go back to Maintenance
    And User Click on Search Button in Maintenance Screen
    And User Enter the Transaction No in Search Box
    And User Double Click on the Searched Transaction No in Search Box
    And User Click on Booked Entries in Maintenance Screen

  @TRS_030
  Scenario: Checking Cash Deposit Transaction - FC/ CV
    Given navigate to CSM application and login with valid credentials
     And user update test data set id for TRS_30
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
    And User Enter the Branch Code in Credit Ac in Maintenance Screen
    And User Enter Currency Code in Credit Ac in Maintenance Screen
    And User Enter GL Code in Credit Ac in Maintenance Screen
    And User Enter CIF Code in Credit Ac in Maintenance Screen
    And User Enter Serial in Credit Ac in Maintenance Screen
    And User Click Ok Button in Warning PopUp Menu
    And User Click Ok Button in Warning PopUp Menu
    #And User Enter the Currency in Maintenance Screen
    And User Enter Currency Code in Credit Ac in Maintenance Screen
    And User Enter the Amount in Maintenance Screen
    And User Click Save Button in Maintenance Screen
    And User Get the Transaction No in Success PopUp Menu for30
    And User Click Ok Button in Success PopUp Menu
    And User Click on Approve Screen under Transactions
    And User Enter the Transaction No in Approve Screen
    And User Double Click on the Transaction No
    And User Click on Approve Button for approve the Transaction
    And User Click on Ok Button in Success PopUp Menu for Approve Transcation
    And User Click on Maintenance under Transactions
    And User Click Ok Button in Warning PopUp to go back to Maintenance
    And User Click on Search Button in Maintenance Screen
    And User Enter the Transaction No in Search Box
    And User Double Click on the Searched Transaction No in Search Box
    And User Click on Booked Entries in Maintenance Screen

  @TRS_031
  Scenario: Checking Single Transfer (Main Debit) Intra Transaction - FC/CV
    Given navigate to CSM application and login with valid credentials
     And user update test data set id for TRS_31
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
    And User Enter the Branch Code in debit Ac in Maintenance Screen
    And User Enter Currency Code in debit Ac in Maintenance Screen
    And User Enter GL Code in debit Ac in Maintenance Screen
    And User Enter CIF Code in debit Ac in Maintenance Screen
    And User Enter Serial in debit Ac in Maintenance Screen
    And User Click Ok Button in Warning PopUp Menu
    And User Click Ok Button in Warning PopUp Menu
    #And User Enter the Currency in Maintenance Screen
    And User Enter Currency Code in Credit Ac in Maintenance Screen
    And User Enter the Amount in Maintenance Screen
    And User Enter the Branch Code in Credit Ac in Maintenance Screen
    #And User Enter Currency Code in Credit Ac in Maintenance Screen
    And User Enter GL Code in Credit Ac in Maintenance Screen
    And User Enter CIF Code in Credit Ac in Maintenance Screen
    And User Enter Serial in Credit Ac in Maintenance Screen
    And User Click Save Button in Maintenance Screen
    And User Get the Transaction No in Success PopUp Menu for31
    And User Click Ok Button in Success PopUp Menu
    And User Click on Approve Screen under Transactions
    And User Enter the Transaction No in Approve Screen
    And User Double Click on the Transaction No
    And User Click on Approve Button for approve the Transaction
    And User Click on Ok Button in Success PopUp Menu for Approve Transcation
    And User Click on Maintenance under Transactions
    And User Click Ok Button in Warning PopUp to go back to Maintenance
    And User Click on Search Button in Maintenance Screen
    And User Enter the Transaction No in Search Box
    And User Double Click on the Searched Transaction No in Search Box
    And User Click on Booked Entries in Maintenance Screen

  @TRS_032
  Scenario: Checking Multi Transfer (Main Credit) Transaction - FC/CV
    Given navigate to CSM application and login with valid credentials
    And user update test data set id for TRS_32
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
    And User Enter the Branch Code in Credit Ac in Maintenance Screen
    And User Enter Currency Code in Credit Ac in Maintenance Screen
    And User Enter GL Code in Credit Ac in Maintenance Screen
    And User Enter CIF Code in Credit Ac in Maintenance Screen
    And User Enter Serial in Credit Ac in Maintenance Screen
    And User Click Ok Button in Warning PopUp Menu
    And User Enter the Currency in Maintenance Screen
    And User Enter the Amount in Maintenance Screen
    And User Click the Account Details in Maintenance Screen
    And User Click Add button in AccountDetails
    And User Enter the Branch in AccountDetails
    And User Enter the Gl in AccountDetails
    And user Enetr the cif in AccountDetails
    And User Enter the Serial in AccountDetails
    And User Enter the Amount in AccountDetails
    And User give some Msg Instruction1 in AccountDetails
    And User give some Msg Instruction2 in AccountDetails
    And User Click the ok button in AccountDetails
    And User Click Save Button in Maintenance Screen
    And User Get the Transaction No in Success PopUp Menu for32
    And User Click Ok Button in Success PopUp Menu
    And User Click on Approve Screen under Transactions
    And User Enter the Transaction No in Approve Screen
    And User Double Click on the Transaction No
    And User Click on Approve Button for approve the Transaction
    And User Click on Ok Button in Success PopUp Menu for Approve Transcation
    And User Click on Maintenance under Transactions
    And User Click Ok Button in Warning PopUp to go back to Maintenance
    And User Click on Search Button in Maintenance Screen
    And User Enter the Transaction No in Search Box
    And User Double Click on the Searched Transaction No in Search Box
    And User Click on Booked Entries in Maintenance Screen

  @TRS_033
  Scenario: Checking Cash Deposit Transaction - FC/ FC Same
    Given navigate to CSM application and login with valid credentials
      And user update test data set id for TRS_33
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
    And User Enter the Branch Code in debit Ac in Maintenance Screen
    And User Enter Currency Code in debit Ac in Maintenance Screen
    And User Enter GL Code in debit Ac in Maintenance Screen
    And User Enter CIF Code in debit Ac in Maintenance Screen
    And User Enter Serial in debit Ac in Maintenance Screen
    And User Click Ok Button in Warning PopUp Menu
    And User Click Ok Button in Warning PopUp Menu
    And User Enter the Currency in Maintenance Screen
    And User Enter the Amount in Maintenance Screen
    And User Enter the Branch Code in Credit Ac in Maintenance Screen
    #And User Enter Currency Code in Credit Ac in Maintenance Screen
    And User Enter GL Code in Credit Ac in Maintenance Screen
    And User Enter CIF Code in Credit Ac in Maintenance Screen
    And User Enter Serial in Credit Ac in Maintenance Screen
    And User Click Save Button in Maintenance Screen
    And User Get the Transaction No in Success PopUp Menu for33
    And User Click Ok Button in Success PopUp Menu
    And User Click on Approve Screen under Transactions
    And User Enter the Transaction No in Approve Screen
    And User Double Click on the Transaction No
    And User Click on Approve Button for approve the Transaction
    And User Click on Ok Button in Success PopUp Menu for Approve Transcation
    And User Click on Maintenance under Transactions
    And User Click Ok Button in Warning PopUp to go back to Maintenance
    And User Click on Search Button in Maintenance Screen
    And User Enter the Transaction No in Search Box
    And User Double Click on the Searched Transaction No in Search Box
    And User Click on Booked Entries in Maintenance Screen

  @TRS_034
  Scenario: Checking Single Transfer (Main Debit) Intra Transaction  FC/ FC Same
    Given navigate to CSM application and login with valid credentials
     And user update test data set id for TRS_34
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
    And User Enter the Branch Code in debit Ac in Maintenance Screen
    And User Enter Currency Code in debit Ac in Maintenance Screen
    And User Enter GL Code in debit Ac in Maintenance Screen
    And User Enter CIF Code in debit Ac in Maintenance Screen
    And User Enter Serial in debit Ac in Maintenance Screen
    And User Click Ok Button in Warning PopUp Menu
    And User Click Ok Button in Warning PopUp Menu
    And User Enter the Currency in Maintenance Screen
    And User Enter the Amount in Maintenance Screen
    And User Enter the Branch Code in Credit Ac in Maintenance Screen
    #And User Enter Currency Code in Credit Ac in Maintenance Screen
    And User Enter GL Code in Credit Ac in Maintenance Screen
    And User Enter CIF Code in Credit Ac in Maintenance Screen
    And User Enter Serial in Credit Ac in Maintenance Screen
    And User Click Save Button in Maintenance Screen
    And User Get the Transaction No in Success PopUp Menu for34
    And User Click Ok Button in Success PopUp Menu
    And User Click on Approve Screen under Transactions
    And User Enter the Transaction No in Approve Screen
    And User Double Click on the Transaction No
    And User Click on Approve Button for approve the Transaction
    And User Click on Ok Button in Success PopUp Menu for Approve Transcation
    And User Click on Maintenance under Transactions
    And User Click Ok Button in Warning PopUp to go back to Maintenance
    And User Click on Search Button in Maintenance Screen
    And User Enter the Transaction No in Search Box
    And User Double Click on the Searched Transaction No in Search Box
    And User Click on Booked Entries in Maintenance Screen

  #pre request
  @TRS_071_01
  Scenario: Checking Cash Withdrawal Transaction Currency Withdrawal Limit Defined - Warn User if Limit Exceeds Checked Amount < Limit
    Given navigate to CSMparam application and login with valid credentials
    And user update test data set id for TRS_71
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the User screen in system parameters
    And user click the update after approve screen
    And user click and send the values in user id under update after approve screen
    And user double click the user id
    And User click the Limit button  in update after approve screen
    And User click the Eco sector Delete All
     And user click the confirm ok
    And user  click add button under Limits
    And user enter the value of currency in Limits
    And User enter the Transaction type in Limits
    And User enter value with WdLimit in Limits
    And User check the with warnuserlimit in Limit
    And user click the ok button under limit
    And user click the update after approve button
      And user click the confirm ok
    And user click the sucesss ok
    And user click the approve in user screen
    And user click and send the values in user id under Approve screen
    And user double click the user id in approve screen
    And user click the Approvebttn
    And user click the confirm ok
    And user click the sucesss ok
    

  @TRS_071
  Scenario: Checking Cash Withdrawal Transaction Currency Withdrawal Limit Defined - Warn User if Limit Exceeds Checked Amount < Limit
    Given navigate to CSM application and login with valid credentials
     And user update test data set id for TRS_71
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
    And User Enter the Branch Code in debit Ac in Maintenance Screen
    And User Enter Currency Code in debit Ac in Maintenance Screen
    And User Enter GL Code in debit Ac in Maintenance Screen
    And User Enter CIF Code in debit Ac in Maintenance Screen
    And User Enter Serial in debit Ac in Maintenance Screen
    And User Click Ok Button in Warning PopUp Menu
    And User Click Ok Button in Warning PopUp Menu
    And User Enter the Currency in Maintenance Screen
    And User Enter the Amount in Maintenance Screen
    And User Click Save Button in Maintenance Screen
    And User Get the Transaction No in Success PopUp Menu for71
    And User Click Ok Button in Success PopUp Menu
    And User Click on Approve Screen under Transactions
    And User Enter the Transaction No in Approve Screen
    And User Double Click on the Transaction No
    And User Click on Approve Button for approve the Transaction
    And User Click on Ok Button in Success PopUp Menu for Approve Transcation
   # And User Click on Maintenance under Transactions
    #And User Click Ok Button in Warning PopUp to go back to Maintenance
    #And User Click on Search Button in Maintenance Screen
    #And User Enter the Transaction No in Search Box
    #And User Double Click on the Searched Transaction No in Search Box

  #postrequest
  @TRS_071_02
  Scenario: Checking Cash Withdrawal Transaction Currency Withdrawal Limit Defined - Warn User if Limit Exceeds Checked Amount < Limit
    Given navigate to CSMparam application and login with valid credentials
    And user update test data set id for TRS_71
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the User screen in system parameters
    And user click the update after approve screen
    And user click and send the values in user id under update after approve screen
    And user double click the user id
    And User click the Limit button  in update after approve screen
    And user retrive the existing record from the limits screen
    And user delete the record from the limits screen
    And user click the confirm ok
     And user click  the grantall keys under Eco sector
    And user click the ok button under limit
    And user click the update after approve button
        And user click the confirm ok
    And user click the sucesss ok
    And user click the approve in user screen
    And user click and send the values in user id under Approve screen
    And user double click the user id in approve screen
    And user click the approve box
      And user click the Approvebttn
        And user click the confirm ok
    And user click the sucesss ok

  @TRS_072_01
  Scenario: Checking Cash Withdrawal Transaction - Currency Withdrawal Limit Defined - Warn User if Limit Exceeds Checked - Amount > Limit
    Given navigate to CSMparam application and login with valid credentials
    And user update test data set id for TRS_72
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the User screen in system parameters
    And user click the update after approve screen
    And user click and send the values in user id under update after approve screen
    And user double click the user id
    And User click the Limit button  in update after approve screen
   And User click the Eco sector Delete All
     And user click the confirm ok
    And user  click add button under Limits
    And user enter the value of currency in Limits
    And User enter the Transaction type in Limits
    And User enter value with WdLimit in Limits
    And User check the with warnuserlimit in Limit
    And user click the ok button under limit
    And user click the update after approve button
       And user click the confirm ok
    And user click the sucesss ok
    And user click the approve in user screen
    And user click and send the values in user id under Approve screen
    And user double click the user id in approve screen
    And user click the Approvebttn
    And user click the confirm ok
    And user click the sucesss ok

  @TRS_072
  Scenario: Checking Cash Withdrawal Transaction- Currency Withdrawal Limit Defined -Warn User if Limit Exceeds Checked  Amount > Limit
    Given navigate to CSM application and login with valid credentials
     And user update test data set id for TRS_72
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
    And User Enter the Branch Code in debit Ac in Maintenance Screen
    And User Enter Currency Code in debit Ac in Maintenance Screen
    And User Enter GL Code in debit Ac in Maintenance Screen
    And User Enter CIF Code in debit Ac in Maintenance Screen
    And User Enter Serial in debit Ac in Maintenance Screen
    And User Click Ok Button in Warning PopUp Menu
    And User Click Ok Button in Warning PopUp Menu
    And User Enter the Currency in Maintenance Screen
    And User Enter the Amount in Maintenance Screen
    #And User Click Ok Button in Warning PopUp Menu for117

  #postrequest
  @TRS_072_02
  Scenario: Checking Cash Withdrawal Transaction Currency Withdrawal Limit Defined - Warn User if Limit Exceeds Checked Amount < Limit
    Given navigate to CSMparam application and login with valid credentials
    And user update test data set id for TRS_72
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the User screen in system parameters
    And user click the update after approve screen
    And user click and send the values in user id under update after approve screen
    And user double click the user id
    And User click the Limit button  in update after approve screen
       And user retrive the existing record from the limits screen
    And user delete the record from the limits screen
    And user click the confirm ok
      And user click  the grantall keys under Eco sector
    And user click the ok button under limit
    And user click the update after approve button
       And user click the confirm ok
    And user click the sucesss ok
    And user click the approve in user screen
    And user click and send the values in user id under Approve screen
    And user double click the user id in approve screen
      And user click the Approvebttn
        And user click the confirm ok
    And user click the sucesss ok
    
#pre req
  @TRS_73_01
  Scenario: Checking Cash Withdrawal Transaction Currency Withdrawal Limit Defined and Warn User if Limit Exceeds Checked and Proceed if Limit Exceeds Checked - Amount > Limit
    Given navigate to CSMparam application and login with valid credentials
    And user update test data set id for TRS_73
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the User screen in system parameters
    And user click the update after approve screen
    And user click and send the values in user id under update after approve screen
    And user double click the user id
    And User click the Limit button  in update after approve screen
     And User click the Eco sector Delete All
     And user click the confirm ok
     And user  click add button under Limits
    And user enter the value of currency in Limits
    And User enter the Transaction type in Limits
    And User enter value with WdLimit in Limits
    And User check the with warnuserlimit in Limit
    And User check the with proceediflimit in Limit
    And user click the ok button under limit
    And user click the update after approve button
       And user click the confirm ok
    And user click the sucesss ok
    And user click the approve in user screen
    And user click and send the values in user id under Approve screen
    And user double click the user id in approve screen
    And user click the Approvebttn
     And user click the confirm ok
    And user click the sucesss ok

  @TRS_73
  Scenario: Checking Cash Withdrawal Transaction Currency Withdrawal Limit Defined and Warn User if Limit Exceeds Checked and Proceed if Limit Exceeds Checked - Amount > Limit
    Given navigate to CSM application and login with valid credentials
       And user update test data set id for TRS_73
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
    And User Enter the Branch Code in debit Ac in Maintenance Screen
    And User Enter Currency Code in debit Ac in Maintenance Screen
    And User Enter GL Code in debit Ac in Maintenance Screen
    And User Enter CIF Code in debit Ac in Maintenance Screen
    And User Enter Serial in debit Ac in Maintenance Screen
    And User Click Ok Button in Warning PopUp Menu
    And User Click Ok Button in Warning PopUp Menu
    And User Enter the Currency in Maintenance Screen
    And User Enter the Amount in Maintenance Screen
    And User Click Save Button in Maintenance Screen
    And User Get the Transaction No in Success PopUp Menu for73
    And User Click Ok Button in Success PopUp Menu
    And User Click on Approve Screen under Transactions
    And User Enter the Transaction No in Approve Screen
    And User Double Click on the Transaction No
    And User Click on Approve Button for approve the Transaction
    And User Click on Ok Button in Success PopUp Menu for Approve Transcation
   # And User Click on Maintenance under Transactions
    #And User Click Ok Button in Warning PopUp to go back to Maintenance
    #And User Click on Search Button in Maintenance Screen
    #And User Enter the Transaction No in Search Box
    #And User Double Click on the Searched Transaction No in Search Box

  #postrequest
  @TRS_073_02
  Scenario: Checking Cash Withdrawal Transaction Currency Withdrawal Limit Defined - Warn User if Limit Exceeds Checked Amount < Limit
    Given navigate to CSMparam application and login with valid credentials
        And user update test data set id for TRS_73
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the User screen in system parameters
    And user click the update after approve screen
    And user click and send the values in user id under update after approve screen
    And user double click the user id
    And User click the Limit button  in update after approve screen
    And user retrive the existing record from the limits screen
    And user delete the record from the limits screen
     And user click the confirm ok
      And user click  the grantall keys under Eco sector
    And user click the ok button under limit
    And user click the update after approve button
    And user click the confirm ok
    And user click the sucesss ok
      And user click the approve in user screen
    And user click and send the values in user id under Approve screen
    And user double click the user id in approve screen
   And user click the Approvebttn
        And user click the confirm ok
    And user click the sucesss ok

  #pre req
  @TRS_069_01
  Scenario: Checking Cash Withdrawal Transaction - Proceed on Insufficient Fund unchecked and Allow Overdraw unchecked and Force Overdraw checked
    Given navigate to CSMparam application and login with valid credentials
     And user update test data set id for TRS_69
    And user click the parameters menu
    And user click the system parameters submenu
    #And user click the User screen in system parameters
    And user click the transationtype submenu under systemparameters
    And user click the updateafterapprove menu under transationtype
    And user Enter the code in inputfield on updateafterapprove screen under transactiontype
    And User double click the record under updateafterapprove screen
    And User unCheck the ProceedOnInsufficientFund chequebox
    And user check the Force overdrawn
    And User click UpdateAfterApprove button on updateafterapprove field
    And user click the save ok button
    And user click the confirm ok
    And user click the approve in user screen
    And user click and send the values in user id under Approve screen
    And user double click the user id in approve screen
    And user click the approve box
    And user click the save ok button
    #And user click the confirm ok
    And user click the AccountParameter submenu under Parameters
    And user click the AccountType under AccountParameters
    And user click the UPA field under AccountTypes
    And user Enter the TypeCode in UPA field
    And user double click the TypeCode in UPA field
    And user click the Instructions in AccountTypes
    And user uncheck with AllowAccess checkBox under Instructions
    And user click UPA Button
    And user click the confirm ok
    And user click the sucesss ok
    And user click the Approve field under AccountTypes
    And user Enter the TypeCode in Approve Field
    And user double click the Typecode in Approve field
   And user click the Approvebttn
    And user click the confirm ok
    And user click the sucesss ok

  @TRS_069
  Scenario: Checking Cash Withdrawal Transaction - Proceed on Insufficient Fund unchecked and Allow Overdraw unchecked and Force Overdraw checked
    Given navigate to CSM application and login with valid credentials
       And user update test data set id for TRS_69
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
    And User Enter the Branch Code in debit Ac in Maintenance Screen
    And User Enter Currency Code in debit Ac in Maintenance Screen
    And User Enter GL Code in debit Ac in Maintenance Screen
    And User Enter CIF Code in debit Ac in Maintenance Screen
    And User Enter Serial in debit Ac in Maintenance Screen
    And User Click Ok Button in Warning PopUp Menu
    And User Click Ok Button in Warning PopUp Menu
    And User Enter the Currency in Maintenance Screen
    And User Enter the Amount in Maintenance Screen
    And User Click Save Button in Maintenance Screen
    And User Get the Transaction No in Success PopUp Menu for69
    And User Click Ok Button in Success PopUp Menu
    And User Click on Approve Screen under Transactions
    And User Enter the Transaction No in Approve Screen
    And User Double Click on the Transaction No
    And User Click on Approve Button for approve the Transaction
    And User Click on Ok Button in Success PopUp Menu for Approve Transcation
    #And User Click on Maintenance under Transactions
    #And User Click Ok Button in Warning PopUp to go back to Maintenance
    #And User Click on Search Button in Maintenance Screen
    #And User Enter the Transaction No in Search Box
    #And User Double Click on the Searched Transaction No in Search Box
    
#pre req
  @TRS_070_01
  Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Proceed on Insufficient Fund unchecked/ Allow Overdraw unchecked/ Force Overdraw checked
    Given navigate to CSMparam application and login with valid credentials
    And user update test data set id for TRS_70
    And user click the parameters menu
    And user click the AccountParameter submenu under Parameters
    And user click the AccountType under AccountParameters
    And user click the UPA field under AccountTypes
    And user Enter the TypeCode in UPA field
    And user double click the TypeCode in UPA field
    And user click the Instructions in AccountTypes
    And user uncheck with AllowAccess checkBox under Instructions
    And user click UPA Button
    And user click the confirm ok
    And user click the sucesss ok
    And user click the Approve field under AccountTypes
    And user Enter the TypeCode in Approve Field
    And user double click the Typecode in Approve field
   And user click the Approvebttn
    And user click the confirm ok
    And user click the sucesss ok

  @TRS_070
  Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Proceed on Insufficient Fund unchecked/ Allow Overdraw unchecked/ Force Overdraw checked
    Given navigate to CSM application and login with valid credentials
    And user update test data set id for TRS_70
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
    And User Enter the Branch Code in debit Ac in Maintenance Screen
    And User Enter Currency Code in debit Ac in Maintenance Screen
    And User Enter GL Code in debit Ac in Maintenance Screen
    And User Enter CIF Code in debit Ac in Maintenance Screen
    And User Enter Serial in debit Ac in Maintenance Screen
    And User Click Ok Button in Warning PopUp Menu
    And User Click Ok Button in Warning PopUp Menu
    And User Enter the Currency in Maintenance Screen
    And User Enter the Amount in Maintenance Screen
    And User Enter the Branch Code in Credit Ac in Maintenance Screen
    #And User Enter Currency Code in Credit Ac in Maintenance Screen
    And User Enter GL Code in Credit Ac in Maintenance Screen
    And User Enter CIF Code in Credit Ac in Maintenance Screen
    And User Enter Serial in Credit Ac in Maintenance Screen
    And User Click Save Button in Maintenance Screen
    And User Get the Transaction No in Success PopUp Menu for70
    And User Click Ok Button in Success PopUp Menu
    And User Click on Approve Screen under Transactions
    And User Enter the Transaction No in Approve Screen
    And User Double Click on the Transaction No
    And User Click on Approve Button for approve the Transaction
    And User Click on Ok Button in Success PopUp Menu for Approve Transcation
    #And User Click on Maintenance under Transactions
    #And User Click Ok Button in Warning PopUp to go back to Maintenance
    #And User Click on Search Button in Maintenance Screen
    #And User Enter the Transaction No in Search Box
    #And User Double Click on the Searched Transaction No in Search Box

  #pre-requesties
  @TRS_121_01
  Scenario: Checking Cash Depsoit Transaction - Eco Sector Deposit Limit Defined - Warn User if Limit Exceeds Checked - Amount < Limit
    Given navigate to CSMparam application and login with valid credentials
    And user update test data set id for TRS_121
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the User screen in system parameters
    And user click the update after approve screen
    And user click and send the values in user id under update after approve screen
    And user double click the user id
    Then user click Eco sector button
    And User click the Eco sector Delete All
     And user click the confirm ok
    And user click add icon under Eco sector limit
    And user enter eco sector value
    And user enter transaction value under Eco sector
    And user enter deposit limit value under Eco sector
    Then user verify the warn user if limit exceed flag checked under Eco sector
    And user click the ok button under limit
    And user click the update after approve button
    And user click the confirm ok
    And user click the sucesss ok
    And user click the approve in user screen
    And user click and send the values in user id under Approve screen
    And user double click the user id in approve screen
    And user click the Approvebttn
    And user click the confirm ok
    And user click the sucesss ok

  @TRS_121
  Scenario: Checking Cash Depsoit Transaction - Eco Sector Deposit Limit Defined - Warn User if Limit Exceeds Checked - Amount < Limit
    Given navigate to CSM application and login with valid credentials
    And user update test data set id for TRS_121
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
    And User Enter the Branch Code in debit Ac in Maintenance Screen
    And User Enter Currency Code in debit Ac in Maintenance Screen
    And User Enter GL Code in debit Ac in Maintenance Screen
    And User Enter CIF Code in debit Ac in Maintenance Screen
    And User Enter Serial in debit Ac in Maintenance Screen
    And User Click Ok Button in Warning PopUp Menu
    And User Click Ok Button in Warning PopUp Menu
    And User Enter the Currency in Maintenance Screen
    And User Enter the Amount in Maintenance Screen
    And User Click Save Button in Maintenance Screen
    And User Get the Transaction No in Success PopUp Menu for121
    And User Click Ok Button in Success PopUp Menu
    And User Click on Approve Screen under Transactions
    And User Enter the Transaction No in Approve Screen
    And User Double Click on the Transaction No
    And User Click on Approve Button for approve the Transaction
    And User Click on Ok Button in Success PopUp Menu for Approve Transcation
  

  #post-requesties
  @TRS_121_02
  Scenario: Checking Cash Depsoit Transaction - Eco Sector Deposit Limit Defined - Warn User if Limit Exceeds Checked - Amount > Limit
    Given navigate to CSMparam application and login with valid credentials
    And user update test data set id for TRS_121
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the User screen in system parameters
    And user click the update after approve screen
    And user click and send the values in user id under update after approve screen
    And user double click the user id
    Then user click Eco sector button
    And user select the row for delete the record
    And user delete the inserted record under Eco sector
    And user click the confirm ok
     And user click  the grantall keys under Eco sector
    And user click the ok button under limit
    And user click the update after approve button
    And user click the confirm ok
    And user click the sucesss ok
    And user click the approve in user screen
    And user click and send the values in user id under Approve screen
    And user double click the user id in approve screen
    And user click the Approvebttn
    And user click the confirm ok
    And user click the sucesss ok

  #pre requesties
  @TRS_116_01
  Scenario: Checking Cash Withdrawal Transaction - Eco Sector Withdrawal Limit Defined - Warn User if Limit Exceeds Checked  Amount < Limit
    Given navigate to CSMparam application and login with valid credentials
    And user update test data set id for TRS_116
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the User screen in system parameters
    And user click the update after approve screen
    And user click and send the values in user id under update after approve screen
    And user double click the user id
    Then user click Eco sector button
    And User click the Eco sector Delete All
     And user click the confirm ok
    And user click add icon under Eco sector limit
    And user enter eco sector value
    And user enter transaction value under Eco sector
    And user enter withdraw limit value under Eco sector
    Then user verify the warn user if limit exceed flag checked under Eco sector
    And user click the ok button under limit
    And user click the update after approve button
    And user click the confirm ok
    And user click the sucesss ok
    And user click the approve in user screen
    And user click and send the values in user id under Approve screen
    And user double click the user id in approve screen
    And user click the Approvebttn
    And user click the confirm ok
    And user click the sucesss ok

  @TRS_116
  Scenario: Checking Cash Withdrawal Transaction - Eco Sector Withdrawal Limit Defined - Warn User if Limit Exceeds Checked  Amount < Limit
    Given navigate to CSM application and login with valid credentials
    And user update test data set id for TRS_116
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
    And User Enter the Branch Code in debit Ac in Maintenance Screen
    And User Enter Currency Code in debit Ac in Maintenance Screen
    And User Enter GL Code in debit Ac in Maintenance Screen
    And User Enter CIF Code in debit Ac in Maintenance Screen
    And User Enter Serial in debit Ac in Maintenance Screen
    And User Click Ok Button in Warning PopUp Menu
    And User Click Ok Button in Warning PopUp Menu
    And User Enter the Currency in Maintenance Screen
    And User Enter the Amount in Maintenance Screen
    And User Click Save Button in Maintenance Screen
    And User Get the Transaction No in Success PopUp Menu for116
    And User Click Ok Button in Success PopUp Menu
    And User Click on Approve Screen under Transactions
    And User Enter the Transaction No in Approve Screen
    And User Double Click on the Transaction No
    And User Click on Approve Button for approve the Transaction
    And User Click on Ok Button in Success PopUp Menu for Approve Transcation
   # And User Click on Maintenance under Transactions
    #And User Click Ok Button in Warning PopUp to go back to Maintenance
    #And User Click on Search Button in Maintenance Screen
    #And User Enter the Transaction No in Search Box
    #And User Double Click on the Searched Transaction No in Search Box

  #postreq
  @TRS_116_02
  Scenario: Checking Cash Withdrawal Transaction - Eco Sector Withdrawal Limit Defined - Warn User if Limit Exceeds Checked  Amount < Limit
    Given navigate to CSMparam application and login with valid credentials
    And user update test data set id for TRS_116
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the User screen in system parameters
    And user click the update after approve screen
    And user click and send the values in user id under update after approve screen
    And user double click the user id
    Then user click Eco sector button
    And user select the row for delete the record
    And user delete the inserted record under Eco sector
    And user click the confirm ok
    And user click  the grantall keys under Eco sector
     And user click the ok button under limit
    And user click the update after approve button
    And user click the confirm ok
    And user click the sucesss ok
    And user click the approve in user screen
    And user click and send the values in user id under Approve screen
    And user double click the user id in approve screen
    And user click the Approvebttn
    And user click the confirm ok

  #prereq
  @TRS_117_01
  Scenario: Checking Cash Withdrawal Transaction - Eco Sector Withdrawal Limit Defined - Warn User if Limit Exceeds Checked - Amount > Limit
    Given navigate to CSMparam application and login with valid credentials
    And user update test data set id for TRS_117
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the User screen in system parameters
    And user click the update after approve screen
    And user click and send the values in user id under update after approve screen
    And user double click the user id
    Then user click Eco sector button
    And User click the Eco sector Delete All
     And user click the confirm ok
    And user click add icon under Eco sector limit
    And user enter eco sector value
    And user enter transaction value under Eco sector
    And user enter withdraw limit value under Eco sector
    Then user verify the warn user if limit exceed flag checked under Eco sector
    And user click the ok button under limit
    And user click the update after approve button
    And user click the confirm ok
    And user click the sucesss ok
    And user click the approve in user screen
    And user click and send the values in user id under Approve screen
    And user double click the user id in approve screen
    And user click the Approvebttn
    And user click the confirm ok
    And user click the sucesss ok

  @TRS_117
  Scenario: Checking Cash Withdrawal Transaction - Eco Sector Withdrawal Limit Defined - Warn User if Limit Exceeds Checked - Amount > Limit
    Given navigate to CSM application and login with valid credentials
    And user update test data set id for TRS_117
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
    And User Enter the Branch Code in debit Ac in Maintenance Screen
    And User Enter Currency Code in debit Ac in Maintenance Screen
    And User Enter GL Code in debit Ac in Maintenance Screen
    And User Enter CIF Code in debit Ac in Maintenance Screen
    And User Enter Serial in debit Ac in Maintenance Screen
    And User Click Ok Button in Warning PopUp Menu
    And User Click Ok Button in Warning PopUp Menu
    And User Enter the Currency in Maintenance Screen
    And User Enter the Amount in Maintenance Screen
     And  User Vaildate the Cannot proceed Msg for117
    #And User Click Save Button in Maintenance Screen
    # And User Click Ok Button in Warning PopUp Menu
    

  #postreq
  @TRS_117_02
  Scenario: Checking Cash Withdrawal Transaction - Eco Sector Withdrawal Limit Defined - Warn User if Limit Exceeds Checked - Amount > Limit
    Given navigate to CSMparam application and login with valid credentials
    And user update test data set id for TRS_117
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the User screen in system parameters
    And user click the update after approve screen
    And user click and send the values in user id under update after approve screen
    And user double click the user id
    Then user click Eco sector button
    And user select the row for delete the record
    And user delete the inserted record under Eco sector
    And user click the confirm ok
     And user click  the grantall keys under Eco sector
    And user click the ok button under limit
    And user click the update after approve button
    And user click the confirm ok
    And user click the sucesss ok
    And user click the approve in user screen
    And user click and send the values in user id under Approve screen
    And user double click the user id in approve screen
    And user click the Approvebttn
    And user click the confirm ok

  #pre req
  @TRS_118_01
  Scenario: Checking Cash Withdrawal Transaction - Eco Sector Withdrawal Limit Defined - Warn User if Limit Exceeds Checked - Proceed if Limit Exceeds Checked - Amount > Limit
    Given navigate to CSMparam application and login with valid credentials
    And user update test data set id for TRS_118
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the User screen in system parameters
    And user click the update after approve screen
    And user click and send the values in user id under update after approve screen
    And user double click the user id
    Then user click Eco sector button
    And User click the Eco sector Delete All
     And user click the confirm ok
    And user click add icon under Eco sector limit
    And user enter eco sector value
    And user enter transaction value under Eco sector
    And user enter withdraw limit value under Eco sector
    Then user verify the warn user if limit exceed flag checked under Eco sector
    Then user verify the Proceed if Limit Exceeds Checked under Eco sector
    And user click the ok button under limit
    And user click the update after approve button
    And user click the confirm ok
    And user click the sucesss ok
    And user click the approve in user screen
    And user click and send the values in user id under Approve screen
    And user double click the user id in approve screen
    And user click the Approvebttn
    And user click the confirm ok
    And user click the sucesss ok

  @TRS_118
  Scenario: Checking Cash Withdrawal Transaction - Eco Sector Withdrawal Limit Defined - Warn User if Limit Exceeds Checked - Proceed if Limit Exceeds Checked - Amount > Limit
    Given navigate to CSM application and login with valid credentials
    And user update test data set id for TRS_118
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
    And User Enter the Branch Code in debit Ac in Maintenance Screen
    And User Enter Currency Code in debit Ac in Maintenance Screen
    And User Enter GL Code in debit Ac in Maintenance Screen
    And User Enter CIF Code in debit Ac in Maintenance Screen
    And User Enter Serial in debit Ac in Maintenance Screen
    And User Click Ok Button in Warning PopUp Menu
    And User Click Ok Button in Warning PopUp Menu
    And User Enter the Currency in Maintenance Screen
    And User Enter the Amount in Maintenance Screen
    And User Click Ok Button in Warning PopUp Menu
     And User Click Save Button in Maintenance Screen
      And User Click Ok Button in Warning PopUp Menu for118
    And User Get the Transaction No in Success PopUp Menu for118
    And User Click Ok Button in Success PopUp Menu
    And User Click on Approve Screen under Transactions
    And User Enter the Transaction No in Approve Screen
    And User Double Click on the Transaction No
    And User Click on Approve Button for approve the Transaction
   And user_612 validate the warning pop upfor118
    And User Click on Ok Button in Success PopUp Menu for Approve Transcation
   

  #post req
  @TRS_118_02
  Scenario: Checking Cash Withdrawal Transaction - Eco Sector Withdrawal Limit Defined - Warn User if Limit Exceeds Checked - Proceed if Limit Exceeds Checked - Amount > Limit
    Given navigate to CSMparam application and login with valid credentials
    And user update test data set id for TRS_118
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the User screen in system parameters
    And user click the update after approve screen
    And user click and send the values in user id under update after approve screen
    And user double click the user id
    Then user click Eco sector button
    And user select the row for delete the record
    And user delete the inserted record under Eco sector
    And user click the confirm ok
     And user click  the grantall keys under Eco sector
    And user click the ok button under limit
    And user click the update after approve button
    And user click the confirm ok
    And user click the sucesss ok
    And user click the approve in user screen
    And user click and send the values in user id under Approve screen
    And user double click the user id in approve screen
    And user click the Approvebttn
    And user click the confirm ok

  #pre req
  @TRS_119_01
  Scenario: Checking Cash Withdrawal Transaction - Eco Sector Withdrawal Limit Defined - Warn User if Limit Exceeds UnChecked - Proceed if Limit Exceeds Checked - Amount > Limit
    Given navigate to CSMparam application and login with valid credentials
    And user update test data set id for TRS_119
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the User screen in system parameters
    And user click the update after approve screen
    And user click and send the values in user id under update after approve screen
    And user double click the user id
    Then user click Eco sector button
    And User click the Eco sector Delete All
     And user click the confirm ok
    And user click add icon under Eco sector limit
    And user enter eco sector value
    And user enter transaction value under Eco sector
    And user enter withdraw limit value under Eco sector
    #Then user verify the warn user if limit exceed flag unchecked under Eco sector
    Then user verify the Proceed if Limit Exceeds Checked under Eco sector
    And user click the ok button under limit
    And user click the update after approve button
    And user click the confirm ok
    And user click the sucesss ok
    And user click the approve in user screen
    And user click and send the values in user id under Approve screen
    And user double click the user id in approve screen
    And user click the Approvebttn
    And user click the confirm ok
    And user click the sucesss ok

  @TRS_119
  Scenario: Checking Cash Withdrawal Transaction - Eco Sector Withdrawal Limit Defined - Warn User if Limit Exceeds UnChecked - Proceed if Limit Exceeds Checked - Amount > Limit
    Given navigate to CSM application and login with valid credentials
    And user update test data set id for TRS_119
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
    And User Enter the Branch Code in debit Ac in Maintenance Screen
    And User Enter Currency Code in debit Ac in Maintenance Screen
    And User Enter GL Code in debit Ac in Maintenance Screen
    And User Enter CIF Code in debit Ac in Maintenance Screen
    And User Enter Serial in debit Ac in Maintenance Screen
    And User Click Ok Button in Warning PopUp Menu
    And User Click Ok Button in Warning PopUp Menu
    And User Enter the Currency in Maintenance Screen
    And User Enter the Amount in Maintenance Screen
    And User Click Save Button in Maintenance Screen
    And User Get the Transaction No in Success PopUp Menu for119
    And User Click Ok Button in Success PopUp Menu
    And User Click on Approve Screen under Transactions
    And User Enter the Transaction No in Approve Screen
    And User Double Click on the Transaction No
    And User Click on Approve Button for approve the Transaction
    And User Click on Ok Button in Success PopUp Menu for Approve Transcation
    

  #post req
  @TRS_119_02
  Scenario: Checking Cash Withdrawal Transaction - Eco Sector Withdrawal Limit Defined - Warn User if Limit Exceeds UnChecked - Proceed if Limit Exceeds Checked - Amount > Limit
    Given navigate to CSMparam application and login with valid credentials
    And user update test data set id for TRS_119
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the User screen in system parameters
    And user click the update after approve screen
    And user click and send the values in user id under update after approve screen
    And user double click the user id
    Then user click Eco sector button
    And user select the row for delete the record
    And user delete the inserted record under Eco sector
    And user click the confirm ok
     And user click  the grantall keys under Eco sector
    And user click the ok button under limit
    And user click the update after approve button
    And user click the confirm ok
    And user click the sucesss ok
    And user click the approve in user screen
    And user click and send the values in user id under Approve screen
    And user double click the user id in approve screen
    And user click the Approvebttn
    And user click the confirm ok
    

 

    
  
 
 
    
    
 

 



