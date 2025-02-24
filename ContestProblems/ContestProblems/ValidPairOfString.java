package ContestProblems.ContestProblems;

import java.util.HashMap;

class ValidPairOfString {
    public static String geString(String s){
        HashMap<Integer,Integer> a = new HashMap<>();
        for(int i=0;i<s.length();i++){
            a.put(s.charAt(i)-'0', a.getOrDefault(s.charAt(i)-'0', 0)+1);
        }   

        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)-'0' == a.get(s.charAt(i)-'0')){
                if(s.charAt(i+1)-'0' == a.get(s.charAt(i+1)-'0')){
                    return s.charAt(i)+""+s.charAt(i+1);
                }
                continue;
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String s = "2523533";
        String newa = geString(s);
        System.out.println(newa);
    }
}