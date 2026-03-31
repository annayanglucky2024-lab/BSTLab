package ds.bst;

public class BinarySearchTree <T extends Comparable<? super T>> {
	
	private Node root;
	private int size;
	
	public boolean add(T newData) {
		boolean wasAdded = false;
		if(isEmpty()) {
			root = new Node(newData);
			size +=1;
			return true;
		}else {
			wasAdded = add(null, root, newData);
		}
		return wasAdded;
	}
	
	private boolean add(Node parent, Node current, T newData) {
		if(current == null) {
			
			int result = newData.compareTo(current.data);
			
			if(result < 0) {
				parent.leftChild = new Node(newData);
			}else {
				parent.rightChild = new Node(newData);	
			}
			
			return true;
		}else if(newData.compareTo(current.data) < 0) {
			return add(current, current.leftChild, newData);
		}else if(newData.compareTo(current.data) > 0) {
			return add(current, current.rightChild, newData);
		}else {
		return false;
		}
	}
		
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void clear() {
		root = null;
		size = 0;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{ ");
		if(isEmpty()) {
			inOrderString(root, sb);
		}
		sb.append("} ");		
		return sb.toString();
	}
	
	public String inOrderString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{ ");
		if(isEmpty()) {
			inOrderString(root, sb);
		}
		sb.append("} ");		
		return sb.toString();
	}
	
	private void inOrderString(Node current, StringBuilder sb) {
		if(current != null) {
			inOrderString(current.leftChild, sb);
			if(current.leftChild != null) {
				sb.append(", ");
			}
			
			sb.append(current.data);
			
			if(current.rightChild != null) {
				sb.append(", ");
			}
			inOrderString(current.rightChild,sb);
		}
	}
	
	private class Node {
		private Node leftChild, rightChild;
		private T data;
		
		
		public Node(T data) {
			this.data = data;
		}
	}

}
