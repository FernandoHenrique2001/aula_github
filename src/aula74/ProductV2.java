package aula74;

public class ProductV2 {
	
	public String name;
	public double price;
	public int quantity;
	
	public ProductV2(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public int getQuantity() {
		return quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return this.name + ", R$" + String.format("%.2f", price) + ", " + this.quantity + " units, Total: " + String.format("%.2f", totalValueInStock());
	}
}
