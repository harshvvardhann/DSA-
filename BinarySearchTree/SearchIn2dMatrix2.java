package BinarySearchTree;
class SearchIn2dMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;//no. of rows
        int m = matrix[0].length;//no. of columns

        int rows = 0;
        int columns = m-1;

        while(rows<n && columns>=0){
            if(matrix[rows][columns]==target) return true;
            else if(matrix[rows][columns]<target) rows++;
            else columns--;
        }
        return false;
    }
}