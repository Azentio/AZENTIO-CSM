Feature: Testing functionalities of Chequebook feature screen
@CHB_007
Scenario: checking if the user is able to suspend a chequebook - short process
Given User Launch CSM Core Application
And User Click Chequebook Request Menu
And User Click Suspend Sub Menu
And User update Test data id for checking if the user is able to suspend a chequebook short process
And User search the chequebook code in chequebook request Maintenance Screen
And User Select the Searched Record in chequebook request Maintenance Screen
And User click suspend button to suspend the cheque book record
And User Click Maintanence sub menu in chequebook request
And User Click Search button in chequebook request Maintenance Screen
And User Search Suspended chequebook code in Cheque book Request Maintenance Screen
Then User Validate the suspended chequebook record in Cheque book Request Maintenance Screen