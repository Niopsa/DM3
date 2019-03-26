public class Sin extends OperationUnaire{
	
	public Sin(Expression e) {
		super(e);
	}
	
	public double valeur(double x) {
		return Math.sin(e.valeur(x));
	}
	
	public String toString() {
		return "sin("+e+")";
	}
}