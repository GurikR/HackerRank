package org.practice.tree;

import java.util.ArrayList;
import java.util.Collections;

public class TreeNode {

	private String data;
	
	private ArrayList<TreeNode> childern;
	
	TreeNode(String data){
		this.data = data;
		this.childern = new ArrayList<>();
	}
	
	public void addChild(TreeNode node) {
		this.childern.add(node);
	}
	
	public String print(int level) {
		String ret = null;
		ret = String.join(" ", Collections.nCopies(level, " ")) + data + "\n";
		for(TreeNode node: this.childern) {
			ret += node.print(level + 1);
		}
		return ret;
	}
}
