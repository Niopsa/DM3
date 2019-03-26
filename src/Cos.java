public class Cos extends OperationUnaire{
	
	public Cos(Expression e) {
		super(e);
	}
	
	public double valeur(double x) {
		return Math.cos(e.valeur(x));
	}

	public String toString() {
		return "cos("+e+")";
	}
}