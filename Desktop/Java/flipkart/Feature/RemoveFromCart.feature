Feature: User login and search the item,add to the cart and make payment

#Scenario: User login,item added to cart and make payment
#Given  User login to flipkart
#When User select Cart option
#And User remove item from cart


Scenario: User login,item added to cart and make payment
Given  User login to flipkart
When User select Cart option
And If no item is added in Cart
And Select More option
And Sell on Flipkart