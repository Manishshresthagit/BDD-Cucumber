@ShowEntriesFunctionality
Feature: user must be able to see the entries.
Scenario: show entries page number.
Given launch invoicemanager website"http://3.13.126.58/AMS3.0/auth/login"
Then  Enter Username" admin@gic.com"
Then  Enter Password"Admin123"
Then  Click on Login 
And   User must be able to Login Accountmanager page Dashboard
And   Click on Products 
Then  Click on List Products
Then  Click on dropdown 
Then  Select 25
And   Select all
Then  Select 100



