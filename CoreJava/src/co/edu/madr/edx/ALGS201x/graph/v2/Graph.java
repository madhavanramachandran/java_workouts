package co.edu.madr.edx.ALGS201x.graph.v2;

import java.util.ArrayList;
import java.util.List;

public abstract class Graph {
	
	protected int vertices;

	protected List<Integer> adjacencyListArray[];
	
	public Graph(int vertexCount) {
		vertices = vertexCount;
		adjacencyListArray = new ArrayList[vertices];
		for (int i = 0; i < vertices; i++) {
			adjacencyListArray[i] = new ArrayList<>();
		}
	}

	public abstract void addEdge(int source, int dest);

	public int getVertices() {
		return vertices;
	}

	public List<Integer>[] getAdjacencyListArray() {
		return adjacencyListArray;
	}

}
