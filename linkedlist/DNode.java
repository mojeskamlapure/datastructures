package datastructures.linkedlist;

public class DNode<E> extends Node<E> {
	Node<E> prev;
	
	public Node<E> getPrev() {
		return prev;
	}

	public void setPrev(Node<E> prev) {
		this.prev = prev;
	}

	public DNode(E value) {
		super(value);
		this.prev=null;
	}

}
