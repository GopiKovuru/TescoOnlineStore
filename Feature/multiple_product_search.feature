#Keywords Summary :Search for a product
#Feature: A user Search for a product and add a product to cart t
#Scenario: Add to cart.
#Given: An user can able to navigate to the site
#When: Search for a product 
#Then: select a product from the list of products 
#And,But: see the selected product added in to the basket
@tag
Feature: search for multiple products
	

@multipleproducts
Scenario Outline: Launch the site and search for a multiple products
Given I want to launch website for multiple search
When I click on multiple search link 
#When I enter the products <Name> 
#And I ckick on search button
#Then see the multiple results for your search  
#And see the List of all available products 
#Examples:
    #| value  |Name     | status   |
    #| 1      |cucumber | available|
    #| 2      |Mango    | available|
    #| 3      |Milk     | available|

