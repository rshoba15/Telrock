$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Amazonshopping.feature");
formatter.feature({
  "name": "Verify if item selected from search cataloug is added to the Shopping Basket",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on Amazons home page.",
  "keyword": "Given "
});
formatter.match({
  "location": "Gluecode.i_am_on_Amazons_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search and add an item to the Basket",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I  enter the item name on the Search box",
  "keyword": "When "
});
formatter.match({
  "location": "Gluecode.i_enter_the_item_name_on_the_Search_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Search",
  "keyword": "And "
});
formatter.match({
  "location": "Gluecode.click_on_Search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to select the item from the list of items displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Gluecode.i_should_be_able_to_select_the_item_from_the_list_of_items_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "add the item to the shopping basket",
  "keyword": "And "
});
formatter.match({
  "location": "Gluecode.add_the_item_to_the_shopping_basket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check if the item is added the basket.",
  "keyword": "And "
});
formatter.match({
  "location": "Gluecode.check_if_the_item_is_added_the_basket()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});