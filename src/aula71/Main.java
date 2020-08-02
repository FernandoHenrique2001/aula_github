package aula71;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.printf("What is the dollar price? %.2f", Convercao.DOLLAR);
		System.out.print("\nHow many dollars will be bought? ");
		double reais = in.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f", Convercao.convercao(reais));
		
	}

}
