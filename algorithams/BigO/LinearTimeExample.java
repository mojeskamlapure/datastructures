package datastructures.algorithams.BigO;

import java.util.Date;

public class LinearTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int find=0;
		long startTime=new Date().getTime();
		for(int i=0;i<1;i++) {
			if(i==find)
				System.out.println("found");
		}
		long endTime=new Date().getTime();
		
		System.out.println(endTime-startTime);
		
		
		find=500;
		startTime=new Date().getTime();
		for(int i=0;i<10000000;i++) {
			if(i==find)
				System.out.println("found");
		}
		endTime=new Date().getTime();		
		System.out.println(endTime-startTime);
		
	}

}
