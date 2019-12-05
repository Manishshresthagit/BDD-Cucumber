@AddUserFunctionality
Feature: I want to Add user in the List 

Scenario: User must be able to add the user in thye list.

Given launch invoicemanager website"http://3.13.126.58/AMS3.0/auth/login"
Then  Enter Username" admin@gic.com"
Then  Enter Password"Admin123"
Then  Click on Login 
And   User must be able to Login Accountmanager page Dashboard
And   Click on Users
Then  Click on List users
Then  Click on search textbox 
Then  Click on Add new user
Then  Enter first name 
Then  Enter Last name 
Then  Enter company 
Then  Enter phone number
Then  Enter Email address
Then  Select sales staff
Then  create password
Then  Confirm Passowrd
And   Click on Add user 

