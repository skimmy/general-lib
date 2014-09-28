package graph;

import graph.adt.LinkedVertex;
import graph.adt.Vertex;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
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
        SimpleLinkedVertex<T> vFrom = new SimpleLinkedVertex<T>(from.getContent());
        SimpleLinkedVertex<T> vTo = new SimpleLinkedVertex<T>(to.getContent());
        // check the node list for the nodes at the end of the new edge, if they
        // are not in the graph inserted tehm
        int fromPos = this.vertices.indexOf(vFrom);
        vFrom = (fromPos >= 0) ? (SimpleLinkedVertex<T>) this.vertices.get(fromPos) : vFrom;
        if (fromPos < 0) {
            this.vertices.add(vFrom);
        }
        int toPos = this.vertices.indexOf(vTo);
        vTo = (toPos >= 0) ? (SimpleLinkedVertex<T>) this.vertices.get(toPos) : vTo;
        if (toPos < 0) {
            this.vertices.add(vTo);
        }
        // we need now to create the edge and inserting it into the structure by
        // connecting the two nodes with each other (i.e. undirected graph)
        boolean fromTo = vFrom.addNeighbour(vTo);
        boolean toFrom = vTo.addNeighbour(vFrom);
        return (fromTo && toFrom);
    }

    @Override
    public List<Vertex<T>> incidentVertices(T key) {
        // create a vertex for the key object and retrieve the proper one from
        // the vertices list (possibly null)
        SimpleLinkedVertex<T> vertex = new SimpleLinkedVertex<T>(key);
        int i = this.vertices.indexOf(vertex);
        if (i < 0) {
            // no element found, throw an exception
            throw new IllegalArgumentException("No vertex found for key "
                    + key.toString());
        }
        // retrieve the queried vertex and the return its neighbours list
        vertex = (SimpleLinkedVertex<T>) vertices.get(i);
        return vertex.getNeighbours();
    }

    @Override
    public Vertex<T> removeVertex(Vertex<T> toRemove) {
        // retrieve the vertex from the list
        SimpleLinkedVertex<T> vertex = new SimpleLinkedVertex<T>(toRemove.getContent());
        int i = this.vertices.indexOf(vertex);
        if (i < 0) {
            return null;
        }
        vertex = (SimpleLinkedVertex<T>) this.vertices.get(i);
        // remove the vertex and all its neighbours
        this.vertices.remove(vertex);
        for (Vertex<T> v : vertex.getNeighbours()) {
            ((LinkedVertex<T>) v).removeNeighbour(vertex);
        }
        // finally return the vertex
        return vertex;
    }

    @Override
    public boolean removeEdge(Vertex<T> v, Vertex<T> w) {
        // TODO: implement method
        // retrieves the two vertices
        int i = this.vertices.indexOf(v);
        LinkedVertex<T> vv = (i < 0) ? null : this.vertices.get(i);
        i = this.vertices.indexOf(w);
        LinkedVertex<T> ww = (i < 0) ? null : this.vertices.get(i);
        // one or both vertices not present in the list of vertices
        if (vv == null || ww == null) {
            return false;
        }
        // check if the edge exists and (possibly) remove it
        if (vv.hasNeighbour(ww)) {
            vv.removeNeighbour(ww);
            ww.removeNeighbour(vv);
            return true;
        }
        return false;
    }
}
