package co.edu.madr.edx.ALGS201x.graph.directed;

public class Node {

	private Integer nodeIdx;

	private int weight;

	public Node(int nodeIdx) {
		this.nodeIdx = nodeIdx;
		this.weight = 1;
	}

	public Node(int nodeIdx, int weight) {
		this.nodeIdx = nodeIdx;
		this.weight = weight;
	}

	public Integer getNodeIdx() {
		return nodeIdx;
	}

	public void setNodeIdx(Integer nodeIdx) {
		this.nodeIdx = nodeIdx;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Node [nodeIdx=");
		builder.append(nodeIdx);
		builder.append(", weight=");
		builder.append(weight);
		builder.append("]");
		return builder.toString();
	}

}
