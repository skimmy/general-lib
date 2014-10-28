package common.containers;

/**
 * A simple commodity implementation of the {@link common.containers.AbstractContentHolder}
 * abstract class. This class is declared <code>final</code> because it should
 * not be used in a class hierarchy where {@link common.containers.AbstractContentHolder}
 * should instead be used.
 *
 * Created by Michele Schimd on 28/10/2014.
 *
 * @version 1.0
 */
public final class SimpleContentHolder<T> extends AbstractContentHolder<T> {
    public SimpleContentHolder(T content) {
        super(content);
    }
}
