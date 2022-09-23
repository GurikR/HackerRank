package org.practice.sort;

public class SelectionSort {

	void print(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	void sort(int[] arr) {
		for(int i = 0 ;i < arr.length; i++) {
			int j = i;
			
			for(int k = i+1; k < arr.length; k++) {
				if(arr[k] < arr[j]) {
					j = k;
				}
			}
			
			if(j != i) {
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp; 
			}
		}
		print(arr);
	}
}
