package datastructures.graphs;

import java.util.ArrayList;
import java.util.List;

public class UndirectedGraph<E> {
	 List<GraphNode<E>> adjacentList;
	int numberOfNodes;
	public UndirectedGraph() {
		this.numberOfNodes=0;
		if(adjacentList==null) {
			adjacentList=new ArrayList<GraphNode<E>>();
		}
	}	
	
	void addVertex(GraphNode<E> node){
		this.adjacentList.add(node);
		this.numberOfNodes++;
	}
	
	void addEdge(GraphNode<E> node1,GraphNode<E> node2){
		node1.getAdjacentList().add(node2);
		node2.getAdjacentList().add(node1);
	}
	
	void showConnection() {
		System.out.println("===================================");
			for(GraphNode<E> node:adjacentList) {
				System.out.print(node+"-->");
				for(GraphNode<E> n:node.getAdjacentList()) {
					System.out.print(n);
				}
				System.out.println();
			}
			System.out.println();
	}
}
