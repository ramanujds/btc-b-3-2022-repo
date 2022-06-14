package lambdaexpressions;

interface Showable{
	public void show();
	public static void check() {	
	}
}

interface Operation{
	public double perform(double a, double b);
}

class Calculator{
	public double calculate(double a, double b, Operation op) {
		return op.perform(a, b);
	}
}

public class LambdaExpressions {

	public static void main(String[] args) {
		
//		Showable obj =	()-> System.out.println("Hello World");
//		obj.show();
		
		Calculator obj = new Calculator();
		
		var output = obj.calculate(15, 25, (x,y) -> x>y?x:y );
		
		System.out.println(output);
	
	}

}
