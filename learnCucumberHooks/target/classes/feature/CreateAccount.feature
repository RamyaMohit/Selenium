Feature: CreateAccount of leaftaps aaplication

Scenario Outline: Create Account

And Enter the username as 'Demosalesmanager'
And Enter the password as  'crmsfa'
When Click on the login link
Then It should be logged In
When Click on the CRMSFA link
And Click on the Accounts link
And Clcikk on the CreateAccount link
Given Enter the Account Name as <AccountName>
And Enter the Number Of Employees <TotalEmployees>
And Enter the Description as <Description>
When Click on the Create Account link
Then Account should be created

Examples:
|AccountName|TotalEmployees|Description|
|TestleafAccountData3|5|Detailed description of the account|
