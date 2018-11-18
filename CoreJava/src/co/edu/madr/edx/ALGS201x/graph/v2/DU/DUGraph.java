package co.edu.madr.edx.ALGS201x.graph.v2.DU;

import co.edu.madr.edx.ALGS201x.graph.v2.Graph;

public class DUGraph extends Graph {

	public DUGraph(int vertexCount) {
		super(vertexCount);
	}

	@Override
	/**
	 * Here we add only the destination to the source
	 * @param source Source vertex
	 * @param dest Destination vertex
	 */
	public void addEdge(int source, int dest) {
		adjacencyListArray[source].add(dest);
	}

	
}
