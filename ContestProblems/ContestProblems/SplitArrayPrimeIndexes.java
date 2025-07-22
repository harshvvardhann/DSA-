package ContestProblems.ContestProblems;
class SplitArrayPrimeIndexes {
    public boolean isPrime(int index){
        for(int i=2;i<=Math.sqrt(index);i++){
            if(index%i==0){
                return false;
            }
        }
        return true;
    }

    public long getSum(int arr[]){
        long sum = 0;
        for(int num: arr){
            sum += num;
        }
        return sum;
    }
    public long splitArray(int[] nums) {
        int primeElements[] = new int[nums.length];
        int nonPrimeElements[] = new int[nums.length];
        int x=0,y=0;
        for(int i=0;i<nums.length;i++){
            if(i>=2 && isPrime(i)){
                primeElements[x++] = nums[i];
            }else{
                nonPrimeElements[y++] = nums[i];
            }
        }

        long primeSum = getSum(primeElements);
        long nonPrimeSum = getSum(nonPrimeElements);

        return Math.abs(primeSum-nonPrimeSum);
    }
}