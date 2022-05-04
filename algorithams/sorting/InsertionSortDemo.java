package datastructures.algorithams.sorting;

public class InsertionSortDemo {

	public static void main(String[] args) {
		int arr[]= {99,44,6,2,1,5,63,87,283,4,0};
		
		System.out.println("Before Sort");
		for(int x:arr)
			System.out.print(x+"\t");
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					//break;
				}
			}
			
			System.out.println("\nAfter Iteration:"+i);
			for(int x:arr)
				System.out.print(x+"\t");
				
		}
		
		System.out.println("\nAfter Sort");
		for(int x:arr)
			System.out.print(x+"\t");
		
	}

}
