package aula71;

public class Convercao {
	
	public static double DOLLAR = 3.10;
	public static double IOF = 0.06;
	
	public static double convercao(double compra) {
		return (compra * DOLLAR) + (compra * DOLLAR * IOF) ;
	}
	
}
