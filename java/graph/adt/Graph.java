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
     * this method should do nothing. If the vertex to tbe inserted is already
     * present in the graph, the method returns <code>false</code> (indicating
     * that no actual vertex has been inserted) without modifying the structure.
     *
     * @param newVertex vertex to be inserted
     *
     * @return <code>true</code> if the vertex was inserted <code>false</code>
     * if the vertex was already present in the graph
     */
	public boolean addVertex(Vertex<T> newVertex);

    /**
     * Inserts a new edge starting at vertex <code>from</code> and ending at
     * vertex <code>to</code>. If either of the two vertex don't exist they
     * are automatically inserted into the graph and the edge is created. If the
     * edge already exist the methods returns <code>false</code> and do not
     * modify the graph structure at all.
     *
     * @param from the vertex corresponding to the tail of the new edge
     * @param to the vertex corresponding to the head of the new edge
     *
     * @return <code>true</code> if the edge is actually created <code>false</code>
     * if the edge existed before the method invocation
     */
    public boolean addEdge(Vertex<T> from, Vertex<T> to);
}