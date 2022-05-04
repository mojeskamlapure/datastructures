package datastructures.queues;

import datastructures.linkedlist.Node;

class Queue<E>{
	Node<E> head;
	Node<E> tail;
	int length;
	
	public Node<E> getHead() {
		return head;
	}


	public void setHead(Node<E> head) {
		this.head = head;
	}


	public Node<E> getTail() {
		return tail;
	}


	public void setTail(Node<E> tail) {
		this.tail = tail;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	Node<E> peek(){
	return this.getHead();
	}
	
	void enqueue(Node<E> node){
		
		if(this.getHead()==null && this.getTail()==null) {
			this.setHead(node);
			this.setTail(node);
		}else {
		Node<E> temp=this.getTail();
		temp.setNext(node);
		this.setTail(node);
		}
		this.length++;
	}
	
	Node<E> dequeue(){
		Node<E> temp=null;
		if(this.getHead()==this.getTail()) {
			temp=this.getHead();
			this.setHead(null);
			this.setTail(null);
		}else {
		temp=this.getHead();
		this.setHead(temp.getNext());
		}
		this.length--;
		return temp;
	}
	void display(){
		System.out.println("======================");
		Node<E> temp=this.getHead();
		while(temp!=null) {
			System.out.println(temp);
			temp=temp.getNext();
		}
		System.out.println("======================"); 
	}
	
}
public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> que=new Queue<String>();
		que.enqueue(new Node<String>("How"));
		que.enqueue(new Node<String>("Are"));
		que.enqueue(new Node<String>("You"));
		que.display();
		System.out.println(que.dequeue());
		System.out.println(que.dequeue());
		System.out.println(que.dequeue());
		System.out.println(que.dequeue());
	}

}
