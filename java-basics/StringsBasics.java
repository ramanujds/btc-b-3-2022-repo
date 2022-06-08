class StringsBasics{
	public static void main(String []args){
		String str = new String("Hello");
		String str2 = new String("hello");
		
		/*
		System.out.println("String is : "+str);
		str = str+" BTC";
		System.out.println("String is : "+str);
		*/
		
		boolean b = str.equalsIgnoreCase(str2);
		System.out.println(b);

		int length = str.length();
		System.out.println("Length : "+length);

		// str.compareTo(str2)

		// str.indexOf("lo") = 3
		// str.indexOf("l") = 2
		// str.charAt(2) = 'l'
		// str.contains("He") true
		
		
	}
}