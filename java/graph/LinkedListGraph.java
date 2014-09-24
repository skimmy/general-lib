package graph;

import graph.adt.LinkedVertex;
import graph.adt.Vertex;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * Created by michele.schimd on 24/09/2014.
 */
public class LinkedListGraph<T> extends AbstractGraph<T> {

    private LinkedList<LinkedVertex<T>> vertices = null;

    public LinkedListGraph() {
        this.vertices = new LinkedList<LinkedVertex<T>>();
    }

    @Override
    public Set<Vertex<T>> getVertices() {
        return new HashSet<Vertex<T>>(this.vertices);
    }

    @Override
    public boolean addVertex(Vertex<T> newVertex) {
        // check if the vertex already exists
        LinkedVertex<T> vertex = new SimpleLinkedVertex<T>(newVertex.getContent());
        if (this.vertices.contains(vertex)) {
            return false;
        }
        // add a new vertex and return
        this.vertices.add(vertex);
        return true;
    }

    @Override
    public boolean addEdge(Vertex<T> from, Vertex<T> to) {
        // check if the vertex exist and possibly insert them


        // check if the edge already exist

        // insert the edge and return the proper value
        return false;
    }


}
