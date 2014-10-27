package tree.adt;

import common.containers.AbstractContentHolder;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by skimmy on 10/27/14.
 */
public class SimpleTreeNode<T> extends AbstractContentHolder<T> implements TreeNode<T> {

    private TreeNode<T> parent = null;
    private List<TreeNode<T>> children = new LinkedList<TreeNode<T>>();

    public SimpleTreeNode(T content, TreeNode<T> parent) {
        super(content);
        this.parent = parent;
    }

    @Override
    public boolean isRoot() {
        return (this.parent == null);
    }

    @Override
    public boolean isLeaf() {
        return (this.children.isEmpty());
    }

}
