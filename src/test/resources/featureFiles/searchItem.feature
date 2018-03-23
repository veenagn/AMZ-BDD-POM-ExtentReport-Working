Feature: Search for an item

Scenario: I am on the home page of Amazon and I search for an item, the relavant items are displayed

Given I am on home page
When I enter an item in the search text box
And I select an item from the auto select list
Then Verify the search items are displayed