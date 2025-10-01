package Graphs;
import java.util.LinkedList;
import java.util.Queue;
class Pair {
    int row;
    int column;
    int count;

    Pair(int row,int column,int count){
        this.row = row;
        this.column = column;
        this.count = count;
    }
}
class RottingOranges {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<Pair> queue = new LinkedList<>();
        int visited[][] = new int[m][n];
        int freshCount = 0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 2){
                    queue.add(new Pair(i,j,0));
                    visited[i][j] = 2;
                }else{
                    visited[i][j] = 0;
                }

                if(grid[i][j] == 1) freshCount++;
            }
        }

        int delRow[] = {-1,0,1,0};
        int delCol[] = {0,1,0,-1};
        int totalFreshCount = 0;
        int ansCount = 0;

        while(!queue.isEmpty()){
            int rowVal = queue.peek().row;
            int colVal = queue.peek().column;
            int val = queue.peek().count;
            ansCount = Math.max(ansCount,val);
            for(int i=0;i<4;i++){
                int rv = rowVal + delRow[i];
                int cv = colVal + delCol[i];

                if(rv>=0 && rv<m && cv>=0 && cv<n && grid[rv][cv] == 1 && visited[rv][cv]!=2){
                    queue.add(new Pair(rv,cv,val+1));
                    visited[rv][cv] = 2;
                    totalFreshCount++;
                }
            }
            queue.poll();
        }

        if(totalFreshCount != freshCount) return -1;
        return ansCount;
    }
}