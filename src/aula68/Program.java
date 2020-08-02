package aula68;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name=in.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary=in.nextDouble();
		System.out.print("Tax: ");
		employee.taxy=in.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		Double percentage= in.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println("Update data: " + employee);
	}

}
