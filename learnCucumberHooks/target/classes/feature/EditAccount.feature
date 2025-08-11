Feature: EditAccount of leaftaps application 

Scenario: Edit Account of leaftaps

And Enter the username as 'Demosalesmanager'
And Enter the password as  'crmsfa'
When Click on the login link
Then It should be logged In
When Click on the CRMSFA link
And Click on the Accounts link
And Clcikk on the FindAccount link
And Clicck on the AccountId link
And Click on the Edit button
Given Edit the AccountName as 'FirstAccount'
And Edit the total employees as '2'
And Edit the description as 'First Description'
When Click on the Edit link
Then Account Edited successfully
