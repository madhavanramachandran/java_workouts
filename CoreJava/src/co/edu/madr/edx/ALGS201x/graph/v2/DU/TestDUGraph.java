package co.edu.madr.edx.ALGS201x.graph.v2.DU;

import java.util.Scanner;

import co.edu.madr.edx.ALGS201x.graph.v2.Traversal;

public class TestDUGraph {

	public static void main(String[] args) {
		TestDUGraph test = new TestDUGraph();
		test.test_input();

	}

	void test_input() {
		Traversal grTraversal = new Traversal();
		Scanner s = new Scanner(System.in);
		int ne, nv;
		System.out.print("Enter no of vertices : ");
		nv = s.nextInt();
		DUGraph graph = new DUGraph(nv);
		System.out.print("Enter no of edges : ");
		ne = s.nextInt();
		for (int i = 0; i < ne; i++) {
			System.out.print("Edge " + i);
			System.out.print("\n\tFrom vertex : ");
			int from = s.nextInt();
			System.out.print("\n\tTo vertex : ");
			int to = s.nextInt();
			graph.addEdge(from, to);
		}
		System.out.println("\n\nBFS Result");
		grTraversal.bfsGraph(graph);
		System.out.println("\n\nDFS Result");
		grTraversal.dfsGraph(graph);
	}

	void test_01() {
		Traversal graphTraversal = new Traversal();
		DUGraph graph = new DUGraph(5);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 3);
		graph.addEdge(3, 4);
		graph.addEdge(4, 2);
		graphTraversal.bfsGraph(graph);
		System.out.println("#############");
		graphTraversal.dfsGraph(graph);

	}

}
