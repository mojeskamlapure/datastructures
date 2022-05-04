package datastructures.graphs;

public class UndirectedGraphDemo {
public static void main(String[] args) {
	UndirectedGraph<Integer> graph=new UndirectedGraph<Integer>();
	GraphNode<Integer> node0 = new GraphNode<Integer>(0);
	GraphNode<Integer> node1 = new GraphNode<Integer>(1);
	GraphNode<Integer> node2 = new GraphNode<Integer>(2);
	GraphNode<Integer> node3 = new GraphNode<Integer>(3);
	
	graph.addVertex(node0);
	graph.addVertex(node1);
	graph.addVertex(node2);
	graph.addVertex(node3);
	
	graph.addEdge(node0, node2);
	
	graph.addEdge(node1, node2);
	graph.addEdge(node1, node3);

	graph.showConnection();
	
	
	
}
}
