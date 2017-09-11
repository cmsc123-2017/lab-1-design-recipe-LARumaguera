
class Item {
	String name;
	double price;

	Item(String name, double price){
		this.name = name;
		this.price = price;
	}
	// constants
	final int SALE_LIMIT = 1000;

	// -> double
	// Returns the sale price value given this sale percentage only if the price exceeds 1000.

	double salePrice1000(double percentage){
		if (price > SALE_LIMIT){
			return price * (1 - percentage);
		} else {
			return price;
		}
	}
}
