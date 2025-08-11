Feature: DeleteAccount of leaftaps application 

Scenario: Delete Account of leaftaps

And Enter the username as 'Demosalesmanager'
And Enter the password as  'crmsfa'
When Click on the login link
Then It should be logged In
When Click on the CRMSFA link
And Click on the Accounts link
And Clcikk on the FindAccount link
And Clicck on the AccountId link
And Click on the DeActivate link
When Click OK link on the alert
Then Delete Account Successfully