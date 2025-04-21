package Recursion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class LetterCombinationPhoneNo {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return Collections.emptyList();

        String phone_map[] = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> output = new ArrayList<>();
        backtrack("", digits, phone_map, output);
        return output;
    }

    public void backtrack(String str,String digits,String phone_map[],List<String> output){
        if(digits.isEmpty()){
            output.add(str);
        }else{
            String word = phone_map[digits.charAt(0)-'2'];
            for(char c : word.toCharArray()){
                backtrack(str+c,digits.substring(1),phone_map,output);
            }
        }
    }
}