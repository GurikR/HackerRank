package org.practice.tree.array;

public class TreeMain {

	public static void main(String[] args) {
		//bTree();
		bTree1();
	}
	
	static void bTree() {
		BinaryTree bt = new BinaryTree(6);
		bt.insert("N1");
		bt.insert("N2");
		bt.insert("N3");
		bt.insert("N4");
		bt.insert("N5");
		bt.insert("N6");
		//bt.preOrder(1);
		bt.levelOrder();
		System.out.println();
		bt.delete("N3");
		bt.levelOrder();
	}
	
	static void bTree1() {
		BTree bt = new BTree(6);
		bt.insert("N1");
		bt.insert("N2");
		bt.insert("N3");
		bt.insert("N4");
		bt.insert("N5");
		bt.insert("N6");
		
		//bt.preOrder(1);
		//bt.inOrder(1);
		//bt.postOrder(1);
		bt.levelOrder();
		System.out.println();
		bt.delete("N2");
		bt.levelOrder();
	}
}
