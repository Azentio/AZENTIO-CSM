Feature: Checking functionality of transaction
@TRS_218
Scenario: Checking the transaction - GL type field - Don’t notify and proceed - Proceed on insufficient funds flag2 unchecked

Given User click the reverse option under transaction flag
And User enter the transaction number in transaction number column under reverse option
Then User double click the entered transaction number to view the details in reverse option
And User close the view memo popup box
Then User select the valid reason in reverse option
And User reverse the record to save the reason
Then User click the approve reverse option under transaction flag
And User enter the transaction number in transaction number column under approve reverse option
Then User double click the entered transaction number to view the details in approve reverse option
And User click save option to save the record
