package Rules;

public class ReducedPriceRule {
	
	 private static double discount;
	 private int amountToDiscount;


	public static double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	
	public static double getDiscount(int amount, double price) {
		double discount = getDiscount();
		double priceEach = price - discount;
		double finalPrice = priceEach*amount;
		return finalPrice;
	}

	public int getAmountToDiscount() {
		return amountToDiscount;
	}

	public void setAmountToDiscount(int amountToDiscount) {
		this.amountToDiscount = amountToDiscount;
	}



}
