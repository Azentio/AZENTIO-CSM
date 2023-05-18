Feature: User login to New Template user in Populate user
@TSA_010
Scenario: Checking if records are created in the user template screen (ET000MT) when the user specifies within this field the user template code under user-populate
Given User login to CSM Param Application
And Click the Parameter button in Template user
And Click the System parameter button in Temple user
And Click the Populate Uesr Under New Template User
And Click the Maintenance Under Populate User Screen
And Enter the Teller Population User Code under populate User
And Enter the Brife Name for under Populate User Screen
And Enter the Long Name for Under Populate User
And Enter the BriefNamearab under Populate User
And Enter the LongNamearab for under Populate User
And Click the search in user code
And Enter the Value User Teller code
And Click the Add button
And Enter the Value Branch Code under
And Click Saerch box
And Enter the code value in under New user Template
And Click the Save
And Click the Approve button
And Click the Search button
And Click the Approve submit button
Then Click confirm ok button
Then Click the Ok submit button

@TSA_013
Scenario: Checking if the “New user template” field is added next to each line added under the destination branch
Given User login to CSM Param Application
And Click the Parameter button in Template user
And Click the System parameter button in Temple user
And Click the Populate Uesr Under New Template User
And Click the Maintenance Under Populate User Screen
And Enter the Teller Population User Code under populate User
And Enter the Brife Name for under Populate User Screen
And Enter the Long Name for Under Populate User
And Enter the BriefNamearab under Populate User
And Enter the LongNamearab for under Populate User
And Click the search in user code
And Enter the Value User Teller code
And Click the Add button
And Enter the Value Branch Code under
And Click Saerch box
And Enter the code value in under New user Template
And Click the Save
And Click the Add button
And Enter the Value Branch Code under
And Click Saerch box
And Enter the code value in under New user Template
And Click the Save
And Click the Approve button
And Click the Search button
And Enter the code Value Under Approve populate user
And Click the Approve submit button
Then Click confirm ok button
Then Click the Ok submit button
