$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/RemoveFromCart.feature");
formatter.feature({
  "line": 1,
  "name": "User login and search the item,add to the cart and make payment",
  "description": "",
  "id": "user-login-and-search-the-item,add-to-the-cart-and-make-payment",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#Scenario: User login,item added to cart and make payment"
    },
    {
      "line": 4,
      "value": "#Given  User login to flipkart"
    },
    {
      "line": 5,
      "value": "#When User select Cart option"
    },
    {
      "line": 6,
      "value": "#And User remove item from cart"
    }
  ],
  "line": 9,
  "name": "User login,item added to cart and make payment",
  "description": "",
  "id": "user-login-and-search-the-item,add-to-the-cart-and-make-payment;user-login,item-added-to-cart-and-make-payment",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User login to flipkart",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User select Cart option",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "If no item is added in Cart",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Select More option",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Sell on Flipkart",
  "keyword": "And "
});
formatter.match({
  "location": "TestStep1.user_login_to_flipkart()"
});
formatter.result({
  "duration": 14728627400,
  "status": "passed"
});
formatter.match({
  "location": "TestStep1.user_select_Cart_option()"
});
formatter.result({
  "duration": 180394600,
  "status": "passed"
});
formatter.match({
  "location": "TestStep1.if_no_item_is_added_in_Cart()"
});
