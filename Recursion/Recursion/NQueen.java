package Recursion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class NQueen {

    public boolean isSafe(List<List<String>> ansList,char nQueens[][],int row,int col,int n){
        for(int i=0;i<n;i++){
            if(nQueens[i][col] == 'Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(nQueens[i][j] == 'Q') return false;
        }
        for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++){
            if(nQueens[i][j] == 'Q') return false;
        }

        return true;        
    }
    public void backTrack(List<List<String>> ansList,char nQueens[][],int row,int n){
        if(row == n){
            List<String> solutions = new ArrayList<>();
            for(char [] s:nQueens){
                solutions.add(new String(s));
            }
            ansList.add(solutions);
            return;
        }

        for(int col = 0;col<n;col++){
            if(isSafe(ansList,nQueens,row,col,n)){
                nQueens[row][col] = 'Q';
                backTrack(ansList,nQueens,row+1,n);
                nQueens[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ansList = new ArrayList<>();
        char nQueens[][] = new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(nQueens[i],'.');
        }
        backTrack(ansList,nQueens,0,n);
        return ansList;
    }
}