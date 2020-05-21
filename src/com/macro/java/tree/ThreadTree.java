package com.macro.java.tree;

public class ThreadTree {
	private Node root;
	private int size;
	private Node pre = null;

	public ThreadTree(Integer[] datas) {
		this.pre = null;
		this.size = datas.length;
		this.root = createTree(datas, 1);

	}

	private Node createTree(Integer[] datas, int index) {
		if (index > datas.length) {
			return null;
		}
		Node node = new Node(datas[index - 1]);
		Node left = createTree(datas, 2 * index);
		Node right = createTree(datas, 2 * index + 1);
		node.setLeft(left);
		node.setRight(right);
		return node;
	}

	/**
	 * 将以root为根节点的二叉树线索化
	 * 
	 */
	public void inThread(Node root) {
		if (root == null) {
			return;
		}
		inThread(root.getLeft());// 线索化左孩子
		if (null == root.getLeft()) {// 左孩子为空
			root.setLeftIsThread(true);// 将左孩子设置为线索
			root.setLeft(pre);
		}
		if (pre != null && null == pre.getRight()) { // 右孩子为空
			pre.setRightIsThread(true);
			pre.setRight(root);
		}
		pre = root;
		inThread(root.getRight());// 线索化右孩子
	}
	 /** 
     * 中序遍历线索二叉树 
     *  
     */  
	public void inThreadList(Node root) {
		if (root == null) {
			return;
		}
		while (!root.getLeftIsThread()) {// 如果左孩子不是线索
			root = root.getLeft();
		}
		do {
			System.out.println(root.getData() + ",");
			if (root.getRightIsThread()) {// 如果右孩子是线索
				root = root.getRight();
			} else {
				root = root.getRight();
				while (root != null && !root.getLeftIsThread()) {
					root = root.getLeft();

				}
			}
		} while (root != null);
	}

}
