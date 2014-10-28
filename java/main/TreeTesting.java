package main;

import common.containers.SimpleContentHolder;
import common.exceptions.ContainerFullException;
import tree.SimpleTree;
import tree.adt.NaryNode;
import tree.adt.TreeNode;

import java.util.List;

/**
 * Class containing static methods to test the <code>tree</code> package.
 *
 * Created by Michele Schimd on 10/27/14.
 *
 * @version 1.0
 */
public class TreeTesting {
    public static void SimpleTreeTesting() {
        System.out.println("- SimpleTree Construction tests");
        SimpleTree<String> stringTree = new SimpleTree<String>();
        TreeNode<String> root = stringTree.getRoot();
        System.out.println("  * Root content (before set)  ---> " + root.getContent());
        root.setContent("ROOT");
        root = stringTree.getRoot();
        System.out.println("  * Root content (after set)   ---> " + root.getContent());
        System.out.println("- Equality tests");
        System.out.println("  * isEqual(\"ROOT\")    ---> " + (root.equals("ROOT")));
        SimpleContentHolder<String> stringHolder = new SimpleContentHolder<String>("ROOT");
        System.out.println("  * isEqual(strHolder) ---> " + (root.equals(stringHolder)));
    }

    public static void NaryNodeTesting() {
        System.out.println("- NaryNode tests");
        NaryNode<Double> binNode1 = new NaryNode<Double>(2, .01);
        NaryNode<Double> binNode11 = new NaryNode<Double>(2, binNode1, .11);
        NaryNode<Double> binNode12 = new NaryNode<Double>(2, binNode1, .12);
        binNode1.addChild(binNode11);
        binNode1.addChild(binNode12);
        List< TreeNode<Double> > children = binNode1.getChildren();
        String strChild = "";
        for (TreeNode<Double> node : children) {
            strChild += node.getContent() + " ";
        }
        System.out.println("  * getChildren test    --->  ` " + strChild + "`");
        boolean exceptionThrown = false;
        NaryNode<Double> binNode13 = new NaryNode<Double>(2, binNode1, .13);
        try {
            binNode1.addChild(binNode13);
        } catch (ContainerFullException e) {
            exceptionThrown = true;
        }
        System.out.println("  * Overflow children   --->  " + ((exceptionThrown) ? "Passed" : "Failed" ));
    }
}
