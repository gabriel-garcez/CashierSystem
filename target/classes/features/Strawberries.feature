Feature: Simple cashier function that adds products to a cart and displays the total price 

Scenario: Buy Strawberries 
Given User adds "<amount>" strawberries  to the cart
When User check the cart with strawberries in next page
Then User should see the strawberries right "<finalAmount>"
Then User should see the strawberries correct "<finalPrice>" 


Examples:
| amount	| finalAmount|finalPrice|
| 1				| 2					 |	5.00   	|
| 4 			| 5          |	20.00 	|
| 5 			| 6          |	22.50	 	|
| 6 			| 7          |	27.00	 	|
| 7				| 8          |  28.00 	|
| 8				| 9          |  32.00	 	|