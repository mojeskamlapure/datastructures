package datastructures.arrays;

import java.util.Arrays;

public class MergeSortDemo {
	static int[] mergeSort(int[] arr1,int arr2[]) {
		int i=0,j=0;
		int len=arr1.length;
		int len2=arr2.length;
		int sortedArray[]=new int[len+len2];
		int k=0;
		
		/*
		 int itemFromArr1=arr1[i];
		 int itemFromArr2=arr2[j];
		 while(itemFromArr1!=itemFromArr2) {
			System.out.println(itemFromArr1 + "\t"+itemFromArr2);
			if (i < arr1.length && itemFromArr1 < itemFromArr2) {
				sortedArray[k++] = itemFromArr1;
				if (i + 1 < arr1.length) {
					itemFromArr1 = arr1[++i];
				}
				else
					++i;
			} else {
				if (j < arr2.length) {
					sortedArray[k++] = itemFromArr2;
					if (j + 1 < arr2.length) {
						itemFromArr2 = arr2[++j];
					}
					else
						++j;
				}
			}
			
			if(i==arr1.length && j==arr2.length) {
				break;
			}
			System.out.println(Arrays.toString(sortedArray));
		}*/
		
		while(i<arr1.length&&j<arr2.length) {
			if (arr1[i] < arr2[j]) {
				sortedArray[k++] = arr1[i++];
			}else {
				sortedArray[k++] = arr2[j++];
			}
		}
		while(i<arr1.length) {
			sortedArray[k++] = arr1[i++];
		}
		
		while(j<arr2.length) {
			sortedArray[k++] = arr2[j++];
		}
		System.out.println(Arrays.toString(sortedArray));
		return sortedArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1= {1,3,5,7};
		int [] arr2= {2,12,14,16,18};
		System.out.println(mergeSort(arr1, arr2));
		
		System.out.println(mergeSort(arr1, new int[] {}));
		
		
		
	}

}
