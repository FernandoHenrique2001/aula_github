package application;


import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name= in.nextLine();
		System.out.print("Price: ");
		product.price= in.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity=in.nextInt();
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = in.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed in stock: ");
		quantity = in.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
	}

}
