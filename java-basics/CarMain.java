class Car{
	
	// Fields
	String regs;
	String model;
	String color;

	static String type = "Petrol";
	
	// Methods
	public void start(){
		System.out.println("Car started");
	}
	
	public void acclerate(){
		System.out.println("Car Moving..");
	}
	
	public void brake(){
		System.out.println("Brakes applied..");
	}

	public static void fillFuel(){
		System.out.println("Fuel Filled");
	}

	public void printCarDetails(){
		System.out.println("Model : "+model);
		System.out.println("Reg No. : "+regs);
		System.out.println("Color : "+color);
		System.out.println("Engine Type : "+type);
	}
}

class CarMain{
	public static void main(String []args){
		
		Car ford = new Car();
		ford.regs = "KA05 8888";
		ford.model = "Eco Sports";
		ford.color = "Black";

		ford.start();
		ford.acclerate();
		ford.brake();
		// Car.type = "EV";
		Car.fillFuel();

		ford.printCarDetails();
		System.out.println("\n-------------------------------\n");

		Car tata = new Car();
		tata.regs = "WB02 4444";
		tata.model = "Nexon";
		tata.color = "Red";

		tata.start();
		tata.acclerate();
		tata.brake();


		tata.printCarDetails();
		
	}
}