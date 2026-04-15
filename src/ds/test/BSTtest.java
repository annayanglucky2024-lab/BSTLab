package ds.test;

import ds.bst.BinarySearchTree;

public class BSTtest {

	public static void main(String[] args) {
		BinarySearchTree<Integer>bst = new BinarySearchTree<>();
		

		System.out.println(bst.getHeight());
		for(int i = 0; i < 1024; i++) {
			bst.add(i + 1);
			System.out.println(bst.getHeight());
		}
		
		
		
		System.out.println(bst);
		System.out.println(bst.getHeight());
	}

}
