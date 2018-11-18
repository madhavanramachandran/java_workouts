package co.edu.madr.edx.ALGS201x.graph.v2.UU;

import co.edu.madr.edx.ALGS201x.graph.v2.Graph;

public class UUGraph extends Graph {

	public UUGraph(int vertexCount) {
		super(vertexCount);
	}

	@Override
	public void addEdge(int source, int dest) {
		/* Its undirected so we add both */
		adjacencyListArray[source].add(dest);
		adjacencyListArray[dest].add(source);
	}
}
