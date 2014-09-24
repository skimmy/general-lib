package graph.adt;

/**
 * Created by michele.schimd on 24/09/2014.
 */
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
    public String toString() {
        return this.content.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Vertex) {
            return ((Vertex) obj).getContent().equals(this.content);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return content.hashCode();
    }
}
