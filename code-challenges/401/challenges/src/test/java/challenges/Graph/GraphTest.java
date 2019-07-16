package challenges.Graph;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class GraphTest<T> {

    @Test
    public void addNode() {
        Graph graph = new Graph();
        graph.addNode(13);
        ArrayList<GraphNode<T>> nodes = graph.getNodes();
        GraphNode<T> testNode = nodes.get(0);
        assertEquals(13, testNode.value);
    }

    @Test
    public void addEdge() {
        Graph graph = new Graph();
        graph.addEdge(graph.addNode(13), graph.addNode(7), 1);
        ArrayList<GraphNode<T>> nodes = graph.getNodes();
        GraphNode<T> node = nodes.get(0);
        System.out.println(node);
    }

    @Test
    public void getNodes() {
        Graph graph = new Graph();
        graph.addEdge(graph.addNode(13), graph.addNode(7), 1);
        ArrayList<GraphNode<T>> nodes = graph.getNodes();
        assertEquals(2, nodes.size());
    }

    @Test
    public void getNeighbors() {
        Graph graph = new Graph();
        graph.addEdge(graph.addNode(13), graph.addNode(7), 1);
        ArrayList<GraphNode<T>> nodes = graph.getNodes();
        GraphNode<T> nodeOne = nodes.get(0);
        graph.addEdge(nodeOne, graph.addNode(20), 1);
        graph.addEdge(nodeOne, graph.addNode(30), 1);

        assertEquals(3, nodeOne.neighbors.size());
    }

    @Test
    public void getSize() {
        Graph graph = new Graph();
        graph.addEdge(graph.addNode(13), graph.addNode(7), 1);
        ArrayList<GraphNode<T>> nodes = graph.getNodes();
        GraphNode<T> nodeOne = nodes.get(0);
        graph.addEdge(nodeOne, graph.addNode(20), 1);
        graph.addEdge(nodeOne, graph.addNode(30), 1);

        assertEquals(4, graph.getSize());
    }
}