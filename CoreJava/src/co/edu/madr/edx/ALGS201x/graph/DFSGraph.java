package co.edu.madr.edx.ALGS201x.graph;

import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class DFSGraph {

	private static final String[] VERTICES = new String[] { "A", "B", "C", "D", "E" };
	private static final String[] VERTICES_PAIR = new String[] { "0-1", "0-2", "0-3", "1-4", "2-4", "3-4" };

	public static void main(String[] args) {
		DFSGraph dfs = new DFSGraph();
		BasicGraph graph = new BasicGraph(VERTICES, VERTICES_PAIR);
		dfs.depthFirstSearch(graph);
		//System.out.println(graph);
	}

	protected void depthFirstSearch(BasicGraph graph) {
		Stack<Vertex> stack = new Stack<>();
		Vertex adjVertex = graph.getVertexMap().get(0);
		do {
			if (null == adjVertex) {
				adjVertex = stack.pop();
			}
			if (!adjVertex.isIs_visited()) {
				adjVertex.setIs_visited(true);
				stack.push(adjVertex);	
				System.out.println(adjVertex.getData());
			}
			adjVertex = getNextUnVisitedVertex(graph, adjVertex.getAdjacenyList());
			
			//System.out.println(stack);
		} while (!stack.isEmpty());

	}

	private Vertex getNextUnVisitedVertex(BasicGraph graph, List<Integer> adjacenyList) {
		boolean isResulted = false;
		Vertex nextVer = null;
		for (int i = 0; i < adjacenyList.size() && !isResulted; i++) {
//			nextVer = graph.getVertexMap().get(adjacenyList.get(i));
			if (!nextVer.isIs_visited()) {
				isResulted = true;//return nextVar;
			}
		}
		return isResulted ? nextVer : null;//return null;
	}

}
