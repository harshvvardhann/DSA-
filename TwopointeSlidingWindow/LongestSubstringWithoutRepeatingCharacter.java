package TwopointeSlidingWindow;
// Given a string s, find the length of the longest substring without repeating characters.
import java.util.HashSet;
import java.util.HashMap;
class LongestSubstring {
    // O(N) time complexity and O(N) space complexity
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        HashSet<Character> hs = new HashSet<>();
        int left = 0;
        for(int right=0;right<s.length();right++){
            while(hs.contains(s.charAt(right)) && right<s.length()){
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(s.charAt(right));
            max = Math.max(max,right-left+1);
        }
        return max;
    }

    // O(N) time complexity and O(N) space complexity
    // this approach uses a hashmap to store the last index of each character in the string
    public int lengthOfLongestSubstring1(String s) {
        int max = 0;
        HashMap<Character,Integer> hm = new HashMap<>();
        int left = 0;
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
               left = Math.max(left, hm.get(s.charAt(i)) + 1);
            }
            hm.put(s.charAt(i),i);
            max = Math.max(max,i-left+1);
        }
        return max;
    }
}
