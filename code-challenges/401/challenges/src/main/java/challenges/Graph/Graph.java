package challenges.Graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph<T> {
    ArrayList<GraphNode<T>> graph;

    public Graph() {
        this.graph = new ArrayList<>();
    }

    // add node
    public GraphNode addNode(T value) {
        GraphNode<T> newNode = new GraphNode<>(value);
        graph.add(newNode);
        return newNode;
    }

    // add edge
    public void addEdge(GraphNode nodeOne, GraphNode nodeTwo, int weight) {
        // check if nodes exist
        if (graph.contains(nodeOne) && graph.contains(nodeTwo)) {
            GraphNode graphNodeOne = graph.get(graph.indexOf(nodeOne));
            GraphNode graphNodeTwo = graph.get(graph.indexOf(nodeTwo));

            graphNodeOne.neighbors.put(nodeTwo, weight);
            graphNodeTwo.neighbors.put(nodeOne, weight);
        }
    }

    // get nodes
    public ArrayList<GraphNode<T>> getNodes() {
        return graph;
    }

    // get neighbors
    public HashMap<GraphNode<T>, Integer> getNeighbors(GraphNode node) {
        // if node is in graph, return neighbors hashmap
        if (graph.contains(node)) {
            return graph.get(graph.indexOf(node)).neighbors;
        }
        return null;
    }

    // get size
    public int getSize() {
        return graph.size();
    }
}
