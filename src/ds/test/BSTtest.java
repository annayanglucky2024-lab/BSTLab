package ds.test;

import ds.bst.BinarySearchTree;

public class BSTtest {

	public static void main(String[] args) {
		BinarySearchTree<Integer>bst = new BinarySearchTree<>();
		
		
		System.out.println(bst);
		
		bst.add(50);
		bst.add(25);
		bst.add(15);
		bst.add(35);
		bst.add(75);
		bst.add(65);
		
		System.out.println(bst);
		
		System.out.println("Add duplicat:" + bst.add(35));
		System.out.println("Add 80:" + bst.add(80));
		
		System.out.println(bst);
		System.out.println(bst.getHeight());


	}

}
