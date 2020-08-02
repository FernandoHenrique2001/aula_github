package aula68;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		aluno.name=in.nextLine();
		aluno.first=in.nextDouble();
		aluno.second=in.nextDouble();
		aluno.third=in.nextDouble();
		
		System.out.println(aluno);
		
	}

}
