package datastructures.stacks;

import datastructures.linkedlist.Node;

class Stack<E>{
	Node<E> top;
	Node<E> bottom;
	int length;
	public Node<E> getTop() {
		return top;
	}
	public void setTop(Node<E> top) {
		this.top = top;
	}
	public Node<E> getBottom() {
		return bottom;
	}
	public void setBottom(Node<E> bottom) {
		this.bottom = bottom;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	Node<E> peek (){
		return this.getTop();
	}
	Node<E> pop(){
		Node<E> temp=this.getTop();
		if(this.getTop()==this.getBottom()) {
			this.setBottom(null);
			this.setTop(null);
		}else {
			this.setTop(temp.getNext());	
		}
		this.length--;
		return temp;
	}
	
	void push(Node<E> node) {
		if (this.getTop() == null && this.getBottom() == null) {
			this.setBottom(node);
			this.setTop(node);
		} else {
			Node<E> temp = this.getTop();			
			this.setTop(node);
			this.getTop().setNext(temp);
		}
		
		this.length++;
	}
	
	void display() {
		Node<E> temp=this.getTop();
		while(temp!=null) {
			System.out.println(temp);
			temp=temp.getNext();
		}
	}
}
public class StacksDemo {

	public static void main(String[] args) {
		Stack<String> stacks=new Stack<String>();
		stacks.push(new Node<String>("How"));
		stacks.push(new Node<String>("Are"));
		stacks.push(new Node<String>("You"));
		stacks.display();
		//System.out.println("peek :\t"+stacks.peek());
		System.out.println("Removed :\t"+stacks.pop());
		//System.out.println("peek :\t"+stacks.peek());
		System.out.println("Removed :\t"+stacks.pop());
		System.out.println("Removed :\t"+stacks.pop());
		System.out.println("Removed :\t"+stacks.pop());
	}

}
