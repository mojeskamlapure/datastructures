package datastructures.arrays;

import java.util.HashSet;

public class IsCommanElementPresent {

	public static void main(String[] args) {
		char [] array1= {'d','r','h','f','w'};
		char [] array2= {'a','b','c','r'};
		
		System.out.println(IsCommonElementPresentNaive(array1,array2));
		System.out.println(IsCommonElementPresent(array1, array2));
		
		
	}

	private static boolean IsCommonElementPresentNaive(char[] array1, char[] array2) {
		/* nested for loop with same array 
			so Time Complexity is O(n^2)
		 */
		for(int i=0;i<array1.length;i++)
			for(int j=0;j<array2.length;j++) {
				System.out.println(array1[i]+"\t"+array2[j]);
				if(array1[i]==array2[j]) {
					return true;
				}
			}
		return false;
	}
	
	private static boolean IsCommonElementPresent(char[] array1, char[] array2) {
		HashSet<Character> charSet=new HashSet<Character>();
		/* traverse through an array once  
			so Time Complexity is O(array1.length)
		 */
		for(int i=0;i<array1.length;i++)
			charSet.add(array1[i]);
		
		/* traverse through an array once  
			so Time Complexity is O(array2.length)
		 */
		for(int j=0;j<array2.length;j++)
			if(charSet.contains(array2[j]))
					return true;
			
		return false;
	}


}
