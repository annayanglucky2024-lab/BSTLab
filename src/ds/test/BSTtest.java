package ds.test;

import ds.bst.BinarySearchTree;

public class BSTtest {

	public static void main(String[] args) {
		BinarySearchTree<Integer>bst = new BinarySearchTree<>();
		
		
		System.out.println(bst);  
		bst.add(50);
		bst.add(25);
		bst.add(75);
		bst.add(55);
		
		System.out.println(bst);   
		System.out.println(bst.remove(50)); 
		System.out.println(bst);  
		System.out.println(bst.debugLevelOrderString());
		System.out.println(bst.remove(100)); 



	}

}
