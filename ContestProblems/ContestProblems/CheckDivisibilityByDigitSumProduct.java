package ContestProblems.ContestProblems;
class CheckDivisibilityByDigitSumProduct {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;

        int x = n;
        while(x>0){
            int num = x % 10;
            sum += num;
            product *= num;
            x /= 10;
        }

        if(n % (sum + product) == 0) return true;
        return false;
    }
}