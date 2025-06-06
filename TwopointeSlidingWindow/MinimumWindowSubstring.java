package TwopointeSlidingWindow;
import java.util.HashMap;
class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0 || s.length() < t.length()) {
            return "";
        }

        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<t.length();i++){
            hm.put(t.charAt(i),hm.getOrDefault(t.charAt(i),0)+1);
        }

        int left = 0;
        int right = 0;
        int minLen = Integer.MAX_VALUE;
        int required = t.length();
        int startIndex = 0;
        while(right<s.length()){
            char a = s.charAt(right);
            if(hm.containsKey(a)){
                if(hm.get(a)>0){
                    required--;
                }
                hm.put(a,hm.get(a)-1);
            }

            while(required == 0){
                if(right-left+1<minLen){
                    minLen = right-left+1;
                    startIndex = left;
                }

                char c = s.charAt(left);
                if (hm.containsKey(c)) {
                    hm.put(c, hm.get(c) + 1);
                    if (hm.get(c) > 0) {
                        required++;
                    }
                }
                left++;
            }
            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIndex,startIndex+minLen);
    }
}