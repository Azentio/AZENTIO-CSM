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
