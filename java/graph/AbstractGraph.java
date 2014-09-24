package graph;

import graph.adt.Graph;
import graph.adt.Vertex;

import java.util.Set;

/**
 * This is an abstract implementation of a graph data structure, it defines all
 * the methods that are appropriate for graphs and do not change as the structure
 * used to store nodes and arcs changes (<i>i.e.</i> linked list or adjacency
 * matrix.
 *
 * Created by Michele Schimd on 24/09/2014.
 */
public abstract class AbstractGraph<T> implements Graph<T> {
    @Override
    public String toString() {
        String str = "";
        Set<Vertex<T>> vertices = this.getVertices();
        for (Vertex<T> vertex : vertices) {
            str += vertex.toString() + "\n";
        }
        return str;
    }
}
