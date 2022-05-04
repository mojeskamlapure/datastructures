package datastructures.algorithams.dynamicprogramming;

public class HouseRobber {
	static public int rob(int[] nums) { 
		int n=nums.length;
	    
	    if(n==0) return 0;
	    if(n==1) return nums[0];
	    
	    int a[]=new int[n];
	   
	    a[0]=nums[0];
	    a[1]=Math.max(nums[0],nums[1]);
	    
	    for(int i=2;i<n;i++)
	        a[i]=Math.max(nums[i]+a[i-2], a[i-1]);
	    
	    return a[n-1];
	    }
	
	public static void main(String[] args) {
			
		System.out.println(rob(new int[]{2,7,9,3,1})+"\t=\t12");
		System.out.println(rob(new int[]{1,2})+"\t=\t2");
		System.out.println(rob(new int[]{1,3,1})+"\t=\t3");
		System.out.println(rob(new int[]{1,2,3,1})+"\t=\t4");
		System.out.println(rob(new int[]{2,4,2})+"\t=\t4");
		System.out.println(rob(new int[]{1,2,1,1})+"\t=\t3");
		System.out.println(rob(new int[]{2,1,1,2})+"\t=\t4");
		System.out.println(rob(new int[]{1,2,1,0})+"\t=\t4");
		System.out.println(rob(new int[]{1,3,1,3,100})+"\t=\t103");
	}

}
