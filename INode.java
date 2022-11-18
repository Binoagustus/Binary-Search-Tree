package com.binary_tree;

public class INode<K> {
	K key;
	INode<K> left;
	INode<K> right;
	
	public INode(K key) {
		this.key = key;
		right = null;
		left = null;
	}
}
