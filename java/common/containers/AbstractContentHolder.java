package common.containers;

/**
 * Created by skimmy on 9/28/14.
 */
public abstract class AbstractContentHolder<T> implements ContentHolder<T> {
    protected T content;

    protected AbstractContentHolder(T content) {
        this.content = content;
    }

    @Override
    public T getContent() {
        return this.content;
    }

    @Override
    public int hashCode() {
        return this.content.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.content.equals(obj);
    }

    @Override
    public String toString() {
        return this.content.toString();
    }
}
