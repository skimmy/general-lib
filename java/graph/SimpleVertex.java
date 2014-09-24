package graph;

import graph.adt.Vertex;

import java.util.LinkedList;
import java.util.List;

public class SimpleVertex<T> implements Vertex<T> {

    private T content;
    private LinkedList<Vertex<T>> neighbours;

    public SimpleVertex(T content) {
        this.content = content;
        this.neighbours = new LinkedList<Vertex<T>>();
    }

    @Override
    public T getContent() {
        return this.content;
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
        String str = this.content.toString() + " --> ";
        for (Vertex<T> vertex : this.neighbours) {
            str += vertex.getContent().toString() + " -- ";
        }
        return str;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Vertex) {
            return ((Vertex) obj).getContent().equals(this.content);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return content.hashCode();
    }
}