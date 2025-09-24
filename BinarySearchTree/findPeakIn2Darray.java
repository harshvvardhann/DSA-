package BinarySearchTree;
class findPeakIn2Darray {
    int maxElement(int mat[][], int n, int m, int mid){
        int max = -1;
        int row = -1;
        for(int i=0;i<=n;i++){
            if(mat[i][mid]>max){
                max = mat[i][mid];
                row = i;
            }
        }
        return row;
    }
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length-1;
        int m = mat[0].length-1;
        int left = 0;
        int right = m;

        while(left<=right){
            int mid = left + (right-left)/2;
            int row = maxElement(mat,n,m,mid);
            int leftSie = mid-1>=0 ? mat[row][mid-1] : -1;
            int rightSide = mid+1<=m ? mat[row][mid+1] : -1;

            if(mat[row][mid] > leftSie && mat[row][mid] > rightSide){
                return new int[]{row,mid};
            }else if(mat[row][mid] < leftSie) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return new int[]{-1,-1};
    }
}