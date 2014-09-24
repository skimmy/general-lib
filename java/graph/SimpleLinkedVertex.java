package graph;

import graph.adt.LinkedVertex;
import graph.adt.SimpleVertex;
import graph.adt.Vertex;

import java.util.LinkedList;
import java.util.List;

public class SimpleLinkedVertex<T> extends SimpleVertex<T> implements LinkedVertex<T> {


    private LinkedList<Vertex<T>> neighbours;

    public SimpleLinkedVertex(T content) {
        super(content);
        this.neighbours = new LinkedList<Vertex<T>>();
    }

    @Override
    public List<Vertex<T>> getNeighbours() {
        return this.neighbours;
    }

    @Override
    public void addNeighbour(Vertex<T> v) {
        this.neighbours.add(v);
    }

    @Override
    public String toString() {
        String str = super.toString() + " --> ";
        for (Vertex<T> vertex : this.neighbours) {
            str += vertex.getContent().toString() + " -- ";
        }
        return str;
    }
}