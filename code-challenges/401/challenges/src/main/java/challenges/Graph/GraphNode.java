package challenges.Graph;

import java.util.HashMap;

public class GraphNode<T> {
    T value;
    HashMap<GraphNode<T>, Integer> neighbors;

    public GraphNode(T value) {
        this.value = value;
        this.neighbors = new HashMap<>();
    }

    public T getValue() {
        return value;
    }

    public HashMap<GraphNode<T>, Integer> getNeighbors() {
        return neighbors;
    }
}
