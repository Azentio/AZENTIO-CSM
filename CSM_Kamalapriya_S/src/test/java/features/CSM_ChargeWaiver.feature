Feature: To check the functinalities of charge waiver feature
@CW_008
Scenario: Checking the waiver when opening an FMA
Given navigate to CSM application and login with valid credentials
And Get the data set id for FMA
And Click the accounts falg
Then Click the Fixed Maturity Accounts under accounts
And Click the openings under fixed maturity accounts
Then Enter the currency code under FMA
And Enter the GL Type under FMA
Then Enter the CIF number under FMA
And Click the Instruction under FMA
Then Enter the transfer amount under instruction
And Enter the transaction type under instruction
#Then Save the FMA record
And Validate the charges amount is waived