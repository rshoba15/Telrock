Feature: Verify if item selected from search cataloug is added to the Shopping Basket

	Background:
		Given I am on Amazons home page.
		
	Scenario: Search and add an item to the Basket
		When I  enter the item name on the Search box 
		And click on Search 
		Then I should be able to select the item from the list of items displayed
		And add the item to the shopping basket
        And check if the item is added the basket.
        
		