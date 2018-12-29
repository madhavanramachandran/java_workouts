package co.interview.datastructures.graph.undirected;

import java.util.ArrayList;
import java.util.List;

public class UUVertex {

	
	private String data;
	
	private boolean is_visited;
	
	private List<Integer> adjacenyList;

	
	public UUVertex() {
		this(null);
	}
	
	public UUVertex(String data) {
		super();
		adjacenyList = new ArrayList<>();
		this.data = data;
	}
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public boolean isIs_visited() {
		return is_visited;
	}

	public void setIs_visited(boolean is_visited) {
		this.is_visited = is_visited;
	}

	public List<Integer> getAdjacenyList() {
		return adjacenyList;
	}

	public void setAdjacenyList(List<Integer> adjacenyList) {
		this.adjacenyList = adjacenyList;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vertex [data=");
		builder.append(data);
		builder.append(", is_visited=");
		builder.append(is_visited);
		builder.append(", adjacenyList=");
		builder.append(adjacenyList);
		builder.append("]");
		return builder.toString();
	}
}
