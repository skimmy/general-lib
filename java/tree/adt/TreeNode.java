package tree.adt;

import common.containers.ContentHolder;

import java.util.List;

/**
 * Defines the abstract data type for a node of a {@link tree.adt.Tree} class
 *
 * Created by Michele Schimd on 10/27/14.
 *
 * @version 1.0
 */
public interface TreeNode<T> extends ContentHolder<T> {

    public TreeNode<T> getParent();

    public List< TreeNode<T> > getChildren();

    public boolean isRoot();

    public boolean isLeaf();

    public void addChild(TreeNode<T> newChild);
}
