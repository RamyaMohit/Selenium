Feature: CreateLead functionality of Leaftaps application

Scenario: CreateLead with multiple data
Given Launch the browser
And Load the url
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then It should be logged in
When Click on the CRMSFA link
And Clcik on the Leads Link
And Click on the CreateLead link
Given Enter the companyname as 'Testleaf Org'
And Enter the firstname as 'Ramya'
And Enter the lastname as 'Dinesh'
When Click on the CreateLead button
Then Lead should be created