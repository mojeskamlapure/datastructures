package datastructures.stacks;

import datastructures.linkedlist.Node;

class QueueUsingStackEnqueueCostly<E>{
	Stack<E> st1=new Stack<E>();
	Stack<E> st2=new Stack<E>();
	
	void enqueue(Node<E> node) {
		while(st1.getLength()>0) {
			st2.push(st1.pop());
		}
		st1.push(node);
		
		while(st2.getLength()>0) {
			st1.push(st2.pop());
		}
	}
	
   Node<E> dequeue() {
	   Node<E> temp=null;
	   if(st1.getLength()<0)
		return temp;
	   else
		   temp=st1.pop();
	   return temp;
	}
   
   Node<E> peek() {
	   Node<E> temp=null;
	   if(st1.getLength()<0)
		return temp;
	   else
		   temp=st1.peek();
	   return temp;
   }
   
   void display(){
	  st1.display(); 
   }
	
}

class QueueUsingStackDequeueCostly<E>{
	Stack<E> st1=new Stack<E>();
	Stack<E> st2=new Stack<E>();
	
	void enqueue(Node<E> node) {st1.push(node);}
	
   Node<E> dequeue() {
	   Node<E> temp=null;
	   if(st1.getLength()<0)
		return temp;
	   else {
		   if(st2.getLength()<0)
		   while(st1.getLength()>0) {
			   st2.push(st1.pop());
		   }
	   }
	   temp=st2.pop();
	   return temp;
	}
   
   Node<E> peek() {
	   Node<E> temp=null;
	   if(st2.getLength()<0)
		return temp;
	   else
		   temp=st2.peek();
	   return temp;
   }
	
}

class QueueUsingStackRecursion<E>{
	Stack<E> st1=new Stack<E>();
	
	void enqueue(Node<E> node) {st1.push(node);}
	
   Node<E> dequeue() {
	   Node<E> res=null;
	   if(st1.length==0) return null;
	   if(st1.getLength()==1) {
		   res=st1.pop();
		return res;
	   } else {
		   Node<E> temp=st1.pop();
		   res = dequeue();
		//   System.out.println(temp);
		   st1.push(temp);
		   return res;
	   }
	}
   
   Node<E> peek() {
	   Node<E> temp=null;
	   if(st1.getLength()<0)
		return temp;
	   else
		   temp=st1.peek();
	   return temp;
   }
	
}

public class QueuUsingStacksDemo {

	public static void main(String[] args) {

		/*QueueUsingStackEnqueueCostly<String> queUsingStack = new QueueUsingStackEnqueueCostly<String>();
		queUsingStack.enqueue(new Node<String>("apple"));
		queUsingStack.enqueue(new Node<String>("ball"));
		queUsingStack.enqueue(new Node<String>("cat"));
		queUsingStack.display();
		System.out.println(queUsingStack.dequeue());
		System.out.println(queUsingStack.dequeue());
		System.out.println(queUsingStack.dequeue());
		System.out.println(queUsingStack.dequeue());*/
		System.out.println("===========================");
		/*QueueUsingStackDequeueCostly<String> queUsingStack2 = new QueueUsingStackDequeueCostly<String>();
		queUsingStack2.enqueue(new Node<String>("xmas"));
		queUsingStack2.enqueue(new Node<String>("yak"));
		queUsingStack2.enqueue(new Node<String>("zebra"));
		System.out.println(queUsingStack2.dequeue());
		System.out.println(queUsingStack2.dequeue());
		System.out.println(queUsingStack2.dequeue());
		System.out.println(queUsingStack2.dequeue());*/
		
		QueueUsingStackRecursion<String> qusr=new QueueUsingStackRecursion<String>();
		qusr.enqueue(new Node<String>("monkey"));
		qusr.enqueue(new Node<String>("nest"));
		qusr.enqueue(new Node<String>("orange"));
		System.out.println(qusr.dequeue());
		System.out.println(qusr.dequeue());
		System.out.println(qusr.dequeue());
	//	System.out.println(qusr.dequeue());
		

	}

}
