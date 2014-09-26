package main;

import graph.LinkedListGraph;
import graph.SimpleLinkedVertex;
import graph.adt.SimpleVertex;
import graph.adt.Vertex;

/**
 * Created by michele.schimd on 22/09/2014.
 */
public class GraphTesting {
    public static void generalGraphTesting() {
        // Vertex testing
        System.out.println();
        System.out.println("- Vertex testing" );
        SimpleLinkedVertex<String> vertex = new SimpleLinkedVertex<String>("Hello");
        System.out.println(vertex.getContent());
        SimpleLinkedVertex<String> world = new SimpleLinkedVertex<String>("World!");
        vertex.addNeighbour(world);
        for (Vertex<String> v : vertex.getNeighbours()) {
            System.out.println(" " + v.getContent());
        }
        SimpleLinkedVertex<String> clone = new SimpleLinkedVertex<String>("Hello");
        String eq = (clone.equals(vertex)) ? "equals" : "not equals";
        System.out.println("vertex (" + vertex.hashCode() + ") and clone (" +
                clone.hashCode() + ") are " + eq);
        System.out.println();

        // LinkedListGraph testing
        System.out.println("- LinkedListGraph testing");
        LinkedListGraph<String> llGraph = new LinkedListGraph<String>();
        llGraph.addVertex(world);
        llGraph.addVertex(new SimpleVertex<String>("Mars"));
        llGraph.addEdge(world, new SimpleVertex<String>("Moon"));
        llGraph.addEdge(new SimpleVertex<String>("Jupiter"), new SimpleVertex<String>("Europa"));
        llGraph.addEdge(new SimpleVertex<String>("Jupiter"), new SimpleVertex<String>("Europa"));
        llGraph.addEdge(new SimpleVertex<String>("Jupiter"), new SimpleVertex<String>("Callisto"));

        System.out.println(llGraph.toString());

    }
}
