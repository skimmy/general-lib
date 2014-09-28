package common.containers;

/**
 * The {@link common.containers.ContentHolder} interface defines s simple
 * container for any kind of object
 *
 * Created by Michele Schimd on 9/28/14.
 */
public interface ContentHolder<T> {

    /**
     * Returns the content of this holder object.
     *
     * @return the content
     */
    public T getContent();
}
