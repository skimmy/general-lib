package tree;

import tree.adt.Tree;
import tree.adt.TreeNode;

/**
 * A simple implementation of the {@link tree.adt.Tree} interface.
 *
 * Created by Michele Schimd on 10/27/14.
 *
 * @version 1.0
 */
public class SimpleTree<T> implements Tree<T> {

    private TreeNode<T> root = null;

    public SimpleTree() {
        this.root = new SimpleTreeNode<T>(null, null);
    }

    @Override
    public TreeNode<T> getRoot() {
        return this.root;
    }
}
