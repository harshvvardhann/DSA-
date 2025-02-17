package Strings;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        int left = 0;
        int right = strs[0].length();

        while (left < right) {
            int mid = (left + right + 1) / 2;
            if (isCommonPrefix(strs, mid)) {
                left = mid; // Move right
            } else {
                right = mid - 1; // Move left
            }
        }

        return strs[0].substring(0, left);
    }
    private static boolean isCommonPrefix(String[] strs, int length) {
        String prefix = strs[0].substring(0, length);
        for (int i = 1; i < strs.length; i++) {
            if (!strs[i].startsWith(prefix)) {
                return false;
            }
        }
        return true;
    }
}