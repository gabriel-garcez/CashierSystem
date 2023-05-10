package Rules;

public class FractionPriceRule {

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
		price = price*amount;
		double discountValue = price*discount;
		price = price - discountValue;
	return price;
}

	public int getAmountToDiscount() {
		return amountToDiscount;
	}

	public void setAmountToDiscount(int amountToDiscount) {
		this.amountToDiscount = amountToDiscount;
	}


	
}
