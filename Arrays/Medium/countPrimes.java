package Arrays.Medium;
import java.util.*;
class countPrimes {
    public int countPrimes1(int n) {
        if(n<=2) return 0;
        boolean check[] = new boolean[n];
        Arrays.fill(check,true);

        check[0] = false;
        check[1] = false;

        for(int i=2;i*i<n;i++){
            if(check[i]){
                for(int j=i*i;j<n;j+=i){
                    check[j] = false;
                }
            }
        }
        int count = 0;
        for(boolean num:check) if(num) count++;
        return count;
    }
}