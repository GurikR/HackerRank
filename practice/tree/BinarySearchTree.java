package org.practice.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	
	BinaryNode root;
	
	BinarySearchTree(){
		root = null;
	}
	
	private BinaryNode insert(BinaryNode currNode, int value) {
		if(currNode == null) {
			BinaryNode newNode = new BinaryNode();
			newNode.val = value;
			//System.out.println("New node successfully inserted");
			return newNode;
		} else if(value <= currNode.val) {
			currNode.left = insert(currNode.left, value);
			return currNode;
		} else {
			currNode.right = insert(currNode.right, value);
			return currNode;
		}
	}

	void insert(int value) {
		root = insert(root, value);
	}
	
	void preOrder(BinaryNode node) {
		if(node == null) {
			return;
		}
		System.out.print(node.val + " ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	void postOrder(BinaryNode node) {
		if(node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.val + " ");
	}
	
	void inOrder(BinaryNode node) {
		if(node == null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.val + " ");
		inOrder(node.right);
	}
	
	void levelOrder() {
		Queue<BinaryNode> que = new LinkedList<>();
		que.add(root);
		while(!que.isEmpty()) {
			BinaryNode presentNode = que.remove();
			System.out.print(presentNode.val + "  ");
			if(presentNode.left != null) {
				que.add(presentNode.left);
			}
			if(presentNode.right != null) {
				que.add(presentNode.right);
			}
		}
	}
	
	void search(int value) {
		Queue<BinaryNode> que = new LinkedList<>();
		que.add(root);
		while(!que.isEmpty()) {
			BinaryNode presBinaryNode = que.remove();
			if(presBinaryNode.val == value) {
				System.out.println("Found the node with value: " + value);
				return;
			} else if(presBinaryNode.left != null && value  < presBinaryNode.val) {
				que.add(presBinaryNode.left);
			} else if(presBinaryNode.right != null){
				que.add(presBinaryNode.right);
			}
		}
		System.out.println("Not found");
	}
	
	BinaryNode search2(BinaryNode node, int value) {
		if(node == null) {
			System.out.println("Not found");
		} else if(node.val == value) {
			System.out.println("Found the node with value + " + value);
			return node;
		} else if(value < node.val) {
			return search2(node.left, value);
		} else {
			return search2(node.right, value);
		}
		return null;
	}
	
	static BinaryNode minNode(BinaryNode root) {
		if(root.left == null) {
			return root;
		}
		return minNode(root.left);
	}
	
	static BinaryNode deleteNode(BinaryNode root, int value) {
		if(root == null) {
			System.out.println("value not found in bst");
			return null;
		}
		
		if(value < root.val) {
			root.left =  deleteNode(root.left, value);
		} else if(value > root.val){
			root.right = deleteNode(root.right, value);
		} else {
			if(root.left != null && root.right != null) {
				BinaryNode  temp = root;
				BinaryNode minNodeFromRightSubTree = minNode(temp.right);
				root.val = minNodeFromRightSubTree.val;
				root.right = deleteNode(root.right, minNodeFromRightSubTree.val);
			} else if(root.left != null) {
				root = root.left;
			} else if(root.right != null) {
				root = root.right;
			} else {
				root = null;
			}
		}
		
		return root;
	}
}
