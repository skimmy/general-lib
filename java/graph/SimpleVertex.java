package graph;

import java.util.List;

public class SimpleVertex<T> implements Vertex<T> {

    private T content;

    public SimpleVertex(T content) {
        this.content = content;
    }

    @Override
    public T getContent() {
        return this.content;
    }

    @Override
    public List<Vertex<T>> getNeighbours() {
        return null;
    }
}