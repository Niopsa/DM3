public class Multiplication extends OperationBinaire{
	
	public Multiplication(Expression e1, Expression e2) {
		super(e1, e2);
	}
	
	public double valeur(double x) {
		return e1.valeur(x) * e2.valeur(x);
	}
	
	public String toString() {
		return e1 + " * " + e2;
	}
}