package datastructures.arrays;

import java.util.HashSet;
import java.util.Set;

public class PairWithSumExample {

	static boolean hasPairWithSumNaive(int[] arr,int sum) {	
		/* nested for loop with same array 
			so Time Complexity is O(n^2)
		*/
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum )
						return true;
			}
		}
		return false;
	}
	
	static boolean hasPairWithSum(int[] arr,int sum) {	
		/* traverse through an array once  
			so Time Complexity is O(n)
		*/
		Set<Integer> hashSet=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(hashSet.contains(arr[i]))
				return true;
			hashSet.add(sum-arr[i]);
					
		}
		return false;
	}
	public static void main(String[] args) {
		int [] array= {1,2,3,4,5};
		int [] array2= {1,2,3,4};
		int sum=9;
		System.out.println(hasPairWithSumNaive(array, sum));
		System.out.println(hasPairWithSum(array2, sum));
		
	}

}
