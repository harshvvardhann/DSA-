package Stack;
import java.util.Stack;
class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                st.push(s.charAt(i));
            }else{
                if(st.size() > 0){
                    char top = st.pop();
                    if((s.charAt(i) == ')' && top != '(') || 
                        (s.charAt(i) == '}' && top != '{')  ||
                        (s.charAt(i) == ']' && top != '[')){
                        return false;
                    }
                }else{
                    return false;
                }
            }
        }

        return st.size() == 0;
    }
}