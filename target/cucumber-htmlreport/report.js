$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("searchItem.feature");
formatter.feature({
  "line": 1,
  "name": "Search for an item",
  "description": "",
  "id": "search-for-an-item",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "I am on the home page of Amazon and I search for an item, the relavant items are displayed",
  "description": "",
  "id": "search-for-an-item;i-am-on-the-home-page-of-amazon-and-i-search-for-an-item,-the-relavant-items-are-displayed",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter an item in the search text box",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I select an item from the auto select list",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Verify the search items are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.i_am_on_home_page()"
});
formatter.result({
  "duration": 4903278999,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.i_enter_an_item_in_the_search_text_box()"
});
formatter.result({
  "duration": 257668637,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.i_select_an_item_from_the_auto_select_list()"
});
formatter.result({
  "duration": 3304199840,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.verify_the_search_items_are_displayed()"
});
formatter.result({
  "duration": 6470313,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c...ning: Home \u0026 Kitchen[xx]\u003e but was:\u003c...ning: Home \u0026 Kitchen[]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat action.HomePageAction.validateTitle(HomePageAction.java:51)\n\tat stepDefinition.HomePageSteps.verify_the_search_items_are_displayed(HomePageSteps.java:30)\n\tat ✽.Then Verify the search items are displayed(searchItem.feature:8)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 881575670,
  "status": "passed"
});
});