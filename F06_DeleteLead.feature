Feature: Delete Lead in LeafTaps application

@functional
Scenario: To Delete Lead in LeafTap page
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
Then 'View Lead' page should be displayed
Then Note the LeadID
When Click on 'Delete' link
Then 'My Leads' page should be displayed
When Click on 'Find Leads' link 
Then 'Find Leads' page should be displayed 
Then Verify Lead deleted


