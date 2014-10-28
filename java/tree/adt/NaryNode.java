package tree.adt;

import common.containers.AbstractContentHolder;
import common.exceptions.ContainerFullException;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a N-ary node (<i>i.e.</i> a node with at most N children).
 *
 * Created by Michele Schimd on 28/10/2014.
 *
 * @version 1.0
 */
public class NaryNode<T> extends AbstractContentHolder<T> implements TreeNode<T> {

    private final int N;
    private List< TreeNode<T> > children;
    private NaryNode<T> parent;

    public NaryNode(int ariety, T content) {
        super(content);
        N = ariety;
        this.children = new ArrayList<TreeNode<T>>(N);
        this.parent = null;
    }

    public NaryNode(int ariety, NaryNode<T> parent, T content) {
        super(content);
        N = ariety;
        this.children = new ArrayList<TreeNode<T>>(N);
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
        if (this.children.size() == N) {
            throw new ContainerFullException();
        }
        this.children.add(newChild);
    }

    public int getAriety() {
        return this.N;
    }

}
