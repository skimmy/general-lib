package graph;

import java.util.Set;

public interface Graph {
	public Set<Vertex> getVertices();
	public void addVertex(Vertex newVertex);
}