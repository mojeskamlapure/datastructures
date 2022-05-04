package datastructures.algorithams.recursion;

import java.util.Stack;

public class FibonacciSequenceDemo {

	static int fibonacciSequenceUsingIteration(int n) {
		// O(n)
		int[] arr = new int[n + 1];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 1;
		for (int i = 3; i <= n; i++)
			arr[i] = arr[i - 1] + arr[i - 2];
		return arr[n];
	}
	
	static int fibonacciSequenceUsingStack(int n) {
		
		Stack<Integer> stack=new Stack<>();
		stack.push(0);
		stack.push(1);
		//stack.push(1);
		// O(n)
		for (int i = 2; i <= n; i++)
			stack.push(stack.get(i-2)+stack.get(i-1));
		return stack.pop();
	}
	
	static int fibonacciSequenceUsingRecursion(int n) {
		// O( 2^n) Exponential with the help of dynamic prog. this can be converted to
		// O(n)
		if (n < 2)
			return n;
		return fibonacciSequenceUsingRecursion(n - 1) + fibonacciSequenceUsingRecursion(n - 2);

	}
	public static void main(String[] args) {
		//fibonacciSequenceUsingIteration(5);
		/*
		 *  0 1 2 3 4 5 6 7  8  9
		 *  0 1 1 2 3 5 8 13 21 34
		 */
		System.out.println(fibonacciSequenceUsingIteration(9));
		System.out.println(fibonacciSequenceUsingRecursion(9));
		System.out.println(fibonacciSequenceUsingStack(9));
	}

}
