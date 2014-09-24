package graph;

import graph.adt.Vertex;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * Created by michele.schimd on 24/09/2014.
 */
public class LinkedListGraph<T> extends AbstractGraph<T> {

    private LinkedList<Vertex<T>> vertices = null;

    public LinkedListGraph() {
        this.vertices = new LinkedList<Vertex<T>>();
    }

    @Override
    public Set<Vertex<T>> getVertices() {
        return new HashSet<Vertex<T>>(this.vertices);
    }

    @Override
    public void addVertex(Vertex<T> newVertex) {
        if (!this.vertices.contains(newVertex)) {
            this.vertices.add(newVertex);
        }
    }


}
