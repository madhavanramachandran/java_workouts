package co.edu.madr.edx.ALGS201x.graph.v2.UU;

import co.edu.madr.edx.ALGS201x.graph.v2.Traversal;

public class TestUUGraph {

	public static void main(String[] args) {
		TestUUGraph test = new TestUUGraph();
		//test.testDFS_01();
		test.testDFS_02();
	}

	private void testDFS_02() {
		Traversal graphTraversal = new Traversal();
		UUGraph graph = new UUGraph(5);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(0, 3);

		graph.addEdge(1, 4);
		graph.addEdge(2, 4);
		graph.addEdge(3, 4);

		graphTraversal.bfsGraph(graph);
		System.out.println("---------------------");
		graphTraversal.dfsGraph(graph);

	}

	private void testDFS_01() {
		Traversal graphTraversal = new Traversal();
		UUGraph graph = new UUGraph(8);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(0, 3);

		graph.addEdge(1, 4);
		graph.addEdge(1, 5);
		graph.addEdge(2, 6);

		graph.addEdge(3, 7);
		graph.addEdge(4, 7);
		graph.addEdge(5, 7);

		graphTraversal.dfsGraph(graph);
		System.out.println("---------------------");
		graphTraversal.bfsGraph(graph);
	}

}
