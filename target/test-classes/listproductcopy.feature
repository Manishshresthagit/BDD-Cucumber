@ListProductFeature
Feature: user can do all the functionality in List product list
Scenario: checking the functionlaity of list product
Given launch invoicemanager website"http://3.13.126.58/AMS3.0/auth/login"
Then  Enter Username" admin@gic.com"
Then  Enter Password"Admin123"
Then  Click on Login 
And   User must be able to Login Accountmanager page Dashboard
Then click on product
Then Click on list product
Then click on copy
Then click on Excel
Then click on csv
Then click on pdf
And Click on page number 
And click on Next
And click on previous
And Click on addproduct
Then Enter Name
Then Enter Detail
Then Price
And Click Add Product
Then Click on Names
Then Click on Details
Then Click on Price
Then Click on Tax Method

