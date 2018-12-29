package co.interview.datastructures.graph.directed;

import java.util.ArrayList;
import java.util.List;

public class DUVertex {

	private String data;
	
	private boolean is_visited;
	
	private List<Node> adjacencyNodes;
	
	public DUVertex() {
		this(null);
	}

	public DUVertex(String data) {
		this.data = data;
		this.adjacencyNodes = new ArrayList<>();
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public List<Node> getAdjacencyNodes() {
		return adjacencyNodes;
	}

	public void setAdjacencyNodes(List<Node> adjacencyNodes) {
		this.adjacencyNodes = adjacencyNodes;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DUVertex [data=");
		builder.append(data).append(", adjacencyNodes: ").append(adjacencyNodes);
		builder.append("]");
		return builder.toString();
	}

	public boolean isIs_visited() {
		return is_visited;
	}

	public void setIs_visited(boolean is_visited) {
		this.is_visited = is_visited;
	}
}
