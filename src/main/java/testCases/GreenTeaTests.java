package testCases;


import org.junit.Assert;

import Products.Products;
import Rules.Rules;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manager.YamlManager;


public class GreenTeaTests extends YamlManager {
	
	public static Products products = new GreenTeaTests().getProductsYaml();
	public static Rules rules = new GreenTeaTests().getRulesYaml();
	public static String productName;
	public static int amount;
	public static double price;
	
	public static int finalAmount;
	double finalPrice;
	
	@Given("User adds {string} green teas  to the cart")
	public void user_adds_green_teas_to_the_cart(String amount) {
		this.amount = Integer.parseInt(amount);
		productName = products.getGreenTea().getName();
		price = products.getGreenTea().getPrice();
		
	}


	@When("User check the cart with green tea in next page")
	public void user_check_the_cart_with_green_tea_in_next_page() {
		 if (amount >= rules.getFractionPriceRule().getAmountToDiscount()) {
	         price = rules.getFractionPriceRule().getDiscount(amount, price);
	     } else if (amount >= rules.getReducedPriceRule().getAmountToDiscount() && amount < rules.getFractionPriceRule().getAmountToDiscount() )  {
	    	 price = rules.getReducedPriceRule().getDiscount(amount, price);
	     } else {
	    	price = products.calculatePrice(price, amount);
	     }
		 amount = rules.getFreeRule().getExtraProduct(amount);
	}

	@Then("User should see the green tea right {string}")
	public void user_should_see_the_green_tea_right(String finalAmount) {
		Assert.assertEquals(Integer.parseInt(finalAmount), amount);
	}

	@Then("User should see the green tea correct {string}")
	public void user_should_see_the_green_tea_correct(String finalPrice) {
		Assert.assertEquals(Double.parseDouble(finalPrice), price, 0.01);
		System.out.println("\nCart: "+amount+" " +productName+ "\nFinal Price: " +price);
		price = products.getGreenTea().getPrice();
	}
		
	}
	


	
     
