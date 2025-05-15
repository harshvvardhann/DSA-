package Stack;
import java.util.Stack;
class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        boolean visited[] = new boolean[26];
        int freq[] = new int[26];
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            freq[c-'a']--;
            if(visited[c-'a']) continue;

            while(!st.isEmpty() && st.peek()>c && freq[st.peek()-'a']>0){
                visited[st.pop()-'a'] = false;
            }
            st.push(c);
            visited[c-'a'] = true;
        }

        StringBuilder sb = new StringBuilder();
        for(char c:st){
            sb.append(c);
        }
        return sb.toString();
    }
}