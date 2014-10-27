package tree.adt;

/**
 * Defines the most general Tree Abstract Data Type.
 *
 * Created by Michele Schimd on 10/27/14.
 *
 * @version 1.0
 */
public interface Tree<T> {

    /**
     * Returns the root of the current tree.
     *
     * @return the {@link tree.adt.TreeNode} which is the root of the tree
     */
    TreeNode<T> getRoot();
}
