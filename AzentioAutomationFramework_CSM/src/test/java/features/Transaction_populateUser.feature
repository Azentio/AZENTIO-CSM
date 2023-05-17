Feature: User create branch to transaction populate user
@TSA_008
Scenario: Checking if suspended users with sub status “Transferred” are not retrieved from the User- reactivate screen
Given User login to CSM Param application
And click the parameter under transaction
And click the System parameter under transaction
And click the user under transaction
And click the update after approve under transaction
And enter the value user Id in under transaction
And click the Populate user under transaction
And click the Maintenance under transaction
And enter the code value under transaction
And click the Suspend button under transaction
And click the update button under transaction
And click the popup msg in ok
And ok done in under transaction

@TSA_009
Scenario: Checking if User suspended with sub status “Transferred” is only reactivated by populating the user again to the destination branch (branch where the user has status suspended- transferred)
Given User login to CSM Param application
And click the parameter under transaction
And click the System parameter under transaction
And click the user under transaction
And click the update after approve under transaction
And enter the value user Id in under transaction
And click the Populate user under transaction
And click the Maintenance under transaction
And enter the code value under transaction
And click the Suspend button under transaction
And click the update button under transaction
And click the popup msg in ok
And ok done in under transaction