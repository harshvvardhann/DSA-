package Graphs;
import java.util.LinkedList;
import java.util.Queue;

class BipartateGraph {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        
        int color[] = new int[n];

        for(int i=0;i<n;i++){
            if(color[i] != 0) continue; //already colored
            Queue<Integer> queue = new LinkedList<>();
            queue.offer(i);
            color[i] = 1;
            while(!queue.isEmpty()){
                int node =  queue.poll();
                for(int neighbour : graph[node]){
                    if(color[neighbour] == 0){
                        color[neighbour] = -color[node];
                        queue.offer(neighbour);
                    }else if(color[node] == color[neighbour]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}