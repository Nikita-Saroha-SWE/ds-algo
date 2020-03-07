package pvt.nikita.ds.algo.tree_graphs;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import pvt.nikita.ds.algo.model.GraphNode;

public class DepthFirstSearch {

	public static void main(String[] args) {
		printDFS(GraphNode.createInput());
		System.out.println();
		System.out.println(depthFirstSearch(7, GraphNode.createInput()).getValue());
	}
	
	public static void printDFS(GraphNode start) {
		Stack<GraphNode> stack = new Stack<GraphNode>();
		Set<GraphNode> seen = new HashSet<GraphNode>(); 
		stack.push(start);
		
		while(!stack.isEmpty()) {
			GraphNode node = stack.pop();
			if(!seen.contains(node)) {
				seen.add(node);
				System.out.print(node.getValue() +" ");
			}
			
			for(GraphNode adjacentNode : node.getAdjacentNodes()) {
				if(!seen.contains(adjacentNode)) {
					stack.push(adjacentNode);
				}
			}
		}
	}
	
	public static GraphNode depthFirstSearch(Integer x, GraphNode start) {
		Stack<GraphNode> stack = new Stack<GraphNode>();
		Set<GraphNode> seen = new HashSet<GraphNode>(); 
		stack.push(start);
		
		while(!stack.isEmpty()) {
			GraphNode node = stack.pop();
			if(node.getValue() == x) {
				return node;
			}
			
			if(!seen.contains(node)) {
				seen.add(node);
			}
			
			for(GraphNode adjacentNode : node.getAdjacentNodes()) {
				if(!seen.contains(adjacentNode)) {
					stack.push(adjacentNode);
				}
			}
		}
		return null;
	}

}
