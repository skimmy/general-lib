package graph;

import java.util.List;

public interface Vertex<T> {
    /**
     * Returns the actual content of the vertex
     *
     * @return the content of the vertex
     */
	public T getContent();

    /**
     * Returns the neighbours of the current vertex
     *
     * @return vertex neighbours
     */
	public List<Vertex<T>> getNeighbours();

    /**
     * Adds <code>v</code> as a new neighbour to the current vertex
     *
     * @param v new neighbour to be added
     */
    public void addNeighbour(Vertex<T> v);
}