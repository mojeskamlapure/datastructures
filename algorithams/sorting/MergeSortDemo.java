package datastructures.algorithams.sorting;


public class MergeSortDemo {

	 static void mergeSort(int[] arr,int start,int end) {
		if(start<end) {
			int middle=start+(int) Math.floor((end-start)/2);
			
			mergeSort(arr,start,middle);
			mergeSort(arr,middle+1,end);
			
			merge(arr,start,middle,end);
			
			
		}
			
	}
	
	 static void merge(int[] arr, int start, int middle, int end) {
		int n1 = middle - start + 1;
		int n2 = end - middle;

		int left[] = new int[n1];
		int right[] = new int[n2];
		System.out.println("\n===========================");
		System.out.println("\nleft:");
		for (int i = 0; i < n1; i++) {
			left[i] = arr[start + i];
			System.out.print(left[i]+"\t");
		}
		
		System.out.println("\nright:");
		for (int i = 0; i < n2; i++) {
			right[i] = arr[middle + 1 + i];
			System.out.print(right[i]+"\t");
		}

		System.out.println("\n===========================");
		int i = 0, j = 0;
		int k = start;

		while (i < n1 && j < n2) {
			if (left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
			
			
		}

		while (i < n1) {
			arr[k] = left[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = right[j];
			j++;
			k++;
		}

	}	
	
	public static void main(String[] args) {
		int arr[]= {99,44,6,2,1,5,63,87,283,4,0};
		
		System.out.println("Before Sort");
		for(int x:arr)
			System.out.print(x+"\t");
		mergeSort(arr, 0, arr.length-1);
				
		System.out.println("\nAfter Sort");
		for(int x:arr)
			System.out.print(x+"\t");
		
	}

}
