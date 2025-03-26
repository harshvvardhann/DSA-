package Arrays.Medium;

class PowerImplementation {
    public double myPow(double x, int n) {
        if(n==0) return 1.0;

        //here if the power is negative then we need to do it in this way like: 2^-5 = 1/(2^5) so we need to change the sign of n
        // so (x = 1/x) so it will be x = 1/2 = 0.5 and now (0.5^5) = 0.03125
        long newn = n;
        if(newn<0){
            x = 1/x;
            newn = -newn;
        }

        //here we are optimising the code by reducing the number of multiplications
        //so we are reducing the number of multiplications by half if the power is off like 2^5, then we can do it in this way
        //2^5 = (2^2*2^2)*2
        double result = 1.0;
        while(newn>0){
            if(newn%2==1){
                result *= x;//multiplying the result with x(which is extra 2 in the above example)
            }
            x *= x;//squaring the x
            newn /= 2;//reducing the power by half because if 2^2 and we did 2^2 then we need to multiply it more 2 times so dividing it by 2, again in next iteration x = 4*4, newn = 1 so we'll multiplt the result by 2*16=32
        }

        return result;
    }
}
