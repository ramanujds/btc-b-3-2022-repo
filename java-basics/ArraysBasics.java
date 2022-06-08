import java.util.Scanner;
import java.util.Arrays;

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

		// Finding the second largest item
		
		/*
		int max1=nums[0], max2=nums[0];
		
		for(int item:nums){
			if(item>max1){
				max1=item;
			}
		}

		for(int item:nums){
			if(item>max2 && item<max1){
				max2=item;
			}
		}
		
		System.out.println("\nSecond Largest = "+max2);
		*/

		Arrays.sort(nums);
		// O(nLogn)
		System.out.println("Second Largest = "+nums[nums.length-2]);
		
	}
}