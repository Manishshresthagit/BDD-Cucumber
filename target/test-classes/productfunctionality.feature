@ProductListFunctionality
Feature: List Product functionality should work .
Scenario: User must be able to use all the functionality in List product .

Given launch invoicemanager website"http://3.13.126.58/AMS3.0/auth/login"
Then  Enter Username" admin@gic.com"
Then  Enter Password"Admin123"
Then  Click on Login 
And   User must be able to Login Accountmanager page Dashboard
Then  Click on products
Then  Click on List products
Then  Click on page 1
Then  Click on Next
Then  Click on previous
