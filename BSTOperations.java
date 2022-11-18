package com.binary_tree;

public class BSTOperations<K extends Comparable<K>>{
	INode<K> root;

	public void add(K value) {
		if (root == null) {
			root = new INode<K>(value);
			System.out.println("root value is " + value);
		}

		if (value.compareTo(root.key) < 0) {
			root.left = new INode<K>(value);
			System.out.println("left " + value);
			
		} else if (value.compareTo(root.key) > 0) {
			root.right = new INode<K>(value);
			System.out.println("right " + value);
		}

	}
}
