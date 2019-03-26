public class Division extends OperationBinaire{
	private double p;
	
	public Division(double p) {
		this.p = p;
	}
	
	public double valeur(double x) {
		return (double)x/p;
	}
	
	public String toString() {
		return ("" + p);
	}
}