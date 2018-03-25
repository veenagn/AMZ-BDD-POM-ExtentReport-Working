Feature: Log on to Amazon Site

Scenario Outline: I am on the home page of Amazon and I log on 

Given I am on home page
Then I click on the sign in button
Then I am displayed username textbox to enter email address
Then I enter the <username> in the email text box 
And Click continue button
Then I am displayed password textbox to enter password
Then I enter the <password> in the password textbox
And Click on the password signin button
Then I verify that I have logged in sucessfully

Examples:

| username             | password |
| vns_test@hotmail.com | Google001 |

Scenario Outline: Verify User Name

Given I am on home page
Then I click on the sign in button
Then I am displayed username textbox to enter email address
Then I enter the <username> in the email text box 
And Click continue button
Then I verify the <username> username

Examples:

| username             | password |
| vns_testxx@hotmail.com | Google001 |