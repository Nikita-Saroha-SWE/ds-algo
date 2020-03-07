package pvt.nikita.ds.algo.tree_graphs;

import java.util.LinkedList;
import java.util.Queue;

import pvt.nikita.ds.algo.model.Node;

public class LevelOrderTraversalBT {

	public static void main(String[] args) {
		levelOrderBFS(Node.createBinaryTree());

	}
	
	public static void levelOrderBFS(Node root) {
		Queue<Node> queue = new LinkedList<Node>(); 
		
		queue.add(root);
		while(!queue.isEmpty()) {
			Node node = queue.poll();
			System.out.print(node.getValue()+" ");
			if(node.getLeft() != null)
				queue.add(node.getLeft());
			if(node.getRight() != null)
				queue.add(node.getRight());
		}
	}

}
