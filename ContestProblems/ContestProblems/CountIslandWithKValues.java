package ContestProblems.ContestProblems;
class SolutCountIslandWithKValuesion {
    public int getIslandCount(int grid[][],boolean visited[][],int i,int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]<=0 || visited[i][j]) return 0;
        visited[i][j] = true;
        int currentSum = grid[i][j];

        currentSum += getIslandCount(grid,visited,i+1,j);
        currentSum += getIslandCount(grid,visited,i-1,j);
        currentSum += getIslandCount(grid,visited,i,j+1);
        currentSum += getIslandCount(grid,visited,i,j-1);

        return currentSum;
    }
    public int countIslands(int[][] grid, int k) {
        if(grid == null || grid.length == 0) return 0;
        boolean visited[][] = new boolean[grid.length][grid[0].length];
        int count = 0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!visited[i][j] && grid[i][j]!=0) {
                    int getIslandCount = getIslandCount(grid,visited,i,j);
                    if(getIslandCount % k == 0) count++;                
                }
            }
        }

        return count;
    }
}