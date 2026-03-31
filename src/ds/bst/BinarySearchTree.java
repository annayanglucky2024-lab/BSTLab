package ds.bst;

public class BinarySearchTree <T extends Comparable<? super T>> {
	
	private class Node {
		private Node leftChild, rightChild;
		private T data;
		
		
		public Node(T data) {
			this.data = data;
		}
	}

}
