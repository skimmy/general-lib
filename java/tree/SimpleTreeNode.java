package tree;

import common.containers.AbstractContentHolder;
import common.containers.ContentHolder;
import tree.adt.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * A simple implementation of the {@link tree.adt.TreeNode} interface. This class
 * provides basic functionality for a node of a tree and is intended mostly as
 * either a test or a base class to extend when more sophisticated nodes are needed.
 *
 * Created by Michele Schimd on 10/27/14.
 *
 * @version 1.0
 */
public class SimpleTreeNode<T> extends AbstractContentHolder<T> implements TreeNode<T> {

    private TreeNode<T> parent = null;
    private List<TreeNode<T>> children = new LinkedList<TreeNode<T>>();

    public SimpleTreeNode(T content, TreeNode<T> parent) {
        super(content);
        this.parent = parent;
    }

    @Override
    public TreeNode<T> getParent() {
        return this.parent;
    }

    @Override
    public List<TreeNode<T>> getChildren() {
        return this.children;
    }

    @Override
    public boolean isRoot() {
        return (this.parent == null);
    }

    @Override
    public boolean isLeaf() {
        return (this.children.isEmpty());
    }

    @Override
    public void addChild(TreeNode<T> newChild) {
        this.children.add(newChild);
    }

    /**
     * The basic equality method relies on the equality of the content, that is,
     * any {@link common.containers.ContentHolder} with content satisfying an
     * equality test against the content of this class, will result in a
     * successful equality test.
     *
     * This behaviour (although counter-intuitive) has been applied to the class
     * in order to allow simple equality tests. Clients should be aware of this
     * 'special' equality semantic and act accordingly.
     *
     * Note that {@link SimpleTreeNode#hashCode()} is modified accordingly and
     * returns the hash of the content.
     *
     * @param obj the object to be tested against
     * @return <code>true</code> if <code>obj</code> is a {@link common.containers.ContentHolder}
     * instance and content of <code>obj</code> equals content of this class.
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ContentHolder)) {
            return false;
        }
        return (this.getContent().equals(((ContentHolder) obj).getContent()));
    }

    @Override
    public int hashCode() {
        return this.content.hashCode();
    }
}
