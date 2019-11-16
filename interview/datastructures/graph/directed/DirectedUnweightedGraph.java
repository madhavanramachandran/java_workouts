package co.interview.datastructures.graph.directed;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

/**
 * Directed Unweighted Graph.
 * All edges are assumed with uniform weight of '1'
 * 
 * @author madr
 *
 */
public class DirectedUnweightedGraph {

	private Map<Integer, DUVertex> vertexMap;

	public DirectedUnweightedGraph() {
		this.vertexMap = new HashMap<>();
	}

	/**
	 * Just to parse the input and load the vertexMap.
	 * @param sItems {@code Array} of vertices.
	 * @param verticesPair Array of Vertices pair
	 */
	public DirectedUnweightedGraph(String[] sItems, String[] verticesPair) {
		Map<Integer, DUVertex> vMap = new HashMap<>();
		for (int i = 0; i < sItems.length; i++) {
			vMap.put(i, new DUVertex(sItems[i]));
		}

		for (int i = 0; i < verticesPair.length; i++) {
			String[] arr = verticesPair[i].split("-");
			DUVertex vertex = vMap.get(Integer.parseInt(arr[0]));
			vertex.getAdjacencyNodes().add(new Node(Integer.parseInt(arr[1])));
		}
		vertexMap = vMap;
	}

	/**
	 * Breadth First Traversal
	 * 
	 * @param startIdx
	 *            Start Index of the vertex to be traversed.
	 */
	public void bfsGraph(int startIdx) {
		Queue<DUVertex> queue = new LinkedList<>();
		DUVertex startVertex = vertexMap.get(startIdx);
		startVertex.setIs_visited(true);
		queue.add(startVertex);
		while (!queue.isEmpty()) {
			DUVertex travesed = queue.poll();
			System.out.println(travesed.getData());
			for (Node n : travesed.getAdjacencyNodes()) {
				DUVertex temp = vertexMap.get(n.getNodeIdx());
				if (!temp.isIs_visited()) {
					temp.setIs_visited(true);
					queue.add(temp);
				}
			}
		}

		List<Node> adjacencyNodes = startVertex.getAdjacencyNodes();
		for (Node n : adjacencyNodes) {
			queue.add(vertexMap.get(n.getNodeIdx()));
		}
	}

	/**
	 * Depth First Traversal We do DFS in recursive way.
	 * 
	 * @param startIdx
	 *            Start Index of the vertex to be traversed
	 */
	public void dfsGraph(int startIdx) {
		DUVertex startVertex = vertexMap.get(startIdx);
		dfsGraphUtil(startVertex);

	}

	private void dfsGraphUtil(DUVertex vertex) {
		System.out.println(vertex.getData());
		vertex.setIs_visited(true);
		List<Node> nodes = vertex.getAdjacencyNodes();
		for (Node n : nodes) {
			DUVertex temp = vertexMap.get(n.getNodeIdx());
			if (!temp.isIs_visited()) {
				dfsGraphUtil(temp);
			}
		}

	}

	/**
	 * Depth First Traversal We do DFS in Iterative way.
	 * 
	 * @param startIdx
	 *            Start Index of the vertex to be traversed
	 */
	public void dfsGraphStack(int startIdx) {
		final int vertexCount = vertexMap.size();
		Stack<DUVertex> stack = new Stack<>();
		DUVertex startVertex = vertexMap.get(startIdx);
		startVertex.setIs_visited(true);
		stack.push(startVertex);
		System.out.println(startVertex.getData());
		int traversedCount = 1;
		DUVertex traversed = null;
		int loopCount = 0;
		/* Checking for the count will reduce the iteration count considerably */
		while (traversedCount < vertexCount) {
			/*
			 * Checking for Count and stack size will hold good except the fact that
			 * checking the stack size will take more iteration than using count
			 */
			// while (!stack.isEmpty()) {
			loopCount++;
			if (null == traversed) {
				traversed = stack.pop();
			}
			List<Node> neighbours = traversed.getAdjacencyNodes();
			traversed = null;
			for (Node n : neighbours) {
				DUVertex temp = vertexMap.get(n.getNodeIdx());
				if (!temp.isIs_visited() && null == traversed) {
					temp.setIs_visited(true);
					System.out.println(temp.getData());
					stack.push(temp);
					traversed = temp;
					traversedCount++;
				}
			}
		}
		System.out.println("No of Iteration(s):: " + loopCount);
	}
	
	public void bfsGraph() {
		this.bfsGraph(0);
	}
	
	public void dfsGraph() {
		this.dfsGraph(0);
	}
	
	public void dfsGraphStack() {
		this.dfsGraphStack(0);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DirectedGraph [vertexMap=");
		builder.append(vertexMap);
		builder.append("]");
		return builder.toString();
	}

}
