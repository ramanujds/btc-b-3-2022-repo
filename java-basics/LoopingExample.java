class LoppingExample{
	public static void main(String []args){
		// int num = 100;
		int sum = 0;

		/*
		while(num<=10){
			// sum = sum + num;
			// Arithmetic Assignment Operator
			sum += num;
			// num = num+1;
			// Increment Operator
			num++;
		}
		*/
		
		/*
		do{
			sum+=num;
			num++;
		}while(num<=10);
		*/

		for(int num=1; ; num++){
			if(num==5){
				continue;
			}
			sum+=num;
			if(num>=10){
				break;
			}
		}
		
		System.out.println("Sum = "+sum);
	}
}
		