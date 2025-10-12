package Graphs;
import java.util.LinkedList;
import java.util.Queue;

class BipartateGraph {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;

        int color[] = new int[n];
        Queue<Integer> queue = new LinkedList<>();

        for(int i=0;i<n;i++){
            if(color[i] != 0) continue;
            queue.offer(i);
            color[i] = 1;

            while(!queue.isEmpty()){
                int neighbour = queue.poll();
                for(int ex :  graph[neighbour]){
                    if(color[ex] == 0){
                        color[ex] = -color[neighbour];
                        queue.offer(ex);
                    }else if(color[ex] == color[neighbour]) return false;
                }
            }
        }        

        return true;
    }
}