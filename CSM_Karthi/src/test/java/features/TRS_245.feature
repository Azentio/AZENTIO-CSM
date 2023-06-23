Feature: verify the funcnality of the transaction
@TRS_245
Scenario: Functional Testing - Main Account Debited - No Future Value Date - No Charges - Account Sign Credit - Not Overdrawn/ Withdrawal - Base/ Base


  Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_245
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the transationtype submenu under systemparameters
    And user click the updateafterapprove menu under transationtype
    And user Enter the code in inputfield on updateafterapprove screen under transactiontype
    And User double click the record under updateafterapprove screenforTRS_064
    And User Check the ProceedOnInsufficientFund chequebox
    And User click the allow post dated value flag under update after approve
    And user click UpdateAfterApprove Button
    And user click the save ok button
    And user click the ok
    And user click Approve field under TransactionType
    And user Enter the code in Approve field
    And user double click the code on Approve fieldforTRS_064
    And user click Approve Button
    And user click the save ok button
    And user click the ok
    #Given navigate to CSM param application and login with valid credentials
    #And user click the parameters menu
    And user click the AccountParameter submenu under Parameters
    And user click the AccountType under AccountParameters
    And user click the UPA field under AccountTypes
    And user Enter the TypeCode in UPA field
    And user double click the TypeCode in UPA field
    And user click the Instructions in AccountTypes
     And user Check AllowAccess checkBox under Instructions
    And user click UPA Button
    And user click the save ok button
    And user click the ok
    And user click the Approve field under AccountTypes
    And user Enter the TypeCode in Approve Field
    And user double click the Typecode in Approve field
    And user click the Approve button
    And user click the save ok button
    And user click the ok
     
    Given navigate to CSM application and login with valid credentials
And user click on Date to Change the Current Date in the CSM core application
And user Enter the Date in user Running Date in the CSM core application
And user click on Use Button in Change Running Date Popup in the CSM core application
And user click Ok Button in Information PopUp menu in the CSM core application
And user click on Close Button in Change Running Date Popup in the CSM core application
And user click on Technical Details Icon in the CSM core application
And user click Clear Cache in Technical Details Icon in the CSM core application
And user click Ok Button Under Information PopUp Menu in the CSM core application
And user click on Transactions under CSM application in the CSM core application
And user click on Maintenance under Transactions in the CSM core application
And user enters the transaction type
#Then user Enter the Branch Code for AC1 in Maintenance Screen
And user Enter Currency Code for AC1 in Maintenance Screen
And user click random click
And user Enter GL Code for AC1 in Maintenance Screen
And user click random click
Then user Enter CIF Code for AC1 in Maintenance Screen 
And user click random click
And user Enter Serial for AC1 in Maintenance Screen
And user click random click
And user click Ok Button in Warning PopUp Menu
Then user Enter the Currency in Maintenance Screen
Then user Enter the Amount in Maintenance Screen
    
    #TRS_245
    And User click the allow back dated value flag under update after approve



#TRS_119 to TRS_129

And user update test data set id for TRS_119 
And user update test data set id for TRS_220
And user update test data set id for TRS_221
And user update test data set id for TRS_222
And user update test data set id for TRS_223
And user update test data set id for TRS_224
And user update test data set id for TRS_225
And user update test data set id for TRS_226
And user update test data set id for TRS_227
And user update test data set id for TRS_228
And user update test data set id for TRS_229
#TRS_245 to TRS_256

And user update test data set id for TRS_246
And user update test data set id for TRS_247
And user update test data set id for TRS_248
And user update test data set id for TRS_249
And user update test data set id for TRS_250
And user update test data set id for TRS_251
And user update test data set id for TRS_252
And user update test data set id for TRS_253
And user update test data set id for TRS_254
And user update test data set id for TRS_255
And user update test data set id for TRS_256

