package Bit_Manipulation;

class Power_Of_Four {
    public static boolean isPowerOfFour(int n) {
        if (n<=0) return false;
        if((n & (n-1)) == 0 && Integer.bitCount(n-1)%2 == 0) return true;
        return false;
    }
    public static void main(String[] args) {
        boolean ans = isPowerOfFour(16);
        System.out.println(ans);
    }
}
