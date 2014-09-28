package graph.adt;

import java.util.List;

/**
 * Created by michele.schimd on 24/09/2014.
 */
public interface LinkedVertex<T> extends Vertex<T> {
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
     * @return <code>true</code> if the node has been actually inserted or
     * <code>false</code> if note (because it was already in the neighbourhood)
     */
    public boolean addNeighbour(Vertex<T> v);

    /**
     * Removes the given vertex from the list of neighbours. The method returns
     * <code>true</code> if a vertex is actually removed <code>false</code>
     * otherwise (<i>i.e.</i> no such vertex was present in the neighbours list).
     *
     * @param v the vertex to be removed
     * @return <code>true</code> if an actual element was removed, <code>false</code>
     * otherwise.
     */
    public boolean removeNeighbour(Vertex<T> v);

    /**
     * Check if the passed vertex is a neighbour of this node.
     *
     * @param v the vertex to be checked
     * @return <code>true</code> if and only if <code>v</code> is a eighbour of
     * this node.
     */
    public boolean hasNeighbour(Vertex<T> v);
}
