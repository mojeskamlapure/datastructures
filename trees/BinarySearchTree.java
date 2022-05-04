package datastructures.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
BinaryNode<Integer> root;
int height;

public int getHeight() {
	return height;
}

public void setHeight(int height) {
	this.height = height;
}

public BinaryNode<Integer> getRoot() {
	return root;
}

public void setRoot(BinaryNode<Integer> root) {
	this.root = root;
}

void insert(BinaryNode<Integer> node) {
	//check if its first node in atree
	if(this.getRoot()==null) {
		this.setRoot(node);
	}else {
		BinaryNode<Integer> temp=this.getRoot();
			while (temp != null) {
				//left
				if (node.getValue()<=temp.getValue()) {
					if (temp.getLeft() == null) {
						temp.left = node;
						break;
					}
					temp = temp.getLeft();
				} 
				//right
				else {
					if (temp.getRight() == null) {
						temp.right = node;
						break;
					}
					temp = temp.getRight();
				}
			}
	}
}

boolean lookup(BinaryNode<Integer> node){
	boolean found = false;
	if(this.getRoot()==null)
	found=false;
	else {
		BinaryNode<Integer> temp=this.getRoot();
		while(temp!=null) {
			if(node.getValue()<temp.getValue()) {
				temp=temp.getLeft();
			}else if (node.getValue()>temp.getValue()) {
				temp=temp.getRight();
			}else {
				found=true;
				break;
			}
		}
	}
	return found;
}

	BinaryNode<Integer> postOrderDisplay(BinaryNode<Integer> node) {
		BinaryNode<Integer> temp=node;
		if (temp.getLeft() != null ) {
			postOrderDisplay(temp.getLeft());
		}
		if (temp.getRight() != null) {
			postOrderDisplay(temp.getRight());
		}
		System.out.println(temp);
		
		return temp;
	}
	
	BinaryNode<Integer> preOrderDisplay(BinaryNode<Integer> node) {
		BinaryNode<Integer> temp=node;
		System.out.println(temp);
		if (temp.getLeft() != null ) {
			preOrderDisplay(temp.getLeft());
		}
		if (temp.getRight() != null) {
			preOrderDisplay(temp.getRight());
		}
		return temp;
	}
	
	BinaryNode<Integer> inOrderDisplay(BinaryNode<Integer> node) {
		BinaryNode<Integer> temp=node;
		if (temp.getLeft() != null ) {
			inOrderDisplay(temp.getLeft());
		}
		System.out.println(temp);
		
		if (temp.getRight() != null) {
			inOrderDisplay(temp.getRight());
		}
		return temp;
	}
	
	boolean remove(BinaryNode<Integer> nodeToDelete) {

		if (this.getRoot() == null) {
			return false;
		}

		BinaryNode<Integer> currentNode = this.getRoot();
		BinaryNode<Integer> parentNode = null;
		while (currentNode != null) {
			System.out.println(currentNode.getValue()+"--");
			if (nodeToDelete.getValue() < currentNode.getValue()) {
				parentNode = currentNode;
				currentNode = currentNode.getLeft();
			} else if (nodeToDelete.getValue() > currentNode.getValue()) {
				parentNode = currentNode;
				currentNode = currentNode.getRight();
			} else {
				// 1. no right child
				if (currentNode.getRight() == null) {
					// parent node is no set
					if (parentNode == null) {
						this.setRoot(currentNode.getLeft());
					} else {
						if (currentNode.getValue() < parentNode.getValue()) {
							parentNode.setLeft(currentNode.getLeft());
						} else if (currentNode.getValue() > parentNode.getValue()) {
							parentNode.setRight(currentNode.getRight());
						}
					}
					currentNode=currentNode.getLeft();
				} else {
					BinaryNode<Integer> rightNode = currentNode.getRight();
					// 2.right child with no left child
					if (rightNode.getLeft() == null) {
						rightNode.setLeft(currentNode.getLeft());
						if (parentNode == null) {
							this.setRoot(currentNode.getRight());
						} else {
							if (currentNode.getValue() < parentNode.getValue()) {
								parentNode.setLeft(currentNode.getRight());
							} else if (currentNode.getValue() > parentNode.getValue()) {
								parentNode.setRight(currentNode.getRight());
							}
						}
						currentNode=currentNode.getRight();
					} else {
						// 3. right child with left child

						// find the Right child's left most child

						BinaryNode<Integer> leftMost = rightNode.getLeft();
						BinaryNode<Integer> leftMostParent = currentNode.getRight();
						while (leftMost.getLeft() != null) {
							leftMostParent = leftMost;
							leftMost = leftMost.getLeft();
						}

						// Parent's left subtree is now leftmost's right subtree
						leftMostParent.setLeft(leftMost.getRight());
						leftMost.setLeft(currentNode.getLeft());
						leftMost.setRight(currentNode.getRight());

						if (parentNode == null) {
							this.setRoot(leftMost);
						} else {
							if (currentNode.getValue() < parentNode.getValue()) {
								parentNode.setLeft(leftMost);
							} else if (currentNode.getValue() > parentNode.getValue()) {
								parentNode.setRight(leftMost);
							}
						}
						return true;
					}
				}
			}
		}
		return false;

	}
	
	void nonRecursiveBFSTraversal() {
		BinaryNode<Integer> currentNode=this.getRoot();
		Queue<BinaryNode<Integer>> list=new LinkedList<BinaryNode<Integer>>();
		list.add(currentNode);
		while(!list.isEmpty()) {
			currentNode=list.remove();
			System.out.println(currentNode);
			if(currentNode.getLeft()!=null)
				list.add(currentNode.getLeft());
			if(currentNode.getRight()!=null)
				list.add(currentNode.getRight());			
		}
	}
	
	void recursiveBFSTraversal(Queue<BinaryNode<Integer>> list) {
		
		if(list.isEmpty()) {
			return ;
		}
		BinaryNode<Integer> currentNode = list.remove();
		System.out.println(currentNode);
		if(currentNode.getLeft()!=null)
			list.add(currentNode.getLeft());
		if(currentNode.getRight()!=null)
			list.add(currentNode.getRight());
		recursiveBFSTraversal(list);
	}
	
}
