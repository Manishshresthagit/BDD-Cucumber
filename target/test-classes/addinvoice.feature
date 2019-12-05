@AddInvoice
Feature:  add invoice functionlaity should work
Scenario: user must be able to add invoce 

Given launch invoicemanager website"http://3.13.126.58/AMS3.0/auth/login"
Then  Enter Username" admin@gic.com"
Then  Enter Password"Admin123"
Then  Click on Login 
And   User must be able to Login Accountmanager page Dashboard
Then  Click sales
Then  Click add invoce
Then  Click on company
Then 	Select Santhos (Shan)
Then  Enter Order Disocunt
Then  Select Recurring
Then  Billing company
Then  Enter Due Date
Then  Select order tax
Then  Select Reference number
Then  Enter Shipping
Then  Select Status
Then  Enter Quantity
Then  Enter Production 
Then  Enter unit price
And   Click Add invoice