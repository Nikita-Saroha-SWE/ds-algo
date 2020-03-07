package pvt.nikita.ds.algo.model;

public class Node {
	
	private Integer value;
	private Node left, right;
	
	public Node(Integer value) {
		super();
		this.value = value;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}
	
	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
	
	/*
	 * 	8
       / \
	  3   10
	 / \    \
	1   6    14
	   / \   /
	  4   7 13
	 */
	public static Node createBinaryTree() {
		Node root = new Node(8);
		root.left = new Node(3);
		root.right = new Node(10);
		
		Node node = root.left;
		node.left = new Node(1);
		node.right = new Node(6);
		
		node = node.right;
		node.left = new Node(4);
		node.right = new Node(7);
		
		node = root.right;
		node.right = new Node(14);
		
		node = node.right;
		node.left = new Node(13);
		return root;
	}
	
}
