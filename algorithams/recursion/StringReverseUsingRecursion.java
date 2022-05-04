package datastructures.algorithams.recursion;

public class StringReverseUsingRecursion {

	static String stringReverse(String str) {
		if(str.isEmpty())
			return "";
		else {
			return stringReverse(str.substring(1))+str.charAt(0);	
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ey --> h
		//y --> eh
		//yeh
		System.out.println(stringReverse("hey"));

	}

}
