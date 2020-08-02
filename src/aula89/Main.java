package aula89;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Scanner on = new Scanner(System.in);
		

		Aluguel[] vect = new Aluguel[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Rent #" + (i+1));
			System.out.print("name: ");
			String name = on.nextLine();
			System.out.print("Email: ");
			String email = on.nextLine();
			System.out.print("Room: ");
			int room = in.nextInt();
			vect[room] = new Aluguel(name, email);

		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < vect.length; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i].getName() + ", " + vect[i].getEmail());
			}
		}
		
	}

}
