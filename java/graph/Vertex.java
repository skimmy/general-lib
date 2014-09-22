package graph;

import java.util.List;

public interface Vertex<T> {
	public T getContent();
	public List<Vertex<T>> getNeighbours();
}