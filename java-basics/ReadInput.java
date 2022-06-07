import java.util.Scanner;

class ReadInput{
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		String username;
		int age;
		char gender;
		String initials="";
		
		

		System.out.print("Enter your name : ");
		username = scan.nextLine();

		System.out.print("Enter your age : ");
		age = scan.nextInt();

		System.out.println("Select Gender :(M/F) ");
		gender = scan.next().charAt(0);

		switch(gender){
			case 'M':
			case 'm':
				initials = "Mr.";
				break;
			case 'F':
			case 'f':
				initials="Ms.";
				break;
			default:
				System.out.println("Wrong input");
				return;
		}
		

		/*
		if(gender == 'M' || gender == 'm'){
			initials="Mr.";
		}
		else if(gender == 'F' || gender == 'f'){
			initials="Ms.";
		}
		else{
			System.out.println("Wrong input");
			return;
		}

		*/

		System.out.println("Hello "+initials+" "+username+",");
		
		
		
		if(age>=13 && age<=45){
			System.out.println("Welcome to Play with Code");
		}
		else{
			System.out.println("You aren't eligible to play this game");
		}
		

	}
}

