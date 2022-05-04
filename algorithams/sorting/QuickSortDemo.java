package datastructures.algorithams.sorting;

public class QuickSortDemo {
	
	static void quickSort(int arr[],int start,int end) {
		if(start<end) {
			int pivot=end;
			int parttionIndex = partition(arr, start, pivot, end);
			//divide the list at pivot and run the same for both the halves of list 
			quickSort(arr, start, parttionIndex-1);
			quickSort(arr, parttionIndex+1, end);
		}
	}
	
	static int partition(int arr[],int start,int pivot,int end) {
		
		int pivotValue=arr[pivot];
		int partitionIndex=start;
		
		for(int i=start;i<end;i++) {
			//swap as long as the pivotValue gets its correct position i.e. index
			if(arr[i]<pivotValue) {
				swap(arr,i,partitionIndex);
				partitionIndex++;
			}
		}
		
		swap(arr,end,partitionIndex);
		return partitionIndex;
		
	}
	
	static void swap(int arr[],int firstIndex,int lastIndex) {
		int temp=arr[firstIndex];
		arr[firstIndex]=arr[lastIndex];
		arr[lastIndex]=temp;
	}
	public static void main(String[] args) {
		int arr[]= {99,44,6,2,1,5,63,87,283,4,0};
		
		System.out.println("Before Sort");
		for(int x:arr)
			System.out.print(x+"\t");
		quickSort(arr, 0, arr.length-1);
				
		System.out.println("\nAfter Sort");
		for(int x:arr)
			System.out.print(x+"\t");
		
	}

}
