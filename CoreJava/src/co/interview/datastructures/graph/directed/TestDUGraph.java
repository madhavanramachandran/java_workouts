package co.interview.datastructures.graph.directed;

public class TestDUGraph {

	static final String[] VERTICES_1 = new String[] { "A", "B", "C", "D", "E", "F", "G" };
	static final String[] VERTICES_PAIR_1 = new String[] { "0-1", "0-2", "2-4", "4-6", "6-5", "5-3" };

	static final String[] VERTICES_2 = new String[] { "A", "B", "C", "D", "E" };
	static final String[] VERTICES_PAIR_2 = new String[] { "0-1", "0-2", "1-3", "3-4", "4-2" };
	
	static final String[] VERTICES_3 = new String[] { "A", "B", "C", "D", "E", "F", "G", "H" };
	static final String[] VERTICES_PAIR_3 = new String[] { "0-4", "4-0", "7-4", "1-7", "1-2", "3-2", "5-3", "3-5", "4-5", "5-6", "6-1" };
	
	public static void main(String[] args) {
		DirectedUnweightedGraph graph = new DirectedUnweightedGraph(VERTICES_3, VERTICES_PAIR_3);
		//graph.bfsGraph(0);
		graph.dfsGraphStack();

	}

}
