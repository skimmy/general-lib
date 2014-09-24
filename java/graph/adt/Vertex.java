package graph.adt;

import java.util.List;

public interface Vertex<T> {
    /**
     * Returns the actual content of the vertex
     *
     * @return the content of the vertex
     */
	public T getContent();

}