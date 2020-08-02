package aula98;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		
		int[][] matriz = new int[n][m];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]= in.nextInt();
			}
			
		}
		
		int num = in.nextInt();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == num) {
					System.out.println("Position: " + i + "," + j );
					try {
						System.out.println("Left: "+matriz[i][j-1]);
					}catch(Exception e) {
						System.out.println("A posicao esquerda nao existe!");
					}
					try {
						System.out.println("Right: "+matriz[i][j+1]);
					}catch(Exception e) {
						System.out.println("A posicao direita nao existe!");
					}
					try {
						System.out.println("Up: "+matriz[i-1][j]);
					}catch(Exception e) {
						System.out.println("A posicao superior nao existe!");
					}
					try {
						System.out.println("Down: "+matriz[i+1][j]);
					}catch(Exception e) {
						System.out.println("A posicao inferio nao existe!");
					}
				}
			
			}
		}	

	}
}