package Graphs;
import java.util.*;
class FindIfPathExistsInGraph {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        boolean visited[] = new boolean[n];
        visited[source] = true;
        queue.add(source);

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] e : edges) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]); // undirected
        }

        while(!queue.isEmpty()){
            int num = queue.poll();
            if(num == destination) return true;

            for(int num2: graph.get(num)){
                if(!visited[num2]) {
                    visited[num2] = true;
                    queue.add(num2);
                }
            }
        }

        return false;
    }
}