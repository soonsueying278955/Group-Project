package TravelAndTransport;

//different implementation of payment for different travel packages

class PriceRateOne implements Payment{
	//calculate total price with no disc
	double price = Double.parseDouble(Package_Admin_SetPrice.price1);
	public double Price() {
		return price;
	}
	
	//calculate total price with discount
	public double totalPrice(double disc) {
		return price * (1-disc);
	}
	

}

class PriceRateTwo implements Payment{
	double price = Double.parseDouble(Package_Admin_SetPrice.price2);
	public double Price() {
		return price;
	}
	
	//calculate total price with discount
	public double totalPrice(double disc) {
		return price * (1-disc);
	}

	
}

class PriceRateThree implements Payment{
	double price = Double.parseDouble(Package_Admin_SetPrice.price3);
	public double Price() {
		return price;
	}
	
	//calculate total price with discount
	public double totalPrice(double disc) {
		return price * (1-disc);
	}
	
}
