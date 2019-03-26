public class Constante implements Expression{
	private double c;
	
	public Constante(double c) {
		this.c = c;
	}
	
	public double valeur(double c) {
		return c;
	}
	
	public String toString() {
		return ("" + c);
	}
}
