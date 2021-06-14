@List
Feature: List scenarios

@MOB-3204 @AndroidRegression @Positive
  Scenario: Verify user is able to create list,add items and delete an item
  Given User creates a list "List1"
  When User adds an item "Item11"
  And User adds an item "Item21"
  And User deletes an item "Item11"

@MOB-3204 @AndroidRegression @Positive
  Scenario: Verify list items are sorted
  Given User creates a list "List2"
  When User adds an item "ZItem"
  And User adds an item "XItem"
  And User adds an item "YItem"
  And Verify items are sorted "ZItem" "XItem" "YItem"
