@AddingProduct
Feature: User must be able to add Product 

Scenario: Add valid details in Add Product 
Given launch invoicemanager website"http://3.13.126.58/AMS3.0/auth/login"
Then  Enter Username" admin@gic.com"
Then  Enter Password"Admin123"
Then  Click on Login 
And   User must be able to Login Accountmanager page Dashboard
And   Click on Product
Then  Click on add product
Then  Enter name 
Then  Enter details
Then 	Enter phone 
And   click Add product



  