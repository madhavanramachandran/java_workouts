package co.edu.madr.edx.ALGS201x.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class BasicGraph {

	private Map<Integer, Vertex> vertexMap;
	
	public BasicGraph() {
		this.vertexMap = new HashMap<>();
	}
	
	public BasicGraph(Map<Integer, Vertex> vertexMap, Map<Integer, List<Integer>> vertexEdgeListMap) {
		super();
		this.vertexMap = vertexMap;
	}
	
	public BasicGraph(String[] sItems, String[] vertexPairs) {
		this(sItems.length, sItems, vertexPairs.length, vertexPairs);
	}
	
	public BasicGraph(int v, String[] sItems, int e, String[] vertexPairs) {
		Map<Integer, Vertex> vertexMap = new HashMap<>();
		for (int i = 0; i < v; i++) {
			vertexMap.put(i, new Vertex(sItems[i]));
		}

		for (int i = 0; i < e; i++) {
			String vv = vertexPairs[i]; // 0-1
			String[] vvArray = vv.split("-");
			/**
			 * Get the vertex for the 0th index and set element at 1st index as adjacency vertex.
			 */
			Integer v0 = Integer.parseInt(vvArray[0]);
			Integer v1 = Integer.parseInt(vvArray[1]);
			vertexMap.get(v0).getAdjacenyList().add(v1);
			vertexMap.get(v1).getAdjacenyList().add(v0);
		}
		this.setVertexMap(vertexMap);
	}
	

	public Map<Integer, Vertex> getVertexMap() {
		return vertexMap;
	}

	public void setVertexMap(Map<Integer, Vertex> vertexMap) {
		this.vertexMap = vertexMap;
	}


	/**
	 * Breadth First Search
	 * @param startIdx
	 */
	public void bfsTraversal(final int startIdx) {
		Queue<Vertex> queue = new LinkedList<>();
		Vertex startVertex = vertexMap.get(startIdx);
		startVertex.setIs_visited(true);
		queue.add(startVertex);

		while (!queue.isEmpty()) {
			Vertex traversed = queue.poll();
			if (null != traversed) {
				System.out.println(traversed.getData());
			}
			
			//Add the neighbours;
			for (int i =0 ; i < traversed.getAdjacenyList().size(); i++) {
				Integer vertexKey = traversed.getAdjacenyList().get(i);
				Vertex v = vertexMap.get(vertexKey); 
				if (!v.isIs_visited()) {
					v.setIs_visited(true);
					queue.add(v);	
				}
			}
		}
	}
	
	/**
	 * Depth First search
	 * 
	 * @param startIdx
	 */
	public void dfsTraversal(final int startIdx) {
		Vertex traversed = vertexMap.get(startIdx);
		this.dfsTraversalRecursive(traversed);
	}
	
	private void dfsTraversalRecursive(Vertex vertex) {
		System.out.println(vertex);
		vertex.setIs_visited(true);
		System.out.println(vertex.getData());
		List<Integer> adjacenyList = vertex.getAdjacenyList();
		for (int i = 0; i < adjacenyList.size() ; i++) {
			Integer key = adjacenyList.get(i);
			Vertex temp = vertexMap.get(key);
			if (!temp.isIs_visited()) {
				dfsTraversalRecursive(temp);
			}
		}
	}

	
	/**
	 * Override to String method
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BasicGraph [vertexMap=");
		builder.append(vertexMap);
		builder.append("]");
		return builder.toString();
	}
	

}
