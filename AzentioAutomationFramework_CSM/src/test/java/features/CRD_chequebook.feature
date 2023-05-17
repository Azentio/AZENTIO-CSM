Feature: Checking if the user is able to modify Cheque book Cancel and Reverse,Delete
@CHB_088
Scenario: From Number and To Number fields with Cancel sequences
Given User login to cheque book in Reverse
And User click the Chequebook Request button
And User click the To Cancelchequebook button
And User enter the code button
And User enter the From Number
And User enter the To Number
And User click the Tocancelbutton 
And user click on ok button

@CHB_087
Scenario: From Number and To Number fields with Reversed sequences
Given User login to cheque book in Cancel 
And User click the Chequebook Request button1
And User select the To Reversed chequebook button
And User enter the code button for To Reversed chequebook
And User enter the From Number for To Reversed chequebook
And User enter the To Number for To Reversed chequebook
And User click the Tocancelbutton for To Reversed chequebook
And user click on ok button To Reversed chequebook

@CHB_89
Scenario: From Number and To Number fields with Deleted sequences
Given User login to cheque book in delect
And User click the Chequebook Request button1 in delete
And User select the To deleted chequebook button
And User enter the code button for To delete chequebook
And User enter the From Number for To delete chequebook
And User enter the To Number for To delete chequebook
And User click the To delete button for To delete chequebook
And user click on ok button To delete chequebook