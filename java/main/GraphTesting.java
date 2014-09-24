package main;

import graph.LinkedListGraph;
import graph.SimpleVertex;
import graph.adt.Vertex;

/**
 * Created by michele.schimd on 22/09/2014.
 */
public class GraphTesting {
    public static void generalGraphTesting() {
        // Vertex testing
        System.out.println();
        System.out.println("- Vertex testing" );
        SimpleVertex<String> vertex = new SimpleVertex<String>("Hello");
        System.out.println(vertex.getContent());
        SimpleVertex<String> world = new SimpleVertex<String>("World!");
        vertex.addNeighbour(world);
        for (Vertex<String> v : vertex.getNeighbours()) {
            System.out.println(" " + v.getContent());
        }
        SimpleVertex<String> clone = new SimpleVertex<String>("Hello");
        String eq = (clone.equals(vertex)) ? "equals" : "not equals";
        System.out.println("vertex (" + vertex.hashCode() + ") and clone (" +
                clone.hashCode() + ") are " + eq);
        System.out.println();

        // LinkedListGraph testing
        System.out.println("- LinkedListGraph testing");
        LinkedListGraph<String> llGraph = new LinkedListGraph<String>();
        llGraph.addVertex(world);
        System.out.println(llGraph.toString());

    }
}
