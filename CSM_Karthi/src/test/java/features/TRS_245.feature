Feature: verify the funcnality of the transaction
@TRS_245
Scenario: Functional Testing - Main Account Debited - No Future Value Date - No Charges - Account Sign Credit - Not Overdrawn/ Withdrawal - Base/ Base


 Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_245 
   
    And user click the system parameters submenu
    And user click the transationtype submenu under systemparameters
    And user click the updateafterapprove menu under transationtype
    And user Enter the code in inputfield on updateafterapprove screen under transactiontype
    And User double click the record under updateafterapprove screen
    And User Check the ProceedOnInsufficientFund chequebox
    And User click UpdateAfterApprove button on updateafterapprove field
    And user click the save ok button
    And user click the ok
    And user click the Approve field under the transactiontype
    And user Enter the code in inputfield on Approve screen under transactiontype
    And User double click the record Approve screen
    And user click the Approve button on Approve field
    And user click the save ok button
    And user click the ok
    Given navigate to CSM application and login with valid credentials
    And User Click on Date to Change the Current Date
    And User Enter the Date in User Running Dates
    And User Click on Use Button in Change Running Date Popup
    And User Click Ok Button for confirmation PopUp for Company Holiday
    And User Click Ok Button in Information PopUp menu
    And User Click on Close Button in Change Running Date Popup
    And User Click on Technical Details Icon
    And User Click Clear Cache in Technical Details Icon
    And User Click Ok button Under Information PopUp Menu
    And user click the Chequebookrequest submenu on CSMCORE
    And user click the maintanance under the chequebookrequest screen
    And user Enter the NoOfCheques in the field
    And user Enter the code on chequebookrequest maintanance screen
    # And user click on some thing in visible screen
    And user Enter the Branchcode on chequebookrequest maintenance screen
    And user Enter the Currencycode on chequebookrequest maintenance screen
    And user Enter the GLCode on chequebookrequest maintenance screen
    And user Enter the CIFCode on chequebookrequest maintenance screen
    And user Enter the SerialNo on chequebookrequest maintance screen
    And user click the ok
    #And that warning popup
    And user click the Save button on maintance screen
    And user click the Approve field under chequebookrequest field
    And user enter the cheque code on approve screen
    And user double click the cheque code on approve screen
    And user click the ok
    # And that warning popup
    And user Approve the cheque record on Approve field
    And user validate the cannot Proceed Message
    
    #TRS_245
    And User click the allow back dated value flag under update after approve
And User click the allow post dated value flag under update after approve


