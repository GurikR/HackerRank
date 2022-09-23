package org.practice.heap;

public class BinaryHeap {

	int arr[];
	int sizeOfTree;
	
	BinaryHeap(int size){
		arr = new int[size + 1];
		this.sizeOfTree = 0;
		System.out.println("Binary Heap has been created");
	}
	
	boolean isEmpty() {
		return this.sizeOfTree == 0;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Binary Heap is empty");
			return Integer.MIN_VALUE;
		}
		return arr[1];
	}
	
	public int sizeOfBH() {
		return sizeOfTree;
	}
	
	void levelOrder() {
		for(int i = 1; i <= sizeOfTree; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println("\n");
	}
	
	void heapifyBottomToTop(int index, String heapType) {
		int parent = index/2;
		if(index <= 1) {
			return;
		}
		if(heapType == "Min") {
			if(arr[index] < arr[parent]) {
				int tmp = arr[index];
				arr[index] = arr[parent];
				arr[parent] = tmp;
			}
		} else if(heapType == "Max") {
			if(arr[index] > arr[parent]) {
				int tmp = arr[index];
				arr[index] = arr[parent];
				arr[parent] = tmp;
			}
		}
		heapifyBottomToTop(parent, heapType);
	}
	
	void insert(int value, String heapType) {
		arr[sizeOfTree + 1]=value;
		sizeOfTree++;
		heapifyBottomToTop(sizeOfTree, heapType);
		System.out.println(value + " has been successfully inserted");
	}
	
	void heapifyTopToBotton(int index, String heapType) {
		int left = index * 2;
		int right = index * 2 + 1;
		int swapChild = -1;
		if(sizeOfTree < left) {
			return;
		}
		if(heapType == "Max") {
			if(sizeOfTree == left) {
				if(arr[index] < arr[left]) {
					int tmp = arr[index];
					arr[index] = arr[left];
					arr[left] = tmp;
				}
				return;
			} else {
				if(arr[left] > arr[right]) {
					swapChild = left;
				} else {
					swapChild = right;
				}
				
				if(arr[index] < arr[swapChild]) {
					int tmp = arr[index];
					arr[index]=arr[swapChild];
					arr[swapChild]=tmp;
				}
			}
		} else if(heapType == "Min") {
			if(sizeOfTree == left) {
				if(arr[index] > arr[left]) {
					int tmp = arr[index];
					arr[index] = arr[left];
					arr[left] = tmp;
				}
				return;
			} else {
				if(arr[left] < arr[right]) {
					swapChild = left;
				} else {
					swapChild = right;
				}
				
				if(arr[index] > arr[swapChild]) {
					int tmp = arr[index];
					arr[index]=arr[swapChild];
					arr[swapChild]=tmp;
				}
			}
		}
		heapifyTopToBotton(swapChild, heapType);
	}
	
	int extractHeadOfHeap(String heapType) {
		if(isEmpty()) {
			return -1;
		} else {
			int extractVal = arr[1];
			arr[1] = arr[sizeOfTree];
			sizeOfTree--;
			heapifyTopToBotton(1, heapType);
			return extractVal;
		}
	}
}
