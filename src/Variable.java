public class Variable implements Expression{
	private double x;
	
	public Variable(double x) {
		this.x = x;
	}
	
	public double valeur(double x) {
		return x;
	}
	
	public String toString() {
		return ("" + x);
	}
}