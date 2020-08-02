package aula68;

public class Aluno {
	
	public String name;
	public double first;
	public double second;
	public double third;
	
	public double finalGrade() {
		return (this.first + this.second + this.third);
	}
	
	public String approval() {
		if(finalGrade() >= 60) {
			return "pass" ;
		}else {
			return "failed";
	}
}
	
	public double missing() {
		return 60 - finalGrade();
	}
	
	public String toString() {
		if(approval() == "pass") {
			return "Final grade: " + finalGrade() + "\n" + approval();		
		}else {
			return "Final grade: " + finalGrade() + "\n" + approval() + "\nMissing: " + missing() + " points";		

		}
	}
}