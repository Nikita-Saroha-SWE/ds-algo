package pvt.nikita.ds.algo.model;

public class GraphNode {
	
	public GraphNode(Integer value) {
		this.value = value;
	}
	
	private Integer value;
	private GraphNode [] adjacentNodes;
	
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public GraphNode[] getAdjacentNodes() {
		return adjacentNodes;
	}
	public void setAdjacentNodes(GraphNode[] adjacentNodes) {
		this.adjacentNodes = adjacentNodes;
	}
	
	/**
	 *     7-------2
		  /        /\
		 /        /  \
		6----5---1----3
		 \    \  |   /
		  \    \ |  /
		   \    \| /
		    8----4
    
	 * 
	 */
	
	public static GraphNode createInput() {
		GraphNode start = new GraphNode(1);
		// adjaccents of node 1
		GraphNode[] adjacents = new GraphNode[4];
		adjacents[0] = new GraphNode(2);
		adjacents[1] = new GraphNode(3);
		adjacents[2] = new GraphNode(4);
		adjacents[3] = new GraphNode(5);
		start.setAdjacentNodes(adjacents);
		// adjacents of node 2
		adjacents = new GraphNode[3];
		adjacents[0] = start;
		adjacents[1] = start.getAdjacentNodes()[1];
		adjacents[2] = new GraphNode(7);
		start.getAdjacentNodes()[0].setAdjacentNodes(adjacents);
		
		// adjacents of node 3
		adjacents = new GraphNode[3];
		adjacents[0] = start;
		adjacents[1] = start.getAdjacentNodes()[0];
		adjacents[2] = start.getAdjacentNodes()[2];
		start.getAdjacentNodes()[1].setAdjacentNodes(adjacents);
		
		// adjacents of node 4
		adjacents = new GraphNode[4];
		adjacents[0] = start;
		adjacents[1] = start.getAdjacentNodes()[3];
		adjacents[2] = start.getAdjacentNodes()[1];
		adjacents[3] = new GraphNode(8);
		start.getAdjacentNodes()[2].setAdjacentNodes(adjacents);

		// adjacents of node 5
		adjacents = new GraphNode[3];
		adjacents[0] = start;
		adjacents[1] = start.getAdjacentNodes()[2];
		adjacents[2] = new GraphNode(6);
		start.getAdjacentNodes()[3].setAdjacentNodes(adjacents);
		
		// adjacents of node 6
		adjacents = new GraphNode[3];
		adjacents[0] = start.getAdjacentNodes()[3];
		adjacents[1] = start.getAdjacentNodes()[2].getAdjacentNodes()[3];
		adjacents[2] = start.getAdjacentNodes()[0].getAdjacentNodes()[2];
		start.getAdjacentNodes()[3].getAdjacentNodes()[2].setAdjacentNodes(adjacents);
		
		// adjacents of node 7
		adjacents = new GraphNode[2];
		adjacents[0] = start.getAdjacentNodes()[0];
		adjacents[1] = start.getAdjacentNodes()[3].getAdjacentNodes()[2];
		start.getAdjacentNodes()[0].getAdjacentNodes()[2].setAdjacentNodes(adjacents);
		
		// adjacents of node 7
		adjacents = new GraphNode[2];
		adjacents[0] = start.getAdjacentNodes()[2];
		adjacents[1] = start.getAdjacentNodes()[3].getAdjacentNodes()[2];
		start.getAdjacentNodes()[2].getAdjacentNodes()[3].setAdjacentNodes(adjacents);
		
		return start;
	}
}
