
#Keywords Summary :Search for a product
#Feature: A user Search for a product and add a product to cart t
#Scenario: Add to cart.
#Given: An user can able to navigate to the site
#When: Search for a product 
#Then: select a product from the list of products 
#And,But: see the selected product added in to the basket
@tag
Feature: search for a product
	I want to navigate to the site and add a product to the basketle

@singleproducts
Scenario: Launch the site and search for a product
Given I want to launch the website
	When I click on search field in top navigation pane
	When I enter a product and click on search button
#And I click on search button
#	Then see the results for your search  
#	And see the all List of available products 

