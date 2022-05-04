package datastructures.trees;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }
public class BSTValidator {

	public static boolean isValidBST(TreeNode root) {
        TreeNode currentNode=root;
		Queue<TreeNode> list=new LinkedList<TreeNode>();
		list.add(currentNode);
		while(!list.isEmpty()) {
			currentNode=list.remove();
			//System.out.println(currentNode);
			if(currentNode.left!=null){
                if(currentNode.left.val<currentNode.val)
                    list.add(currentNode.left);
                else
                    return false;
            }
				            
			if(currentNode.right!=null){
                if(currentNode.right.val>currentNode.val)
                    list.add(currentNode.right);
                else
                    return false;
            }
				            
		}
        return true;
    }
	
	public static void bfsTraversal(TreeNode root) {
        TreeNode currentNode=root;
		Queue<TreeNode> list=new LinkedList<TreeNode>();
		list.add(currentNode);
		System.out.println("Traversal:\n");
		while(!list.isEmpty()) {
			currentNode=list.remove();
			if(currentNode!=null)
			System.out.print("\t"+currentNode.val+"\t");
			else
			System.out.print("\t"+currentNode+"\t");
		//	if(currentNode.left!=null){
			if(currentNode!=null)
                    list.add(currentNode.left);
        //    }
				            
		//	if(currentNode.right!=null){
			if(currentNode!=null)
                    list.add(currentNode.right);
       //     }
				            
		}
		System.out.println("==================");
    }
	
	public static void main(String[] args) {
		TreeNode one=new TreeNode(1);
		TreeNode three=new TreeNode(3);
		TreeNode six=new TreeNode(6);
		TreeNode four=new TreeNode(4,three,six);
		TreeNode rootNode=new TreeNode(5, one, four);
		bfsTraversal(rootNode);
		System.out.println(isValidBST(rootNode));
		
		
		TreeNode One=new TreeNode(1);
		TreeNode Three=new TreeNode(3);
		TreeNode rootNode2=new TreeNode(2, One, Three);
		bfsTraversal(rootNode2);
		System.out.println(isValidBST(rootNode2));
	}

}
