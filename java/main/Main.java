package main;

import graph.SimpleVertex;

/**
 * Created by michele.schimd on 22/09/2014.
 */
public class Main {
    public static void main(String[] args) {
        SimpleVertex<String> vertex = new SimpleVertex<String>("Hello");
        System.out.println(vertex.getContent());
    }
}
