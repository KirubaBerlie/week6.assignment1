Feature: Duplicate Lead feature in LeafTaps application

@functional
Scenario: To duplicate Lead in LeafTap page
Given Enter user name as 'demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should get displayed
When Click on 'CRM/SFA' link
Then 'My Home' page should be displayed
When Click on 'Leads' link
Then 'My Leads' page should be displayed
When Click on 'Find Leads' link 
Then 'Find Leads' page should be displayed 
Given Enter the LeadID
When Click button 'Find Leads'
Then Lead List should  get displayed
And Click on first Lead ID
Given Note the LeadID details
Then 'View Lead' page should be displayed
When Click on 'Duplicate Lead' link
Then 'Duplicate Lead' page should be displayed
When Click on 'Create Lead' button
Then 'View Lead' page should be displayed
Then Verify duplicate Lead performed





