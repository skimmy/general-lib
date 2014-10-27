package main;

import tree.SimpleTree;
import tree.adt.TreeNode;

/**
 * Created by skimmy on 10/27/14.
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
        System.out.println("- Content based equality testis");
        System.out.println("  * isEqual(\"ROOT\")  ---> " + (root.equals("ROOT")));
    }
}
