package graph;

import graph.adt.Graph;
import graph.adt.Vertex;

/**
 * Created by michele.schimd on 29/09/2014.
 */
public class SearchAlgorithms {

    // constant defined for internals of Breadth First Search (BFS) algorithms
    private static final Integer BFS_VERTEX_WHITE = new Integer(0);
    private static final Integer BFS_VERTEX_GREY = new Integer(1);
    private static final Integer BFS_VERTEX_BLACK = new Integer(2);

    /**
     * Performs a <em>breadth first search</em> on the graph <code>g</code>
     * starting from the vertex <code>v</code>.
     * If the vertex <code>g</code> is  not present in the graph <code>g</code>
     * an {@link java.lang.IllegalArgumentException} is thrown.
     *
     * @param graph the graph on which perform the search
     * @param start the starting node for the search
     * @return
     */
    public static Vertex breadthFirstSearch(Graph graph, Vertex start) {

        // TODO: Think to a good way of returning result of BFS
        return null;
    }
}
