package org.practice.sort;

public class BubbleSort {

	void sort(int arr[]) {
		int n = arr.length;
		for(int i = 0 ; i < n-1; i++) {
			for(int j = 0 ; j < n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp; 
				}
			}
		}
	}
	
	void print(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
