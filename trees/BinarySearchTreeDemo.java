package datastructures.trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeDemo {

	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		bst.insert(new BinaryNode<Integer>(10));
		bst.insert(new BinaryNode<Integer>(26));
		bst.insert(new BinaryNode<Integer>(5));
		
		bst.insert(new BinaryNode<Integer>(1));
		
		bst.insert(new BinaryNode<Integer>(9));
		
		//    10
		//  5	26
		//1  9
		
		System.out.println(bst.lookup(new BinaryNode<Integer>(26)));
		System.out.println(bst.lookup(new BinaryNode<Integer>(100)));
		System.out.println("=============POST ORDER =====================");
		bst.postOrderDisplay(bst.getRoot());
		System.out.println("=============PRE ORDER =====================");
		bst.preOrderDisplay(bst.getRoot());
		System.out.println("=============BFS TRAVERSAL =====================");
		bst.nonRecursiveBFSTraversal();
		
		System.out.println("=============BFS RECURSIVE TRAVERSAL =====================");
		BinaryNode<Integer> currentNode=bst.getRoot();
		Queue<BinaryNode<Integer>> list=new LinkedList<BinaryNode<Integer>>();
		list.add(currentNode);
		bst.recursiveBFSTraversal(list);
		
		System.out.println("=============IN ORDER =====================");
		bst.inOrderDisplay(bst.getRoot());
		System.out.println("============= POST REMOVE =====================");
		System.out.println("Removed:" + bst.remove(new BinaryNode<Integer>(10)));
		bst.preOrderDisplay(bst.getRoot());
		System.out.println("Removed:" + bst.remove(new BinaryNode<Integer>(5)));
		bst.preOrderDisplay(bst.getRoot());
	}

}
