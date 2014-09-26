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
}
