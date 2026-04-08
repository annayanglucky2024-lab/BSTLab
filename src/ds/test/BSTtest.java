package ds.test;

import ds.bst.BinarySearchTree;

public class BSTtest {

	public static void main(String[] args) {
		BinarySearchTree<Integer>bst = new BinarySearchTree<>();
		
		
		bst.add(50);
		bst.add(75);
		bst.add(85);
		
		System.out.println(bst);
		System.out.println(bst.getHeight());
		System.out.println(bst.debugLevelOrderString());
		
	}

}
