package datastructures.algorithams.sorting;

public class SelectionSortDemo {

	public static void main(String[] args) {
		int arr[]= {99,44,6,2,1,5,63,87,283,4,0};
		
		System.out.println("Before Sort");
		for(int x:arr)
			System.out.print(x+"\t");
		
		for(int i=0;i<arr.length;i++) {
			int min=i;
			int temp=arr[min];
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
			System.out.println("\nAfter Iteration:"+i);
			for(int x:arr)
				System.out.print(x+"\t");
				
		}
		
		System.out.println("\nAfter Sort");
		for(int x:arr)
			System.out.print(x+"\t");
		
	}

}
