import java.util.Scanner;

class ReadInput{
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		String username;
		int age;
		System.out.print("Enter your name : ");
		username = scan.nextLine();
		System.out.print("Enter your age : ");
		age = scan.nextInt();

		System.out.println("Hello "+username);
		System.out.println("Entered age : "+age);

		}
}

