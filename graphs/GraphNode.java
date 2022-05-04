package datastructures.graphs;

import java.util.ArrayList;
import java.util.List;

public class GraphNode<E> {
	 List<GraphNode<E>> adjacentList;
	 int data;
	public GraphNode(int data) {
		if(adjacentList==null) {
			adjacentList=new ArrayList<GraphNode<E>>();
		}
		this.data=data;
	}
	public List<GraphNode<E>> getAdjacentList() {
		return adjacentList;
	}
	public void setAdjacentList(List<GraphNode<E>> adjacentList) {
		this.adjacentList = adjacentList;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "GraphNode [data=" + data + "]";
	}
	
	
}
