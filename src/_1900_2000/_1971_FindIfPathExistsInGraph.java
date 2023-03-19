package _1900_2000;

import java.util.*;

class _1971_Node {
    int nodeName;
    ArrayList<_1971_Node> nodeList = new ArrayList<>();
    boolean visited;

    _1971_Node(int n) {
        nodeName = n;
        visited = false;
    }
    public void ConnectNode(_1971_Node node) {
        this.nodeList.add(node);
        node.nodeList.add(this);
    }
}

public class _1971_FindIfPathExistsInGraph {

    boolean IsPathSourceToDestinationInBFS(Map<Integer, _1971_Node> graph, int source, int destination) {
        // destination 값을 만나면 리턴 true 못 만나면 return false
        Queue<_1971_Node> queue = new LinkedList<>();

        graph.get(source).visited = true;
        queue.add(graph.get(source));

        while (queue.size() > 0) {
            _1971_Node curNode = queue.poll();
            for(int i = 0; i < curNode.nodeList.size(); i++) {
                if(curNode.nodeList.get(i).visited == false) {
                    if(curNode.nodeList.get(i).nodeName == destination)
                        return true;

                    curNode.nodeList.get(i).visited = true;
                    queue.add(curNode.nodeList.get(i));
                }
            }
        }

        return false;
    }

    public Map<Integer, _1971_Node> CreateGraph(int n, int[][] edges) {
        Map<Integer, _1971_Node> graph = new HashMap<>();
        for(int i = 0; i < n; i++) {
            _1971_Node node = new _1971_Node(i);
            graph.put(i, node);
        }

        for(int i = 0; i < edges.length; i++) {
            int n1 = edges[i][0];
            int n2 = edges[i][1];

            graph.get(n1).ConnectNode(graph.get(n2));
        }

        return graph;
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination)
            return true;

        Map<Integer, _1971_Node> graph = CreateGraph(n, edges);
        return IsPathSourceToDestinationInBFS(graph, source, destination);
    }
}
