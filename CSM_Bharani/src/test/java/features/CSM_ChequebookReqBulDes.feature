Feature: To check the functionality of chequebook Request
@CHB_161
Scenario: Checking if the user is able to select any row and click "Destroy" under Approve/Reject Destroy
Given navigate to CSM application and login with valid credentials
And Click the Chequebook Request flag
And Click the Bulk Destroy under Chequebook Request
Then Click the retrieve button under Bulk Destroy
And Choose the existing record under Bulk Destroy
Then Destroy the record by clicking To Destroy button under Bulk Destroy
And Navigate to Approve Reject Bulk Destroy
Then Click the retrieve button under Approve Reject Bulk Destroy
And Click the search icon under Approve Reject Bulk Destroy
Then Click the Search Box under Approve Reject Bulk Destroy
#And Choose the destroyed record under Approve/Reject Bulk Destroy
#Then Destroy the record by clicking To Destroy button under Approve/Reject Bulk Destroy