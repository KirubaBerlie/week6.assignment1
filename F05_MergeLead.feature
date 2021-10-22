Feature: Merger in LeafTaps application

@regression
Scenario: To Merge Lead  in LeafTap page
Given Enter user name as 'demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should get displayed
When Click on 'CRM/SFA' link
Then 'My Home' page should be displayed
When Click on 'Leads' link
Then 'My Leads' page should be displayed
When Click on 'Merge Leads' link 
Then 'Merge Leads' page should be displayed 
When Click on Lookup icon '1'
Then 'Find Leads' page should be displayed
And Enter the First Name as 'kiruba'



