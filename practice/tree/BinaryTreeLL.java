package org.practice.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
	BinaryNode root;
	
	BinaryTreeLL(){
		this.root = null;
	}
	
	void preOrder(BinaryNode node) {
		if(null == node) {
			return;
		}
		System.out.print(node.value + " ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	void inOrder(BinaryNode node) {
		if(null == node) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.value + " ");
		inOrder(node.right);
	}
	
	void postOrder(BinaryNode node) {
		if(null == node) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.value + " ");
	}
	
	void levelOrder() {
		Queue<BinaryNode> que = new LinkedList<>();
		que.add(root);
		while(!que.isEmpty()) {
			BinaryNode presentNode = que.remove();
			System.out.print(presentNode.value + " ");
			if(null != presentNode.left) {
				que.add(presentNode.left);
			}
			if(null != presentNode.right) {
				que.add(presentNode.right);
			}
		}
	}
	
	void search(String value) {
		Queue<BinaryNode> que = new LinkedList<>();
		que.add(root);
		while(!que.isEmpty()) {
			BinaryNode presentNode = que.remove();
			if(value == presentNode.value) {
				System.out.println("The value " + value + " is found in Tree");
				return;
			} else {
				if(null != presentNode.left) {
					que.add(presentNode.left);
				}
				if(null != presentNode.right) {
					que.add(presentNode.right);
				}
			}
		}
		System.out.println("The value " + value + " is not found in Tree");
	}
	
	void insert(String value) {
		BinaryNode newNode = new BinaryNode();
		newNode.value = value;
		
		if(null == root) {
			root = newNode;
			System.out.println("Inserted new node at root level");
			return;
		}
		
		Queue<BinaryNode> que = new LinkedList<>();
		que.add(root);
		while(!que.isEmpty()) {
			BinaryNode presentNode = que.remove();
			if(null == presentNode.left) {
				presentNode.left = newNode;
				System.out.println("Successfully Inserted");
				break;
			} else if(null == presentNode.right) {
				presentNode.right = newNode;
				System.out.println("Successfully Inserted");
				break;
			} else {
				que.add(presentNode.left);
				que.add(presentNode.right);
			}
		}
	}
	
	BinaryNode getDeepestNode() {
		Queue<BinaryNode> que = new LinkedList<>();
		que.add(root);
		BinaryNode presBinaryNode = null;
		while(!que.isEmpty()) {
			presBinaryNode = que.remove();
			if(null != presBinaryNode.left) {
				que.add(presBinaryNode.left);
			}
			if(null != presBinaryNode.right) {
				que.add(presBinaryNode.right);
			}
		}
		
		return presBinaryNode;
	}
	
	void deleteDeepestNode() {
		Queue<BinaryNode> que = new LinkedList<>();
		que.add(root);
		BinaryNode prev, presentBinaryNode = null;
		while(!que.isEmpty()) {
			prev = presentBinaryNode;
			presentBinaryNode = que.remove();
			if(null == presentBinaryNode.left) {
				prev.right = null;
				return;
			} else if(null == presentBinaryNode.right) {
				presentBinaryNode.left = null;
				return;
			}
			que.add(presentBinaryNode.left);
			que.add(presentBinaryNode.right);
		}
	}
	
	void deleteNode(String value) {
		Queue<BinaryNode> que = new LinkedList<>();
		que.add(root);
		while(!que.isEmpty()) {
			BinaryNode presentNode = que.remove();
			if(presentNode.value == value) {
				presentNode.value = getDeepestNode().value;
				deleteDeepestNode();
				System.out.println("Node is delete");
				return;
			} else {
				if(null != presentNode.left) {
					que.add(presentNode.left);
				}
				if(null != presentNode.right) {
					que.add(presentNode.right);
				}
			}
		}
		System.out.println("Node does not exist in this BT");
	}
	
	void deleteBT() {
		root = null;
		System.out.println("BT has successfully deleted");
	}
}
