package aula68;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double taxy;
	
	public double netSalary() {
		return this.grossSalary - this.taxy;
	}
	
	public void increaseSalary(double percentage) {
		this.grossSalary += (this.grossSalary * (percentage/100));
	}
	
	public String toString() {
		return name + ", R$ " + String.format("%.2f", netSalary()) ;
	}
}
