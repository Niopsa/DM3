public class Test{
	public static void main(String [] args) {
		Expression c1 = new Constante(2);
		Expression c2 = new Constante(3);
		
		Expression x = new Variable(0);
		
		Expression sin1 = new Sin(x);
		
		Expression multi = new Multiplication(c1,sin1);
		
		Expression cos1 = new Cos(x);
		Expression multi1 = new Multiplication(c2, cos1);
		
		Expression fin = new Addition(multi, multi1);
		
		System.out.println(fin);
		System.out.println(fin);
	}
}