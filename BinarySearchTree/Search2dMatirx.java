class Search2dMatirx {
    public boolean binarySearch(int [] a,int target){
        int low =0;
        int high = a.length-1;
        while(low<=high){
            int mid  = low+(high-low)/2;
            if(a[mid]==target){
                return true;
            }else if(a[mid]>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
           boolean result = binarySearch(matrix[i],target);
           if(result){
            return true;
           }
        }
    
        return false;
    }
}