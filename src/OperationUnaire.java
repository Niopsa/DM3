abstract class OperationUnaire implements Expression{
	Expression e;
	
	public OperationUnaire(Expression e) {
		this.e = e;
	}
}