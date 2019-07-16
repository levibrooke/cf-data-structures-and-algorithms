# Graph

## Challenge
- Implement a Graph

## Approach & Efficiency
Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:

1. AddNode()
  - Adds a new node to the graph
  - Takes in the value of that node
  - Returns the added node
2. AddEdge()
  - Adds a new edge between two nodes in the graph
  - Include the ability to have a “weight”
  - Takes in the two nodes to be connected by the edge
  - Both nodes should already be in the Graph
3. GetNodes()
  - Returns all of the nodes in the graph as a collection (set, list, or similar)
4. GetNeighbors()
  - Returns a collection of nodes connected to the given node
  - Takes in a given node
  - Include the weight of the connection in the returned collection
5. Size()
  - Returns the total number of nodes in the graph

## Solution
- [Link to code](../challenges/src/main/java/challenges/Graph/)
- [Link to tests](../challenges/src/test/java/challenges/Graph/GraphTest.java)