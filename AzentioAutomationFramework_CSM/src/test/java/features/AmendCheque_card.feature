Feature: checking if the system is changing the chequebook status from "cancelled" to its old status " submit " and Amend a cheque if it is unpaid
@ACSD_010
Scenario: User login to Amend cheque card status in cheque book cancelled to submit
Given User login to Card Status for cheque book 
And User click on the Amend cheque card status in cancelled Record
And user click on the maintenance in cancelled Record
And user Select on the Product type in cancelled Record
And User click on the chequeNo in Cancelled Record
And User Select on the Status in Cancelled Record
And User click on the Branch code in Cancelled Record
And User click on the Currency button in Cancelled Record
And User click on the GL code in Cancelled Record
And User click on the CIF type in Cancelled Record
And User click on the Serial Number in Cancelled Record
And User click on the Update button in Cancelled Record
And User click on the icon button in Cancelled Record

@ACSD_011
Scenario: checking if the system is reversing the charges transaction if charges were applied on the cancellation
Given User login to Card Status for cheque book 
And User click on the Amend cheque card status in cancelled Record
And user click on the maintenance in cancelled Record
And user Select on the Product type in cancelled Record
And User click on the chequeNo in Cancelled Record
And User Select on the Status in Cancelled Record
And User click on the Branch code in Cancelled Record
And User click on the Currency button in Cancelled Record
And User click on the GL code in Cancelled Record
And User click on the CIF type in Cancelled Record
And User click on the Serial Number in Cancelled Record
And User click on the Update button in Cancelled Record
And User click on the icon button in Cancelled Record