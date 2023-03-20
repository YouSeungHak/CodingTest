package _1900_2000;

import java.util.*;

class _1971_Node {
    int nodeNum;
    ArrayList<_1971_Node> nodeList = new ArrayList<>();
    boolean visited;

    _1971_Node(int n) {
        nodeNum = n;
        visited = false;
    }
    public void connectNode(_1971_Node node) {
        this.nodeList.add(node);
        node.nodeList.add(this);
    }
}

public class _1971_FindIfPathExistsInGraph {
    boolean isPathSourceToDestinationInBFS(Map<Integer, _1971_Node> graph, int source, int destination) {
        Queue<_1971_Node> queue = new LinkedList<>();

        graph.get(source).visited = true;
        queue.add(graph.get(source));

        while (queue.size() > 0) {
            _1971_Node curNode = queue.poll();
            for(int i = 0; i < curNode.nodeList.size(); i++) {
                if(!curNode.nodeList.get(i).visited) {
                    if(curNode.nodeList.get(i).nodeNum == destination)
                        return true;

                    curNode.nodeList.get(i).visited = true;
                    queue.add(curNode.nodeList.get(i));
                }
            }
        }

        return false;
    }

    private Map<Integer, _1971_Node> createGraph(int n, int[][] edges) {
        Map<Integer, _1971_Node> graph = new HashMap<>();
        for(int i = 0; i < n; i++) {
            graph.put(i, new _1971_Node(i));
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).connectNode(graph.get(edge[1]));
        }

        return graph;
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination)
            return true;

        Map<Integer, _1971_Node> graph = createGraph(n, edges);
        return isPathSourceToDestinationInBFS(graph, source, destination);
    }
}
