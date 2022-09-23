package org.practice.heap;

public class BHeap {
	int[] arr;
	int sizeOfTree;
	
	BHeap(int size){
		this.arr = new int[size+1];
		this.sizeOfTree = 0;
	}
	
	boolean isEmpty() {
		return this.sizeOfTree == 0;
	}
	
	Integer peek() {
		if(isEmpty()) return null;
		return arr[1];
	}
	
	Integer sizeOfBH() {
		return sizeOfTree;
	}
	
	void levelOrder() {
		for(int i = 1 ; i <= sizeOfTree; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
	
	void heapifyBottomUp(int index, String heapType) {
		int parent = index/2;
		
		//no node or root node base case
		if(index <= 1) return;
		
		if(heapType == "Min") {
			if(arr[parent] > arr[index]) swap(arr, parent, index);
		} else {
			if(arr[parent] < arr[index]) swap(arr, parent, index);
		}
		
		heapifyBottomUp(parent, heapType);
	}
	
	void heapifyTopToBottom(int index, String heapType) {
		int left = 2 * index;
		int right = 2*index+1;
		if(sizeOfTree < left) return;
		int swapChild = -1;
		if(heapType == "Max") {
			if(sizeOfTree == left) {
				if(arr[index] < arr[left]) swap(arr, index, left);
				return;
			} else {
				if(arr[left] >  arr[right]) {
					swapChild = arr[left];
				} else {
					swapChild = arr[right];
				}
				
				if(arr[index] < arr[swapChild]) swap(arr, swapChild, index);
			}
		}
		
		if(heapType == "Min") {
			if(sizeOfTree == right) {
				if(arr[index] > arr[left]) swap(arr, index, left);
				return;
			} else {
				if(arr[left] <  arr[right]) {
					swapChild = arr[left];
				} else {
					swapChild = arr[right];
				}
				
				if(arr[index] > arr[swapChild]) swap(arr, swapChild, index);
			}
		}
		
		heapifyTopToBottom(swapChild, heapType);
	}
	
	void swap(int arr[], int m, int n) {
		int temp = arr[m];
		arr[m] = arr[n];
		arr[n] = temp;
	}
	
	void insert(int val, String heapType) {
		arr[sizeOfTree + 1] = val;
		sizeOfTree++;
		heapifyBottomUp(sizeOfTree, heapType);
	}
	
	int extract(String heapType) {
		if(isEmpty()) return -1;
		
		int extractVal = arr[1];
		arr[1] = arr[sizeOfTree];
		sizeOfTree--;
		heapifyTopToBottom(1, heapType);
		return extractVal;
	}
}
