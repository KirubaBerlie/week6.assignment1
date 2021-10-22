Feature: CreateLead in LEafTaps application

@smoke @functional
Scenario: To create Lead in LeafTap page

Given Enter user name as 'demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should get displayed
When Click on 'CRM/SFA' link
Then 'My Home' page should be displayed
When Click on 'Leads' link
Then 'My Leads' page should be displayed
When Click on 'Create Lead' link 
Then 'Create Lead' page should be displayed 
Given Enter the Company name as 'Testleaf' in 'create' Lead
And Enter the FirstName as 'Kiruba'
And Enter the LastName as 'Berlie'
When Click on Create Lead button
Then 'View Lead' page should be displayed
Then New Lead should be created
Then Note the LeadID