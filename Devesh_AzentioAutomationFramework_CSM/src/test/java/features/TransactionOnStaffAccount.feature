Feature: Testing the functionality of chequebook
@TSA_165
Scenario: Check if the system restricts the user from performing a transaction on an account
					for the Joint CIF in which "Joint Details" includes the CIF defined under User screen
					if the flag "Do not allow Trx on his Account" flag is checked for the related User
Given navigate to CSM application and login with valid credentials
Then select data set ID when user perform transaction if do not allow trx on his account flag is checked
Then navigate to transaction menu option
Then navigate to maintenance screen under transaction
Then click on lookup button and fill the trx type
Then Fill the From account1 and To account1 details for do not allow trx on his account flag as checked
Then verify system must display User does not have access to make a Transaction on his own Account message
Then click on new button to perform a new transaction
Then click on lookup button and fill the trx type
Then Fill the From account2 and To account2 details under transaction management
Then click on save button under transaction maintenance screen
Then verify system must display User does not have access to make a Transaction on his own Account message

@TSA_166
Scenario: Check if the system restricts the user from performing a transaction on an account
				  for the Joint CIF in which "Joint Details" includes the CIF defined under User screen
				  if the flag "Do not allow Trx on his Account" flag is not checked for the related User
Given navigate to CSM application and login with valid credentials
Then select data set ID when user perform transaction if do not allow trx on his account flag is unchecked 
Then navigate to transaction menu option
Then navigate to maintenance screen under transaction
Then click on lookup button and fill the trx type
Then Fill the From account1 and To account1 details for do not allow trx on his account flag as unchecked
Then click on save button under transaction maintenance screen
Then verify system should accept this fully
Then click on new button to perform a new transaction
Then click on lookup button and fill the trx type
Then Fill the From account2 and To account2 details under transaction management
Then click on save button under transaction maintenance screen
Then verify system should accept this fully

@TSA_167
Scenario: Check if the system restricts the user from performing a transaction on an account
 					for the Joint CIF in which "Joint Details" includes the CIF defined under User screen
  				if the flag "Do not allow Trx on his Account" flag is checked for another User
Given navigate to CSM application and login with another user
Then select data set ID when user perform transaction if do not allow trx on his account flag is checked for another user
Then navigate to transaction menu option
Then navigate to maintenance screen under transaction
Then click on lookup button and fill the trx type
Then Fill the From account1 and To account1 details for do not allow trx on his account flag as checked for another user
Then click on save button under transaction maintenance screen
Then verify system should accept this fully
Then click on new button to perform a new transaction
Then click on lookup button and fill the trx type
Then Fill the From account2 and To account2 details under transaction management
Then click on save button under transaction maintenance screen
Then verify system should accept this fully


@TSA_168
Scenario: Check if the system restricts the user from performing a transaction on an account
				  for the other Joint CIF defined under "Joint Details"
  				if the flag "Do not allow Trx on his Account" flag is checked for the related User
Given navigate to CSM application and login with valid credentials
Then select data set ID when user perform transaction if do not allow trx on his account flag is checked for related user
Then navigate to transaction menu option
Then navigate to maintenance screen under transaction
Then click on lookup button and fill the trx type
Then Fill the From account1 and To account1 details for do not allow trx on his account flag as checked
Then verify system must display User does not have access to make a Transaction on his own Account message

Then click on new button to perform a new transaction
Then click on lookup button and fill the trx type
Then Fill the From account2 and To account2 details under transaction management
Then click on save button under transaction maintenance screen
Then verify system must display User does not have access to make a Transaction on his own Account message

Then click on new button to perform a new transaction
Then click on lookup button and fill the trx type
Then Fill the From account3 and To account3 details under transaction management
Then click on save button under transaction maintenance screen
Then verify system should accept this fully

