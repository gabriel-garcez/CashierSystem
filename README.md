# Cashier System

About:
Simple cashier function that adds products to a cart and displays the total price.

The Products and prices are: 

- Green Tea: 3.11
- Strawberries: 5.00
- Coffee: 11.23

Special Rules
- FreeRule: Buy one get one free
- ReducedPriceRule: Buy > N products, pay X price per product
- FractionPriceRule: Buy > N products, pay X% of the original price

Products Data:
It reads both the products and rules from a YAML file. The default location of the file is priv/assets/products.yml and priv/assets/rules.yml, this can be changed in the Configuration

How to Run:
There is a Runner inside the folde testCases that links the features with the test cases. Run it to run the tests. 

Project Includes:
- Java
- Cucumber
- JUnit
- SnakeYaml
