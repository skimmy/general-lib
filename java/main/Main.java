package main;

/**
 * Created by Michele Schimd on 22/09/2014.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("---- GRAPH TESTING ----");
        main.GraphTesting.generalGraphTesting();

        System.out.println("----- TREE TESTING -----");
        main.TreeTesting.SimpleTreeTesting();
        main.TreeTesting.NaryNodeTesting();

        // flushing to avoid IDEA messing up
        System.out.flush();
    }
}
