package main;

/**
 * Created by michele.schimd on 22/09/2014.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("---- GRAPH TESTING ----");
        main.GraphTesting.generalGraphTesting();

        System.out.println("----- TREE TESTING -----");
        main.TreeTesting.SimpleTreeTesting();

        // flushing to avoid IDEA messing up
        System.out.flush();
    }
}
