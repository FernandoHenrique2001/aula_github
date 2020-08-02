package aula94;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Scanner on = new Scanner(System.in);

		
		ArrayList<Funcionario> list = new ArrayList<>();
		
		System.out.print("How many employee will be registered? ");
		int n = in.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Employee #" + (i+1));
			System.out.print("Id: ");
			int id = in.nextInt();
			System.out.print("Name: ");
			String name = on.nextLine();
			System.out.println("Salary: ");
			double salary = in.nextDouble();
			
			Funcionario funcionario = new Funcionario(id, name, salary);
			list.add(funcionario);
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idsalary = in.nextInt();
		Integer pos = position(list, idsalary);
		
		if(pos != null) {
		System.out.print("Enter the percentage: ");
		double percent = in.nextDouble();
		list.get(pos).aumento(percent);
		}else {
			System.out.println("This id does not exist!");
		}
		
		System.out.println();
		System.out.println("List of employee: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	
	}
	
	public static Integer position(ArrayList<Funcionario> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}	
		}	
		return null;

		}
		
	}


