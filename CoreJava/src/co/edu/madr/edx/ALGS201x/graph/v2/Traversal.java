package co.edu.madr.edx.ALGS201x.graph.v2;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Traversal {

	public void bfsGraph(Graph graph) {
		boolean[] visitedVertices = new boolean[graph.getVertices()];
		for (int m = 0; m < graph.getVertices(); m++) {
			if (!visitedVertices[m]) {
				bfsGraphUtil(graph, m, visitedVertices);
			}
		}
	}

	public void bfsGraphUtil(Graph graph, int vertexIdx, boolean[] visitedVertices) {
		Queue<Integer> queue = new LinkedList<Integer>();
		/* Starting from index 0 */
		visitedVertices[vertexIdx] = true;
		/** Initially add the start index here */
		queue.add(vertexIdx);

		/** Continue the iteration till queue is empty */
		while (!queue.isEmpty()) {
			int currentVertexIdx = queue.poll();
			/** Current vertex being parsed */
			System.out.println(currentVertexIdx);
			List<Integer> neighbours = graph.getAdjacencyListArray()[currentVertexIdx];
			for (int i : neighbours) {
				if (!visitedVertices[i]) {
					queue.add(i);
					visitedVertices[i] = true;
				}
			}
		}
	}

	public void dfsGraph(Graph graph) {
		boolean[] visitedVertices = new boolean[graph.getVertices()];
		for (int m = 0; m < graph.getVertices(); m++) {
			if (!visitedVertices[m]) {
				dfsGraphUtil(graph, m, visitedVertices);
			}
		}
	}

	private void dfsGraphUtil(Graph graph, int vertex, boolean[] visitedVertices) {
		System.out.println(vertex);
		visitedVertices[vertex] = true;
		List<Integer> neighbours = graph.getAdjacencyListArray()[vertex];
		for (int i = 0; i < neighbours.size(); i++) {
			int key = neighbours.get(i);
			if (!visitedVertices[key]) {
				dfsGraphUtil(graph, key, visitedVertices);
			}
		}
	}

}
