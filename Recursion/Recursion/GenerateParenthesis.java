package Recursion;
import java.util.ArrayList;
import java.util.List;

class GenerateParenthesis {
    public List<String> permute(String s,int open,int close,List<String> list,int n){
        if(open == n && close == n){
            list.add(s);
            return list;
        }
        if(open<n){
            permute(s+"(",open+1,close,list,n);
        }
        if(close<open){
            permute(s+")",open,close+1,list,n);
        }
        return list;
    }
    public List<String> getAllParenthesis(int n){
        List<String> li = new ArrayList<>();
        return permute("",0,0,li,n);
    }
    public List<String> generateParenthesis(int n) {
        List<String> gP = getAllParenthesis(n);
        return gP;
    }
}