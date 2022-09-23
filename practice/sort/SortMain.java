package org.practice.sort;

public class SortMain {

	public static void main(String[] args) {
		//bubbleSort();
		selectionSort();
	}
	
	static void bubbleSort() {
		BubbleSort bs = new BubbleSort();
		int[] arr = {10, 5, 30, 15, 50, 6};
		bs.sort(arr);
		bs.print(arr);
	}
	
	static void selectionSort() {
		SelectionSort ss = new SelectionSort();
		int[] arr = {10, 5, 30, 15, 50, 6};
		ss.sort(arr);
	}
}
