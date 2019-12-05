@ListProductSorting
Feature: user must be able to sort the columns
Scenario: sorting functionality

Given launch invoicemanager website"http://3.13.126.58/AMS3.0/auth/login"
Then  Enter Username" admin@gic.com"
Then  Enter Password"Admin123"
Then  Click on Login 
And   User must be able to Login Accountmanager page Dashboard
Then  click on product
Then  Click on list product
Then  Click on edit
Then  click on name
Then  click on Details
Then  click price
Then  click Tax price
