package ds.test;

import ds.bst.BinarySearchTree;

public class BSTtest {

	public static void main(String[] args) {
		BinarySearchTree<Integer>bst = new BinarySearchTree<>();
		
		
		System.out.println(bst);  
		
		bst.add(50);
		bst.add(25);
		bst.add(75);
		bst.add(65);
		bst.add(67);
		
		System.out.println(bst);
		System.out.println(bst.getHeight());  
		bst.remove(25);
		System.out.println(bst.getHeight());  
		System.out.println(bst);
		System.out.println(bst.debugLevelOrderString());
	
	}

}
