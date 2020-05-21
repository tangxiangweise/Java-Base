package com.macro.java;

public class BinaryTree {

	private class Node {
		Object data;
		Node lchild, rchild;
	}
	
	public void preOrderTraverse(BinaryTree tree,int level) {
		
		if (tree !=null) {
			visit(tree,level);
		}
	}

	private void visit(BinaryTree tree, int level) {
		
	}
}
