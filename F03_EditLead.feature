Feature: EditLead in LeafTaps application

@smoke
Scenario: To Edit Lead Company Name in LeafTap page
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
When Click on 'Edit' link
Then 'Edit Lead' page should be displayed
Given Enter the Company name as 'CTS' in 'update' Lead 
When Click on 'Update' button
Then 'View Lead' page should be displayed
Then Company name should be updated as 'CTS'

