Feature: Simple cashier function that adds products to a cart and displays the total price 

Scenario: Buy Green Tea 
Given User adds "<amount>" green teas  to the cart
When User check the cart with green tea in next page
Then User should see the green tea right "<finalAmount>"
Then User should see the green tea correct "<finalPrice>" 


Examples:
| amount	| finalAmount|finalPrice|
| 1				| 2					 |	3.11   	|
| 4 			| 5          |	12.44	 	|
| 5 			| 6          |	13.05	 	|
| 6 			| 7          |	15.66	 	|
| 7				| 8          |  17.41	 	|
| 8				| 9          |  19.91	 	|