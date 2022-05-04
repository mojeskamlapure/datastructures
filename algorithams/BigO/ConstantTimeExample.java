package datastructures.algorithams.BigO;

import java.util.Date;

public class ConstantTimeExample {

	public static void main(String[] args) {
		//Display first elements from array and print
				int [] arr= {10,20,50};
				long startTime=new Date().getTime();
				for(int i=0;i<=0;i++)
					System.out.println("\t\t"+arr[i]);
				long endTime=new Date().getTime();		
				System.out.println(endTime-startTime);
		
		//Add first two elements from array and print
		startTime=new Date().getTime();
		for(int i=0;i<=2;i++)
			System.out.println("\t\t"+arr[i]);
		endTime=new Date().getTime();		
		System.out.println(endTime-startTime);
		
	}

}
