package datastructures.algorithams.dynamicprogramming;

public class FibonacciSequenceDemo {

	static int fibonacciSequenceUsingDP(int n) {
		// O(n)
		int[] arr = new int[n + 1];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 1;
		for (int i = 3; i <= n; i++)
			arr[i] = arr[i - 1] + arr[i - 2];
		return arr[n];
	}
	
	
	public static void main(String[] args) {
		//fibonacciSequenceUsingDP(5);
		/*
		 *  0 1 2 3 4 5 6 7  8  9
		 *  0 1 1 2 3 5 8 13 21 34
		 */
		System.out.println(fibonacciSequenceUsingDP(9));
	}

}
