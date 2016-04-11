#Keywords Summary :Search for a product
#Feature: A user Search for a product and add a product to cart t
#Scenario: Add to cart.
#Given: An user can able to navigate to the site
#When: Search for a product 
#Then: select a product from the list of products 
#And,But: see the selected product added in to the basket
@tag
Feature: Add to cart for a product
	I want to navigate to the site and add a product to the basket

@singleproducts
Scenario: Launch the site and search for a product and add to cart 
Given I want to launch the website
And I enter product on search field in top navigation pane
When I click on search button
And see the results for your search  
Then select the product from the list 
And click on add to cart 
And see the selected product in the basket list 