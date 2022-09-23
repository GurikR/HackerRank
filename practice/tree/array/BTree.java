package org.practice.tree.array;

public class BTree {

	String[] arr;
	int lastUsedIndex;
	
	BTree(int size){
		arr = new String[size+1];
		lastUsedIndex = 0;
	}
	
	boolean isFull(){
		return lastUsedIndex == arr.length;
	}
	
	void insert(String value) {
		if(!isFull()) {
			arr[lastUsedIndex+1] = value;
			lastUsedIndex++;
		}
	}
	
	void preOrder(int index) {
		if(index > lastUsedIndex) return;
		
		System.out.print(arr[index] + "  ");
		preOrder(2*index);
		preOrder(2*index+1);
	}
	
	void inOrder(int index) {
		if(index > lastUsedIndex) return;
		
		inOrder(2*index);
		System.out.print(arr[index] + "  ");
		inOrder(2*index+1);
	}
	
	void postOrder(int index) {
		if(index > lastUsedIndex) return;
		
		postOrder(2*index);
		postOrder(2*index+1);
		System.out.print(arr[index] + "  ");
	}
	
	void levelOrder() {
		for(int i = 1 ; i <= lastUsedIndex; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	int search(String value) {
		for(int i = 1 ; i <= lastUsedIndex; i++) {
			if(value == arr[i]) return i;
		}
		
		return -1;
	}
	
	void delete(String value) {
		int idx = search(value);
		if(idx != -1) {
			arr[idx] = arr[lastUsedIndex];
			lastUsedIndex--;
		}
	}
}
