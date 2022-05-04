package datastructures.linkedlist;


class SinglyLinkedList<E> {
	Node<E> tail = null;
	Node<E> head = null;
	long length;

	public Node<E> getTail() {
		return tail;
	}

	public void setTail(Node<E> tail) {
		this.tail = tail;
	}

	public Node<E> getHead() {
		return head;
	}

	public void setHead(Node<E> head) {
		this.head = head;
	}

	void preppend(Node<E> node) {
				
		//in case of single node set tail to head first
		if (this.length == 1) {
			this.tail = head;
		}
		
		// point new-node-->next to head 
		node.next = this.head;
		
		// point head to new node
		this.head = node;

		this.length++;
	}

	void append(Node<E> node) {
		// if first node , then point new node to head and tail
		if (this.head == null) {
			this.head = node;
			this.tail = node;
		} else {
			// add new node to tail-->next
			this.tail.next = node;
			// update tail to new node
			this.tail = node;
		}
		this.length++;
	}

	void insert(int index, Node<E> node) {
		Node<E> temp = this.head;
		int i = 0;
		// if insert is at 0th index then its as good as prepend
		if (index == 0) {
			this.preppend(node);
			return;
		}

		// if insert is at index > length of list then its as good as append
		if (index >= this.length + 1) {
			this.append(node);
			return;
		}

		while (temp != null) {
			if (i + 1 == index) {
				// here temp is leader now , so point newnode --> next to leader --> next
				node.next = temp.next;
				// make leader --> next pointing to newnode
				temp.next = node;
				this.length++;
				break;
			} else {
				temp = temp.next;
			}
			i++;
		}

	}
	Node<E> delete(int index) {
		Node<E> temp = this.head;
		Node<E> nodeToDelete = null;
		int i = 0;
		if (index == 0) {
			// capture 0th node as nodeToDelete
			nodeToDelete=temp;
			this.head = temp.next;
			this.length--;
			return nodeToDelete;
		}
		
		while (temp != null) {
			// identify the leader i.e. index-1 as long as index < length of list
			if (index == i + 1 && index<this.length) {
				nodeToDelete = temp.next;
				temp.next = nodeToDelete.next;
				break;
			} else {
				
				//identify if the next node is the tail node
				if(temp.next==this.tail) {
					// in case of invalid index , remove the tail node
					nodeToDelete=this.tail;
					this.tail=temp;
					temp.next=null;
					
				}
				else {					
					temp = temp.next;
				}
			}
			i = i + 1;
		}
		if (this.length == 1) {
			this.tail = this.head;
		}
		this.length--;
		return nodeToDelete;
	}

	void display() {
		Node<E> temp = this.head;
		System.out.println("================"+this.length);
		while (temp != null) {
			System.out.println("" + temp);
			temp = temp.next;
		}
	}

	public void reverse() {
		if(this.length==1) {
			return;
		}
		Node<E> first=this.getHead();
		this.tail=this.getHead();
		Node<E> second=first.getNext();
		while(second!=null) {
			Node<E> temp=second.next;
			second.next=first;
			first=second;
			second=temp;
		}
		this.head.next=null;
		this.head=first;
	}

}

public class ReverseSinglyLinkedListDemo {

	public static void main(String[] args) {
		SinglyLinkedList<String> list = new SinglyLinkedList<String>();
		list.append(new Node<String>("apples"));
		list.append(new Node<String>("grapes"));
		list.display();
		list.preppend(new Node<String>("guava"));
		list.display();
		System.out.println("Deleting from 2 :\t "+list.delete(2)); 
		
		list.display();
		list.reverse();
		list.display();
	}

}
