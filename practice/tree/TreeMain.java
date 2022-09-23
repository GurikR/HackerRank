package org.practice.tree;

public class TreeMain {

	public static void main(String[] args) {
		b1Tree();
//		b2Tree();
//		b3Tree();
//		b4Tree();
	}
	
	static void b1Tree() {
		TreeNode drinks = new TreeNode("Drinks");
		
		TreeNode hot = new TreeNode("Hot");
		drinks.addChild(hot);
		TreeNode cold = new TreeNode("Cold");
		drinks.addChild(cold);
		
		TreeNode tea = new TreeNode("Drinks");
		TreeNode cofee = new TreeNode("Hot");
		hot.addChild(tea);
		hot.addChild(cofee);
		
		TreeNode wine = new TreeNode("Cold");
		TreeNode beer = new TreeNode("Cold");
		cold.addChild(wine);
		cold.addChild(beer);
		
		System.out.println(drinks.print(0)); 
	}
	
	static void b2Tree() {
		BinaryTreeLL bt = new BinaryTreeLL();
		BinaryNode n1 = new BinaryNode();
		n1.value = "n1";
		BinaryNode n2 = new BinaryNode();
		n2.value = "n2";
		BinaryNode n3 = new BinaryNode();
		n3.value = "n3";
		BinaryNode n4 = new BinaryNode();
		n4.value = "n4";
		BinaryNode n5 = new BinaryNode();
		n5.value = "n5";
		BinaryNode n6 = new BinaryNode();
		n6.value = "n6";
		BinaryNode n7 = new BinaryNode();
		n7.value = "n7";
		BinaryNode n8 = new BinaryNode();
		n8.value = "n8";
		BinaryNode n9 = new BinaryNode();
		n9.value = "n9";
		
		n1.left = n2;
		n1.right = n3;
		
		n3.left = n6;
		n3.right = n7;

		n2.left = n4;
		n2.right = n5;
		
		n4.left = n8;
		n4.right = n9;
		bt.root = n1;
		
		bt.preOrder(bt.root);
		bt.inOrder(bt.root);
		bt.postOrder(bt.root);
		bt.levelOrder();
		
		bt.search("n5");
	}
	
	static void b3Tree() {
		BinaryTreeLL nbt = new BinaryTreeLL();
		nbt.insert("n1");
		nbt.insert("n2");
		nbt.insert("n3");
		nbt.insert("n4");
		nbt.insert("n5");
		nbt.insert("n6");
		nbt.levelOrder();
	}

	
	static void b4Tree() {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(70);
		bst.insert(50);
		bst.insert(90);
		bst.insert(30);
		bst.insert(60);
		bst.insert(80);
		bst.insert(100);
		bst.insert(20);
		bst.insert(40);
		
		//bst.preOrder(bst.root);
		//bst.postOrder(bst.root);
		//bst.inOrder(bst.root);
		//bst.levelOrder();
		//bst.search(31);
		//bst.search2(bst.root, 34);
		
		bst.levelOrder();
		BinarySearchTree.deleteNode(bst.root, 90);
		System.out.println();
		bst.levelOrder();
	}
}
