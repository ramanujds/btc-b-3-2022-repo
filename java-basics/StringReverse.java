
// Reverse a String
class StringReverse{
	public static void main(String []args){
		String str="Super Computer";
		StringBuilder revStr = new StringBuilder(str);
		revStr.reverse();
		System.out.println(str+"|"+revStr);
	}
}