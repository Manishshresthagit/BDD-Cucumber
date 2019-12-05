@productFunctionality
Feature: User must be able to Add product and list product

Scenario: Adding and Listing product

Given launch invoicemanager website"http://3.13.126.58/AMS3.0/auth/login"
Then  Enter Username" admin@gic.com"
Then  Enter Password"Admin123"
Then  Click on Login 
And   User must be able to Login Accountmanager page Dashboard
Then  Click on User
Then  Click on List user 
Then Click on Excel
Then Click on PDF
Then Click on CSV
Then Click on Columns
Then  Click on Add Product

