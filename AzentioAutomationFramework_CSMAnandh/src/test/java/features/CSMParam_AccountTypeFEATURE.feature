Feature: To test the Account type creation
@ACTType_GL_1
Scenario: To verify user can able to create the GL Number
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on accounts parameter
And click on general ledger module
And get the test data for gl Creation
And click on maintenance under general ledger
And enter the GL code under gl maintenance
And enter the brief name under gl maintenance
And enter the long name under Gl maintenance
And click on additional details tab
And select the Gl category 
And enter the Account sign under addditional details tab
And save the gl record
And click on approve module under GL screen
And search for saved record in approve screen
And select the Gl record from search suggestion
And click on approve button in general ledger record
And click on ok button in confirm popup under Gl approval
And click on ok button after approval in Gl
And logout from the application
@ACTType_GL_2
Scenario: To verify user can able to create the account typee
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on accounts parameter
And click on account type module
And click on maintenance under account type
And get the test data for creating account type
And enter the gl code in account type
And click on instructions tab in account type
And select the gl category in account type
And select the Period in account type 
And select the client bank in account type
And click on sve button in account type
And click on confirm ok button in account type
And click on ok button after save the account type record
And click on approve screen under account type
And enter the gl code and search in account type approval screen
And select the record from suggestio in Account type
And approve the account type record
And click on ok buttton for confirm approval in account type
And click on ok button after approve thee record in account type
And logout from the application
@ActType_Acces_03
Scenario: To verify user can able to give access to account type
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And click on user module under system parameter
And click on update after approve screen under user module
And get the test data for give acess to account type
And search the user ID in user module
And select the user from suggestion
And click on account type access option 
And click on add button in account type access
And enter the account type for access
And enter the transaction number for access
And click on ok button in access screen
And click on update after approve button
And click on ok button in update confirmation
And click on ok button in saved successfully in user screen
@ActType_Acces_04
Scenario: approve the user access updated record
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And click on user module under system parameter
And click on approval module under user module
And get the test data for the user access record which is done on account type access
And search the user ID in user module
And select the user from suggestion
And click on approve button in user module
And click on approval confirmation ok button under user screen
And click on ok button after approval screen under user screen
And logout from the application
@CIFType_01
Scenario: To create individual CIF
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on CIF parameter module 
And click o CIF type module 
And click on maintenance screen under CIF type module
And get the test data for creating the CIF type record
And enter the cif Type code in code input box
And enter the brief name in cif type
And enter the long name in cif type 
And choose the CIF type as individual CIF
And choose CIF is a client
And enter the value of economic sector in CIF type
And enter the the role code in CIF type
And enter the subeconomic sector in CIF type
And enter the legal status in CIf type
And click on allowed account type section
And click on add button under allowed account type
And enter the Gl code in allowed account type
And click on save button in account type screen
And click ok button in confirm save in CIF type
And click on save confirmation OK button after saving the CIF type record
And click approve module under CIf type
And search the CIf type code
And select the CIF code in suggested result
And click on approve button in CIF type
And click on ok in approve confirmation in CIF type
And click on ok in after approval confirmation
@CIFTypeAcess_01
Scenario: To verify user can able to give access to account type
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And click on user module under system parameter
And click on update after approve screen under user module
And get the test data for give access to CIF Type
And search the user ID in user module
And select the user from suggestion
And click on CIf type access option
And click on add button in CIF type access page
And enter the CIF type in access screen
And enter the Transaction number in CIF type access screen
And click on ok button in CIF type access screen
