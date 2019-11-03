@britishTest
Feature: british airways registration

Scenario: british Airways registration by filling all the mandatory fields 
	Given launch british airways url "https://britishairways.com"
	And click on Registration Link
	Then check for registration page is opened
	Given Enter email id "manishbshrestha@hotmail.co.uk"
	Then  Confirm email address "manishbshrestha@hotmail.co.uk"
	Then  Choose Password "manish123"
	Then  Confirm Password "manish123"
	Then  Select Title "MR"
	Then  Enter First name "Manish"
	Then  Enter Last name "Shrestha"
	Then  Select a Registration option 
	And   Click a radio button "register with ba.com"
	Then  Click on Join now
	Then  Select a radio button "Join the excutive club"
	Then  Enter Address line 1 "Dartford"
	Then  Enter Address line 2 "England"
	Then  Enter Address line 3 "United Kingdom"
	Then  Town /city "Dartford"
	Then  Enter Country/state "United Kingdom"
	Then  Enter Postcode/Zip code"
	Then  Enter Country /Region of Residence
	Then  Enter country/Region where your mobile/cell phone is registered.
	Then  Enter Date of birth 
	
	
	
	

	
	
