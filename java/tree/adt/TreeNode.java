package tree.adt;

import common.containers.ContentHolder;

/**
 * Defines the abstract data type for a node of a {@link tree.adt.Tree} class
 *
 * Created by Michele Schimd on 10/27/14.
 *
 * @version 1.0
 */
public interface TreeNode<T> extends ContentHolder<T> {

    public boolean isRoot();

    public boolean isLeaf();
}
