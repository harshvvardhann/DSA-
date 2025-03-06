package Strings;

class LongestPalindromicSubstring {
    boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    // O(N^3)
    public String longestPalindrome(String s) {
        if(s.length()<=1){
            return s;
        }

        int maxLen = 1;
        String maxStr = s.substring(0,1);

        for(int i=0;i<s.length();i++){
            for(int j=i+maxLen; j<=s.length();j++){
                if(j-i>maxLen && isPalindrome(s.substring(i,j))){
                    maxLen = j-1;
                    maxStr = s.substring(i,j);
                }
            }
        }
        return maxStr;
    }

    // O(N^2)
    public String longestPalindrome1(String s) {
        if(s.length()<=1) return s;
        String LPS = "";;
        for (int i = 0; i < s.length(); i++) {  // Start from i = 0
            // Odd length palindrome
            int low = i, high = i;
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                low--;
                high++;
            }
            String palindrome = s.substring(low + 1, high);  // Extract palindrome
            if (palindrome.length() > LPS.length()) {
                LPS = palindrome;
            }

            // Even length palindrome
            low = i - 1; 
            high = i;
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                low--;
                high++;
            }
            palindrome = s.substring(low + 1, high);
            if (palindrome.length() > LPS.length()) {
                LPS = palindrome;
            }
        }

        return LPS;
    }
}