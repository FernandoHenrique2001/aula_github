package aula80;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Scanner on = new Scanner(System.in);
		Conta conta;
		double deposit;
		
		System.out.print("Enter account number: ");
		int number = in.nextInt();
		System.out.print("Enter account holder: ");
		String titular = on.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char aux = in.next().charAt(0);
		
		if(aux == 'y') {
			System.out.print("Enter initial deposit value: ");
			deposit = in.nextDouble();
			conta = new Conta(number, titular, deposit);
		}else {
			conta = new Conta(number, titular );

		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		deposit = in.nextDouble();
		conta.deposito(deposit);
		System.out.println("Update account data: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double saque= in.nextDouble();
		conta.saque(saque);
		System.out.println("Update account data: ");
		System.out.println(conta);
		
		}
}