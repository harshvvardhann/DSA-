package BinarySearchTree;
class kokoEatingBanana {
    public int totalHours(int piles[], int k){
        int x = 0;
        for(int i=0; i<piles.length;i++){
            x+=Math.ceil((double)piles[i]/(double)k);
        }
        return x;
    }
    public int getMax(int piles[]){
        int max = 0;
        for(int j=0;j<piles.length;j++){
            max = Math.max(max,piles[j]);
        }
        return max;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = getMax(piles);
        while(left<=right){
            int mid = (left+right)/2;
            int totalHour = totalHours(piles,mid);
            if(totalHour<=h){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}