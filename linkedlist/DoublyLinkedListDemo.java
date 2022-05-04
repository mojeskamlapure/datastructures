package datastructures.linkedlist;

class DoublyLinkedList<E> {
	DNode<E> head;
	DNode<E> tail;
	int length=0;

	public DNode<E> getHead() {
		return head;
	}

	public void setHead(DNode<E> head) {
		this.head = head;
	}

	public DNode<E> getTail() {
		return tail;
	}

	public void setTail(DNode<E> tail) {
		this.tail = tail;
	}

	DNode<E> delete(int index) {
		DNode<E> nodeToDelete = null;
		/*
		 * 1. if index ==0 call prepend
		 */
		if (index == 0) {
			nodeToDelete = this.getHead();
			DNode<E> newHead = (DNode<E>) nodeToDelete.next;
			newHead.prev = null;
			this.setHead(newHead);
		}

		/*
		 * 2. if index > list.length call append
		 * 
		 */
		else if (index + 1 >= this.length) {
			nodeToDelete = this.getTail();
			DNode<E> newTail = (DNode<E>) nodeToDelete.prev;
			newTail.next = null;
			this.setTail(newTail);
		} else {

			/*
			 * 3. if index is between 1 and list.length
			 * 
			 */
			int i = 0;
			/*
			 * 3.1 initialize temp ref with head
			 * 
			 */
			DNode<E> temp = this.getHead();

			while (temp != null) {
				/*
				 * 3.2 identify the leader
				 */
				if (index == i + 1 && index <= this.length) {
					/*
					 * 3.3 update prev to leader and next pointer to leader next
					 */

					nodeToDelete = (DNode<E>) temp.next;
					nodeToDelete.prev = temp;
					temp.next = nodeToDelete.next;
					break;
				} else {
					if (temp.next == this.getTail()) {
						nodeToDelete = this.getTail();
						this.setTail(temp);
						temp.next = null;
					} else {
						temp = (DNode<E>) temp.next;
					}
				}
			}

		}
		this.length--;
		return nodeToDelete;
	}

	void insert(int index, DNode<E> node) {

		/*
		 * 1. if index ==0 call prepend
		 * 
		 */
		if (index == 0) {
			this.prepend(node);
			return;
		}
		/*
		 * 2. if index > list.length call append
		 * 
		 */
		if (index > this.length - 1) {
			this.append(node);
			return;
		}

		/*
		 * 3. if index is between 0 and list.length
		 */

		DNode<E> temp = null;

		if ((this.length - index) < index) {
			int counterFromTail = this.length - index;
			/*
			 * 3.1 initialize temp ref with tail
			 */
			temp = this.getTail();
			int i = 0;
			/* 3.2 identify the leader */
			while (temp != null && (i + 1) <= counterFromTail) {
				temp = (DNode<E>) temp.prev;
				counterFromTail--;
			}

		} else {
			int counterFromHead = index;
			/*
			 * 3.1 initialize temp ref with head
			 */
			temp = this.getHead();
			int i = 0;

			/* 3.2 identify the follower */
			while (temp != null && (i + 1) <= counterFromHead) {
				temp = (DNode<E>) temp.next;
				counterFromHead--;
			}

		}
		
		/* 3.3. update node prev to leader */
		node.prev = temp;

		/* 3.4 node next pointer to leader next */
		node.next = temp.next;
		/* 3.5 leader next to node */
		temp.next = node;

	}

	void append(DNode<E> node) {

		/*
		 * 1. verify head and tail
		 */
		if (this.getHead() == null) {
			this.setHead(node);
			this.setTail(node);
		}
		
		/*
		 * 2. initialize temp ref with tail
		 */
		DNode<E> temp = this.getTail();

		/*
		 * 3. update tail next to new node
		 * 
		 */
		temp.next = node;
		/*
		 * 4. update node prev to current tail pointer
		 */
		node.prev = temp;

		/*
		 * 5. update the tail
		 * 
		 */
		this.setTail(node);
		
		this.length++;
	}

	void prepend(DNode<E> node) {
		/*
		 * 1. initialize temp ref with head
		 */
		DNode<E> temp = this.getHead();

		/*
		 * 2. update node prev to null and next pointer to current head
		 * 
		 */
		node.next = temp;
		temp.prev=node;

		/*
		 * 3. update the head pointer pointing to new node
		 * 
		 */
		this.setHead(node);
		
		this.length++;
	}

	void displayFromHead() {
		/*
		 * 1. initialize temp ref with head
		 */
		DNode<E> temp = this.getHead();

		/*
		 * 2. display value and traverse forward
		 * 
		 */
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
		while (temp != null) {
			System.out.println(temp);
			temp = (DNode<E>) temp.next;
		}
	}

	void displayFromTail() {
		/*
		 * 1. initialize temp ref with tail
		 */
		DNode<E> temp = this.getTail();

		/*
		 * 2. display value and traverse backward
		 * 
		 */
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<");
		while (temp != null) {
			System.out.println(temp);
			temp = (DNode<E>) temp.prev;
		}
	}
}

public class DoublyLinkedListDemo {

	public static void main(String[] args) {
		DoublyLinkedList<String> dList = new DoublyLinkedList<String>();

		dList.append(new DNode<String>("A"));
		dList.append(new DNode<String>("B"));
		dList.prepend(new DNode<String>("="));
		dList.append(new DNode<String>("C"));
		dList.append(new DNode<String>("D"));
		
		dList.displayFromHead();
		//dList.displayFromTail();
		System.out.println("Deleting from index 0 "+dList.delete(0));
		dList.displayFromHead();
		System.out.println("Deleting from index 1 "+dList.delete(1));
		dList.displayFromHead();
	//	System.out.println("Deleting from index 3 "+dList.delete(3));
	//	dList.displayFromHead();
		dList.insert(2, new DNode<String>("E"));
		dList.displayFromHead();

	}

}
