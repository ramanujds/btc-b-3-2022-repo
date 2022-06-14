package defaultandstatic;

interface Printable {
	public void print();

	public default void scan() {
		System.out.println("Scanning Data");
	}

	public static void applyColor() {
		System.out.println("Color Applied");
	}
}

interface Scannable{
	public default void scan() {
		System.out.println("Scanning Documents");
	}
}

class ImagePrinter{
	public void scan() {
		System.out.println("Scanning Images");
	}
}

class Printer extends ImagePrinter implements Printable,Scannable {
	public void print() {
		System.out.println("Hello World");
	}

//	@Override
//	public void scan() {
//		Printable.super.scan();
//		Scannable.super.scan();
//	}

}



public class DefaultAndStatic {

	public static void main(String[] args) {
		Printable obj = new Printer();
		Printer p = new Printer();
		obj.print();
		obj.scan();

	}

}
