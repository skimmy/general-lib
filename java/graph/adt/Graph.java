package graph.adt;

import java.util.Set;

public interface Graph<T> {
    /**
     * Returns all the vertices in the graph. The vertices are returned as a
     * <i>set</i>.
     *
     * @return the vertices of the graph
     */
	public Set<Vertex<T>> getVertices();

    /**
     * Inserts a new vertex into the graph, if the vertex is already present,
     * this method should do nothing.
     *
     * @param newVertex vertex to be inserted
     */
	public void addVertex(Vertex<T> newVertex);
}