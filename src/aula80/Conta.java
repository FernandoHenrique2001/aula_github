package aula80;

public class Conta {
	
	private int numConta;
	private String titular;
	private double saldo;
	
	public Conta(int numConta, String titular, double depositoInicial) {
		this.numConta = numConta;
		this.titular = titular;
		deposito(depositoInicial);
	}
	
	public Conta(int numConta, String titular) {
		this.numConta = numConta;
		this.titular = titular;
	}

	public int getNumConta() {
		return numConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double deposito) {
		this.saldo += deposito;
	}
	
	public void saque(double saque) {
		this.saldo = (this.saldo - saque) - 5;
	}

	@Override
	public String toString() {
		return "Conta [numConta: " + this.numConta + ", titular: " + this.titular + ", saldo: R$ " + this.saldo + "]";
	}
	
	
}