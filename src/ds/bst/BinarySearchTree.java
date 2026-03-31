package ds.bst;

import java.util.LinkedList;
import java.util.Queue;

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
			
			int result = newData.compareTo(parent.data);
			
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
	
	public int getHeight() {
		return getHeight(root);
	}
	
	private int getHeight(Node current) {
		if(current == null) {
			return -1;
		}
		return Math.max(getHeight(current.leftChild), getHeight(current.rightChild)) +1;
	}
	@Override
	public String toString() {		
		return inOrderString();
	}
	
	public String inOrderString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		if(!isEmpty()) {
			inOrderString(root, sb);
		}
		sb.append("}");		
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
	
	public String debugLevelOrderString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(" DEBUG {");
		
		if(!isEmpty()) {
			debugLevelOrderString(sb);
		}
		
		sb.append("}");
		
		return sb.toString();
	}
	
	private void debugLevelOrderString(StringBuilder sb) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		
		String repr = "(LC: %s | My: %s |RC: %s)";
		while(!q.isEmpty()) {
			Node current = q.remove();
			String leftChildData = current.leftChild == null ? "" : current.leftChild.data.toString();
			String rightChildData = current.rightChild == null ? "" : current.rightChild.data.toString();
			String nodeData = String.format(repr, leftChildData, current.data, rightChildData);
			sb.append(nodeData);
			
			if(current.leftChild != null) {
				q.add(current.leftChild);
			}
			
			if(current.rightChild != null) {
				q.add(current.rightChild);
			}
			
			if(!q.isEmpty()) {
				sb.append(" , ");
			}
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
