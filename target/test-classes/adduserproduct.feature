@AddUserProduct
Feature: user must be able to add user
Scenario: To check user in Add Product

Given launch invoicemanager website"http://3.13.126.58/AMS3.0/auth/login"
Then  Enter Username" admin@gic.com"
Then  Enter Password"Admin123"
Then  Click on Login 
And   User must be able to Login Accountmanager page Dashboard
And   Click on Product
Then  click on List Product
Then  click on Add user 
Then  Enter First Name
Then  Enter Details
Then  Enter price
And   Click on Add product 


