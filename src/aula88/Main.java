package aula88;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Scanner on = new Scanner(System.in);

		int n = in.nextInt();
		Product[] vect = new Product[n];
		
		for (int i = 0; i < vect.length; i++) {
			String name = on.nextLine();
			double price = in.nextInt();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum/vect.length;
		
		System.out.printf("Average price = %.2f\n", avg);
	}

}
