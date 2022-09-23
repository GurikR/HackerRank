package org.practice.heap;

public class TMain {

	public static void main(String[] args) {
		//binaryHeap1();
		binaryHeap2("Min");
		binaryHeap2("Max");
	}
	
	static void binaryHeap1(String heapType) {
		BinaryHeap bh = new BinaryHeap(5);
		bh.insert(10, heapType);
		bh.insert(5, heapType);
		bh.insert(15, heapType);
		bh.insert(1, heapType);
		//bh.peek();
		bh.levelOrder();
	}
	
	static void binaryHeap2(String heapType) {
		BHeap bh = new BHeap(5);
		bh.insert(10, heapType);
		bh.insert(5, heapType);
		bh.insert(15, heapType);
		bh.insert(1, heapType);
		//bh.peek();
		bh.levelOrder();
	}
}
