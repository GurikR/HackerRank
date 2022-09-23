package org.practice.tree.array;

public class BinaryTree {

	String[] arr;
	int lastUsedIndex;
	
	BinaryTree(int size){
		arr = new String[size+1];
		lastUsedIndex = 0;
	}
	
	boolean isFull(){
		return arr.length == lastUsedIndex;
	}
	
	void insert(String value) {
		if(!isFull()) {
			arr[lastUsedIndex+1] = value;
			lastUsedIndex++;
		}
	}
	
	void preOrder(int index) {
		if(index > lastUsedIndex) {
			return;
		}
		System.out.print(arr[index] + "  ");
		preOrder(2*index);
		preOrder(2*index + 1);
	}
	
	void levelOrder() {
		for(int i = 1 ; i <= lastUsedIndex; i++) {
			System.out.print(arr[i] + "  ");
		}
	}
	
	int search(String value) {
		for(int i = 1 ; i <= lastUsedIndex; i++) {
			if(value == arr[i]) {
				return i;
			}
		}
		return -1;
	}
	
	void delete(String value) {
		int index = search(value);
		if(-1 == index) {
			return;
		} else {
			arr[index] = arr[lastUsedIndex];
			lastUsedIndex--;
		}
	}
}
