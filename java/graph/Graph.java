package graph;

import java.util.Set;

public interface Graph<T> {
	public Set<Vertex<T>> getVertices();
	public void addVertex(Vertex<T> newVertex);
}