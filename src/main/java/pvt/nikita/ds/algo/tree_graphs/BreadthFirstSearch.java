package pvt.nikita.ds.algo.tree_graphs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import pvt.nikita.ds.algo.model.GraphNode;

public class BreadthFirstSearch {

	public static void main(String[] args) {
		printBFS(GraphNode.createInput());
		System.out.println();
		System.out.println(breadthFirstSearch(GraphNode.createInput(), 2).getValue());

	}
	
	public static void printBFS(GraphNode start) {
		Queue<GraphNode> queue = new LinkedList<GraphNode>();
		Set<GraphNode> seen = new HashSet<GraphNode>();
		queue.add(start);
		while(!queue.isEmpty()) {
			GraphNode node = queue.poll();
			if(!seen.contains(node)) {
				seen.add(node);
				System.out.print(node.getValue()+" ");
			}
			
			for(GraphNode adjacentNode : node.getAdjacentNodes()) {
				if(!seen.contains(adjacentNode)) {
					queue.add(adjacentNode);
				}
			}
		}
	}
	
	public static GraphNode breadthFirstSearch(GraphNode start, Integer x) {
		Queue<GraphNode> queue = new LinkedList<GraphNode>();
		Set<GraphNode> seen = new HashSet<GraphNode>();
		queue.add(start);
		while(!queue.isEmpty()) {
			GraphNode node = queue.poll();
			if(node.getValue() == x) {
				return node;
			}
			if(!seen.contains(node)) {
				seen.add(node);
			}
			
			for(GraphNode adjacentNode : node.getAdjacentNodes()) {
				if(!seen.contains(adjacentNode)) {
					queue.add(adjacentNode);
				}
			}
		}
		return null;
	}
	
	

}
