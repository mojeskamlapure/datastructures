package datastructures.algorithams.recursion;

public class FactorialDemo {

	static int findFactorialUsingIteration(int n) {
		int fact=1;
		while(n>1) {
			fact=n*fact;
			n--;
		}
		return fact;
	}
	
	static int findFactorial(int n) {
		if(n==2)
			return n;
		return n*findFactorial(n-1);
	}
	public static void main(String[] args) {
		System.out.println(findFactorial(5));
		System.out.println(findFactorialUsingIteration(5));
	}

}
