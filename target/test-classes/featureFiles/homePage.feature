Feature: Verify the drop down menu when hovering on menu on home page

Scenario Outline: I am on the home page of Amazon and I hover on "Hello. Sign in" 

Given I am on home page
Then I hover on the link HelloSignin
And I am displayed list of menu items
Then I verify the items displayed
