package Rules;

public class FreeRule {
	
	 private int extraProduct;

	public int getExtraProduct() {
		return extraProduct;
	}

	public void setExtraProduct(int extraProduct) {
		this.extraProduct = extraProduct;
	}
	
	public static int getExtraProduct(int amount) {
	amount = amount + 1;
	return amount;
}

}
