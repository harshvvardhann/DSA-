package Graphs;
import java.util.LinkedList;
import java.util.Queue;

class NumberOfEnclaves {
    Queue<int[]> queue = new LinkedList<>();
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for(int i=0;i<m;i++){
            dfs(grid,i,0,m,n);
            dfs(grid,i,n-1,m,n);
        }

        for(int j=0;j<n;j++){
            dfs(grid,0,j,m,n);
            dfs(grid,m-1,j,m,n);
        }
        
        int count = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){   
                if(grid[i][j] == 1){
                    count++;
                }
            }
        }

        return count;
    }

    public void dfs(int grid[][],int row,int col,int m,int n) {
        if(row<0 || row>=m || col<0 ||col>=n || grid[row][col]!= 1) return;

        queue.add(new int[]{row,col});
        grid[row][col] = 0;

        int delRow[] = {-1,0,1,0};
        int delCol[] = {0,-1,0,1};

        while(!queue.isEmpty()){
            int arr[] = queue.poll();
            int row1 = arr[0];
            int col1 = arr[1];
            
            for(int i=0;i<4;i++){
                int newrw = row1 + delRow[i];
                int newcl = col1 + delCol[i];

                if(newrw>=0 && newrw<m && newcl>=0 && newcl<n && grid[newrw][newcl] == 1){
                    queue.add(new int[]{newrw,newcl});
                    grid[newrw][newcl] = 0;
                }
            }
        }
    }
}