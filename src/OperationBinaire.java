abstract class OperationBinaire implements Expression{
	Expression e1;
	Expression e2;
	
	public OperationBinaire(Expression e1, Expression e2) {
		this.e1 = e1;
		this.e2 = e2;
	}
}