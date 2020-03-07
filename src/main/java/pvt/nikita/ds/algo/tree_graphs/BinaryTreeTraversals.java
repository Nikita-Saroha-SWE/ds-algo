package pvt.nikita.ds.algo.tree_graphs;

import pvt.nikita.ds.algo.model.Node;

public class BinaryTreeTraversals {
	
	public static void main(String[] args) {
		preorder(Node.createBinaryTree());
		System.out.println();
		inorder(Node.createBinaryTree());
		System.out.println();
		postorder(Node.createBinaryTree());
	} 
	
	public static void preorder(Node node) {
		if(node != null) {
			System.out.print(node.getValue()+" ");
			preorder(node.getLeft());
			preorder(node.getRight());
		}
	}
	
	public static void postorder(Node node) {
		if(node != null) {
			postorder(node.getLeft());
			postorder(node.getRight());
			System.out.print(node.getValue()+" ");
		}
	}
	
	public static void inorder(Node node) {
		if(node != null) {
			inorder(node.getLeft());
			System.out.print(node.getValue()+" ");
			inorder(node.getRight());
		}
	}

}
