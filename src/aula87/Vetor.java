package aula87;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int n=in.nextInt();
		double[] vetor= new double[n];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i]=in.nextDouble();
		}
		
		double soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		
		soma = soma/vetor.length;
		System.out.printf("A media é : %.2f", soma);
	}

}
