Feature: Simple cashier function that adds products to a cart and displays the total price 

Scenario: Buy Coffee
Given User adds "<amount>" coffees to the cart
When User check the cart with coffee in next page
Then User should see the coffee right "<finalAmount>"
Then User should see the coffee correct "<finalPrice>"


Examples:
| amount	| finalAmount|finalPrice|
| 1				| 2					 |	11.23   |
| 4 			| 5          |	44.92	 	|
| 5 			| 6          |	53.65	 	|
| 6 			| 7          |	64.38 	|
| 7				| 8          |  62.88	 	|
| 8				| 9          |  71.87 	|