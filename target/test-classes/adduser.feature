@OpenAInvocieManager
Feature: Login Functinality of invoice manager
Scenario: User must be able to login in 
Given launch invoicemanager website"http://3.13.126.58/AMS3.0/auth/login"
Then  Enter Username" admin@gic.com"
Then  Enter Password"Admin123"
Then  Click on Login 
And   User must be able to Login Accountmanager page Dashboard
Then  Click on calander
Then  Click on Month
Then  Click on week 
Then  Click on day
Then  Click on > sign
Then  Click on > sign 
And   Click on Today 