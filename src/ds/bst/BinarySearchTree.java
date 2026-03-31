package ds.bst;

public class BinarySearchTree <T extends Comparable<? super T>> {
	
	private Node root;
	private int size;
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	private class Node {
		private Node leftChild, rightChild;
		private T data;
		
		
		public Node(T data) {
			this.data = data;
		}
	}

}
