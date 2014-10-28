package graph.adt;

import common.containers.ContentHolder;

/**
 * This interface extends the {@link common.containers.ContentHolder} one to be
 * used in with graphs. It contains an extra auxiliary field that can be used by
 * graph algorithms to store temporary data. The interface also provide a method
 * to <em>clear</em> (<i>i.e.</i> reset) the auxiliary content, thi method should
 * always be called before using it again (more safely each algorithm using the
 * auxiliary field should clear it once it is no more needed)
 *
 * @param <T> the type of content for this vertex
 *
 * @version 1.2
 */
public interface Vertex<T> extends ContentHolder<T> {

    /**
     * Returns the auxiliary data stored in this vertex
     *
     * @return the auxiliary data
     */
    public Object getAuxiliary();

    /**
     * Clears the auxiliary data of this vertex
     */
    public void clearAuxiliary();
}