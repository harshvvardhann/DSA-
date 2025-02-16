package Strings;
class removeOuterMostParenthesis {
    public String removeOuterParentheses(String s) {
        String a = "";
        int count = 0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(') {
                count++;
                if(count>=2) a += "(";
            }else if(s.charAt(i) == ')'){
                count--;
                if(count>0) a += ")";
            }
        }
        return a;
    }
}

// Optimal
class removeOuterMostParenthesis1 {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
                if (count >= 2) sb.append(c);
            } else {
                count--;
                if (count > 0) sb.append(c);
            }
        }
        return sb.toString();
    }
}