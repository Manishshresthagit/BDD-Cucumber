@BookaFlight
Feature: to book a flight

Scenario: to book a flight
Given launch british airways url "https://britishairways.com"
And   Click on Book 
And   Click on Book a Flight 
And 	Click More Destinations under Europe
And   Enter PAR and choose "France"
And  	Select One Way
And   Select First Class
Then  Click Find Lowest Price 


