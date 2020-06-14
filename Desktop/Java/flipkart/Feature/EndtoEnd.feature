Feature: User login and search the item,add to the cart and make payment

Scenario: User login,item added to cart and make payment
Given  User login to flipkart
When User search item
And User added item to cart
And User make changes in Cart
And User make payment
Then User successfully delievered to customer

#Scenario: User login,item added to cart and make payment
#Given  User login to flipkart
#When User search item 
#And User added item to cart
#And Item is out of stock
#Then Navigate back to flipkart home screen
