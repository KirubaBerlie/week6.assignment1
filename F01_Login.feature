Feature: Leaftaps login functionality


#Background:
#Given Open the Chrome browser 
#And Load the application url as <url>

Scenario Outline: Test with positive credential
Given Open the Chrome browser 
And Load the application url as <url>
And Enter the username as <username>
And Enter the password as <password>
When Click on Login button
Then My Home' page gets displayed

Examples:
|url|username|password|
|'http://leaftaps.com/opentaps/control/login'|'demosalesmanager'|'crmsfa'|
|'http://leaftaps.com/opentaps/control/login'|'democsr'|'crmsfa'|

#Scenario: Test with negative credential
#Given Enter the username as <url>
#And Enter the password as <username>
#And Enter the password as <password>
#When Click on Login button
#But Error message should be displayed
