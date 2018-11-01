package co.edu.madr.edx.ALGS201x.graph.undirected;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestUUGraph {

	private static final String[] VERTICES = new String[] {"A", "B", "C", "D"};
	private static final String[] VERTICES_PAIR = new String[] {"0-1", "1-2", "0-2", "2-3"};
	
	public static void main(String[] args) {
		try {
			BasicGraph graph = new BasicGraph(
									VERTICES.length, 
									VERTICES, 
									VERTICES_PAIR.length, 
									VERTICES_PAIR);
			graph.bfsTraversal(3);
			System.out.println(graph.isCyclic(0));		
									
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

	protected BasicGraph getDetailsAndBuildGraph() throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter #number of vertices:: ");
		// no of vertices
		int v = Integer.parseInt(bufferedReader.readLine().trim());
		// List of vertices
		System.out.println("Enter vertices:: ");
		String[] vItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
		if (v != vItems.length) {
			throw new IllegalArgumentException("Vertex count not match");
		}

		System.out.println("Enter #number of vertices pair:: ");
		int e = Integer.parseInt(bufferedReader.readLine().trim());

		System.out.println("Enter vertices pair:: (Eg. 0-1 1-2 2-3) ");
		String[] vertexPairs = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
		if (e != vertexPairs.length) {
			throw new IllegalArgumentException("Vertex paris count not match");
		}

		bufferedReader.close();
		return new BasicGraph(v, vItems, e, vertexPairs);

	}

}
