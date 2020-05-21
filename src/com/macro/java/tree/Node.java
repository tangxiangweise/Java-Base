package com.macro.java.tree;

public class Node {

	private Integer data;
	private Node left;
	private Boolean leftIsThread;
	private Node right;
	private Boolean rightIsThread;

	public Node(Integer data) {
		this.data = data;
		this.left = null;
		this.leftIsThread = false;
		this.rightIsThread = false;
		this.right = null;
	}

	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Boolean getLeftIsThread() {
		return leftIsThread;
	}

	public void setLeftIsThread(Boolean leftIsThread) {
		this.leftIsThread = leftIsThread;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public Boolean getRightIsThread() {
		return rightIsThread;
	}

	public void setRightIsThread(Boolean rightIsThread) {
		this.rightIsThread = rightIsThread;
	}

}
