package Recursion;
import java.util.ArrayList;
import java.util.List;
class PalindromePartitioning {
    public void getAllPartitions(String s, int index,List<String> str,List<List<String>> ansList){
        if(index == s.length()){
            ansList.add(new ArrayList<>(str));
            return;
        }

        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                str.add(s.substring(index,i+1));
                getAllPartitions(s,i+1,str,ansList);
                str.remove(str.size()-1);
            }
        }
    }

    public boolean isPalindrome(String s, int startIndex, int endIndex){
        while(startIndex<endIndex){
            if(s.charAt(startIndex++)!=s.charAt(endIndex--)) return false;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ansList = new ArrayList<>();
        List<String> a = new ArrayList<>();
        getAllPartitions(s,0,a,ansList);
        return ansList;
    }
}