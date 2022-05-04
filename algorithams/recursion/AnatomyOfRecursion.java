package datastructures.algorithams.recursion;

public class AnatomyOfRecursion {

	static int recursiveMethod(int n) {
		if(n>0)	{		
			if(n%2==0) {
				System.out.println(n);
			}
			n--;
			return recursiveMethod(n);
		}
		return 0;
	}
	public static void main(String[] args) {
		System.out.println(recursiveMethod(10));
	}

}
