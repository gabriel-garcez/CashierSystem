package Products;

public class Products {
		
	private GreenTea greenTea; 
	private Strawberries strawberries;
	private Coffee coffee;
	public GreenTea getGreenTea() {
		return greenTea;
	}
	public void setGreenTea(GreenTea greenTea) {
		this.greenTea = greenTea;
	}
	public Strawberries getStrawberries() {
		return strawberries;
	}
	public void setStrawberries(Strawberries strawberries) {
		this.strawberries = strawberries;
	}
	public Coffee getCoffee() {
		return coffee;
	}
	public void setCoffee(Coffee coffee) {
		this.coffee = coffee;
	} 
	
	public static double calculatePrice(double price, int amount) {
		 price = price * amount;
		return price;
	}
	    

	}

