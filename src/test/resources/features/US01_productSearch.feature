Feature: Product Search and Cart Management

  Background:
    Given User is  on the "https://www.webstaurantstore.com/" website

  Scenario: Search for 'stainless work table' and add the last item to Cart
    When User searches for 'stainless work table'
    Then User checks that every product in the search result has the word 'Table' in its title
    And User adds the last found item to the Cart
    And User navigates to chart by clicking View Cart button
    And User clicks empty cart button
    Then Verify there is no items in the cart