package common.containers;

/**
 * Abstract class implementing the basics operation for the {@link common.containers.ContentHolder}
 * interface.
 *
 * Created by Michele Schimd on 9/28/14.
 *
 * @version 1.0
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
    public void setContent(T content) {
        this.content = content;
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
