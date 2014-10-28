package graph.adt;

import common.containers.AbstractContentHolder;

/**
 * Created by michele.schimd on 24/09/2014.
 */
public class SimpleVertex<T> extends AbstractContentHolder<T> implements Vertex<T> {

    private Object auxiliary = null;

    public SimpleVertex(T content) {
        super(content);
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
    public Object getAuxiliary() {
        return this.auxiliary;
    }

    @Override
    public void clearAuxiliary() {
        this.auxiliary = null;
    }
}
