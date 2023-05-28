@ui @healthcheck
Feature: E-commerce Project Web Site Health Check

	Background: Navigation to Apprication BASE URL
	Given User navigated to the home application url

	@SearchProd1
	Scenario: User is able to Open the browser, navigate to the URL and Search for Product
		#Given User opened browser
    #Given User navigated to the home application url
    When User Search for product "Mobiles"
    Then Search Result page is displayed with title contains "Mobiles"
    #And Broswer is closed

	@SearchProd2
  Scenario: User is able to Open the browser, navigate to the URL and Search for Product
		#Given User opened browser
    #Given User navigated to the home application url
    When User Search for product "keyboards"
    Then Search Result page is displayed with title contains "keyboards"
    #And Broswer is closed
    
  @ProdDetails
  Scenario: User is click on the Product and check the Product Details
    #Given User opened browser
    #Given User navigated to the home application url
    And User Search for product "monitors"
    When User click on any product
    Then Product Description is displayed in new tab
    #And Broswer is closed
    
  @MultiSearch
  Scenario Outline: User is able to search multiple products
    When User Search for product "<product_name>"
    Then  Search Result page is displayed with title contains "<prod_result>"
    Examples: 
      | product_name | prod_result |
      | mouse        | mouse       |
      | earphone     | earphone    |
      | computer     | computer    |
      | monitors     | monitors    |