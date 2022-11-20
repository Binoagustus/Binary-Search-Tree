package com.binary_tree;

public class BSTOperations<K extends Comparable<K>> {
	INode<K> root;

	public INode<K> add(K value) {
		root = addRecursive(root, value);
		System.out.println("root returned is " + root.key);
		System.out.println("");
		return root;
	}

	public INode<K> addRecursive(INode<K> current, K key) {
		if (current == null) {
			current = new INode<K>(key);
			System.out.println("Node " + key + " created ");
			return current;
		}
		if (key.compareTo(current.key) < 0) {
			current.left = addRecursive(current.left, key);
			System.out.println(key + " is assigned left of " + current.key);

		} else if (key.compareTo(current.key) > 0) {
			current.right = addRecursive(current.right, key);
			System.out.println(key + " is assigned right of " + current.key);

		} else {
			return current;
		}
		return current;
	}
}
