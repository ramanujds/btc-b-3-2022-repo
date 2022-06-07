import java.util.Scanner;

class ArraysBasics{
	public static void main(String []args){

		Scanner scan = new Scanner(System.in);
		int []nums = new int[5];

		System.out.println("Enter the elements : ");
		for(int index = 0; index<nums.length; index++){
			nums[index]=scan.nextInt();
		}
		
		
		
		// System.out.println("Element 2 : "+nums[1]);

		/*
		// index based traversing
		for(int index = 0; index<nums.length; index++){
			System.out.println(nums[index]);
		}
		*/

		// Enhanced for loop (for each loop)
		
		System.out.println("Entered Elements are : ");
		for(int item : nums){
			System.out.print(item+"\t");
		}

		int min = nums[0];
		for(int item:nums){
			if(item<min){
				min=item;
			}
		}
		System.out.println("\nMin = "+min);

	}
}